package com.avee.h2.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avee.h2.api.model.Toole;

public interface TooleRepository extends JpaRepository<Toole, Integer> {

	List<Toole> findByBrand(String brand);

}
