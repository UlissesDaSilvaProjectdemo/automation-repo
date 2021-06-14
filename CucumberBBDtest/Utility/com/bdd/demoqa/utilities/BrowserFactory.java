//package com.bdd.demoqa.utilities;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class BrowserFactory {
//
//
//	public  WebDriver driver;
//	public  WebElement element;
//	public  WebElement wait;	
//	
//	 
//
//	@BeforeTest
//	public void setBrowser(){
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("ignoreProtectedModeSettings",true);
//		cap.setCapability("ignoreZoomSettings",true);
//		 
//		cap.setCapability("enablePersistentHover",false);
//		cap.setCapability("enableElementCacheCleanup",false);
//		cap.setCapability("requireWindowFocus",false);
//		cap.setCapability("browserAttachTimeout",false);
//		cap.setCapability("ie.forceCreateProcessApi",false);
//		 
//		cap.setCapability("ie.ensureCleanSessions",false);
//		cap.setCapability("logFile",false);
//		cap.setCapability("logLevel",false);
//		cap.setCapability("host",false);
//		cap.setCapability("extractPath",false); 
//		cap.setCapability("silent",false);
//		cap.setCapability("ie.setProxyByServer",false); 
//		
//		
//		 
//      	String Browser = "chrome";
//
//		if(Browser.equals("Chrome")) { 
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//
//
//		else if(Browser.equals("FireFox")) {
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//
//
//		else if(Browser.equals("IE")) {
//			
//			 
//			System.setProperty("webdriver.ie.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
//		}
//
//
//		driver.get("https://demoqa.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)");	  
//
//
//	}
//
//	@Test
//	public void navigatetoform() {
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();	 
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
//	}
//
//
//	@AfterTest
//	public void quitbrowser() {
//		driver.quit();
//	}
//
//
//
//
//}
//
//
//
//
//
//
