package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * InventoryId generated by hbm2java
 */
public class InventoryId implements java.io.Serializable {

	private String pid;
	private String sid;

	public InventoryId() {
	}

	public InventoryId(String pid, String sid) {
		this.pid = pid;
		this.sid = sid;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InventoryId))
			return false;
		InventoryId castOther = (InventoryId) other;

		return ((this.getPid() == castOther.getPid())
				|| (this.getPid() != null && castOther.getPid() != null && this.getPid().equals(castOther.getPid())))
				&& ((this.getSid() == castOther.getSid()) || (this.getSid() != null && castOther.getSid() != null
						&& this.getSid().equals(castOther.getSid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPid() == null ? 0 : this.getPid().hashCode());
		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		return result;
	}

}