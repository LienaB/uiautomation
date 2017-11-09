package com.nordstrom.smrt.pages;

import com.nordstrom.smrt.driver.Driver;
import com.nordstrom.smrt.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class LoginPage {

    private By byUserNameEdt = By.xpath("//input[@ng-reflect-name='username']");
    private By byPasswordEdt = By.xpath("//input[@ng-reflect-name='password']");

    private By bySignInBtn = By.xpath("//input[@value='Sign in']");

    public void navigate (String Url){
        Driver.get().navigate().to(Url);
    }

    public void login (String userName, String password){
        WebDriverUtils.enterValueTo(byUserNameEdt, userName);
        WebDriverUtils.enterValueTo(byPasswordEdt, password);
        WebDriverUtils.clickOnElement(bySignInBtn);
    }
}
