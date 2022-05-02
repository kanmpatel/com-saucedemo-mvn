package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends Utility {
    By signInText = By.xpath("//span[@class='title']");
    By listOfProducts = By.className("inventory_item_name");
    public String getsignInMessage(){
        return getTextFromElement(signInText);
    }

    public int getSizeOfTheProductList(){
        List<WebElement> productList = getTheListOfElement(listOfProducts);
        return productList.size();
    }

}
