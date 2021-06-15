package com.bdd.demoqa.utilities;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//calling object from the configuration file

	public RedConfig readconfig = new RedConfig();
	public String baseUrl= readconfig.baseUrl();
	public String username =readconfig.username();
	public String password= readconfig.password();
	public String Chromedriver;
	public String FireFoxDriver;
	public String IEDriver = readconfig.IEDriver();
	public String NavigateBack = readconfig.naviagetbackwards();


	public  WebDriver driver;
	public  WebElement element;
	public  WebElement wait;	

 
	@BeforeTest
	public void setBrowserManager() throws IOException{


		DesiredCapabilitessetup cap = new DesiredCapabilitessetup();
		cap.desiredCapabilitySetup();
		CaptureScreenshoot Screeshoot = new CaptureScreenshoot();



		String Browser = "Chrome";
		if(Browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();


		}

		else if(Browser.equals("FireFox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}


		else if(Browser.equals("IE")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		else if(Browser.equals("edged")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://demoqa.com");
		Screeshoot.Takescreenshoot(driver, Browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  



	}
	

	 
	@AfterTest
	public void quitbrowser() {
		driver.quit();
	}
  
	
	 



}






