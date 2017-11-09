package com.nordstrom.smrt.pages;

import com.nordstrom.smrt.domain.StylePlusColor;
import com.nordstrom.smrt.driver.Driver;
import com.nordstrom.smrt.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class CustomerChoicePage {

    private By byRefreshBtn = By.xpath("//span[text()='Refresh']");
    private By byFiltersBtn = By.xpath("//span[contains(text(),'Filters')]");
    private By byExpandFiltersBtn = By.xpath("//button[@id = 'btnGroupDrop1']");
    private By byTitleTextLbl = By.xpath("//div[contains(@class, 'col-sm-6')]/h3");

    private By byTable = By.xpath("//table[contains(@class,'ipad-table')]");



    public String getPageTitle(){
       return WebDriverUtils.getElementText(byTitleTextLbl);
    }

    private String getText(WebElement element, int index){
        return element.findElement(By.xpath("td["+index+"]")).getText();
    }

    public List<StylePlusColor> getStylePlusColorByDescription(String description){
       WebElement elementTable = Driver.get().findElement(byTable);

        List<WebElement> listRow
                = elementTable.findElements(By.xpath(".//td[text()='"+description+"']/.."));

        List<StylePlusColor> list = new ArrayList<StylePlusColor>();

        for (WebElement element : listRow) {

            StylePlusColor row = new StylePlusColor();
            row.setDepartament(getText(element,1));
            row.set_class(getText(element,2));
            row.setClassName(getText(element,3));
            row.setVendor(getText(element,4));
            row.setStyle(getText(element,5));
            row.setColor(getText(element,6));
            list.add(row);
        }
        return list;

    }

}
