package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab302 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.thetestingacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
