package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/draft/")
public class StudentController {
	
	@Autowired
	private VacancyDao vacancyDao;
	
	@GetMapping("all")
	public ResponseEntity<List<Vacancy>> allPublishers() {
		List<Vacancy> allVacancies = vacancyDao.findAll();
		return  ResponseEntity.ok(allVacancies);
	}
}