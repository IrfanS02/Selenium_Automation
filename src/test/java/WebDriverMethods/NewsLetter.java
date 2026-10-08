package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsLetter {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        

        driver.get("https://www.selenium.dev/selenium/web/locators_tests/locators.html");
        Thread.sleep(2000);
        
        driver.findElement(By.name("newsletter")).click();
        Thread.sleep(2000);
        driver.quit();
//        driver.quit();
        
    }
}
