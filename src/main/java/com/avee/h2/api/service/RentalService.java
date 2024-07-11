package com.avee.h2.api.service;

import com.avee.h2.api.dao.RentAgreementRepository;
import com.avee.h2.api.dao.TooleRepository;
import com.avee.h2.api.model.Toole;
import com.avee.h2.api.model.TooleRentAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Service
public class RentalService {


  @Autowired
  private TooleRepository toolRepository;

  @Autowired
  private RentAgreementRepository rentAgreementRepository;

  public TooleRentAgreement checkout(String toolCode, int rentalDays, int discountPercent, LocalDate checkoutDate) {
    if (rentalDays < 1) {
      throw new IllegalArgumentException("Rental day count must be 1 or greater");
    }
    if (discountPercent < 0 || discountPercent > 100) {
      throw new IllegalArgumentException("Discount percent must be between 0 and 100");

    }

    Toole toole = toolRepository.findById(toolCode)
      .orElseThrow(() -> new IllegalArgumentException("Invalid tool code"));

    TooleRentAgreement rentalAgreement = new TooleRentAgreement();
    rentalAgreement.setToolCode(toole.getCode());
    rentalAgreement.setToolType(toole.getType());
    rentalAgreement.setToolBrand(toole.getBrand());
    rentalAgreement.setRentalDays(rentalDays);
    rentalAgreement.setCheckoutDate(checkoutDate);

    LocalDate dueDate = checkoutDate.plusDays(rentalDays);
    rentalAgreement.setDueDate(dueDate);

    rentalAgreement.setDailyRentalCharge(toole.getDailyCharges());

    int chargeDays = calculateChargeDays(checkoutDate, dueDate, toole);
    rentalAgreement.setChargeDays(chargeDays);

    BigDecimal preDiscountCharge = toole.getDailyCharges().multiply(BigDecimal.valueOf(chargeDays));
    rentalAgreement.setPreDiscountCharge(preDiscountCharge);

    rentalAgreement.setDiscountPercent(discountPercent);

    BigDecimal discountAmount = preDiscountCharge.multiply(BigDecimal.valueOf(discountPercent)).divide(BigDecimal.valueOf(100));
    rentalAgreement.setDiscountAmount(discountAmount);

    BigDecimal finalCharge = preDiscountCharge.subtract(discountAmount);
    rentalAgreement.setFinalCharge(finalCharge);

    return rentAgreementRepository.save(rentalAgreement);
  }

  private int calculateChargeDays(LocalDate checkoutDate, LocalDate dueDate, Toole tool) {
    int chargeDays = 0;
    for (LocalDate date = checkoutDate.plusDays(1); !date.isAfter(dueDate); date = date.plusDays(1)) {
      boolean isWeekend = date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
      boolean isHoliday = isHoliday(date);
      if ((tool.isChargeOnWeekends() || !isWeekend) && (tool.isChargeOnHolidays() || !isHoliday)) {
        chargeDays++;
      }
    }
    return chargeDays;
  }

  private boolean isHoliday(LocalDate date) {
    // Implement holiday logic
    return false;
  }
}

