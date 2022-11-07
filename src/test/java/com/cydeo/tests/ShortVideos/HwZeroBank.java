package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwZeroBank {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(3000);
        WebElement ActualHeadText = driver.findElement(By.tagName("h3"));
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = ActualHeadText.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Expected Title Verification PASSED");
        }else{
            System.out.println("Expected Title Verification FAILED");
        }
        Thread.sleep(3000);
        driver.quit();







    }
}
