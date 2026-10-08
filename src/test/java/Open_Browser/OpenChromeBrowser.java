package Open_Browser;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		new ChromeDriver();
	}

}
