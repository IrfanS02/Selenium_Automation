package Selenium_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		System.out.println("Title : " + driver.getCurrentUrl());
		
		List<WebElement> deleteBtn = driver.findElements(
				By.xpath("//button[text() = 'Delete']"));
		System.out.println("Count of Delete buttons : "+ deleteBtn.size());
		 Thread.sleep(2000);
		 
		 for(int i = 0 ; i < 5 ; i++) {
			 driver.findElement(By.xpath("//button[text() = 'Add Element']")).click();
		     Thread.sleep(1000);
		 }
		 List<WebElement> DltbtnCnt = driver.findElements(By.className("added-manually"));
		 if(DltbtnCnt.size() == 5) {
			 System.out.println("Delete Button Count is 5");
			 
		 }
		 Thread.sleep(2000);
		 
		 for(int i = 0 ; i < 2 ; i++) {
			 driver.findElement(By.className("added-manually")).click();
			 Thread.sleep(1000);
		 }
		 
		 List<WebElement> updatedDeleteBtns =
			        driver.findElements(By.className("added-manually"));

			System.out.println("Current Delete button count: "
			        + updatedDeleteBtns.size());

			if (updatedDeleteBtns.size() == 3) {
			    System.out.println("Delete button count is 3");
			}
		driver.quit();
		
		
	}

}

//findElement() returns a single WebElement.
//If no matching element is found, it throws a NoSuchElementException.
//
//findElements() returns a List<WebElement>.
//If no matching elements are found, it returns an empty list.
//Therefore, findElements().size() returns 0.
