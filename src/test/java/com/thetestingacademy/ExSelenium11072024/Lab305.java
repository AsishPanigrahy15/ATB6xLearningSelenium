package com.thetestingacademy.ExSelenium11072024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab305 {

    @Description("Verify the Title of the page")
    @Test
    public void testVWOLogin(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com"); // http  mandatory
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        driver.quit();
    }
}
