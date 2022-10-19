package com.myProjects.utils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtil {
    public static void verifyTitle(WebDriver driver, String expectedTitle) {


        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
