package org.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\SampleCucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String data) {
		driver.get(data);

	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void buttonClick(WebElement element) {
		element.click();
	}

}
