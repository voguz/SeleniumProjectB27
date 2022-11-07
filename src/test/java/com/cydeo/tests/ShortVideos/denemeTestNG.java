package com.cydeo.tests.ShortVideos;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class denemeTestNG {

    /*
    1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
     */

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod (){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Practice (){
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select StateDrop = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        StateDrop.selectByValue("IL");
        StateDrop.selectByVisibleText("Virginia");
        StateDrop.selectByIndex(5);

        String actualSelected = StateDrop.getFirstSelectedOption().getText();
        String expectedSelected = "California";

        Assert.assertEquals(actualSelected,expectedSelected);





    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}

