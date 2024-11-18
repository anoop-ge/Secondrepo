package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagMultipleElementsEg {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 // Set the path for the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the HTML page
        driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\LocateByNameEg.html");

        // Locate the username input field by name
List<WebElement> elements=driver.findElements(By.tagName("input"));		



for(WebElement element:elements) {
	
	element.sendKeys("some text");

	System.out.println(element.getAttribute("name"));

	
}


Thread.sleep(8000);


driver.quit();


	}

}
