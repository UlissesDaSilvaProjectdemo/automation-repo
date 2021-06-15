package com.demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.BaseClass;

 

public class FormPages extends BaseClass {

	By Name=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[2]/svg");
	By Email=By.xpath("//*[@id=\"item-0\"]/span");
	By Gender=By.xpath("//*[@id=\"item-1\"]/span");
	By Date_of_Birth=By.xpath("//*[@id=\"item-2\"]/span");
	By Subjects = By.xpath("//*[@id=\"item-3\"]/span");
	By Hobbies = By.xpath("//*[@id=\"item-4\"]/span");
	By Picture = By.xpath("//span[text()='Practice Form']");
	By Current_Address = By.xpath("//span[text()='Practice Form']");
	By State_and_City = By.xpath("//span[text()='Practice Form']");
	By Submit_button = By.xpath("//span[text()='Practice Form']");


	@Test 
	public void naviagtetoForm() {

		//navigate_to_form
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();	
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on TextBox == //span[text()='Practice Form']
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Practice Form']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}


		}


	}

    @Test
	public void name() {
    	int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on TextBox == //span[text()='Practice Form']
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Practice Form']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}


		}
    }
	@Test
	public void Email() {
		driver.findElement(Email).sendKeys("");
	}
	@Test
	public void Gender() {
		
		WebElement radio1 = driver.findElement(Gender);					
	    WebElement radio2 = driver.findElement(Gender);
	  
	    		
	    //Radio Button1 is selected		
	    radio1.click();			
	    System.out.println("Radio Button Option 1 Selected");					
	    		
	    //Radio Button1 is de-selected and Radio Button2 is selected		
	    radio2.click();			
	    System.out.println("Radio Button Option 2 Selected");					
	    		
	    // Selecting CheckBox		
	    WebElement option1 = driver.findElement(Gender);							

	    // This will Toggle the Check box 		
	    option1.click();			

	    // Check whether the Check box is toggled on 		
	    if (option1.isSelected()) {					
	        System.out.println("Checkbox is Toggled On");					

	    } else {			
	        System.out.println("Checkbox is Toggled Off");					
	    }		
	    
	    
	    WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	    for (int i=0; i<2; i++) {											
	        chkFBPersist.click (); 			
	        System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
	    }		
}

		 
		
	
	@Test
	public void Date_of_Birth() {}
	@Test
	public void Subjects() {}
	@Test
	public void Hobbies() {}
	@Test
	public void Picture() {}
	@Test
	public void Current_Address() {}
	@Test
	public void State_and_City() {}



}
