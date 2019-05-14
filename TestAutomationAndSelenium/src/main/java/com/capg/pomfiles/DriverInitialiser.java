package com.capg.pomfiles;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialiser {

	static Properties prop = new Properties();
	public static WebDriver driver;
	static String browser;

	public static void setBrowserName() {
		try {
			InputStream is = new FileInputStream(
					"G:\\webprogramming\\TestAutomationAndSelenium\\src\\main\\java\\com\\capg\\properties\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		browser = prop.getProperty("browser");
	}

	public static void setBrowserConfig() {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"G:\\webprogramming\\TestAutomationAndSelenium\\src\\main\\java\\chromedriver.exe");

		}
	}

	public static void runTest() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));

	}

	public static void quitTest() {
		driver.quit();

	}

}
