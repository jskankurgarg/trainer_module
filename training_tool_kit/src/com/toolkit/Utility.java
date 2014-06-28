package com.toolkit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility {
	public static final String VIDEO_FILE="videos";
	public static final String AUDIO_FILE="audios";
	public static final String IMAGE_FILE="images";
	public static boolean validateFileFormat(String type,String fileName){
		//boolean extensionFound=false;
		String[] fileTokens=fileName.split("\\.");
/*		
 * iterating throught the tokenized comppnents
 * for(int i=0;i<fileTokens.length;i++)
 * 		System.out.print("-----"+fileTokens[i]+"--");
*/
		System.out.println("inside validation function");
		if(fileTokens.length==1){
			return false;
		}
		else{
			File file=null;
			if(type.equalsIgnoreCase(VIDEO_FILE)){
				file=new File("file_formats/video_formats");
			}else if(type.equalsIgnoreCase(AUDIO_FILE)){
				file=new File("file_formats/audio_formats");
			}else if(type.equalsIgnoreCase(IMAGE_FILE)){
				file=new File("file_formats/image_formats");
			}
			try {
				BufferedReader fr=new BufferedReader(new FileReader(file));
				String formatName="";
				while(formatName!=null){
					formatName=fr.readLine();
					System.out.println(formatName+"-->"+fileTokens[1]+">>>>"+fr);
					if(formatName!=null && formatName.equalsIgnoreCase(fileTokens[1])){
						return true;
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}
	public static void main(String[] asd){
		String fileName="file.rm";
		System.out.println("validate file result : "+validateFileFormat(AUDIO_FILE,fileName));
	}
}
