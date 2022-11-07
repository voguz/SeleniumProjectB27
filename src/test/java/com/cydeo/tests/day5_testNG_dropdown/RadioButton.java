package com.cydeo.tests.day5_testNG_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        if (hockeyButton.isSelected()){
            System.out.println("hockey button is selected");

        }else {
            System.out.println("hockey button is not selected");
        }

        // test all radio buttons if they are working or not
        List<WebElement> sportsRadioButton = driver.findElements(By.xpath("//input[@name='sport']"));
        for (WebElement EachSport : sportsRadioButton) {
            EachSport.click();
            if (EachSport.isSelected()){
                System.out.println( EachSport.getAttribute("id") + " Radio button is selected");
            } else {

            }

        }


        driver.quit();




    }
}
