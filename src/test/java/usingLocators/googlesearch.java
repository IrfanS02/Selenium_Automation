package usingLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.id("ti6dpd"));
		search.sendKeys("Qspider");
		Thread.sleep(3000);
		search.clear();	
		Thread.sleep(3000);
		driver.quit();
	}

}
