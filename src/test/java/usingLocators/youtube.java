package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("Vj Siddhu Vlogs Therku Seemai Vlogs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='video-title' and starts-with(@title, 'இங்கதான்')]")).click();
		Thread.sleep(40000);
		driver.quit();
		
	}

}
