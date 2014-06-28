package com.html;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.toolkit.Integration;
import com.toolkit.Module;
import com.toolkit.SubTopic;
import com.toolkit.Topic;


public class HtmlUtility {
	Properties html;
	public HtmlUtility() throws FileNotFoundException, IOException{
			html=new Properties();
			html.load(new FileInputStream("properties/html.properties"));
	}
	public String getHeaderHtml(){
		return html.getProperty("header");
	}
	public String getModuleHtml(Module module){
		String moduleHtml=html.getProperty("begin_sidebar");
		moduleHtml+=html.getProperty("begin_module")+module.getModuleName();
		moduleHtml+=html.getProperty("begin_module_id")+module.getModuleID()+html.getProperty("end_module_id");
		moduleHtml+=html.getProperty("begin_author_name")+module.getAuthorName()+html.getProperty("end_author_name");
		if(module.getAuthorMailId()!=null  &&  module.getAuthorMailId().length()>0){
			moduleHtml+=html.getProperty("begin_author_mail_id")+module.getAuthorMailId()+html.getProperty("end_author_mail_id");
		}
		moduleHtml+=html.getProperty("end_module");
		return moduleHtml;
	}
	public String getContentListHtml(ArrayList<Topic> topicList){
		String contentList=html.getProperty("begin_topic_list");
		for(Topic topic:topicList){
			String topicFileName=getFileName(topic.getTopicName());
			
			contentList+=html.getProperty("begin_topic");
			contentList+=html.getProperty("begin_source")+topicFileName+html.getProperty("set_target");
			contentList+=html.getProperty("begin_title")+topic.getTopicName()+html.getProperty("end_title");
			contentList+=topic.getTopicName()+html.getProperty("end_source");
			
			String description=topic.getTopicDescription()!=null?topic.getTopicDescription():"";
			System.out.println("description -------getContentListHtml---- >"+description);
			generateFile(description,topicFileName);
			String subtopicList=html.getProperty("begin_subtopic_list");

			for(SubTopic subtopic: topic.getSubTopicList()){
				String subtopicFileName=getFileName(subtopic.getSubTopicName());
				subtopicList+=html.getProperty("begin_subtopic");
				subtopicList+=html.getProperty("begin_source")+subtopicFileName+html.getProperty("set_target");
				subtopicList+=html.getProperty("begin_title")+subtopic.getSubTopicName()+html.getProperty("end_title");
				generateSubTopicContent(subtopicFileName,subtopic);
				subtopicList+=subtopic.getSubTopicName()+html.getProperty("end_source");
				subtopicList+=html.getProperty("end_subtopic");
			}
			subtopicList+=html.getProperty("end_subtopic_list");
			contentList+=subtopicList+html.getProperty("end_topic");
		}
		contentList+=html.getProperty("end_topic_list");
		//adding references and email id of author.
		if(Integration.module.references.size()>0){
			String reference=html.getProperty("begin_reference");
			for(String linkName: Integration.module.references.keySet()){
				reference+=html.getProperty("set_ref_source")+Integration.module.references.get(linkName)+html.getProperty("set_ref_name")+Integration.module.references.get(linkName)+html.getProperty("end_ref");
			}
			contentList+=reference;
		}
		contentList+=html.getProperty("end_sidebar");
		return contentList;
	}
	private void generateSubTopicContent(String subtopicFileName,
			SubTopic subtopic) {
		// TODO Auto-generated method stub
		String html_content="";

		Properties content; //future enhancement
		//System.out.println("description----------generateSubTopicContent------->"+);
		System.out.println(subtopic.contentMap);
		content=new Properties();
		try {
			content.load(new FileInputStream("properties/content.properties"));
			File cssFile=new File("styles/content.css");
			int size=(int) cssFile.length();
			byte[] buffer=new byte[size];
			FileInputStream fis=new FileInputStream(cssFile);
			fis.read(buffer);
			html_content=new String(buffer);
			html_content=content.getProperty("begin_style")+html_content+content.getProperty("end_style");
			for(String key:subtopic.contentMap.keySet()){
				String value=subtopic.contentMap.get(key);
				if(key.contains("text")==true){
					html_content+=content.getProperty("begin_text")+value+content.getProperty("end_text");
				}
				else if(key.contains("code")==true){
					html_content+=content.getProperty("begin_code")+value+content.getProperty("end_code");
				}
				//added else if 26-06-12
				else{
					String fileName=value.split(",")[0];
					//System.out.println(value.split(","));
					//System.out.println(fileName);
					if(key.contains("video")==true){
						fileName="videos"+File.separatorChar+fileName;
						html_content+=content.getProperty("begin_video")+fileName+content.getProperty("end_video");
					}
					else if(key.contains("audio")==true){
						fileName="audios"+File.separatorChar+fileName;
						html_content+=content.getProperty("begin_audio")+fileName+content.getProperty("end_audio");						
					}
					else if(key.contains("image")==true){
						fileName="images"+File.separatorChar+fileName;
						html_content+=content.getProperty("begin_image")+fileName+content.getProperty("end_image");
					}
				}
				System.out.println("key-->"+key+"\thtml_content--->"+html_content);
			}
			System.out.println(html_content);
			FileOutputStream fos=new FileOutputStream(subtopicFileName);
			fos.write(html_content.getBytes());
			fos.close();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!\n"+html_content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void generateFile(String content,String fileName){
		FileOutputStream fos;
		//String heading="<center><center>";
		try {
			System.out.println(">>>>>>>>______________>>>>>>>>\n");
			System.out.println(content+"\n"+fileName);
			System.out.println(">>>>>>>>______________>>>>>>>>\n");
			fos = new FileOutputStream(fileName);
			byte[] buffer=content.getBytes();
			fos.write(buffer);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getContentHtml(){
		String content=html.getProperty("begin_content");
		content+=html.getProperty("begin_content_title")+html.getProperty("end_content_title");
		content+=html.getProperty("iframe");
		content+=html.getProperty("end_content");
		return content;
	}
	public String getFooter(){
		return html.getProperty("footer");
	}
	private String getFileName(String topicName){
			String topicFileName=topicName;
			topicFileName=topicFileName.toLowerCase();
			
			topicFileName=topicFileName.trim();
			topicFileName=topicFileName.replaceAll("[\\.`~!@#$%^&*(){}\\_+|<>?/:\"]","");
			topicFileName=topicFileName.replaceAll("\\s+","_");
			//System.out.println(topicFileName);
			topicFileName+=".html";
			return topicFileName;
	}
	public String util(Module module) throws FileNotFoundException, IOException{
        HtmlUtility html=new HtmlUtility();
        String temp=html.getHeaderHtml();//done
		String output="";
		output+=temp;
		System.out.println("output after getHeaderHtml : "+output);line();
		
		String html_file_code=html.getModuleHtml(module);//done
		output+=html_file_code;
		System.out.println("output after getModuleHtml : "+output);line();
		
		ArrayList<Topic> topic = module.getTopicList();//done
		String html_topic_page = html.getContentListHtml(topic);//done
		output+=html_topic_page;
		System.out.println("output after getContentListHtml : "+output);line();
		
		output+=html.getContentHtml();
		System.out.println("output after getContentHtml : "+output);line();
		
		temp=html.getFooter();//done
		output+=temp;
		System.out.println("output after getFooter : "+output);
		
		char sc=File.separatorChar;
		FileOutputStream fos=new FileOutputStream("module.html");line();
		byte[] buffer=output.getBytes();
		fos.write(buffer);
		fos.close();
		
		return output;

	}
	private void line(){
		System.out.println("");
	}
	public static void main(String...asd) throws FileNotFoundException, IOException{
		Module module=new Module();
		/*/module.setAuthorName("Zensar");
		//module.setCompilerName("JDK");
		//module.setModuleID("121");
		//module.setModuleName("JAVA");
		Topic topic=new Topic();
		//topic.setTopicName("CLASSES");
		//topic.setTopicDescription("this is a class...");
		SubTopic st=new SubTopic();
		//st.setSubTopicName("DEclaring");
		//topic.subTopicList.add(st);
		module.topicList.add(topic);
		HtmlUtility hu=new HtmlUtility();
		hu.util(module);*/
	}
}
