package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * Movie generated by hbm2java
 */
public class Movie implements java.io.Serializable {

	private String name;
	private String actor;

	public Movie() {
	}

	public Movie(String name) {
		this.name = name;
	}

	public Movie(String name, String actor) {
		this.name = name;
		this.actor = actor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

}