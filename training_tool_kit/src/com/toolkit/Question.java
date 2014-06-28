package com.toolkit;

import java.util.List;

public class Question {
	private String description;
	private List<String> options;
	private String explanation;
	private int answer;
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setExplanation(String explanation){
		this.explanation=explanation;
	}
	public String getExplanation(){
		return explanation;
	}
	public void setanswer(int answer){
		this.answer=answer;
	}
	public int getanswer(){
		return answer;
	}
}
