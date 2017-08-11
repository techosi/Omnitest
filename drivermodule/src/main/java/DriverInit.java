
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by rtatavarty on 8/9/17.
 */
public class DriverInit {

    public static WebDriver driver;

    public WebDriver getDriver(String browserType) {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        if(browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/rtatavarty/chromedriver/chromedriver");
            driver = new ChromeDriver();
        }

        else if(browserType.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.chrome.driver", "/Users/rtatavarty/chromedriver/chromedriver");
            driver = new ChromeDriver();
        }

        else if(browserType.equalsIgnoreCase("Safari")) {
            System.setProperty("webdriver.chrome.driver", "/Users/rtatavarty/chromedriver/chromedriver");
            driver = new ChromeDriver();
        }

        return driver;

    }

}
