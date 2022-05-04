package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Register;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    Register register = new Register();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
//Click on the ‘Register’ link
        register.clickOnRegister();
//Verify the text ‘Register’
        String actualRegisterText = register.verifyRegisterText();
        String expectedRegisterText = "Register";
        Assert.assertEquals(actualRegisterText, expectedRegisterText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
//Click on the ‘Register’ link
        register.clickOnRegister();
//Select gender radio button
        register.selectGender();
//Enter First name
        register.enterFirstName("Umi");
//Enter Last name
        register.enterLastName("Patel");
//Select Day Month and Year
        register.selectDayFromIndex(14);
        register.selectMonthFromDropDown("02");
        register.selectYearFromDropDown("2000");
//Enter Email address
        register.enterEmail();
//Enter Password
        register.enterPassword("umi123");
//Enter Confirm password
        register.enterConfirmPassword("umi123");
//Click on REGISTER button
        register.clickOnRegister1();
//Verify the text 'Your registration completed’
        String actualRegistrationText = register.verifyRegisterText1();
        String expectedRegistrationText = "Your registration completed";
        Assert.assertEquals(actualRegistrationText, expectedRegistrationText);
    }
}