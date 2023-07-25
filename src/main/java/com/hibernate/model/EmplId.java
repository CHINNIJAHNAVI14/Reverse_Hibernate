package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * EmplId generated by hbm2java
 */
public class EmplId implements java.io.Serializable {

	private String country;
	private String email;
	private String name;
	private String pass;

	public EmplId() {
	}

	public EmplId(String country, String email, String name, String pass) {
		this.country = country;
		this.email = email;
		this.name = name;
		this.pass = pass;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmplId))
			return false;
		EmplId castOther = (EmplId) other;

		return ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
				&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getPass() == castOther.getPass()) || (this.getPass() != null && castOther.getPass() != null
						&& this.getPass().equals(castOther.getPass())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getPass() == null ? 0 : this.getPass().hashCode());
		return result;
	}

}