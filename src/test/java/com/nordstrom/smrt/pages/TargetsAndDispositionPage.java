package com.nordstrom.smrt.pages;

import com.nordstrom.smrt.domain.CustomerChoiceDescription;
import com.nordstrom.smrt.driver.Driver;
import com.nordstrom.smrt.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TargetsAndDispositionPage {

    //TODO private By byReturnDiscardBtn = By.xpath("//button[contains(text(), 'Return & Discard')]");
    private By byTitleTextLbl = By.xpath("//div[contains(@class, 'col-sm-7')]/h3[contains(text(), '-')]");
    private By byImageTextLbl = By.xpath("//div[contains(@class, 'col-sm-6')]/h3[contains(text(), 'Image')]");
    private By byDispositionTextLbl = By.xpath("//div[contains(@class, 'col-sm-6')]/h3[contains(text(), 'Disposition')]");

    private By byTable = By.xpath("//table[contains(@class,'table table-bordered')]");
    private By bySendAllToStoreBtn = By.xpath("//button[contains(text(),'Send All to Store')]");



    public String getPageTitle(){
        return WebDriverUtils.getElementText(byTitleTextLbl);
    }

    public void clickOnSendAllToStoreBtn (){
        WebDriverUtils.clickOnElement(bySendAllToStoreBtn);
    }

    private String getText(WebElement element, int index){
        return element.findElement(By.xpath("td["+index+"]")).getText();
    }

    public List<CustomerChoiceDescription> getStylePlusColorByDescription(String description){
        WebElement elementTable = Driver.get().findElement(byTable);

        List<WebElement> listRow
                = elementTable.findElements(By.xpath(".//td[text()='"+description+"']/.."));

        List<CustomerChoiceDescription> list = new ArrayList<CustomerChoiceDescription>();

        for (WebElement element : listRow) {

            CustomerChoiceDescription row = new CustomerChoiceDescription();
            row.setSku(getText(element,1));
            row.setSize1(getText(element,2));
            row.setsize2(getText(element,3));
            row.setTarget(getText(element,4));
            row.setAsoh(getText(element,5));
            row.setInTransit(getText(element,6));
            row.setRequested(getText(element,7));
            row.setSsa(getText(element,8));
            row.setRaw(getText(element,9));
            row.setPull(getText(element,10));
            list.add(row);
        }
        return list;

    }
}
