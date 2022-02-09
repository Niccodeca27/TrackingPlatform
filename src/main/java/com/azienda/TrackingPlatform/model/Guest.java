package com.azienda.TrackingPlatform.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String email, username, password, name, surname, sex;
	private Date birthDate;
	//servono a capire se l'utente è admin o no; e se la sua sessione è attiva o meno
	private Boolean admin, logged;
	

	private List<Project> projects;
	
	private List<Activity> activities;

	public Guest() {
		super();
	}

	public Guest(String email, String username, String password, String sex, Date birthDate, Boolean admin) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.birthDate = birthDate;
		this.admin = admin;
	}

	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getSex() {
		return sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public Boolean getLogged() {
		return logged;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setLogged(Boolean logged) {
		this.logged = logged;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	
}
