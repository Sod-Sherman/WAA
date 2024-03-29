package com.students.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {

	@Id@GeneratedValue
	private Integer id;

	@Size(min = 2, max = 50, message = "{Size.name.validation}")
 	private String firstName = null;

 	@NotEmpty(message = "{Size.name.validation}")
 	private  String lastName  = null;

 	@Email
	@NotEmpty(message = "{email.validation}")
 	private String email = null;

 	@NotEmpty(message = "{gender.validation}")
 	private String gender = null;

 	@NotNull(message = "{birthday.validation}")
	@DateTimeFormat(pattern = "MM/dd/yyyy")@Past
    private LocalDate birthday;

    @Valid
	private Phone phone;

  	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
	   	
	   

}
