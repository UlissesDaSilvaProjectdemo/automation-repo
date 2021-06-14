//package utilty.com.selenium.script;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.bdd.demoqa.utilities.BaseClass;
//
//public class HandleElement extends BaseClass {
//	
//	
//	
//	WebElement elementPresent = driver.findElement(By.id("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]"));
//     
//
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,400)");
//	WebElement element = driver.findElement(BookStoreAPI); 
//	element.click();
//
//
//	WebElement ele = driver.findElement(BookStoreAPI);
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", ele);
//
//
//	WebDriverWait t = new WebDriverWait(driver, 3000); 
//	t..until(ExpectedConditions.visibilityOf((WebElement)By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")));  
//	t.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")));
//	 
//
//
//
//	List<WebElement> element1 = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]"));
//	for(int i=0; i < element1.size();i++) {
//
//		WebElement add = element1.get(i);
//
//		String innerhtml = add.getAttribute("innerHTML");
//		if(innerhtml.contains("Alerts, Frame & Windows")) {
//			add.click();
//		}
//	}
//	
//	 WebElement Locator = driver.findElement(BookStoreAPI);
//	//compare the actual title with the expected title
//     if(Locator.equals(BookStoreAPI))
//	{
//	System.out.println( "Test Passed") ;
//	}
//	else {
//	System.out.println( "Test Failed" );
//		}
//	
//	new FluentWait<WebDriver>(driver)							
//			.withTimeout(30, TimeUnit.SECONDS) 			
//			.pollingEvery(5, TimeUnit.SECONDS) 			
//			.ignoring(NoSuchElementException.class);
//
//}
