package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FristExample {

public static void main(String[] args) throws InterruptedException {
	
	//Chromer driver path
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	
	
	
	
	
	//interact with send get request with sample web page.
	
	
	
	WebDriver driver=new ChromeDriver();
	
	
	//perform some operation on above loaded web page.
	
	
	driver.get("http://www.example.com");
	
	
	//Retrieve Title of WebPage.
	String title = driver.getTitle();


	
	System.out.println("Page Title is  "+title);

	Thread.sleep(3000);

	
	driver.quit();
	
	
	
}
	
	
}
