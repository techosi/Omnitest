package com.omni.module.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by rtatavarty on 8/9/17.
 */
public class DriverInit {

    public static WebDriver driver;

    public WebDriver getDriver(String browserType) {

        //gecko driver need to be worked on in Mac
        /*driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.setProperty("webdriver.firefox.marionette", "path/geckodriver");*/

        if(browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.omnitest", "chromedriver");
            driver = new ChromeDriver();
        }

        else if(browserType.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.chrome.omnitest", "/Users/rtatavarty/chromedriver/chromedriver");
            driver = new ChromeDriver();
        }

        else if(browserType.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        }

        return driver;

    }

}
