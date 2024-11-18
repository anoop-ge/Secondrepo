package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSEg {

	public static void main(String[] args) throws InterruptedException {

		// Set the path for the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the HTML page
		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\LocateByCSSEg.html");

		// WebElement element=driver.findElement(By.cssSelector(".input-field"));
		// WebElement element=driver.findElement(By.cssSelector("input.input-field"));
//CSSSleector with attribute name
		// WebElement element=driver.findElement(By.cssSelector("input#some-id"));

		// WebElement
		// element=driver.findElement(By.cssSelector("input[type='password']"));

		WebElement element = driver.findElement(By.cssSelector("form input"));

		element.sendKeys("password");

		List<WebElement> elements = driver.findElements(By.cssSelector("input#some-id, .input-field"));

		elements.stream().forEach(e -> {
			System.out.println("---->" + e.getAttribute("type"));

		});

		//CSS Selector using AND
		
		WebElement elementa = driver.findElement(By.cssSelector("input#some-id.input-field"));

		System.out.println(elementa.getTagName()+"" + elementa.getAttribute("type"));

		Thread.sleep(6000);

		System.out.println(element.getAttribute("value"));

		driver.quit();

	}

}
