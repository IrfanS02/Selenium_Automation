package usingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        WebElement computer = driver.findElement(By.linkText("Computers"));
        System.out.println(computer);
        computer.click();
        String url = driver.getCurrentUrl();
        if(url.contains("computers")) {
        	System.out.println("Test Passed");
        }else {
        	System.out.println("Test case failed");
        }
        WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        	search.click();
        	search.sendKeys("Mouse");
        	
        	System.out.println(search);
        	
        	driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
        	
//        driver.quit();
        
        
        
        
    }
}