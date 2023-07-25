package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Seller generated by hbm2java
 */
public class Seller implements java.io.Serializable {

	private String sid;
	private String sname;
	private String pass;
	private String address;
	private Long phone;
	private Set orderses = new HashSet(0);
	private Set inventories = new HashSet(0);

	public Seller() {
	}

	public Seller(String sid) {
		this.sid = sid;
	}

	public Seller(String sid, String sname, String pass, String address, Long phone, Set orderses, Set inventories) {
		this.sid = sid;
		this.sname = sname;
		this.pass = pass;
		this.address = address;
		this.phone = phone;
		this.orderses = orderses;
		this.inventories = inventories;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getInventories() {
		return this.inventories;
	}

	public void setInventories(Set inventories) {
		this.inventories = inventories;
	}

}
