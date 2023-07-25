package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * DepaEmployee generated by hbm2java
 */
public class DepaEmployee implements java.io.Serializable {

	private DepaEmployeeId id;
	private Emplo employe;
	private Depa depa;

	public DepaEmployee() {
	}

	public DepaEmployee(DepaEmployeeId id, Emplo employe, Depa depa) {
		this.id = id;
		this.employe = employe;
		this.depa = depa;
	}

	public DepaEmployeeId getId() {
		return this.id;
	}

	public void setId(DepaEmployeeId id) {
		this.id = id;
	}

	public Emplo getEmploye() {
		return this.employe;
	}

	public void setEmploye(Emplo employe) {
		this.employe = employe;
	}

	public Depa getDepa() {
		return this.depa;
	}

	public void setDepa(Depa depa) {
		this.depa = depa;
	}

}