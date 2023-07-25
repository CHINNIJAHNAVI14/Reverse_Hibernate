package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * StudentCourse generated by hbm2java
 */
public class StudentCourse implements java.io.Serializable {

	private StudentCourseId id;
	private Course course;
	private Student student;

	public StudentCourse() {
	}

	public StudentCourse(StudentCourseId id, Course course, Student student) {
		this.id = id;
		this.course = course;
		this.student = student;
	}

	public StudentCourseId getId() {
		return this.id;
	}

	public void setId(StudentCourseId id) {
		this.id = id;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}