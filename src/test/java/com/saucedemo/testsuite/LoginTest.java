package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //Enter “standard_user” username
        homePage.enterEmailAddress("standard_user");
        //* Enter “secret_sauce” password
        homePage.enterPassword("secret_sauce");
        //* Click on ‘LOGIN’ button
        homePage.clickOnSignInButton();
        //* Verify the text “PRODUCTS”
        String expectedLogInText = "PRODUCTS";
        String actualLogInText = inventoryPage.getsignInMessage();
        Assert.assertEquals(expectedLogInText,actualLogInText);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Enter “standard_user” username
        //* Enter “secret_sauce” password
        //* Click on ‘LOGIN’ button
        userSholdLoginSuccessfullyWithValidCredentials();
        //* Verify that six products are displayed
        // on page
        int expectedProductList = 6;
        int actualProductList = inventoryPage.getSizeOfTheProductList();
        Assert.assertEquals(expectedProductList,actualProductList);
    }

}
