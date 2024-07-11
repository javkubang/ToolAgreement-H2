package com.avee.h2.api.dao;

import com.avee.h2.api.model.Toole;
import com.avee.h2.api.model.TooleRentAgreement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentAgreementRepository extends JpaRepository<TooleRentAgreement, Long> {}
