package com.alm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alm.qa.base.TestBase;
import com.alm.qa.pages.HomePage;
import com.alm.qa.pages.LoginPage;
import com.alm.qa.pages.UploadPackage;
import com.alm.qa.pages.Validation;

public class LoginPageTest extends TestBase{
	String projectPath="D:\\Sayali-updated\\LeapALM\\SPFx\\Test Packages\\helloworld-webpart.sppkg";
	LoginPage loginPage;
	HomePage homePage;//return type for login test
	//create the constructor of this class
	Validation validation;
	public LoginPageTest() {
		super();//call the constructor of base class
	}
	
	@BeforeMethod
	public void setup() {
		initialization();//call this method from base class
		
		loginPage = new LoginPage();//create object of loginpage class to use all the methods of login page class
		homePage = new HomePage();
		validation = new Validation();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Sign in to your account","Title is not matched");
	}
	
	@Test(priority=2)
	public void LoginTest() throws InterruptedException {
		
		Thread.sleep(5000);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//validation.ValidationTest();
		
	}
	
	
	/*@AfterMethod
	public void teardown() {
		
		driver.quit();
	}*/

}
