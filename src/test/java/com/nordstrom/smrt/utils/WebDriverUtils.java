package com.nordstrom.smrt.utils;

import com.nordstrom.smrt.base.TestConstants;
import com.nordstrom.smrt.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class WebDriverUtils {

    public static WebElement getElement(By locator){
        return Driver.get().findElement(locator);
    }


    public static void clickOnElement(By locator){
        WebElement element = getElement(locator);
        if (null!=element) element.click();
    }

    public static void enterValueTo(By locator, String text){
        WebElement element = getElement(locator);
        if (null!=element) {
            element.clear();
            element.sendKeys(text);
        }
    }

    public static String getElementText(By locator){
        WebElement element = new WebDriverWait(Driver.get(), TestConstants.WAIT_ELEMENT_TIME)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        if (null!=element) return element.getText();
        return "";
    }
}
