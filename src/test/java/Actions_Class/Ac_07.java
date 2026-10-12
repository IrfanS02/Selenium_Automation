package Actions_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_07 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'figure']"));
		Actions actions = new Actions(driver);
		for(WebElement e : elements) {
			WebElement name = e.findElement(By.tagName("h5"));
		    System.out.println("Name Displayed: " + name.isDisplayed());
		    actions.moveToElement(e).perform();
		    System.out.println("After hover name Displayed :" + name.isDisplayed());
		    System.out.println(name.getText());
		}
		
		actions.moveToElement(elements.get(0)).perform();
		elements.get(0).findElement(By.linkText("View profile"));
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();
	}

}
