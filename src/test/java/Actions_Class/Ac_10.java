
package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class Ac_10 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        Actions actions = new Actions(driver);

        By absoluteLocation = By.id("absolute-location");

        actions.moveToLocation(8, 12).perform();
        printLocation(driver, absoluteLocation);

        actions.moveToLocation(200, 300).perform();
        printLocation(driver, absoluteLocation);

        actions.moveToLocation(200, 300).perform();
        printLocation(driver, absoluteLocation);

        try {
            actions.moveToLocation(5000, 5000).perform();
        } catch (MoveTargetOutOfBoundsException e) {
            System.out.println(
                "Exception: " + e.getClass().getSimpleName()
            );
        }

        driver.quit();
    }

    public static void printLocation(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        System.out.println("Absolute Location: " + element.getText());
    }
}