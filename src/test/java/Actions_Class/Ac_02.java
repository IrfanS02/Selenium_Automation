package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        Thread.sleep(2005);
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder='Clickable']"));

        Actions actions = new Actions(driver);
        Thread.sleep(2005);
        actions.doubleClick(textBox).perform();
        Thread.sleep(2005);
        WebElement status = driver.findElement(By.id("click-status"));
        Thread.sleep(2005);
        System.out.println("Status: " + status.getText());

        driver.quit();
    }
}