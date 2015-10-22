package com.sqa.ao.selenium.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicDriverRun {
	@BeforeClass
	public void beforeClass() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}

	@Test
	public void f() {
	}

}
