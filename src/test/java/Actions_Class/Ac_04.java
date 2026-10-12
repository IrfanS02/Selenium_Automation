package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_04 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement clickableBox = driver.findElement(By.cssSelector("input[placeholder='Clickable']"));

        actions.contextClick(clickableBox).perform();

        WebElement status = driver.findElement(By.id("click-status"));

        System.out.println("Page A Status: " + status.getText());

        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = driver.findElement(By.id("hot-spot"));

        actions.contextClick(box).perform();

        Alert alert = driver.switchTo().alert();
        
        System.out.println("Page B Alert: " + alert.getText());

        alert.accept();

        driver.quit();
    }
}