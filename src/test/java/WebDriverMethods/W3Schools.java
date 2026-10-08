package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

        // Switch into the iframe containing the form
        driver.switchTo().frame("iframeResult");

        WebElement name = driver.findElement(By.name("fname"));
        name.clear();
        Thread.sleep(2000);
        name.sendKeys("Irfan");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}