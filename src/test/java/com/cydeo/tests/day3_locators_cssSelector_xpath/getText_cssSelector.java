package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getText_cssSelector {
    public static void main(String[] args) {
        //1 open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2 go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3 Verify "Log in" button text is as expected
        //Expected: Log In

        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // locate with using cssSelector by type  attribite:

        WebElement LogInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //Locate with using cssSelector by value

        WebElement LoginBtn = driver.findElement(By.cssSelector("input[value='Log In']"));




    }
}
