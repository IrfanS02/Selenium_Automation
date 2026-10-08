package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
//Title is used to retrieve the title of the currect webpages 
//It return type is string
