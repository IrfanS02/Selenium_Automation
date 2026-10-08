package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidandInvalid {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("incorrectUser");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		String error = driver.findElement(By.id("error")).getText();
//		String expectedTitle = "Your username is invalid!";
		if(error.equals("Your username is invalid!")) {
			System.out.println("Test Case Pass for Invalid Data");
		}else {
			System.out.println("Test Case Fails for Invalid Data");
		}
		
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.id("submit")).click();
		
		String url = driver.getCurrentUrl();
//		String login = driver.findElement("")
		String login = driver.findElement(By.className("post-title")).getText();
		if(url.contains("logged-in-successfully") ||
				login == "Logged In Successfully") {
			 System.out.println("Test case passed for Valid data");
		}else {
			System.out.println("Test case failed for Valid data");
		}
		
		
		boolean istrue =  driver.findElement(By.linkText("Log out")).isDisplayed();
		if(istrue) {
			System.out.println("Logout button is visible");
		}else {
			System.out.println("Logout button not visible");
		}
		
		driver.quit();
		
		
	}

}
