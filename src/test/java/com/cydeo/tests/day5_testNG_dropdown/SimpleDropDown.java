package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void simpleDropDown() throws InterruptedException {
        /*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
         */

        driver.get("https://practice.cydeo.com/dropdown");

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”

        Select simpleDropDown = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(2000);


        String ActualSimpleDropDown = simpleDropDown.getFirstSelectedOption().getText();
        String ExpectedSimpleDropDown="Please select an option";

        Assert.assertEquals(ActualSimpleDropDown,ExpectedSimpleDropDown);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropDown = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateDropDown = "Select a State";

        Assert.assertEquals(actualStateDropDown,expectedStateDropDown);

    }
    @AfterMethod
    public void tearDownMethod(){

        driver.quit();
    }
}
