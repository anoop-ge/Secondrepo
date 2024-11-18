package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocateByClassEg{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\LocateByClassEg.html");

		// wait the web page until loaded successfully.

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.className("button")));

		
		button.click();
		
		WebElement message=wait.until(ExpectedConditions.elementToBeClickable(By.className("message")));
		
		
		System.out.println("Message is "+message.getText());
		
		
		Thread.sleep(10000);
		
		driver.quit(); 

	}
}
