package com.thetestingacademy.ExSelenium11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Lab304 {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://bing.com");

        // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
