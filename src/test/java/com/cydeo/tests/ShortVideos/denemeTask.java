package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class denemeTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/gp/yourstore/home/ref=nav_cs_ys");
        WebElement SearchBox =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        SearchBox.click();
        Thread.sleep(2000);
        SearchBox.sendKeys("iphone 14 case water proof " + Keys.ENTER);

        JavascriptExecutor js = ((JavascriptExecutor)driver) ;
        js.executeScript("window.scroll(0,750)");

        Thread.sleep(2000);



        JavascriptExecutor JS = ((JavascriptExecutor)driver);
        JS.executeScript("window.scroll(0,-750)");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).perform();









    }

}
