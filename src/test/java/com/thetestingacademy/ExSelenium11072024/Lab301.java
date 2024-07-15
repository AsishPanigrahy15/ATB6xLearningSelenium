package com.thetestingacademy.ExSelenium11072024;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lab301 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        // Selenium 3.0
        // JSON wire protocol
        //Setting system properties of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/ChromeDriver");
        driver.get("https://sdet.live");

        // Selenium 4.0
        // Selenium manager - W3C protocol
        // Opera Removed
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://sdet.live");
    }
}
