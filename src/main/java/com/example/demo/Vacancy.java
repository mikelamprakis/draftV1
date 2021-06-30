package com.example.demo;


import org.hibernate.annotations.AttributeAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
public class Vacancy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vacancyID_gen")
	@SequenceGenerator(name = "vacancyID_gen", sequenceName = "VACANCY_ID", allocationSize = 1)
	private int id;
	private String kind;
	private String description;


	public Vacancy() {
	}


	public Vacancy(int id, String kind, String description) {
		this.id = id;
		this.kind = kind;
		this.description = description;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Vacancy{" +
				"id=" + id +
				", kind='" + kind + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
