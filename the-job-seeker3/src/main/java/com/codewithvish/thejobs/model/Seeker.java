package com.codewithvish.thejobs.model;

public class Seeker {

	private int id_seek;
	private String name_seek;
	private String number_seek;
	private String email_seek;
	private String country_seek;
	private String job_seek;
	private String username;
	private String password;
	
	public Seeker(){
		
	}

	public Seeker(int id_seek, String name_seek, String number_seek, String email_seek, String country_seek,
			String job_seek, String username, String password) {

		this.id_seek = id_seek;
		this.name_seek = name_seek;
		this.number_seek = number_seek;
		this.email_seek = email_seek;
		this.country_seek = country_seek;
		this.job_seek = job_seek;
		this.username = username;
		this.password = password;
	}

	public int getId_seek() {
		return id_seek;
	}

	public void setId_seek(int id_seek) {
		this.id_seek = id_seek;
	}

	public String getName_seek() {
		return name_seek;
	}

	public void setName_seek(String name_seek) {
		this.name_seek = name_seek;
	}

	public String getNumber_seek() {
		return number_seek;
	}

	public void setNumber_seek(String number_seek) {
		this.number_seek = number_seek;
	}

	public String getEmail_seek() {
		return email_seek;
	}

	public void setEmail_seek(String email_seek) {
		this.email_seek = email_seek;
	}

	public String getCountry_seek() {
		return country_seek;
	}

	public void setCountry_seek(String country_seek) {
		this.country_seek = country_seek;
	}

	public String getJob_seek() {
		return job_seek;
	}

	public void setJob_seek(String job_seek) {
		this.job_seek = job_seek;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
