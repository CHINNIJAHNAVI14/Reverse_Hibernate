package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customers generated by hbm2java
 */
public class Customers implements java.io.Serializable {

	private Integer id;
	private Items itemsByItemId;
	private Items itemsByCustomerId;
	private Items itemsByCustomersId;
	private String name;
	private Set itemsesForItemsId = new HashSet(0);
	private Set itemsesForItemId = new HashSet(0);
	private Set itemsesForCustomersId = new HashSet(0);
	private Set itemsesForCustomerId = new HashSet(0);

	public Customers() {
	}

	public Customers(Items itemsByItemId, Items itemsByCustomerId, Items itemsByCustomersId, String name,
			Set itemsesForItemsId, Set itemsesForItemId, Set itemsesForCustomersId, Set itemsesForCustomerId) {
		this.itemsByItemId = itemsByItemId;
		this.itemsByCustomerId = itemsByCustomerId;
		this.itemsByCustomersId = itemsByCustomersId;
		this.name = name;
		this.itemsesForItemsId = itemsesForItemsId;
		this.itemsesForItemId = itemsesForItemId;
		this.itemsesForCustomersId = itemsesForCustomersId;
		this.itemsesForCustomerId = itemsesForCustomerId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Items getItemsByItemId() {
		return this.itemsByItemId;
	}

	public void setItemsByItemId(Items itemsByItemId) {
		this.itemsByItemId = itemsByItemId;
	}

	public Items getItemsByCustomerId() {
		return this.itemsByCustomerId;
	}

	public void setItemsByCustomerId(Items itemsByCustomerId) {
		this.itemsByCustomerId = itemsByCustomerId;
	}

	public Items getItemsByCustomersId() {
		return this.itemsByCustomersId;
	}

	public void setItemsByCustomersId(Items itemsByCustomersId) {
		this.itemsByCustomersId = itemsByCustomersId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getItemsesForItemsId() {
		return this.itemsesForItemsId;
	}

	public void setItemsesForItemsId(Set itemsesForItemsId) {
		this.itemsesForItemsId = itemsesForItemsId;
	}

	public Set getItemsesForItemId() {
		return this.itemsesForItemId;
	}

	public void setItemsesForItemId(Set itemsesForItemId) {
		this.itemsesForItemId = itemsesForItemId;
	}

	public Set getItemsesForCustomersId() {
		return this.itemsesForCustomersId;
	}

	public void setItemsesForCustomersId(Set itemsesForCustomersId) {
		this.itemsesForCustomersId = itemsesForCustomersId;
	}

	public Set getItemsesForCustomerId() {
		return this.itemsesForCustomerId;
	}

	public void setItemsesForCustomerId(Set itemsesForCustomerId) {
		this.itemsesForCustomerId = itemsesForCustomerId;
	}

}
