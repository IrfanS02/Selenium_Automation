package Selenium_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductListing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String url = driver.getTitle();
		if(url.equals("Swag Labs")) {
			System.out.println("Title Verified");
		}else{
			System.out.println("Title not Verified");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		Thread.sleep(2000);
		if(url1.contains("inventory")) {
			System.out.println("Test Case Passed for Url");
		}else {
			System.out.println("Test Case failed for URL");
		}
		Thread.sleep(2000);
		
		List<WebElement> PrdNames = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Total No of Products :"+ PrdNames.size());
		
		for (WebElement Prd : PrdNames) {
		        System.out.println(Prd.getText()); 
		}
		
		if(PrdNames.size() == 6) {
			System.out.println("Count match successfully");
		}else {
			System.out.println("Count not matched");
		}
		
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		boolean cartBadgeshown = driver.findElement(By.className("shopping_cart_badge")).isDisplayed();
		if(cartBadgeshown) 
		{
			System.out.println("cart Badge show successfully");
		}else {
			System.out.println("Cart badge not shown sucessfully");
		}
		driver.quit();
		
		
	}

}
