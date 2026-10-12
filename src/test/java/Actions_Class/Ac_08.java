package Actions_Class;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ac_08 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/resources/demos/tooltip/default.html");

        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(5));

        Actions actions = new Actions(driver);

        WebElement ageBox = driver.findElement(By.id("age"));

        actions.moveToElement(ageBox).perform();

        By tooltip = By.className("ui-tooltip-content");

        WebElement ageTooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(tooltip));

        System.out.println("Age Tooltip: " + ageTooltip.getText());

        WebElement tooltipLink = driver.findElement(By.linkText("Tooltips"));

        actions.moveToElement(tooltipLink).perform();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(tooltip, "That's what this widget is"));

        System.out.println("Link Tooltip: " + driver.findElement(tooltip).getText());

        driver.quit();
    }
}