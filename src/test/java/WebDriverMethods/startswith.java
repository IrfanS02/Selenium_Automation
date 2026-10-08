package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startswith {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://xpath-by-shreenibas.netlify.app/");
	    boolean result = driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).isDisplayed();	
	    System.out.println(result);
	    driver.quit();
	}

}
