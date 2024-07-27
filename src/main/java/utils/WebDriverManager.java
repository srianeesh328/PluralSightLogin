package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srian\\Downloads\\latestchromedriver\\chromedriver-win64\\chromedriver.exe");
        return new ChromeDriver();
    }
}
