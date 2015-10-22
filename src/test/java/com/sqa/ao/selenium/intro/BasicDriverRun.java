package com.sqa.ao.selenium.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicDriverRun {

	private static String baseUrl;
	private static WebDriver driver;

	@Test
	public void login() {
		baseUrl = "http://google.com";
		driver.get(baseUrl);
	}

	@BeforeClass(enabled = false)
	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeClass(enabled = false)
	public void setupFirefox() {
		driver = new FirefoxDriver();
	}

	@BeforeClass
	public void setupOpera() {
		System.setProperty("webdriver.opera.driver", "drivers\\operadriver.exe");
		driver = new OperaDriver();
	}

}
