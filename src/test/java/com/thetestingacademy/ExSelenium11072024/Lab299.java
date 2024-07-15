package com.thetestingacademy.ExSelenium11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lab299 {
    public static void main(String[] args) {

        // Importance Concept of Oops ->
        // interface interfaceRef = new Class();
        // 1. Inheritance
        // 2.Upcasting -> Dynamic Dispatch

        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new EdgeDriver();
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new InternetExplorerDriver();
        WebDriver driver4 = new SafariDriver();

        // Opera - Selenium - Removed

        // Edge
        // SearchContext(I) (2) - Function
        // WebDriver(I) (10) - Function
        // RemoteWebDriver(C) (15) - Function
        // ChromiumDriver(C) (25) - Function
        // EdgeDriver(C) (45) - Function

        // Chrome
        // SearchContext(I) (2) - Function
        // WebDriver(I) (10) - Function
        // RemoteWebDriver(C) (15) - Function
        // ChromiumDriver(C) (25) - Function
        // ChromeDriver(C) (45) - Function
    }
}
