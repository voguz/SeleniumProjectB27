package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVer {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cydeo.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        if(title.equalsIgnoreCase("cydeo")){
            System.out.println("it passed");
        }else{
            System.out.println("it failed");
        }

        //String expectedTitle = "Cydeo";
        //String actualTitle = driver.getTitle
        driver.quit();









    }
}
