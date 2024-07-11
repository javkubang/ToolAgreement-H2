package com.avee.h2.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toole {
	@Id
	@GeneratedValue
	private int id;
	private String type;
	private String code;
	private double brand;
}
