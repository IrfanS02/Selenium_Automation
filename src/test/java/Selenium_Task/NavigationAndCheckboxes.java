package Selenium_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAndCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());
	    System.out.println("Current URL: " + driver.getCurrentUrl());
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println("Total Count : "+links.size());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkboxes")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Checkboxes Url : "+ currentUrl);
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i < checkBox.size(); i++) {
            System.out.println(
                    "Checkbox " + (i + 1) + " selected: "
                    + checkBox.get(i).isSelected());
        }
		Thread.sleep(2000);
		for(WebElement check : checkBox) {
			if(!check.isSelected()) {
				check.click();
			}
		}
		Thread.sleep(2000);
		
		 for (int i = 0; i < checkBox.size(); i++) {
	            System.out.println(
	                    "Checkbox " + (i + 1) + " selected after click: "
	                    + checkBox.get(i).isSelected());
	        }
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
	        System.out.println("After Back: " + driver.getCurrentUrl());

	        driver.navigate().forward();
	        System.out.println("After Forward: " + driver.getCurrentUrl());

	        driver.navigate().refresh();
	        System.out.println("After Refresh: " + driver.getCurrentUrl());

		 
		driver.quit();
		
		
	}

}
