package com.avee.h2.api.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class RentalAgreement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String toolCode;
  private String toolType;
  private String toolBrand;
  private int rentalDays;
  private LocalDate checkoutDate;
  private LocalDate dueDate;
  private BigDecimal dailyRentalCharge;
  private int chargeDays;
  private BigDecimal preDiscountCharge;
  private int discountPercent;
  private BigDecimal discountAmount;
  private BigDecimal finalCharge;

  // Getters and Setters

  public void printAgreement() {
    System.out.printf("Tool code: %s\nTool type: %s\nTool brand: %s\nRental days: %d\nCheckout date: %s\nDue date: %s\nDaily rental charge: %s\nCharge days: %d\nPre-discount charge: %s\nDiscount percent: %d%%\nDiscount amount: %s\nFinal charge: %s\n",
            toolCode, toolType, toolBrand, rentalDays, checkoutDate, dueDate, dailyRentalCharge, chargeDays, preDiscountCharge, discountPercent, discountAmount, finalCharge);
  }
}