package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthentication {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		 Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
        System.out.println("Window Handle: " + driver.getWindowHandle());

        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(2000);
        
        driver.findElement(By.partialLinkText("Form")).click();
        Thread.sleep(2000);
        
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("login")) {
        	System.out.println("Login page Url Verified");
        }else {
        	System.out.println("Login page Url not Verified");
        }
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("#username")).sendKeys("tosmith");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password")).sendKeys("wrongpass");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type = 'submit']")).click();
        Thread.sleep(2000);
        
        String invalidMessage = driver.findElement(
                By.cssSelector(".flash")).getText();

        System.out.println("Invalid Login Message: " + invalidMessage);
        Thread.sleep(2000);
        if (invalidMessage.contains("Your username is invalid!")) {
            System.out.println("Invalid username message verified");
        } else {
            System.out.println("Invalid username message not found");
        }
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type = 'submit']")).click();
        Thread.sleep(2000);
        
        String secureUrl = driver.getCurrentUrl();
        
        if (secureUrl.contains("secure")) {
            System.out.println("Secure URL verified");
        } else {
            System.out.println("Secure URL verification failed");
        }

        String successMessage = driver.findElement(
                By.cssSelector("#flash")).getText();

        System.out.println("Success Message: " + successMessage);
        if (successMessage.contains(
                "You logged into a secure area!")) {
            System.out.println("Success message verified");
        } else {
            System.out.println("Success message not found");
        }
        Thread.sleep(1000);
        String pageSource = driver.getPageSource();

        if (pageSource.contains("Secure Area")) {
            System.out.println("Page source contains Secure Area");
        } else {
            System.out.println("Secure Area not found in page source");
        }
        Thread.sleep(1000);
        driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(1000);

        
        String logoutURL = driver.getCurrentUrl();

        if (logoutURL.endsWith("/login")) {
            System.out.println("Logout successful");
            System.out.println("Login URL verified after logout");
        } else {
            System.out.println("Logout verification failed");
        }
        Thread.sleep(1000);

        // 10. Theory:
        // close() closes the current browser window.
        // quit() closes all browser windows opened by WebDriver
        // and ends the WebDriver session.
        
        driver.quit();
	}

}
