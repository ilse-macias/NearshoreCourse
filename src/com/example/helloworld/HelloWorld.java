package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
   public static void main(String[] args) throws InterruptedException {
        String valueDriverSetProperty = "webdriver.chrome.driver";
        String pathSetProperty = "/Users/ilsemacias/Desktop/drivers/chromedriver";
        String url = "http://www.practiceselenium.com/";

        //Declaration and instance of drivers.
        //Setup
        System.setProperty(valueDriverSetProperty, pathSetProperty);
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get(url);
        Utilities.printMessage("The URL is: "+ url);

        //Functions
        WebElement HerbalTeaButton = driver.findElement
                (By.id("wsb-button-00000000-0000-0000-0000-000450914890"));
        Utilities.printMessage("Element found.");
        HerbalTeaButton.click();
        Utilities.printMessage("Button clicked.");

        //Close
        driver.close(); //Close only a single windows.
        driver.quit(); //Close all windows.
        Utilities.printMessage("The browser is closed.");
   }
}



