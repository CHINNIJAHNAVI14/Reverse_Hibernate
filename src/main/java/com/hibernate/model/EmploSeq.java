package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

/**
 * EmploSeq generated by hbm2java
 */
public class EmploSeq implements java.io.Serializable {

	private Long nextVal;

	public EmploSeq() {
	}

	public EmploSeq(Long nextVal) {
		this.nextVal = nextVal;
	}

	public Long getNextVal() {
		return this.nextVal;
	}

	public void setNextVal(Long nextVal) {
		this.nextVal = nextVal;
	}

}