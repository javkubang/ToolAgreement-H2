package com.avee.h2.api;

import com.avee.h2.api.dao.TooleRepository;
import com.avee.h2.api.model.Toole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;



@SpringBootApplication
public class TooleH2Application {

	public static void main(String[] args) {
    //SpringApplication.run(TooleH2Application.class, args);

    TooleRepository tooleRepository;


    Toole chainsaw = new Toole();
    chainsaw.setCode("CHNS");
    chainsaw.setType("Chainsaw");
    chainsaw.setBrand("Stihl");
    chainsaw.setDailyCharges(BigDecimal.valueOf(1.49));
    chainsaw.setChargeOnWeekends(false);
    chainsaw.setChargeOnHolidays(true);

    Toole ladder = new Toole();
    ladder.setCode("LADW");
    ladder.setType("Ladder");
    ladder.setBrand("Werner");
    ladder.setDailyCharges(BigDecimal.valueOf(1.99));
    ladder.setChargeOnWeekends(true);
    ladder.setChargeOnHolidays(false);

    Toole jackhammerD = new Toole();
    jackhammerD.setCode("JAKD");
    jackhammerD.setType("Jackhammer");
    jackhammerD.setBrand("DeWalt");
    jackhammerD.setDailyCharges(BigDecimal.valueOf(2.99));
    jackhammerD.setChargeOnWeekends(false);
    jackhammerD.setChargeOnHolidays(false);

    Toole jackhammerR = new Toole();
    jackhammerR.setCode("JAKR");
    jackhammerR.setType("Jackhammer");
    jackhammerR.setBrand("Ridgid");
    jackhammerR.setDailyCharges(BigDecimal.valueOf(2.99));
    jackhammerR.setChargeOnWeekends(false);
    jackhammerR.setChargeOnHolidays(false);

    tooleRepository.save(chainsaw);
    tooleRepository.save(ladder);
    tooleRepository.save(jackhammerD);
    tooleRepository.save(jackhammerR);
  }
	}
}


