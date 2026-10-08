package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {
	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://github.com/login");
	        WebElement email = driver.findElement(By.id("login_field"));
	        email.sendKeys("s.mhdirfan2002@gmail.com");
	        driver.quit();
	        		
	 }

}
