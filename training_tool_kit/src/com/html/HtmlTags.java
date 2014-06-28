package com.html;

public class HtmlTags {
	public static final String HEADER="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
+"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:ice=\"http://ns.adobe.com/incontextediting\">"
+"<head>"
+"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />"
+"<title>Zensar</title>"
+"<link rel=\"stylesheet\" href=\"styles/home.css\" />"
+"<script src=\"includes/ice/ice.js\" type=\"text/javascript\"></script></head>"
+"<body>"
+"<div class=\"container\">"
+"  <div class=\"header\"><a href=\"http://www.zensar.com/\"><img src=\"images/zensar_logo.jpg\" alt=\"Insert Logo Here\" name=\"Insert_logo\" width=\"22%\" height=\"90\" id=\"Insert_logo\" style=\"background-color: #8090AB; display:block;\" /></a>" 
+"    <!-- end .header --></div>"
+"  <div class=\"sidebar1\">";
	public static final String BEGIN_MODULE="<div class=\"module\">";
	public static final String END_MODULE="</div>";
	public static final String LINE_BREAK="<br/>";
	public static final String BEGIN_MODULE_ID=LINE_BREAK+"<a style=\"font-size:11px;text-decoration:none;\"> Id : ";
	public static final String END_MODULE_ID="</a>"+LINE_BREAK;
	public static final String BEGIN_AUTHOR_NAME="<a style=\"font-size:11px;text-decoration:none;\"> Author : ";
	public static final String END_AUTHOR_NAME="</a>";
}