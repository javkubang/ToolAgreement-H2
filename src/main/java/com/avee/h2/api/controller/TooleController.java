package com.avee.h2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avee.h2.api.dao.TooleRepository;
import com.avee.h2.api.model.Toole;

@RestController
public class TooleController {
	@Autowired
	private TooleRepository repository;

	@PostMapping("/saveToole")
	public String saveToole(@RequestBody Toole toole) {
		repository.save(toole);
		return "toole saved..";
	}

	@GetMapping("/getAllToole")
	public List<Toole> getAll() {
		return repository.findAll();
	}

	@GetMapping("/getToole/{brand}")
	public List<Toole> getTooleByDept(@PathVariable String toole) {
		//return repository.findByToole(toole);
    return null;
	}

}
