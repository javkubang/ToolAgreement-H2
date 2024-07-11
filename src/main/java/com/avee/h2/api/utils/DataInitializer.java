package com.avee.h2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ToolRepository toolRepository;

    @Override
    public void run(String... args) throws Exception {
        Tool chainsaw = new Tool();
        chainsaw.setCode("CHNS");
        chainsaw.setType("Chainsaw");
        chainsaw.setBrand("Stihl");
        chainsaw.setDailyCharge(BigDecimal.valueOf(1.49));
        chainsaw.setChargeOnWeekends(false);
        chainsaw.setChargeOnHolidays(true);

        Tool ladder = new Tool();
        ladder.setCode("LADW");
        ladder.setType("Ladder");
        ladder.setBrand("Werner");
        ladder.setDailyCharge(BigDecimal.valueOf(1.99));
        ladder.setChargeOnWeekends(true);
        ladder.setChargeOnHolidays(false);

        Tool jackhammerD = new Tool();
        jackhammerD.setCode("JAKD");
        jackhammerD.setType("Jackhammer");
        jackhammerD.setBrand("DeWalt");
        jackhammerD.setDailyCharge(BigDecimal.valueOf(2.99));
        jackhammerD.setChargeOnWeekends(false);
        jackhammerD.setChargeOnHolidays(false);

        Tool jackhammerR = new Tool();
        jackhammerR.setCode("JAKR");
        jackhammerR.setType("Jackhammer");
        jackhammerR.setBrand("Ridgid");
        jackhammerR.setDailyCharge(BigDecimal.valueOf(2.99));
        jackhammerR.setChargeOnWeekends(false);
        jackhammerR.setChargeOnHolidays(false);

        toolRepository.save(chainsaw);
        toolRepository.save(ladder);
        toolRepository.save(jackhammerD);
        toolRepository.save(jackhammerR);
    }
}
