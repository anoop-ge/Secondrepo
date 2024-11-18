package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActionsEg {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\KeyboardActionsEg.html");
	
	
	WebElement inputfield=driver.findElement(By.id("inputField"));
	
	inputfield.sendKeys("Some text here!");
	
	Thread.sleep(2000);

	
	inputfield.sendKeys(Keys.BACK_SPACE+""+Keys.BACK_SPACE);
	
	Thread.sleep(5000);

inputfield.sendKeys(Keys.CONTROL+""+"A");

	System.out.println(inputfield.getAttribute("value"));
	
	inputfield.sendKeys(Keys.TAB);
	
	driver.findElement(By.id("submitButton")).sendKeys(Keys.ENTER);
	
	
	System.out.println(driver.findElement(By.id("output")).getText());

	Thread.sleep(5000);
	
	driver.quit();
	
	}
}
