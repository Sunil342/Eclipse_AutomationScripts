package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
	}

}
