package com.toolkit;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	public List<Question> questionList;
	public Quiz(){
		questionList=new ArrayList<Question>();
	}
	public void setQuestionList(List<Question> questionList){
		this.questionList=questionList;
	}
	public List<Question> getQuestionList(){
		return questionList;
	}
}