package com.cydeo.tests.day4_xpath_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkboxes {
    public static void main(String[] args) throws InterruptedException {
       // 1. Go to http://practice.cydeo.com/checkboxes
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));


        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected() , expecting False  = " + checkbox1.isSelected());


        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected() , expecting True= " + checkbox2.isSelected());


        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected() , expecting True = " + checkbox1.isSelected());



        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected() , expecting False = " + checkbox2.isSelected());


    }
}
