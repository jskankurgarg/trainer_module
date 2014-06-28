package com.toolkit;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;

public class Integration {
  static {
		  
		  module=new Module();
	  }
	public static Module module;
	public static void setModulePage(MasterPage master){
		module.setModuleID(master.moduleIdTextField.getText());
		module.setModuleName(master.moduleSubjectTextField.getText());
		module.setAuthorName(master.authorNameTextField.getText());					
		String mid= module.getModuleID();
		String an=module.getAuthorName();
		String mn=module.getModuleName();
		System.out.println("module added--->"+module);
	}
	public static void setTopicPage(String topicName){
		Topic topic = new Topic();
		
		//topic.setTopicName(topicPage.topicNameTextField.getText().trim());
		topic.setTopicName(topicName);
		Integration.module.getTopicList().add(topic);
		System.out.println("topic list--->"+module.getTopicList());
	}
	
	public static void setSubtopicName(String topicName,String subTopicName) {
		//String topicName=addContentPage.getTopicName();
		System.out.println("SET SUB TOPIC NAME --->  "+module+"\t list---->"+module.topicList);
		System.out.println(topicName);
		Topic topic=module.getTopicByName(topicName);
		System.out.println("topic----> "+topic);
		
		SubTopic subtopic=new SubTopic();
		//System.out.println(addContentPage.subTopicList.getSelectedValue());
		System.out.println(subTopicName);
		subtopic.setSubTopicName(subTopicName);
		topic.getSubTopicList().add(subtopic);
		System.out.println("subtopic list----->"+topic.getSubTopicList());
	}
	public static void setSubTopicContent(String topicName,String subTopicName,Component panel){
		Topic topic=module.getTopicByName(topicName);
		SubTopic subtopic=topic.getSubTopicByName(subTopicName);
		System.out.println("inside set sub topic content   ***********");
		String key="";
		String value="";
		System.out.println("content map ----> "+subtopic.contentMap);
		if (panel instanceof AddTextJPanel)
		{
			AddTextJPanel tempPanel = (AddTextJPanel) panel;
			key=tempPanel.toString();
			value=tempPanel.getText();
			System.out.println("AddTextJPanel found---->"+key+"------->"+value);
		}  
		else if (panel instanceof AddCodePanel) 
		{
			AddCodePanel tempPanel = (AddCodePanel) panel;
			key=tempPanel.toString();
			value=tempPanel.getText();
			System.out.println("AddCodeJPanel found---->"+key+"------->"+value);
		}
		else if (panel instanceof AddMediaJPanel) 
		{
			AddMediaJPanel tempPanel = (AddMediaJPanel) panel;
			key=tempPanel.toString();
			value=tempPanel.getMediaInfo();
			System.out.println("AddMediaJPanel found---->"+key+"------->"+value);
		}
		subtopic.contentMap.put(key, value);
		System.out.println("Values of content map: " + subtopic.contentMap.get(key)); 
		System.out.println("content map @ end of the set sub topic content "+subtopic.contentMap);
	}
	
	public static void setTopicDescription(AddTopicForm addTopicForm) {
		int topicIndex=addTopicForm.topicList.getSelectedIndex();
		module.topicList.get(topicIndex).setTopicDescription(addTopicForm.descriptionTextArea.getText());
	}
	public static void setSubTopicJList(String topicName,AddContentPage addContentPage) {
		// TODO Auto-generated method stub
		Topic topic=module.getTopicByName(topicName);
		System.out.println("topic name : "+topicName+"--------topic object :"+topic);
		if(topic.subTopicList!=null){
			for(SubTopic subtopic:topic.subTopicList){
				addContentPage.model.addElement(subtopic.getSubTopicName());
			}
		}
	}
	public static void removeSubTopicContents(String topicName,
			String subTopicName) {
		Topic topic=module.getTopicByName(topicName);
		SubTopic subtopic=topic.getSubTopicByName(subTopicName);
		subtopic.contentMap.clear();
	}
	public static void getSubTopicContent(String topicName,String subTopicName,AddContentPage addContentPage) {
		// TODO Auto-generated method stub
		String message=null;
		System.out.println("RETRIVING CONTENTS OF SUBTOPICS....");
		Topic topic=module.getTopicByName(topicName);
		SubTopic subtopic=topic.getSubTopicByName(subTopicName);
		//System.out.println("subtopic before if condition : "+subtopic);
		if(subtopic!=null && subtopic.contentMap!=null){
			System.out.println("subtopic content map : "+subtopic.contentMap);
			Component panel;
			for(String key:subtopic.contentMap.keySet()){
				message="";
				if(key.contains("text")==true){
					AddTextJPanel temp=new AddTextJPanel();
					temp.setText(subtopic.contentMap.get(key));
					panel=temp;
					message+="text panel found--->"+temp.getText();
				}
				else if(key.contains("code")==true){
					AddCodePanel temp=new AddCodePanel();
					temp.setText(subtopic.contentMap.get(key));
					panel=temp;
					message+="code panel found--->"+temp.getText();
				}
				else{
					AddMediaJPanel temp=new AddMediaJPanel();
					String[] value=subtopic.contentMap.get(key).split(",");
					temp.setText(value[0],value[1]);
					panel=temp;
					message+="media panel found--->"+temp.getMediaInfo();
				}
				addContentPage.contentPanel.add(panel);
				System.out.println("adding...."+message);
			}
			addContentPage.contentPanel.repaint();
			addContentPage.contentPanel.validate();
		}
		System.out.println("RETRIVIAL FINISHED.");
	}
	public static void deleteTopic(int topicIndex) {
		// TODO Auto-generated method stub
		module.topicList.remove(topicIndex);
	}
	public static void renameTopic(String newTopicName, int topicIndex) {
		// TODO Auto-generated method stub
		module.topicList.get(topicIndex).setTopicName(newTopicName);
	}
	public static void swapTopic(int a, int b) {
		// TODO Auto-generated method stub
		Topic t1=module.topicList.get(a);
		module.topicList.set(a, module.topicList.get(b));
		module.topicList.set(b, t1);
	}
	public static void renameSubTopic(String topicName, int subtopicIndex,String newSubTopicName) {
		// TODO Auto-generated method stub
		Topic topic=module.getTopicByName(topicName);
		topic.subTopicList.get(subtopicIndex).setSubTopicName(newSubTopicName);
	}
	public static void deleteSubTopic(String topicName, int subTopicIndex) {
		// TODO Auto-generated method stub
		module.getTopicByName(topicName).subTopicList.remove(subTopicIndex);
	}
	public static void swapSubTopic(String topicName,int a, int b) {
		// TODO Auto-generated method stub
		Topic topic=module.getTopicByName(topicName);
		SubTopic subtopic=topic.subTopicList.get(a);
		topic.subTopicList.set(a, topic.subTopicList.get(b));
		topic.subTopicList.set(b, subtopic);
	}
	public static void setReference(JTextField linkNameTextField,
			JTextField linkURLTextField) {
		// TODO Auto-generated method stub
		String linkName=linkNameTextField.getText();
		String linkURL=linkURLTextField.getText();
		module.putReference(linkName, linkURL);
	}

}
