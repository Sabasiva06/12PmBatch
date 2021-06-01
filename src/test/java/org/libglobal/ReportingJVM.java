package org.libglobal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingJVM {

	public static void generateJVMReport(String json) {

		File file = new File("C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\target");

		Configuration configuration = new Configuration(file, "Sample Facebook Project");
		configuration.addClassifications("Brower Name", "Chrome Browser");
		configuration.addClassifications("Platform", "Win-10");
		configuration.addClassifications("Environmemt", "QA");
		configuration.addClassifications("Sprint No", "12");

		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}

}
