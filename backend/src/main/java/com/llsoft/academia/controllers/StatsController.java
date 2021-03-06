package com.llsoft.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llsoft.academia.entities.Stats;
import com.llsoft.academia.services.StatsService;

@RestController
@RequestMapping(value = "/stats")
public class StatsController {
	
	@Autowired
	private StatsService statsService;
	
	@GetMapping
	public ResponseEntity<List<Stats>> findAll() {
		List<Stats> list = statsService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Stats> findById(@PathVariable Long id) {
		Stats obj = statsService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}