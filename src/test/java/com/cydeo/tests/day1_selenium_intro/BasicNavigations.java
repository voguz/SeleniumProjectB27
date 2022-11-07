package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //set up web driver manager
        WebDriverManager.chromedriver().setup();
        //opening an empty driver
        WebDriver driver = new ChromeDriver();

        //making window full screen/max
        driver.manage().window().maximize();

        //navigating to page
        driver.get("https://www.tesla.com");
        //driver.navigate().to("https://www.tesla.com"); doing same job

        Thread.sleep(3000); // hata verecek uzerine gel bekle Add exception to methodu sec hata gidecek

        //navigate to previous page
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        String currentTitle = driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        String CurrentURL = driver.getCurrentUrl();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        // driver.close(); // close current page

        driver.quit(); // close browser





    }

}
