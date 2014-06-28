package com.toolkit;

public class Module implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Module(){
		references=new java.util.LinkedHashMap<String,String>();
		setTopicList(new java.util.ArrayList<Topic>());
	}
	public void setModuleID(String moduleID){
		this.moduleID=moduleID;
	}
	public String getModuleID(){
		return this.moduleID;
	}
	public void setModuleName(String moduleName){
		this.moduleName=moduleName;
	}
	public String getModuleName(){
		return this.moduleName;
	}
	public void setAuthorName(String authorName){
		this.authorName=authorName;
	}
	public String getAuthorName(){
		return this.authorName;
	}
	public void setCompilerName(String compilerName){
		this.compilerName=compilerName;
	}
	public String getCompilerName(){
		return this.compilerName;
	}
	public java.util.ArrayList<Topic> getTopicList() {
		return topicList;
	}
	

	public void setTopicList(java.util.ArrayList<Topic> topicList) {
		this.topicList = topicList;
	}
	private String moduleID;
	private String moduleName;
	private String authorName;
	private String compilerName;
	public java.util.LinkedHashMap<String,String>	references;
	public java.util.ArrayList<Topic> topicList;
	private String emailId;
	public String toString(){
		return getModuleName();
	}
	public Topic getTopicByName(String topicName){
		for(Topic topic:topicList){
			if(topicName.equalsIgnoreCase(topic.getTopicName())){
				return topic;
			}
		}
		return null;
	}
	public void setAuthorMailId(String emailId) {
		// TODO Auto-generated method stub
		this.emailId=emailId;
	}
	public String getAuthorMailId(){
		return emailId;
	}
	public void putReference(String name,String url) {
		// TODO Auto-generated method stub
		if((url!=null && url.length()>0 ) && ( name!=null && name.length()>0) ){
			references.put(name,url);
		}
	}
}