package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[1]/img")
	WebElement HrmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return HrmLogo.isDisplayed();
	}
	
	public ImmigrationHomePage login(String un, String pwd){
		
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new ImmigrationHomePage();
		
	}
	
}
