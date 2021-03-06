package br.com.web.phptravel.core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {
	
private static WebDriver driver;
	
	public Driver() {

	}

	public static WebDriver getDriver() {

		if (driver == null) {
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;

	}

	public static WebDriver encerraDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

}
