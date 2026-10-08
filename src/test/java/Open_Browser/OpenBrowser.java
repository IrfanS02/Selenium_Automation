package Open_Browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenBrowser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String browser = sc.nextLine();

        WebDriver driver = null;

        switch (browser.toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                System.out.println("Invalid browser");
        }

        if (driver != null) {
            driver.get("https://www.amazon.com");
        }
    }
}