package com.sqa.ao.selenium.intro;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicDriverRun {

	private static String baseUrl;
	private static WebDriver driver;

	private static boolean isSupportedPlatform() {
		Platform current = Platform.getCurrent();
		return Platform.MAC.is(current) || Platform.WINDOWS.is(current);
	}

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

	@BeforeClass(enabled = false)
	public void setupOpera() {
		System.setProperty("webdriver.opera.driver", "drivers\\operadriver.exe");
		driver = new OperaDriver();
	}

	@BeforeClass
	public void setupSafari() {
		System.setProperty("webdriver.safari.driver", "drivers\\SafariDriver.safariextz");
		// System.setProperty("webdriver.safari.noinstall", "true"); // To stop
		// uninstall
		// each time

		driver = new SafariDriver();
	}

}
