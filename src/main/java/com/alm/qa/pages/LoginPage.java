package com.alm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alm.qa.base.TestBase;
import com.alm.qa.util.TestUtil;

public class LoginPage extends TestBase{

	//Page factory or OR (Object Repository)
	
	@FindBy(id="i0116")
	WebElement username;
	
	@FindBy(id="idSIButton9")
	//@FindBy(className=("btn.btn-block.btn-primary"))
	WebElement nextbtn;
	
	@FindBy(id="i0118")
	WebElement password;
	
	/*@FindBy(id="idSIButton9")
	WebElement signin;
	
	@FindBy(id="idSIButton9")
	WebElement confirm;*/
	
	
	//initialize the elements with the help of page factory
	//create a constructor for loginpage class
	
	public LoginPage() {
		
		//java has below method use it, this means 'current last object'. instead of 'this' we can write LoginPage.class as well.
		
		PageFactory.initElements(driver, this);
	}
	
	//ACtions
	
	
	public HomePage login(String un,String pwd) throws InterruptedException  {
		username.sendKeys(un);
		//Thread.sleep(5000);
		System.out.println("Usename Entered");
		//nextbtn.sendKeys(Keys.RETURN);
		nextbtn.sendKeys(Keys.ENTER);
		System.out.println("Nextbtn Entered");
	     Thread.sleep(5000);
		password.sendKeys(pwd);
		//Thread.sleep(5000);
		
		nextbtn.click();
		//Thread.sleep(5000);
		
		nextbtn.click();
		Thread.sleep(5000);
		
		return new HomePage();
		
		}
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	
}
