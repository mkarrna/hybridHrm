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
	
	@FindBy(xpath  = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement issueDate;
	
	@FindBy(xpath  = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement expireDate;
	
	@FindBy(xpath  = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement status;
	
	@FindBy(xpath  = "//h6[normalize-space()='Assigned Immigration Records']")
	WebElement Title;
	
	@FindBy(xpath  = "//button[@type='submit']")
	WebElement save;
	

	// Initializing the Page Objects:
	public ImmigrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyCorrectTitle(){
		return Title.isDisplayed();
	}
	
	public void addRecord(String PassNumber,String IssueDate,String ExpireDate,String Status)
	{
		addButton.click();
		Number.sendKeys(PassNumber);
		issueDate.sendKeys(IssueDate);
		expireDate.sendKeys(ExpireDate);
		status.sendKeys(Status);
		save.click();
		
		
		
	}

}
