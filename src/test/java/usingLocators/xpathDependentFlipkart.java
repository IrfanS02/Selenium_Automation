package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDependentFlipkart {
	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(), 'Nokia All-New')]/../../..//div[contains(@class,'ybaCDx')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(), 'Ai+ Pulse 2')]/../../..//div[contains(@class,'ybaCDx')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() = 'COMPARE']")).click();
		Thread.sleep(4000);
		System.out.println("Test Cases Passed");
		driver.quit();
		
	}

}
