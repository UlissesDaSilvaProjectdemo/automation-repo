package utilty.com.selenium.script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.BaseClass;

public class HamdleUnorderList extends BaseClass {
	
	
	
	public void unrolderlist() throws InterruptedException {
		
	
		
	int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")).size();
    System.out.println("Amount of elements: " + elementsCount);
    System.out.println("*********************************************************************");
	
    
    for (int x = 0; x < elementsCount; x++) {
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li"));;
        WebElement client = elements.get(x);
        client.click();
        
        Thread.sleep(5000);
        System.out.println("*********************************************************************");
		
    }
 
		List<WebElement> allProduct = driver.findElements(By.xpath("//*[@id=\"item-0\"]/span"));
		for( WebElement product : allProduct){
			product.click();
			 
			
		}
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,200)");	  
			System.out.println("*********************************************************************");
		
		 
			
			List<WebElement> allProduct2 = driver.findElements(By.xpath("//*[@id=\"item-0\"]/span"));
			for( WebElement product : allProduct2){
				product.click();
				
			}
			System.out.println("*********************Pratical Form************************************************");
			
	} 


}
