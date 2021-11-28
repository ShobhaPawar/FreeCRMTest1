package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
		
	//Page Factory : OR
	@FindBy(name = "username")
	WebElement username;
		
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpLink;
	
	@FindBy(xpath="//a[@class='navbar-brand']/img")
	WebElement crmLogo;
	
	//Initializing the page objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
		//driver.findElement(By.name("username"));
		
	}
	
	//Actions:
	public String validateLoginPagetitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMPageImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String user, String pwd){
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}

}
