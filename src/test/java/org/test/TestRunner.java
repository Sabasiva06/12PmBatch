package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = "org.stepdef")
public class TestRunner {

	public void addd() {
		System.out.println("sdgddj");

	}

	public void sub() {
		System.out.println("SDhscjvbsjc");

	}

	public void adjih() {
		System.out.println("jdaj");

	}

}
