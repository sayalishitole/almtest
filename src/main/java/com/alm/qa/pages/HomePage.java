package com.alm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(linkText="SPFx")
	//@FindBy(xpath="//button[@class='btn btn-primary mt10']")
	//@FindBy(xpath="//a[@class='mainlink active']")
	
	 WebElement linktxt;
	
	
	
	
	
	
public HomePage() {
		
		//java has below method use it, this means 'current last object'. instead of 'this' we can write HomePage.class as well.
		
		PageFactory.initElements(driver, this);
	}


//Actions

public String verifyHomePageTitle() {
	
	return driver.getTitle();
}

public Validation spfxNav() throws InterruptedException {
	
	Thread.sleep(8000);
	
	linktxt.sendKeys(Keys.ENTER);
	
	
     return new Validation();
}

}
