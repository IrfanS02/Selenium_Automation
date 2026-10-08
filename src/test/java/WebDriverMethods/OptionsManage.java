package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OptionsManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		Options opt = driver.manage();
//		Window window = opt.window();
//		window.maximize();
		
		//Instead of using like this we use the method chaining for getting
		driver.manage().window().maximize();
		// It is the process of calling one method from another method using dot operator
		//Rule of the method chaining
		// TO achieve method chaining the return type should be not primitive either class name or interface name.
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Thread.sleep(1000);
		
		driver.manage().window().setSize(new Dimension(290,800));
//		WebDriver setPoint = driver.manage().setPosition(5);
//		
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		Thread.sleep(1000);
		
		driver.manage().window().setPosition(new Point(190,700));
		Thread.sleep(1000);
		driver.quit();
		
		
				
				
		
	}

}
