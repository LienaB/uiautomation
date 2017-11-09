package com.nordstrom.smrt.steps;

import com.nordstrom.smrt.base.EndpointUrl;
import com.nordstrom.smrt.driver.Driver;
import com.nordstrom.smrt.pages.TargetsAndDispositionPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class DispositionSteps extends BaseSteps {
    @Given("^I want to have all available CC in 209 sent to 212$")
    public void userNavigatesToTheCustomerChoiceDescriptionPage()  throws Throwable {
        Driver.get().navigate().to(config.baseHost + EndpointUrl.CUSTOMER_CHOICE);
        TargetsAndDispositionPage page =  PageFactory.initElements(Driver.get(), TargetsAndDispositionPage.class);
        page.getPageTitle();
        throw new Exception();
    }

    @When("^I select disposition Send all to Store$")
    public void userClicksOnSendAllToStoreButton()throws Throwable {
        TargetsAndDispositionPage page = PageFactory.initElements(Driver.get(), TargetsAndDispositionPage.class);
        page.clickOnSendAllToStoreBtn();
        throw new Exception();
    }

    @Then("^Application sets targets for all SKUs for selected CC to infinite sign$")
    public void settingInfiniteSignToTarget()throws Throwable {
        TargetsAndDispositionPage page =  PageFactory.initElements(Driver.get(), TargetsAndDispositionPage.class);
        page.getPageTitle();

        throw new Exception();
    }

    @And("^Application disables target fields$")
    public void checkFieldDisabled() throws Throwable {

        throw new Exception();
    }
}
