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




public class BooksPages extends BaseClass  {	


	By Search=By.xpath("//*[@id=\"searchBox\"]");
	By GetTittle=By.xpath("//*[@id=\"item-2\"]/span");
	By GetImage=By.xpath("//*[@id=\"item-3\"]");
	By getAuthor=By.xpath("//*[@id=\"item-4\"]/span");
	By getpublisher = By.xpath("//*[@id=\"searchBox\"]");
	By getRows = By.xpath("//*[@id=\\\"searchBox\\\"]");


	@Test
	public void navigatetoBookStore() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 

		//navigate_to_form
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();	

	}



	@Test
	public void Login() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login']"));

			WebElement client = elements.get(x);
			client.click();		 

		}


	}

	@Test
	public void BookStore() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Book Store']"));

			WebElement client = elements.get(x);
			client.click();		 

		}

	}

	@Test
	public void Profile() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Profile']"));

			WebElement client = elements.get(x);
			client.click();		 

		}

	}
	@Test
	public void BookStoreAPI() {


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Book Store API"));

			WebElement client = elements.get(x);
			client.click();		 	 
		}



	}

}
