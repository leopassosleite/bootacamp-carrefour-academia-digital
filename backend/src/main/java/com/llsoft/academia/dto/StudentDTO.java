package com.llsoft.academia.dto;

import java.time.Instant;

import com.llsoft.academia.entities.Student;

public class StudentDTO {

	private Long id;
	private String name;
	private String lastName;
	private String district;
	private Instant birthDate;
	private String cpf;
	
	public StudentDTO() {
	}

	public StudentDTO(Long id, String name, String lastName, String district, Instant birthDate, String cpf) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.district = district;
		this.birthDate = birthDate;
		this.cpf = cpf;
	}
	
	public StudentDTO(Student student) {
		id = student.getId();
		name = student.getName();
		lastName = student.getLastName();
		district = student.getDistrict();
		birthDate = student.getBirthDate();
		cpf = student.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
