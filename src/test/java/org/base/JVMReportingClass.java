package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportingClass {

	public static void JVMReportGenration(String jsonFile) {

		File file = new File("C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\src\\test\\resources");
		Configuration configuration = new Configuration(file, "DemoProject");
		configuration.addClassifications("Brower Name", "Chrome Browser");
		configuration.addClassifications("Platform", "Win -10");
		configuration.addClassifications("Sprint", "23");
		configuration.addClassifications("Environment", "QA");

		List<String> li = new ArrayList<String>();
		li.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}
}
