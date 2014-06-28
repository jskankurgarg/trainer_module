package com.html;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileSystem {
	public static String createDirectoryStructure(String root)throws IOException{
		root="d:\\training\\"+root;
		System.out.println(root);
		File dir=new File(root);
		String temp=root;
		int count=0;
		System.out.println("before while");
		while(dir.isDirectory()){
			temp=root+"_"+(++count);
			dir=new File(temp);
			System.out.println("count : "+count);
		}
		root=temp;
		System.out.println("after while : "+root);
		if(dir.mkdir()){
			File videos=new File(dir,"videos");
			File audios=new File(dir,"audios");
			File images=new File(dir,"images");
			File contents=new File(dir,"contents");
			boolean flag=false;
			if(videos.mkdir()){
				if(audios.mkdir()){
					if(images.mkdir()){
						if(contents.mkdir()){
							flag=true;
						}						
					}
				}
			}
			if(!flag)
				throw new IOException();
			System.out.println("completed");
		}
		else{
			throw new IOException();
		}
		return root;
	}
	public static void main(String...asd){
		
		
		
		
		
	}
}