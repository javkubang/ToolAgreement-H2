package com.avee.h2.api.controller;

import java.time.LocalDate;

import com.avee.h2.api.model.ToolRentAgreement;
import com.avee.h2.api.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.avee.h2.api.dao.TooleRepository;

@RestController
@RequestMapping("/api/rentals")
public class TooleController {
	@Autowired
	private TooleRepository repository;
  @Autowired
  private RentalService rentalService;

  @PostMapping("/checkout")
  public ResponseEntity<ToolRentAgreement> checkout(@RequestParam String toolCode,
                                                    @RequestParam int rentalDays,
                                                    @RequestParam int discountPercent,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkoutDate) {
    ToolRentAgreement rentalAgreement = rentalService.checkout(toolCode, rentalDays, discountPercent, checkoutDate);
    return ResponseEntity.ok(rentalAgreement);
  }


}
