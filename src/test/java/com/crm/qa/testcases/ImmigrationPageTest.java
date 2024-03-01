package com.crm.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ImmigrationHomePage;
import com.crm.qa.pages.ImmigrationPage;
import com.crm.qa.pages.LoginPage;

public class ImmigrationPageTest extends TestBase{
	LoginPage loginPage;
	ImmigrationHomePage immigrationHomePage;
	ImmigrationPage immigrationPage;
	
	
	public ImmigrationPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		immigrationHomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		immigrationPage =immigrationHomePage.navigateToImmigration();
	}
	
	@Test(priority=1)
	public void addRecords(){
		immigrationPage.addRecord("pass123");
		
	}
	
	@Test(priority=2)
	public void VerifyTitle(){
		
		boolean flag = immigrationHomePage.verifyCorrectTitle();;
		Assert.assertTrue(flag);
	}
//	
//	@Test(priority=3)
//	public void loginTest(){
//		immigration = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
//	
//	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
