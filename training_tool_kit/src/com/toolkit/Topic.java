package com.toolkit;

public class Topic implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Topic(){
		subTopicList = new java.util.ArrayList<SubTopic>();
	}
	public void setTopicName(String topicName){
		this.topicName=topicName;
	}
	public java.util.ArrayList<SubTopic> getSubTopicList() {
		return subTopicList;
	}
	public void setSubTopicList(java.util.ArrayList<SubTopic> subTopicList) {
		this.subTopicList = subTopicList;
	}
	public String getTopicName(){
		return this.topicName;
	}
	public void setTopicDescription(String topicDescription){
		this.topicDescription=topicDescription;
	}
	public String getTopicDescription(){
		return this.topicDescription;
	}
	private String topicName;
	private String topicDescription;
	public java.util.ArrayList<SubTopic> subTopicList;
	public String toString(){
		return topicName;
	}
	public SubTopic getSubTopicByName(String subtopicName){
		for(SubTopic subtopic : subTopicList){
			if(subtopic.getSubTopicName()!=null && subtopic.getSubTopicName().equalsIgnoreCase(subtopicName)){
				return subtopic;
			}
		}
		return null;
	}
}
