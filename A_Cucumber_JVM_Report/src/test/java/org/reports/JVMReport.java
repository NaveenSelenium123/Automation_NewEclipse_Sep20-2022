package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void cucumberReports(String json) {
	File f =new File("E:\\Windows_Old Eclipse Projects\\A_Cucumber_JVM_Report\\target");
	Configuration c =new Configuration(f,"Cucumber25-08-2022 9AM");
	c.addClassifications("Sprint number","5");
	c.addClassifications("Operating System","Windows");
	c.addClassifications("Windows","11");
	c.addClassifications("BrowserName","Google Chrome");
	c.addClassifications("Version number","100");
	List<String> l =new ArrayList<>();
	l.add(json);
	ReportBuilder a =new ReportBuilder(l,c);
	a.generateReports();
	

	}
}
