package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		String source = driver.getPageSource();
		System.out.println(source);
		driver.close();
	}

}

// It is used to Return a source code of a web-page.
// It's return type is string

// find the difference between quit and close