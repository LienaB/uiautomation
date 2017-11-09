package com.nordstrom.smrt.steps;

import com.nordstrom.smrt.base.EndpointUrl;
import com.nordstrom.smrt.driver.Driver;
import com.nordstrom.smrt.pages.CustomerChoicePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class CustomerChoiceSteps extends BaseSteps {
    @When("^User navigates to the style & color page$")
    public void userNavigatesToTheStyleColorPage(){
        Driver.get().navigate().to(config.baseHost + EndpointUrl.STYLE_PLUS_COLOR);
    }

    @Then("^Application displays list of style & color items available for listing for 212$")
    public void applicationDisplaysListOfStyleColorItemsAvailableForListingFor(){
        CustomerChoicePage page =  PageFactory.initElements(Driver.get(), CustomerChoicePage.class);
        page.getPageTitle();
        List list = page.getStylePlusColorByDescription("MENS UT/MODERN SHOES");
//        Assert.assertEquals("Wrong title of style plus color", "Page Title", page.getPageTitle() );
    }
}
