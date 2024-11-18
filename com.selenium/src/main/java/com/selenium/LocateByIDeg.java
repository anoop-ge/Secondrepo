package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocateByIDeg {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	
	
	
	
	
	//interact with send get request with sample web page.
	
	
	
	WebDriver driver=new ChromeDriver();
	
	
	//perform some operation on above loaded web page.
	
	
	driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\Locateelementbyid.html");
	

	WebElement username= driver.findElement(By.id("username"));

username.sendKeys("username");
Thread.sleep(5000);

	
	


	
}
}
