package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ImmigrationPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement addButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/div/label/span")
	WebElement visa;

	@FindBy(xpath  = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Number;
	
	@FindBy(xpath  = "//h6[normalize-space()='Assigned Immigration Records']")
	WebElement Title;
	

	// Initializing the Page Objects:
	public ImmigrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyCorrectTitle(){
		return Title.isDisplayed();
	}
	
	public void addRecord(String passNumber)
	{
		Number.sendKeys(passNumber);
	}

}
