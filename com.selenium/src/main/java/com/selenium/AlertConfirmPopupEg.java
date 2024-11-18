package com.selenium;








import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmPopupEg {
	public static void main(String[] args) {
		try {
			// chrome driver path
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			// Create an instance of driver
			WebDriver driver = new ChromeDriver();

			// Load web page under Test
			driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.selenium\\src\\main\\resources\\AlertConfirmPromptEg.html");
			//test alert
			//testAlert(driver);
			
			//test confirm
			//testConfirm(driver);
			
			//test prompt
			
			testPrompt(driver);


			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

private static void testAlert(WebDriver driver) throws InterruptedException{
	WebElement alertButton = driver.findElement(
			By.xpath("//button[text()='Show Alert']"));

	alertButton.click();

	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();

	Thread.sleep(2000);

}

private static void testConfirm(WebDriver driver) throws InterruptedException{
	WebElement alertButton = driver.findElement(
			By.xpath("//button[text()='Show Confirm']"));

	alertButton.click();

	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();

	Thread.sleep(2000);

}

private static void testPrompt(WebDriver driver) throws InterruptedException{
	
	 WebElement promptButton = driver.findElement(By.xpath("//button[text()='Show Prompt']"));
     promptButton.click();
 	 Alert alert = driver.switchTo().alert();
    //alert = driver.switchTo().alert();
 	Thread.sleep(2000);

     System.out.println("Prompt message: " + alert.getText());
     
     alert.sendKeys("Test"); 
     alert.accept(); 
 	Thread.sleep(2000);

	
}

}