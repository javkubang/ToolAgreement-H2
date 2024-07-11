package com.avee.h2.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TooleRentAgreement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Rentid;
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

  public Long getRentid() {
    return Rentid;
  }

  public void setRentid(Long rentid) {
    Rentid = rentid;
  }

  public String getToolCode() {
    return toolCode;
  }

  public void setToolCode(String toolCode) {
    this.toolCode = toolCode;
  }

  public String getToolType() {
    return toolType;
  }

  public void setToolType(String toolType) {
    this.toolType = toolType;
  }

  public String getToolBrand() {
    return toolBrand;
  }

  public void setToolBrand(String toolBrand) {
    this.toolBrand = toolBrand;
  }

  public int getRentalDays() {
    return rentalDays;
  }

  public void setRentalDays(int rentalDays) {
    this.rentalDays = rentalDays;
  }

  public LocalDate getCheckoutDate() {
    return checkoutDate;
  }

  public void setCheckoutDate(LocalDate checkoutDate) {
    this.checkoutDate = checkoutDate;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public BigDecimal getDailyRentalCharge() {
    return dailyRentalCharge;
  }

  public void setDailyRentalCharge(BigDecimal dailyRentalCharge) {
    this.dailyRentalCharge = dailyRentalCharge;
  }

  public int getChargeDays() {
    return chargeDays;
  }

  public void setChargeDays(int chargeDays) {
    this.chargeDays = chargeDays;
  }

  public BigDecimal getPreDiscountCharge() {
    return preDiscountCharge;
  }

  public void setPreDiscountCharge(BigDecimal preDiscountCharge) {
    this.preDiscountCharge = preDiscountCharge;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public BigDecimal getFinalCharge() {
    return finalCharge;
  }

  public void setFinalCharge(BigDecimal finalCharge) {
    this.finalCharge = finalCharge;
  }

  private BigDecimal finalCharge;


}
