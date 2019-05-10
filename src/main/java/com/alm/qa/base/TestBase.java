package com.alm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.alm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	//DEfine constructor
	public TestBase() {
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Projects\\Sales Automation\\Automation\\ALMTest\\src\\main\\java\\com\\"
					+ "alm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}//end of constructor
	
	}



//Create one initialization method
public static void initialization() {
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\F drive\\Selenium\\Latest Installation\\Chrome\\chromedriver_win32\\chromedriver.exe"); 
    	  ChromeOptions options = new ChromeOptions();
    	  driver = new ChromeDriver(options);
    	  //do the same for FF and IE
    	  
    	  driver.manage().window().maximize();
    	  //driver.manage().deleteAllCookies();
    	  //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    	  
    	  driver.get(prop.getProperty("url"));
    	  //driver.get("https://leapidsync-staging.azurewebsites.net");
		
	}
}
}
	

	

