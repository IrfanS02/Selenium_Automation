package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_01 {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
	Thread.sleep(2000);
	WebElement link = driver.findElement(By.id("click"));
	Actions actions = new Actions(driver);
	Thread.sleep(2000);
	actions.click(link).perform();
	System.out.println("Title : "+ driver.getTitle());
	System.out.println("Current Url :" + driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	link = driver.findElement(By.id("click"));
	Thread.sleep(5000);
	actions.moveToElement(link).click().perform();
	Thread.sleep(5000);
	System.out.println("Title : " + driver.getTitle());
	System.out.println("Current Url :"+ driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.quit();	
 }
}
