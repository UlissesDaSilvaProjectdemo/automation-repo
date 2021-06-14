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

	
 
	//@Test
	public void GetTittle() {}

	//@Test
	public void GetImage() {}

	//@Test
	public void getAuthor() {}
	//@Test
	public void getpublisher() {}

	//@Test
	public void getRows() {}

}
