package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_05 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		WebElement button =  driver.findElement(By.xpath("//span[text() = 'right click me']"));
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    act.contextClick(button).perform();
	    WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
	    Thread.sleep(2000);
	    System.out.println("Copy displayed: " + copy.isDisplayed());
	    copy.click();
	    Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
        act.contextClick(button).perform();
        WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
        delete.click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Alert text: " + alert2.getText());
        alert2.accept();
        driver.quit();
	}

}
