package usingLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("ti6dpd")).sendKeys("Irfan");
	List<WebElement> suggestions = driver.findElements(
		    By.cssSelector("div[role='presentation']")
		);
          System.out.println(suggestions.size());
		for (WebElement suggestion : suggestions) {
		    if (suggestion.isDisplayed()) {
		        System.out.println(suggestion.getText());
		    }
		}
		Thread.sleep(3000);
		driver.quit();
	
	
	}

}
