package com.nordstrom.smrt.driver;

import org.openqa.selenium.WebDriver;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class Driver {

    private static WebDriver driver;

    public static WebDriver get (){

        if (null ==driver){
            driver = new WebDriverFactory().setupDriver("chrome");
        }
        return driver;
    }

}
