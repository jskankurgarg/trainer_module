package com.toolkit;

import java.util.LinkedHashMap;
import java.util.Set;

public class SubTopic implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SubTopic(){
		contentMap=new java.util.LinkedHashMap<String, String>();
	}
	public void setSubTopicName(String subTopicName){
		this.subTopicName=subTopicName;
	}
	public String getSubTopicName(){
		return this.subTopicName;
	}
	public String toString(){
		return subTopicName;
	}
	public String getComponentByKey(String key1){
		for(String key2:contentMap.keySet()){
			if(key2.equals(key1)){
				return contentMap.get(key2);
			}
		}
		return null;
	}
	private String subTopicName;
	public LinkedHashMap<String, String> contentMap;
	public int pageNo;
}