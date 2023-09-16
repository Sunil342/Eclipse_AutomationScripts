package TestNG.Frameworks;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Amazon {

	
   
	WebDriver driver = new ChromeDriver();
    
	


	@BeforeClass
	public void browserLaunch() throws Throwable {

		//		 WebDriverManager.firefoxdriver().setup();
		//		   
		//		 WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}
	@Test(priority=0)
	public void signInmethod() {
		//	Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9640545984");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//div[@class='a-section']/descendant::input[@id='ap_password']")).sendKeys("Sunil@342");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();


	}

	@Test(priority=2)
	public void Searchproduct() throws Exception {
		driver.findElement(By.xpath("//div[@id='nav-search']/descendant::input[@id='twotabsearchtextbox']")).sendKeys("Samsung galuxy S23 Ultra");
		driver.findElement(By.xpath("//div[@id='nav-search']/descendant::input[@id='nav-search-submit-button']")).click();


	}
	@Test(priority=3)
	public void Selectproduct() {
		//driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'SAMSUNG Galaxy S23 Ultra Cell Phone')])[1]")).click();

	}
	@Test(priority=4)
	public void Addtocart() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='a-button-inner']/child::input[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-button-inner']/child::a[@class='a-button-text'])[3]")).click();

	}
	@Test(priority=5)
	public void Gotocart() {
		//driver.findElement(By.xpath("//div[@id='sw-atc-buy-box']/descendant::a[@class='a-button-text']")).click();
		driver.findElement(By.xpath("//div[@id='sw-atc-actions']/descendant::a[@class='a-button-text']")).click();

	}
	@Test(priority=6)
	public void Deleteproduct() {
		driver.findElement(By.xpath("//div[@class='a-row sc-action-links']/descendant::input[@value='Delete']")).click();
	}
	@Test(priority=7)
	public void Signout() {
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-content']/descendant::a[@href='javascript:void(0)']")).click();
	}

	//	@AfterClass
	public void closingbrowser() {
		driver.quit();
	}

}
