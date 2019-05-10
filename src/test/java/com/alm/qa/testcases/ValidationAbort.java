package com.alm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alm.qa.base.TestBase;
import com.alm.qa.pages.HomePage;
import com.alm.qa.pages.LoginPage;
import com.alm.qa.pages.UploadPackage;
import com.alm.qa.pages.Validation;

public class ValidationAbort extends TestBase{
	String projectPath="D:\\Sayali-updated\\LeapALM\\SPFx\\Test Packages\\helloworld-webpart.sppkg";
	LoginPage loginPage;
	HomePage homePage;//return type for login test
	//create the constructor of this class
	
	public ValidationAbort() {
		super();//call the constructor of base class
	}
	
	@BeforeMethod
	public void setup() {
		initialization();//call this method from base class
		
		loginPage = new LoginPage();//create object of loginpage class to use all the methods of login page class
	}
	
	@Test(priority=2)
	public void LoginTest() throws InterruptedException {
		driver.findElement(By.id("i0116")).sendKeys("meganb@M365x328224.onmicrosoft.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("Pankaj.Katk@0358");
		Thread.sleep(8000);
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(14000);
		
		driver.findElement(By.linkText("SPFx")).click();
        Thread.sleep(8000);
                    
       // for(int i=0;i<=3;i++) {
        	
        	Thread.sleep(8000);
        			driver.findElement(By.xpath("//span[text()='Validate']")).click();
        Thread.sleep(8000);
                  
        			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("SPF");
        Thread.sleep(8000);
        			driver.findElement(By.linkText("SPFxTest-01")).click();
        Thread.sleep(8000);
      
        WebElement webElement = driver.findElement(By.xpath("//div[@class='envlistItems']"));
        System.out.println(webElement);
        			driver.findElement(By.cssSelector("li:nth-child(1).ng-binding.ng-scope")).click();
        Thread.sleep(2000);
        //Click on Upload button before selecting spfx file
         			driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-arrow-right']")).click();
        Thread.sleep(5000);
        
       //code to upload a spfx file
        driver.findElement(By.cssSelector("input[type='file']")).sendKeys(projectPath);
        
         //driver.findElement(By.xpath("//span[@class='btn btn-default ng-scope']")).sendKeys("D:\\Test.docx");*/
        Thread.sleep(5000);
         //Click on Upload button
        driver.findElement(By.xpath("//span[@class='fa fa-upload']")).click();
        Thread.sleep(8000);
        //Abort the ticke
        driver.findElement(By.cssSelector("button.btn.btn-danger.btn-sm.pull-right")).sendKeys(Keys.ENTER);
	}
}