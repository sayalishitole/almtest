package com.alm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alm.qa.base.TestBase;

public class DeclineValidation extends TestBase {
	
	HomePage homePage;
	
	//String projectPath="D:\\Sayali-updated\\LeapALM\\SPFx\\Test Packages\\helloworld-webpart.sppkg";
	
	@FindBy(linkText="SPFx")
	WebElement Spfxlink;
	
	@FindBy(xpath="//span[text()='Validate']")
	WebElement Validate;
	
	@FindBy(css="input[type='text']")
	WebElement Appname;
	
	@FindBy(linkText="SPFxApp01")
	WebElement Appid;
	
	@FindBy(xpath="//div[@class='envlistItems']")
	WebElement Envitem;
	
	@FindBy(css="li:nth-child(2).ng-binding.ng-scope")
	WebElement Sitecollection;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-arrow-right']")
	WebElement Upload;
	
	@FindBy(css="input[type='file']")
	WebElement Spfxpackage;
	
	@FindBy(xpath="//span[@class='fa fa-upload']")
	WebElement Uploadbutton;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-check']")
	WebElement Validatebtn;
	
	//@FindBy(xpath="//span[@class='glyphicon glyphicon-check']")
	//WebElement Finish;
	
	@FindBy(css="button.btn.btn-success.ng-binding")
	WebElement Confirm;
	
	
	
	
	
public DeclineValidation() {
		
		//java has below method use it, this means 'current last object'. instead of 'this' we can write LoginPage.class as well.
		
		PageFactory.initElements(driver, this);
		
	}
	
//Actions

public String ValidationDeclineflow(String appname,String projectpath) throws InterruptedException {
	String String = "https://rapidalm-staging.azurewebsites.net/#/spfx/list";
	Thread.sleep(8000);
	Spfxlink.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	Validate.click();
	Thread.sleep(5000);
	Appname.sendKeys(appname);
	Thread.sleep(5000);
	Appid.click();
	Thread.sleep(9000);
	/*Envitem.isSelected();
//	Thread.sleep(5000);
	Sitecollection.click();
	System.out.println("Child 2 is selelcted");*/
	WebElement webElement = driver.findElement(By.xpath("//div[@class='envlistItems']"));
    System.out.println(webElement);
    driver.findElement(By.cssSelector("li:nth-child(1).ng-binding.ng-scope")).click();
	Thread.sleep(9000);
	Upload.click();
	Thread.sleep(5000);
	Spfxpackage.sendKeys(projectpath);
	Thread.sleep(5000);
	Uploadbutton.click();
	Thread.sleep(8000);
	Validatebtn.click();
	Thread.sleep(200000);
	//click on finish
	Validatebtn.click();
	Thread.sleep(5000);
	//Switching to the modal dialog   
	 System.out.println("DEBUG MESSAGE:Awaiting ALert presence!");
	 driver.switchTo().activeElement();
	 System.out.println("DEBUG MESSAGE:ALert is present!");
	 Thread.sleep(5000);
	// DEcline.click();
	 driver.findElement(By.cssSelector("button.btn.btn-primary.ng-binding")).sendKeys(Keys.ENTER);
	 System.out.println("DEBUG MESSAGE:Validation Confirmed");
	 
	
	
	
	return String;
	
}
}




