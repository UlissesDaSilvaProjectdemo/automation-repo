package com.demoqa.pages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.BaseClass;
 

 

public class ElementPages extends BaseClass{
	By ElementpPgeNavigate = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div");
	By Tetbox = By.xpath("//*[@id=\"item-3\"]/span");
	By CheckBox = By.xpath("//*[@id=\"item-3\"]/span");
	By RadioButton = By.xpath("//*[@id=\"item-2\"]");
	By WebTable = By.xpath("//*[@id=\"item-3\"]/span");
	By Button = By.xpath("//*[@id=\"item-4\"]/span");
	By Links = By.xpath("//*[@id=\"item-4\"]/span");
	By BrokenLink = By. xpath("//*[@id=\"item-6\"]/span");
	By UploadDowload = By.xpath("//*[@id=\"item-7\"]/span");
	By DynamicProperty = By.xpath("//*[@id=\"item-8\"]/span");

	@Test
	public void ElementpPgeNavigate() {

		driver.findElement(By.xpath("//h5[text()='Elements']")).click();	
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Text Box']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}





	@Test
	public void Tetbox() {

		 
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Check Box']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void CheckBox() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Radio Button']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void RadioButton() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Radio Button']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
    @Test
	public void WebTable() {
    	int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Buttons']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
    }
	@Test
	public void Button() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Web Tables']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void Links() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Links']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void BrokenLink() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Broken Links - Images']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void UploadDowload() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Upload and Download']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void DynamicProperty() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Dynamic Properties']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	} 

}