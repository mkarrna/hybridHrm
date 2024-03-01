package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ImmigrationHomePage extends TestBase {

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement Dashboard;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	WebElement My_Info;

	@FindBy(linkText="Immigration")
	WebElement Immigarzion;
	
	@FindBy(xpath  = "//h6[normalize-space()='Assigned Immigration Records']")
	WebElement Title;
	

	// Initializing the Page Objects:
	public ImmigrationHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean verifyCorrectDashboard(){
		return Dashboard.isDisplayed();
	}
	
	public boolean verifyCorrectTitle(){
		return Title.isDisplayed();
	}
	
	
	public ImmigrationPage navigateToImmigration(){
		My_Info.click();
		Immigarzion.click();
		return new ImmigrationPage();
	}
	
	
	
	
	
	
	

}
