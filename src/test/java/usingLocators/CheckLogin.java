package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[contains(text(), 'Log in')]")).click();
        driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
        Thread.sleep(2000);
        System.out.println(errorMessage);
        driver.quit();

    }
}