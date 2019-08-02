package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitializer {

    private static WebDriver driver = null;

    static {
        try {

            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
            driver = new ChromeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
