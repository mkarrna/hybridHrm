package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ImmigrationHomePage;
import com.crm.qa.pages.LoginPage;

public class ImmigrationHomeTest extends TestBase{
	LoginPage loginPage;
	ImmigrationHomePage immigrationHomePage;
	
	public ImmigrationHomeTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		immigrationHomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		 boolean res = immigrationHomePage.verifyCorrectDashboard();
		Assert.assertTrue(res);
	}
	
	@Test(priority=2)
	public void Navigation(){
		immigrationHomePage.navigateToImmigration();
		boolean flag = immigrationHomePage.verifyCorrectTitle();
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
