package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {
        // set up chrome and create webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print out the tittle
        driver.get("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        if(title.equalsIgnoreCase("Cydeo")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.quit();





    }
}
