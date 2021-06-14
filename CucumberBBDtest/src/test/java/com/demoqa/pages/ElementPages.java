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

import com.bdd.demoqa.utilities.BaseClass;

public class ElementPages extends BaseClass {
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





	//@Test
	public void Tetbox() {}
	//@Test
	public void CheckBox() {}
	//@Test
	public void RadioButton() {}
	//@Test
	public void WebTable() {}
	//@Test
	public void Button() {}
	//@Test
	public void Links() {}
	//@Test
	public void BrokenLink() {}
	//@Test
	public void UploadDowload() {}
	//@Test
	public void DynamicProperty() {} 

}