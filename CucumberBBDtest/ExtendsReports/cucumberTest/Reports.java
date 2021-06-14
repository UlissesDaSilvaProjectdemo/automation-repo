package cucumberTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports {


	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter1;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setBrowser() throws IOException { 
		ExtentHtmlReporter htmlReporter1 = new ExtentHtmlReporter("extentBDDReport.html"); 
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(htmlReporter1);    
		extent.createTest("SetBrowser");

		String Browser = "FireFox";
		if(Browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if(Browser.equals("FireFox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if(Browser.equals("IE")) {

			WebDriverManager.edgedriver().setup();
			driver = new InternetExplorerDriver();
		}

		test.log(Status.INFO, "This step shows usage of log(SetBrowser)");
		test.info("This step shows usage of info(SetBrowser)"); 

		driver.get("https://demoqa.com/");
		test.pass("URL");
		driver.manage().window().maximize();

		test.pass("implicitwait");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		test.pass("Explicitwait");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		test.pass("javaScriptExecutor");


		 


	}


	@Test
	public void navigate() throws IOException {	

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();	 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();

		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		test.pass("navigation");

	}


	@AfterTest	
	public void quitBrowser() throws IOException {
		driver.quit();
		
		test.pass("BrowserClose");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		extent.flush();
	 
	}
}



