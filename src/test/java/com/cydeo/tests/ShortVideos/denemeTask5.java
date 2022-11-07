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

public class denemeTask5 {
    /*
    1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
 Select year using   : visible text
Select month using    : value attribute Select
day using : index number
     */

    WebDriver driver ;

    @BeforeMethod
    public void setUpMethod (){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Confirmation (){
        driver.get("https://practice.cydeo.com/dropdown ");
        Select DateDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));

        DateDropDown.selectByVisibleText("1923");

        String ActualDate = DateDropDown.getFirstSelectedOption().getText();
        String ExpectedDate = "1923";
        Assert.assertEquals(ActualDate,ExpectedDate, "year didnt match!");

        Select DateMonth = new Select(driver.findElement(By.id("month")));

        DateMonth.selectByValue("11");

        String ActualMonth = DateMonth.getFirstSelectedOption().getText();
        String ExpectedMonth = "December";
        Assert.assertEquals(ActualMonth,ExpectedMonth, "Month didnt match!");

        Select DateDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        DateDay.selectByIndex(0);

        String ActualDay = DateDay.getFirstSelectedOption().getText();
        String ExpectedDay = "1";
        Assert.assertEquals(ActualDay,ExpectedDay, "Day didnt match!");




    }
    @AfterMethod
    public void tearDownMethod (){
        driver.quit();
    }


}
