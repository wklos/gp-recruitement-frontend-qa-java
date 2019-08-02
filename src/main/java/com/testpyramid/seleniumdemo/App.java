package com.testpyramid.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Test for Cookie banner" );
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.google.com");
        browser.close();
    }
}
