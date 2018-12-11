package com.vaibhu.question2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	int questionId;
	String question;
	List listanswers;
	Set setanswers;
	Map mapanswers;
	
	
	public List getListanswers() {
		return listanswers;
	}
	public void setListanswers(List listanswers) {
		this.listanswers = listanswers;
	}
	public Set getSetanswers() {
		return setanswers;
	}
	public void setSetanswers(Set setanswers) {
		this.setanswers = setanswers;
	}
	public Map getMapanswers() {
		return mapanswers;
	}
	public void setMapanswers(Map mapanswers) {
		this.mapanswers = mapanswers;
	}

	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", listanswers=" + listanswers + ", setanswers=" + setanswers
				+ ", mapanswers=" + mapanswers + "]";
	}
} 
