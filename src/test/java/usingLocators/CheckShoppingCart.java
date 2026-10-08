package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckShoppingCart {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        boolean result = driver.findElement(By.linkText("Shopping cart")).isDisplayed();

        if (result) {
            System.out.println("Shopping Cart is displayed - PASS");
        } else {
            System.out.println("Shopping Cart is not displayed - FAIL");
        }

        driver.quit();
    }
}

//isDisplayed is check whether it is visible are