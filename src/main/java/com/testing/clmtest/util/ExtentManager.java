package com.testing.clmtest.util;

//http://relevantcodes.com/Tools/ExtentReports2/javadoc/index.html?com/relevantcodes/extentreports/ExtentReports.html


import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentManager {
	private static ExtentHtmlReporter  htmlrepoter;

	public static ExtentHtmlReporter  getInstance() {
		if (htmlrepoter == null) {
			Date d=new Date();
			String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
			htmlrepoter = new ExtentHtmlReporter ("D:\\reports\\"+fileName);
			htmlrepoter.setAppendExisting(true);
			htmlrepoter.loadXMLConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
			 
			
		}
		return htmlrepoter;
	}
}
