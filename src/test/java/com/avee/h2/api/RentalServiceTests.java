package com.avee.h2.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RentalServiceTests {
/**
  @Autowired
  private RentalService rentalService;

  @Test
  void testCheckoutInvalidRentalDays() {
    assertThrows(IllegalArgumentException.class, () -> rentalService.checkout("JAKR", 0, 10, LocalDate.now()));
  }

  @Test
  void testCheckoutInvalidDiscountPercent() {
    assertThrows(IllegalArgumentException.class, () -> rentalService.checkout("JAKR", 5, 101, LocalDate.now()));
  }

  @Test
  void testCheckoutValidData() {
    RentalAgreement rentalAgreement = rentalService.checkout("JAKR", 5, 10, LocalDate.of(2015, 9, 3));
    assertEquals("JAKR", rentalAgreement.getToolCode());
    assertEquals(5, rentalAgreement.getRentalDays());
    assertEquals(10, rentalAgreement.getDiscountPercent());

  }
}
**/

}
