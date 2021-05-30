package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\SampleCucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);

	}
}
