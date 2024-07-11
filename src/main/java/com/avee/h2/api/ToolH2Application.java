package com.avee.h2.api;

import com.avee.h2.api.dao.TooleRepository;
import com.avee.h2.api.model.Tool;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;



@SpringBootApplication
public class TooleH2Application {

	public static void main(String[] args) {
    //SpringApplication.run(TooleH2Application.class, args);
    TooleRepository tooleRepository;


    Tool chainsaw = new Tool();
    chainsaw.setCode("CHNS");
    chainsaw.setType("Chainsaw");
    chainsaw.setBrand("Stihl");
    chainsaw.setDailyCharges(BigDecimal.valueOf(1.49));
    chainsaw.setChargeOnWeekends(false);
    chainsaw.setChargeOnHolidays(true);

    Tool ladder = new Tool();
    ladder.setCode("LADW");
    ladder.setType("Ladder");
    ladder.setBrand("Werner");
    ladder.setDailyCharges(BigDecimal.valueOf(1.99));
    ladder.setChargeOnWeekends(true);
    ladder.setChargeOnHolidays(false);

    Tool jackhammerD = new Tool();
    jackhammerD.setCode("JAKD");
    jackhammerD.setType("Jackhammer");
    jackhammerD.setBrand("DeWalt");
    jackhammerD.setDailyCharges(BigDecimal.valueOf(2.99));
    jackhammerD.setChargeOnWeekends(false);
    jackhammerD.setChargeOnHolidays(false);

    Tool jackhammerR = new Tool();
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


