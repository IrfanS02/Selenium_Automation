package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_11 {
 public static void main(String[] args) throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();

  driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
  Thread.sleep(2000);

  WebElement element = driver.findElement(By.id("clickable"));

  Actions actions = new Actions(driver);
  actions.clickAndHold(element).perform();

  WebElement status = driver.findElement(By.id("click-status"));
  System.out.println("Status : " + status.getText());

  actions.release().perform();

  WebElement dragBox = driver.findElement(By.id("draggable"));
  System.out.println("Current Location of  draggable Box : " + dragBox.getLocation());

  actions.clickAndHold(dragBox).moveToElement(dragBox, 100, 50).release().perform();
  Thread.sleep(2000);
  System.out.println("After Drag Location : " + dragBox.getLocation());

  driver.quit();

 }
}