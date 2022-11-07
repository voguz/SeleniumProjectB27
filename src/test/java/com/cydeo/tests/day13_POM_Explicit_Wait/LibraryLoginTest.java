package com.cydeo.tests.day13_POM_Explicit_Wait;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    LoginPage LP; // we made this object public


    @BeforeMethod
    public void SetUp(){
        Driver.getDriver().get("https://library1.cydeo.com");
        LP = new LoginPage();

    }

    @Test
    public void required_field_error_message_test(){

        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");


        //3- Do not enter any information
        //4- Click to “Sign in” button
       // LoginPage LP = new LoginPage();
        LP.signInButton.click();



        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(LP.fieldRequiredErrorMsg.isDisplayed());

    }

    @Test
    public void invalid_email_format_err_mes(){
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");



        //3- Enter invalid email format
      //  LoginPage LP = new LoginPage();
        LP.inputUsername.sendKeys("something"); //bcs we want to send invalid email
        LP.signInButton.click();




        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(LP.enterInvalidEmailErrorMsg.isDisplayed());

    }

    @Test
    //Enter incorrect username and incorrect password
    public void  negative_login_test(){
        LP.inputUsername.sendKeys("wronguser@gmail.com");
        LP.inputPassword.sendKeys("wrongpassword@gmail.com");
        LP.signInButton.click();

        //Verify title expected error is displayed
        //Expected message: sorry, Wrong email or password
        Assert.assertTrue(LP.wrongEmailAndPasswordErrorMsg.isDisplayed());
    }



    @AfterMethod
    public void TearDown(){
        Driver.closeDriver();
    }


}
