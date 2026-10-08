package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        WebElement email = driver.findElement(By.id("user-name"));
	        email.sendKeys("standard_user");
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        Thread.sleep(5000);
	        driver.quit();
	        		
	 }

}
