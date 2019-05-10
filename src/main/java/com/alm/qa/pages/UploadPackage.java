package com.alm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alm.qa.base.TestBase;

public class UploadPackage extends TestBase {
	
	@FindBy(xpath="//span[text()='Validate']")
	static
	WebElement validate;
	
	@FindBy(css="input[type='text']")
	static
	WebElement appname;
	
	@FindBy(linkText="SPFxTest-01")
	static
	WebElement appid;
	
	
	
	public UploadPackage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public static Validation initialpackage(String app) {
		validate.click();
		appname.sendKeys(app);
		appid.click();
		
		return new Validation();
	}
	

}
