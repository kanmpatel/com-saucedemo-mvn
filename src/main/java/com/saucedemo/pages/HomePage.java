package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By emailField = By.name("user-name");
    By passwordField = By.name("password");
    By signInButton = By.cssSelector(".submit-button");

    public void enterEmailAddress(String email){

        sendTextToElement(emailField,email);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }


}
