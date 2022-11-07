package com.cydeo.tests.ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwXpath {
    public static void main(String[] args) throws InterruptedException {
//        TC #6:  XPATH LOCATOR practice
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

//        3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();
        Thread.sleep(2000);

//       4. Verify text displayed is as expected:
//       Expected: “Clicked on button one!”
        String buttonmessage = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedmssg = "Clicked on button one!";
        String actualmssg = buttonmessage ;

        if (actualmssg.equals(expectedmssg)){
            System.out.println("Text verification PASSED!");
        } else {
            System.out.println("Text verification FAILED!");
        }



        driver.quit();



    }
}
