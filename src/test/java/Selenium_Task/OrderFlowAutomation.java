
package Selenium_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderFlowAutomation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

     
        WebElement dropdown = driver.findElement(By.className("product_sort_container"));

        Select sort = new Select(dropdown);

        List<WebElement> options = sort.getOptions();

        for (WebElement e : options) {
            System.out.println(e.getText());
        }

      
        sort.selectByVisibleText("Price (low to high)");

      
        WebElement newdropdown = driver.findElement(By.className("product_sort_container"));

        Select newsort = new Select(newdropdown);

        String selectedOption = newsort.getFirstSelectedOption().getText();

        System.out.println("Selected option: " + selectedOption);

        
        WebElement cheapestProduct = driver.findElement(By.className("inventory_item"));

        String productName = cheapestProduct.findElement(By.className("inventory_item_name")).getText();

        String productPrice = cheapestProduct.findElement(By.className("inventory_item_price")).getText();

        System.out.println("Cheapest Product: " + productName);
        System.out.println("Cheapest Price: " + productPrice);

        driver.quit();
    }
}