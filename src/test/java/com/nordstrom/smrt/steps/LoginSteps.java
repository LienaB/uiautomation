package com.nordstrom.smrt.steps;

import com.nordstrom.smrt.driver.Driver;
import com.nordstrom.smrt.pages.LoginPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class LoginSteps extends BaseSteps {
    @Given("^SMRT User has been logged in to the application$")
    public void smrtUserHasBeenLoggedInToTheApplication(){

        LoginPage page =  PageFactory.initElements(Driver.get(), LoginPage.class);
        page.navigate(config.baseHost);
        page.login(config.smrtUser, config.smrtPassword);
    }


}
