package com.codewithvish.thejobs.model;

public class Consultant {

	private int id_cons;
	private String name_cons;
	private String number_cons;
	private String email_cons;
	private String country_cons;
	private String job_cons;
	private String time;
	private String day;
	
	public Consultant(){
		
	}

	public Consultant(int id_cons, String name_cons, String number_cons, String email_cons, String country_cons,
			String job_cons, String time, String day) {

		this.id_cons = id_cons;
		this.name_cons = name_cons;
		this.number_cons = number_cons;
		this.email_cons = email_cons;
		this.country_cons = country_cons;
		this.job_cons = job_cons;
		this.time = time;
		this.day = day;
	}

	public int getId_cons() {
		return id_cons;
	}

	public void setId_cons(int id_cons) {
		this.id_cons = id_cons;
	}

	public String getName_cons() {
		return name_cons;
	}

	public void setName_cons(String name_cons) {
		this.name_cons = name_cons;
	}

	public String getNumber_cons() {
		return number_cons;
	}

	public void setNumber_cons(String number_cons) {
		this.number_cons = number_cons;
	}

	public String getEmail_cons() {
		return email_cons;
	}

	public void setEmail_cons(String email_cons) {
		this.email_cons = email_cons;
	}

	public String getCountry_cons() {
		return country_cons;
	}

	public void setCountry_cons(String country_cons) {
		this.country_cons = country_cons;
	}

	public String getJob_cons() {
		return job_cons;
	}

	public void setJob_cons(String job_cons) {
		this.job_cons = job_cons;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	
}

