package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by nkramarenko on 2/16/2017.
 */
public class DriverTemplate {

    public static WebDriver chromeDriver() {
        System.setProperty("webdriver.chrome.driver", "d:/MWH/determine-test/src/test/src/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }
}
