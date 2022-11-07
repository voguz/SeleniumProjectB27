package com.cydeo.tests.day4_xpath_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");


        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));



        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());


        //5- Print out the texts of the links.// iter  yaz ENTER
        //6- Print out the HREF attribute values of the links

        for (WebElement eachLink : allLinks) {
            System.out.println("Text of each Link = " + eachLink.getText());
            System.out.println("HREF value for each Link = " + eachLink.getAttribute("href"));
        }













    }
}
