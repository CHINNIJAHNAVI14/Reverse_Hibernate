package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * Em1Id generated by hbm2java
 */
public class Em1Id implements java.io.Serializable {

	private Integer id;
	private String name;
	private String sal;

	public Em1Id() {
	}

	public Em1Id(Integer id, String name, String sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Em1Id))
			return false;
		Em1Id castOther = (Em1Id) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getSal() == castOther.getSal()) || (this.getSal() != null && castOther.getSal() != null
						&& this.getSal().equals(castOther.getSal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getSal() == null ? 0 : this.getSal().hashCode());
		return result;
	}

}
