package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Heading {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		boolean check = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
		if(check) {
			System.out.println("Test case passed");
		}else{
			System.out.println("Test case failed");
		}
	 driver.quit();
	}

}
