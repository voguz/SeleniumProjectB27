package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert_Practice {
    /*
    1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }

    @Test
    public void alertTask(){
        WebElement informationAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        //accept method
        alert.accept();
        //5. Verify  successfully clicked a text is displayed.
        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));

        // Assert.assertTrue(textMessage.isDisplayed());

        String actualTextMessage = textMessage.getText();
        String expectedtextMessage= "You successfully clicked an alert";

        Assert.assertEquals(actualTextMessage,expectedtextMessage);

    }

}
