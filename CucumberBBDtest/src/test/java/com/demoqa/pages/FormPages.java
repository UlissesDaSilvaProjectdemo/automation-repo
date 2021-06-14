package com.demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bdd.demoqa.utilities.BaseClass;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

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

    //@Test
	public void name() {}
	//@Test
	public void Email() {}
	//@Test
	public void Gender() {}
	//@Test
	public void Date_of_Birth() {}
	//@Test
	public void Subjects() {}
	//@Test
	public void Hobbies() {}
	//@Test
	public void Picture() {}
	//@Test
	public void Current_Address() {}
	//@Test
	public void State_and_City() {}



}
