package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookButton {
     public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver = new ChromeDriver();
    	 
    	 driver.get("https://demowebshop.tricentis.com/");
    	 Thread.sleep(4000);
    	 driver.findElement(By.linkText("Books")).click();
    	 Thread.sleep(2000);
    	 String url = driver.getCurrentUrl();
    	 if(url.contains("books")) {
    		 System.out.print("Test passed");
    	 }else {
    		 System.out.print("Test failed");
    	 }
    	 
    	 
     }
}
