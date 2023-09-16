package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	WebDriver driver;


	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement Signin;

	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(id = "continue")
	WebElement Continue;
	
	@FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
	WebElement forgotPassword;
	
	@FindBy(name="password")
	WebElement password;
	
	//@FindBy(xpath = "//input[@type='checkbox']")
	//WebElement clickCheckBox;

	@FindBy(xpath = "//input[@id='signInSubmit']")	
	WebElement signinButton;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbar;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement Clickonsearch;
	
	
	@FindBy(xpath="(//span[contains(text(),'SAMSUNG Galaxy S23 Ultra Cell Phone')])[1]")
	WebElement clickOnProduct;
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement ClickonAddtoCart;
	
	@FindBy(xpath="//div[@id='sw-atc-buy-box']/descendant::a")
	WebElement GotoCart;
	
	@FindBy(xpath ="//div[@class='a-row sc-action-links']/descendant::input[@value='Delete']")
	WebElement DeleteItem;

	
	
	@FindBy(xpath ="//div[@id='nav-main']/descendant::a[@id='nav-hamburger-menu']")
	WebElement ClickonAll;
	
	
	@FindBy(xpath = "(//li/child::a[@class='hmenu-item'])[35]")
	//@FindBy(xpath="\"//div[@id=\\\"nav-main\\\"]/child::div[@class=\\\"nav-left\\\"]\"")
	WebElement Signout;
	
	
	
	AmazonPage(WebDriver d) {
		driver = d;
		
	PageFactory.initElements(d, this);
		
	}
	

	public void ClickonSignin()  {
		Signin.click();
	}

	public void Enteremail(String Mb) {
		Email.sendKeys(Mb);

	}

	public void ClickonContinue() {
		Continue.click();

	}

	public void Enterpasswod(String Pass) {
		password.sendKeys(Pass);

	}

	public void clickOnSignInButton() {
		signinButton.click();
	}
	/*public void clickCheckBox() {
		clickCheckBox.click();
	}*/

	public void twotabsearchtextbox(String Pro) {
		searchbar.sendKeys(Pro);
	}
	
	public void clickOnSearchbar() {
		Clickonsearch.click();
	}

	public void clickonsearchbar() {
		searchbar.click();

	}
	
	public void clickOnProduct() {
		clickOnProduct.click();
	}
	
	public void SelectProduct() {
		 ClickonAddtoCart.click();
	}
	
	public void Clickongotocart() {
		 GotoCart.click();
	}
	
	public void ClickonDelete() {
		DeleteItem.click();
	}
	
	public void ClickonAll() {
		ClickonAll.click();
	}
	
	public void ClickSignout() {
		Signout.click();
	}
	
	
	}

