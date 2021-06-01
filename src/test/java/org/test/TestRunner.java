package org.test;

import org.base.JVMReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.libglobal.ReportingJVM;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"org.stepdef" }, dryRun = false, monochrome = true, tags = { "@F1" }, plugin = { "pretty",
				"html:C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\target",
				"json:C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\target\\sam.json",
				"junit:C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\target\\sam.xml",
				"json:C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\src\\test\\resources\\demo.json" }, snippets = SnippetType.CAMELCASE)
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReportingClass
				.JVMReportGenration("C:\\Users\\vels\\Desktop\\12pmBatch\\12PmBatch\\src\\test\\resources\\demo.json");

	}

}
