package com.kibernumacademy.devops.entitys;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	@Column(name = "lastname", nullable = false, length = 50)
	private String lastname;
	@Column(name = "email", nullable = false, length = 50, unique = true)
	private String email;

	@Column(name = "course", nullable = false, length = 50, unique = false)
	private String course;

	public Student() {
	}

	public Student(String name, String lastname, String email, String course) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.course = course;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", course="
				+ course + "]";
	}
	
	
}
