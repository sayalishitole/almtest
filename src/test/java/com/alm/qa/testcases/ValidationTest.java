package com.alm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.alm.qa.base.TestBase;
import com.alm.qa.pages.DeclineValidation;
import com.alm.qa.pages.HomePage;
import com.alm.qa.pages.LoginPage;
import com.alm.qa.pages.SpfxDeployments;
import com.alm.qa.pages.UploadPackage;
import com.alm.qa.pages.Validation;

public class ValidationTest extends TestBase{
	/*String projectPath="D:\\Sayali-updated\\LeapALM\\SPFx\\Test Packages\\helloworld-webpart.sppkg";
	LoginPage loginPage;
	HomePage homePage;//return type for login test
	Validation validation;
	DeclineValidation declinevalidation;
	
	//create the constructor of this class
	
	public ValidationTest() {
		super();//call the constructor of base class
	}
	
	@BeforeTest
	public void setup() {
		initialization();//call this method from base class
		
		loginPage = new LoginPage();//create object of loginpage class to use all the methods of login page class
		homePage = new HomePage();
		validation = new Validation();
		declinevalidation=new DeclineValidation();
	}
	
	
	@Test(priority=5)
	
	public void ValidateTest() throws InterruptedException
	{
		Thread.sleep(5000);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
		String confirmtest = validation.Validationflow(prop.getProperty("applicationname"), prop.getProperty("projectPath"));
		Assert.assertEquals(confirmtest, "https://rapidalm-staging.azurewebsites.net/#/spfx/validation/finish");
	}
		
	@Test(priority=6)
	
	public void ValidateDeclineTest() throws InterruptedException
	{
		Thread.sleep(5000);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
		String confirmtest1 = declinevalidation.ValidationDeclineflow(prop.getProperty("applicationname"), prop.getProperty("projectPath"));
		Assert.assertEquals(confirmtest1, "https://rapidalm-staging.azurewebsites.net/#/spfx/list");
	}*/
	
	
	
	//}
	
	
	/*@AfterMethod
	public void teardown() {
		
		driver.quit();
	}*/

}
