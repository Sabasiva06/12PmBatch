package org.stepdef;

import org.libglobal.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal {

	@Before
	public void beforeScenario() {
		getDriver();
		launchUrl("https://www.facebook.com/");

	}

	@After
	public void afterScenario() {
		driver.close();

	}
}
