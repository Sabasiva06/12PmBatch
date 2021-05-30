package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = "org.stepdef")
public class TestRunner {

	public void sampeCode() {
		System.out.println("Sampe code");

	}

	public void sampleCode1() {
		System.out.println("Sample code 1");

	}

	public void sampleCode2() {
		System.out.println("Sample Code 2");

	}

	public void sampleCode3() {
		System.out.println("Sample Code 3");

	}

}
