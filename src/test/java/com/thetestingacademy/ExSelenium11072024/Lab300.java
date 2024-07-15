package com.thetestingacademy.ExSelenium11072024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab300 {
    public static void main(String[] args) {

        SearchContext driver = new EdgeDriver(); // Dynamic Dispatch (RunTime Polymorphism)
        //Possible but two functions, which is not much used.
        //driver.findElement();
        //driver.findElements();

        WebDriver driver1 = new EdgeDriver();
        // 12 function which is good

        RemoteWebDriver driver2 = new EdgeDriver();

        EdgeDriver driver3 = new EdgeDriver();

        //Scenario

        // 1. Do you want to run on Chrome or Edge?
        // ChromeDriver driver = new ChromeDriver();
        // EdgeDriver driver = new EdgeDriver();

        // 2. Do you want to run on Chrome then change it to Edge?
        //WebDriver driver = new ChromeDriver();
        //driver = new EdgeDriver();

        // 3. Do you want to run on multiple browsers?
        // RemoteWebDriver driver (with Grid) - Advance (Last 2 sessions)

    }
}
