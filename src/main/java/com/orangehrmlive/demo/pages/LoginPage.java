package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends UtilityClass {

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;

    public void enterUserName(String username1) {
        Reporter.log("Enter userName" + usernameField);

        sendTextToElement(usernameField, username1);
    }

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    public void enterPassword(String password1) {
        Reporter.log("Enter Password" + passwordField);
        sendTextToElement(passwordField, password1);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public void clickOnLoginButton() {
        Reporter.log("click on login button" + loginButton);
        clickOnElement(loginButton);
    }

    @CacheLookup
    @FindBy(xpath = "//span/h6 [text()='Dashboard']")
    WebElement verifyText;

    public String verifyText() {
        Reporter.log("verify text message" + verifyText);
        return getTextFromElement(verifyText);

    }

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement clickOnForgot;

    public void clickOnForgot() {
        Reporter.log("click on forgot button" + clickOnForgot);
        clickOnElement(clickOnForgot);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement resetPassword;

    public String verifyResetPassword() {
        Reporter.log("verify password" + resetPassword);

        return getTextFromElement(resetPassword);

    }


}
