package com.tests;

import com.pageObject.DriverInitializer;

import static org.junit.Assert.assertFalse;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookieBannerTest {
    
    /**
    * COOKIE BANNER COMPONENT
    * 
    * Cookie banner is displayed when the player is navigates to the site for the first time
    *
    * Cookie banner should be not displayed after clicking on [ACCEPT AND CLOSE] button
    * This is a cookie based solution (if the cookie will be deleted, banner will displayed once again)
    * 
    * Cookie banner is translated to all supported Casino web site languages
    * 
    * After clicking on [COOKIE POLICY] link the "William Hill Cookie Policy" page is opened in a new tab
    * 
    * QUESTIONS
    * 1. Build or plan missing tests to verify that the component is covered with automation tests
    * 2. What should or might be improved in the current implementation of the test 
    * 3. How would you use the src/main/java/com/pageObject/CookieBanner class and what advantages it might bring to the project
    * 4. What components should be added / adjusted within the project to get a better framework
    *    Example: replace "System.out.println" with a proper logger
    *  
    */
    

    static WebDriver webDriver;


    @BeforeClass
    public static void setUp() throws Exception {
        webDriver = DriverInitializer.getDriver();
    }

    @AfterClass
    public static void tearDown() {
        webDriver.quit();
    }

    @Before
    public void navigate() {
        System.out.println("Open Casino page");
        webDriver.get("https://casino.williamhill.com/en-gb/");
    }

    @Test
    public void clickOnCookieBanner() {
        WebElement cookieBanner = webDriver.findElement(By.cssSelector(".cookie-disclaimer__holder"));
        WebElement cookieBannerButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/button"));
        System.out.println("Click on cookie banner");
        cookieBannerButton.click();
        System.out.println("Verify cookie banner is not displayed after click");
        assertFalse(checkVisibilityofElement(cookieBanner));
        
    }
    

    private boolean checkVisibilityofElement(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
   

}
