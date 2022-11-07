package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwEtsyTV {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        Thread.sleep(3000);
        WebElement SearchBox = driver.findElement(By.name("search_query"));
        SearchBox.sendKeys("wooden spoon" + Keys.ENTER);
        Thread.sleep(2000);
        String ExpectedTitle = "Wooden spoon | Etsy";
        String ActualTitle = driver.getTitle();
        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println("Title Verified");
        }else {
            System.out.println("Title not Verified");
        }
        driver.quit();






    }
}
