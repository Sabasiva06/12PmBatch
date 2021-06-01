package org.stepdef;

import org.libglobal.LibGlobal;
import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends LibGlobal {
	LoginPage page;

	@Given("user is on fb page")
	public void user_is_on_fb_page() {
		
		
	}

	@When("user need to enter username and password")
	public void user_need_to_enter_username_and_password() {
		page = new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		type(txtUserName, "hijavaaa");
		WebElement txtPassword = page.getTxtPassword();
		type(txtPassword, "welcomejava");

	}

	@When("user need to click login button")
	public void user_need_to_click_login_button() {
		WebElement btnLogin = page.getBtnLogin();
		buttonClick(btnLogin);
	}

	@Then("user need to validate the page")
	public void user_need_to_validate_the_page() {
		System.out.println("Invalid User");
	}

}
