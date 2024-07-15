package com.thetestingacademy.ExSelenium11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab303 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        Thread.sleep(5000);
        driver.close();

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://app.vwo.com/");
        Thread.sleep(5000);
        driver1.quit();

        // IQ - close() vs quit()
        // close():
        // Close the current browser window but not the full browser
        // Session Id != null

        // quit();
        // Close all the sessions/window and stop the browser
        // Session = null, Error - Session ID is null



    }
}
