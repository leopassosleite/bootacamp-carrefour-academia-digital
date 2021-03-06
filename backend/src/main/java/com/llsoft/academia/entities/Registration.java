package com.llsoft.academia.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.llsoft.academia.enums.RegistrationStatus;

@Entity
@Table(name = "tb_registers")
public class Registration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy 'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dateRegistration;
	
	private RegistrationStatus registrationStatus;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Student client;
	
	public Registration() {
	}

	public Registration(Long id, Instant dateRegistration, RegistrationStatus registrationStatus, Student client) {
		this.id = id;
		this.dateRegistration = dateRegistration;
		this.registrationStatus = registrationStatus;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(Instant dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	public RegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(RegistrationStatus registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public Student getClient() {
		return client;
	}

	public void setClient(Student client) {
		this.client = client;
	}
}
