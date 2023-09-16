package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new  FirefoxDriver();
		//WebDriver driver = new  EdgeDriver();
		
		
		
		AmazonPage AP = new AmazonPage(driver);
				
		
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.com/");
		
		
		AP.ClickonSignin();
		AP.Enteremail("9640545984");
		AP.ClickonContinue();
//		AP.clickForgotPassword();
		AP.Enterpasswod("Sunil@342");
		//AP.clickCheckBox();
		AP.clickOnSignInButton();
		AP.twotabsearchtextbox("Samsung galuxy s23 ultra");
		AP.clickOnSearchbar();
		AP.clickOnProduct();
		AP. SelectProduct();
		AP.Clickongotocart();
		AP.ClickonDelete();
		AP.ClickonAll();
		AP.ClickSignout();
		
		
		driver.close();		
		//driver.navigate().to("https://www.flipkart.com/");
		
		
		
		
		
		
		
		

	}

}
