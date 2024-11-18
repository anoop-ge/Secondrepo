package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlForEg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\HtmlFormEg.html");

		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement maleradio = driver.findElement(By.id("male"));
		WebElement femaleradio = driver.findElement(By.id("female"));
		WebElement subCheckbox = driver.findElement(By.id("subscribe"));
		WebElement dropdownSelect = driver.findElement(By.id("dropdown"));
		WebElement submitButton = driver.findElement(By.id("submitBtn"));
		WebElement message = driver.findElement(By.id("message"));

		usernameField.sendKeys("someusername");
		System.out.println("Username entered is:" + usernameField.getAttribute("value"));
		maleradio.click();

		String str = maleradio.isSelected() ? "Male" : "Female";
		System.out.println("Radio selected is " + str);
		subCheckbox.click();
		System.out.println("Subscribed " + subCheckbox.isSelected());

		Select drpdownSelect = new Select(dropdownSelect);
		drpdownSelect.selectByVisibleText("Option 2");

		System.out.println(drpdownSelect.getFirstSelectedOption().getText());

		submitButton.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.quit();

	}

}
