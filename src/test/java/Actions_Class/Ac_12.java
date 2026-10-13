package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		action.clickAndHold(drag).release(drop).perform();
		
		WebElement status = driver.findElement(By.id("drop-status"));
		System.out.println("Status : " + status.getText());
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		drag = driver.findElement(By.id("draggable"));
		drop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		action.clickAndHold(drag).moveToElement(drop).release().perform();
	    status = driver.findElement(By.id("drop-status"));
		System.out.println("Status : " + status.getText());
		
		driver.quit();
	}

}
