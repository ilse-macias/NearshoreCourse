package com.nearsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
   public static void main(String[] args) throws InterruptedException {
        //Declaration and instance of drivers.
        //Setup
        System.setProperty(Constants.VALUE_DRIVER_SET_PROPERTY, Constants.PATH_SET_PROPERTY);
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get(Constants.PRACTICE_SELENIUM_URL);
        Utilities.printMessage("The URL is: "+ Constants.PRACTICE_SELENIUM_URL);

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



