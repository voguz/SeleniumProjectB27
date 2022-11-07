package com.cydeo.tests.day5_testNG_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StateElement {
    public static void main(String[] args) {
        /*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking. USE
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement AddButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        AddButton.click();

        WebElement DeleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        DeleteButton.click();

        try{
            System.out.println("DeleteButton.isDisplayed() = " + DeleteButton.isDisplayed());
        } catch (StaleElementReferenceException e){
            System.out.println("State Element Reference Exception is already expected");
        }


    }
}
