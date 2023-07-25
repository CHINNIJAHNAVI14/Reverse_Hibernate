package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private int id;
	private String name;
	private Set courses = new HashSet(0);
	private Set studentCourses = new HashSet(0);

	public Student() {
	}

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String name, Set courses, Set studentCourses) {
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.studentCourses = studentCourses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

	public Set getStudentCourses() {
		return this.studentCourses;
	}

	public void setStudentCourses(Set studentCourses) {
		this.studentCourses = studentCourses;
	}

}
