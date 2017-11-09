package com.nordstrom.smrt.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class WebDriverFactory {

    WebDriver  driver = null;

    public WebDriver setupDriver(String driverName){

        if ("chrome".equals(driverName))
        {
            ChromeDriverManager.getInstance().setup();
            ChromeDriverManager.getInstance();
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }

        return driver;
    }
}
