package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPathEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\Locateelementbyid.html");
		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		element.sendKeys("usernameinput");
		System.out.println(element.getAttribute("value"));
		Thread.sleep(5000);
		driver.quit();
	}

}
