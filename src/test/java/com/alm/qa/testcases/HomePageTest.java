package com.alm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.alm.qa.base.TestBase;
import com.alm.qa.pages.HomePage;
import com.alm.qa.pages.LoginPage;
import com.alm.qa.pages.Validation;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;

	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Rapid ALM - Dashboard");
		
	}
	
	@Test(priority=4)
	public void spfxNavTest() throws InterruptedException {
		Thread.sleep(5000);
		Validation Validation =homePage.spfxNav();
		//Assert.assertTrue(Validation.contains("SPFx Package Deployments"), "Invalid page title");
		Assert.assertEquals(Validation,"SPFx Package Deployments", "Invalid page title");
	}


}

