package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private Integer oid;
	private Product product;
	private Customer customer;
	private Seller seller;
	private Integer quantity;
	private Integer price;

	public Orders() {
	}

	public Orders(Product product, Customer customer, Seller seller, Integer quantity, Integer price) {
		this.product = product;
		this.customer = customer;
		this.seller = seller;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
