package com.thetestingacademy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.get("https://courses.thetestingacademy.com/");
        driver.quit();
    }
}
