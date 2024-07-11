package com.avee.h2.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toole {
	@Id
	@GeneratedValue
	private int tooleid;
	private String type;
	private String code;
	private double brand;
  @Getter
  private BigDecimal dailyCharges;
  private boolean chargeOnWeekends;

  public int getId() {
    return tooleid;
  }

  public void setId(int id) {
    this.tooleid = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setDailyCharges(BigDecimal dailyCharges) {
    this.dailyCharges = dailyCharges;
  }

  public boolean isChargeOnWeekends() {
    return chargeOnWeekends;
  }

  public void setChargeOnWeekends(boolean chargeOnWeekends) {
    this.chargeOnWeekends = chargeOnWeekends;
  }

  public boolean isChargeOnHolidays() {
    return chargeOnHolidays;
  }

  public void setChargeOnHolidays(boolean chargeOnHolidays) {
    this.chargeOnHolidays = chargeOnHolidays;
  }
  private boolean chargeOnHolidays;
  @Override
  public String toString() {
    return "Toole{" +
      "id=" + tooleid +
      ", type='" + type + '\'' +
      ", code='" + code + '\'' +
      ", brand=" + brand +
      ", dailyCharges=" + dailyCharges +
      ", chargeOnWeekends=" + chargeOnWeekends +
      ", chargeOnHolidays=" + chargeOnHolidays +
      '}';
  }

}
