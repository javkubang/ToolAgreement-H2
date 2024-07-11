package com.avee.h2.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avee.h2.api.model.Tool;

public interface TooleRepository extends JpaRepository<Tool, String> {
	List<Tool> findByBrand(String brand);

}
