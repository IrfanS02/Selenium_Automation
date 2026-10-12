
package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_06 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement hoverButton = driver.findElement(By.id("hover"));
        Thread.sleep(2000);
        WebElement status = driver.findElement(By.id("move-status"));

        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(hoverButton).perform();

        System.out.println("After hover: " + status.getText());
        Thread.sleep(2000);
        WebElement resultsLink = driver.findElement(By.linkText("Click for Results Page"));

        act.moveToElement(resultsLink).perform();
        Thread.sleep(2000);
        System.out.println("After moving away: " + status.getText());

        driver.quit();
    }
}