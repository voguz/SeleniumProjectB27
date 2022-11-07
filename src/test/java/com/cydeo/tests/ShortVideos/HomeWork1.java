package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.get("https://practice.cydeo.com");
        Thread.sleep(5000);
        String Title1 = driver.getTitle();
        if (Title1.equalsIgnoreCase("practice")){
            System.out.println("Title is expected");
        }else{
            System.out.println("Title is not expected");
        }
        String Url1 = driver.getCurrentUrl();
        if (Url1.contains("cydeo")){
            System.out.println("Url expected");
        }else{
            System.out.println("Url is not expected");
        }
        Thread.sleep(3000);

        driver.quit();









    }
}
