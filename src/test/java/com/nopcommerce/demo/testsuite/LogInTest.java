package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.LogInPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    LogInPage logInPage = new LogInPage();
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        logInPage.clickOnLogIn();
        String actualLogInText = logInPage.VerifyLoginText();
        String expectedLogInText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualLogInText,expectedLogInText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        logInPage.clickOnLogIn();
        logInPage.enterEmail1("username17@gmail.com");
        logInPage.enterPassword("abc123");
        logInPage.clickOnLogIn1();
        String actualLogoutText = logInPage.verifyLogoutText();
        String expectedLogoutText = "Log out";
    }
    @Test
    public void verifyTheErrorMessage(){
        logInPage.clickOnLogIn();
        logInPage.enterEmail();
        logInPage.enterPassword("abcd123");
        logInPage.clickOnLogIn1();
        String expectedErrorText = "Login was unsuccessful. Please correct the errors and try again.";
        String actualErrorText = logInPage.verifyErrorText();
        String finalText = actualErrorText.substring(0,64);
        Assert.assertEquals(finalText,expectedErrorText);


    }
}