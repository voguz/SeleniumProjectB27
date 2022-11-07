package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getText_getAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Remember me label verification PASSED");
        } else {
            System.out.println("Remember me label verification FAILED");
        }


        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgetPassLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedPassLink = "Forgot your password?";
        String actualPassLink = forgetPassLink.getText();
        if (actualPassLink.equals(expectedPassLink)){
            System.out.println("Forgot your password verification PASSED!");
        } else{
            System.out.println("Forgot your password verification FAILED!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgetPassLink.getAttribute("href");

        if (actualInHref.contains(expectedInHref)){
            System.out.println("href verification PASSED");
        } else {
            System.out.println("href verification FAILED");
        }

        driver.quit();







    }
}
