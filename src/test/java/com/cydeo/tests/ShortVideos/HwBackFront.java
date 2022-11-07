package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwBackFront {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(2000);

        WebElement GLink = driver.findElement(By.className("gb_d"));
        GLink.click();

        String expectedTitle = "Gmail";
        String actualTitle= driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh();

        String ExpectedTitle2 = "Google";
        String ActualTitle2 = driver.getTitle();
        if (ActualTitle2.equals(ExpectedTitle2)){
            System.out.println("Main Title PASSED");
        }else {
            System.out.println("Main Title FAILED");
        }

        driver.quit();










    }
}
