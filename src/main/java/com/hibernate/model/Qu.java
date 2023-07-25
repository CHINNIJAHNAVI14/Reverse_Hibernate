package com.hibernate.model;
// Generated Jul 25, 2023, 3:27:08 PM by Hibernate Tools 6.0.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Qu generated by hbm2java
 */
public class Qu implements java.io.Serializable {

	private Integer id;
	private String question;
	private Set ansForQuestionId = new HashSet(0);
	private Set ansForQuestId = new HashSet(0);
	private Set ansForQid = new HashSet(0);

	public Qu() {
	}

	public Qu(String question, Set ansForQuestionId, Set ansForQuestId, Set ansForQid) {
		this.question = question;
		this.ansForQuestionId = ansForQuestionId;
		this.ansForQuestId = ansForQuestId;
		this.ansForQid = ansForQid;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set getAnsForQuestionId() {
		return this.ansForQuestionId;
	}

	public void setAnsForQuestionId(Set ansForQuestionId) {
		this.ansForQuestionId = ansForQuestionId;
	}

	public Set getAnsForQuestId() {
		return this.ansForQuestId;
	}

	public void setAnsForQuestId(Set ansForQuestId) {
		this.ansForQuestId = ansForQuestId;
	}

	public Set getAnsForQid() {
		return this.ansForQid;
	}

	public void setAnsForQid(Set ansForQid) {
		this.ansForQid = ansForQid;
	}

}