
package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_03 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.scrollToElement(button).perform();

        WebElement field1 = driver.findElement(By.id("field1"));
        String text1 = field1.getAttribute("value");
        Thread.sleep(2000);
        System.out.println("Field1: " + text1);

        act.doubleClick(button).perform();

        WebElement field2 = driver.findElement(By.id("field2"));
        System.out.println("Field2: " + field2.getAttribute("value"));
        Thread.sleep(2000);
        field1.clear();
        field1.sendKeys("Selenium Actions");

        act.doubleClick(button).perform();
        Thread.sleep(2000);
        System.out.println("Field2 after update: " + field2.getAttribute("value"));

        driver.quit();
    }
}