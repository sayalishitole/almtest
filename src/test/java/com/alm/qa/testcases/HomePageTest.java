package com.alm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alm.qa.base.TestBase;
import com.alm.qa.pages.HomePage;
import com.alm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;

	
	public HomePageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Rapid ALM - Dashboard");
		
	}
	
	@Test(priority=2)
	public void spfxNavTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.spfxNav();
		//Assert.assertTrue(spfxpagetitle.contains("SPFx Package Deployments"), "Invalid page title");
	}


}

