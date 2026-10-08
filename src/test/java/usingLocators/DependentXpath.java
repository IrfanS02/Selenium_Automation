package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Gift Cards")).click();

        Thread.sleep(2000);

        driver.findElement(
            By.xpath("//a[text() = '$50 Physical Gift Card']/../..//input")).click();

        Thread.sleep(4000);

        driver.quit();
    }
}