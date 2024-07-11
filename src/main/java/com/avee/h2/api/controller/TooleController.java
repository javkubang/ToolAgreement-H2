package com.avee.h2.api.controller;

import java.time.LocalDate;
import java.util.List;

import com.avee.h2.api.model.TooleRentAgreement;
import com.avee.h2.api.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.avee.h2.api.dao.TooleRepository;
import com.avee.h2.api.model.Toole;

@RestController
@RequestMapping("/api/rentals")
public class TooleController {
	@Autowired
	private TooleRepository repository;
  @Autowired
  private RentalService rentalService;

  @PostMapping("/checkout")
  public ResponseEntity<TooleRentAgreement> checkout(@RequestParam String toolCode,
                                                     @RequestParam int rentalDays,
                                                     @RequestParam int discountPercent,
                                                     @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkoutDate) {
    TooleRentAgreement rentalAgreement = rentalService.checkout(toolCode, rentalDays, discountPercent, checkoutDate);
    return ResponseEntity.ok(rentalAgreement);
  }


}
