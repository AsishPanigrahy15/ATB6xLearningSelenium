package com.thetestingacademy.ExSelenium11072024;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab298 {

    @Description("TC#1 - Demo test case")
    @Test
    public void vWoLogin(){
        // Selenium flow
        // 1. Create SessionId - q0786252445wq78we87
        // Client - Java
        // Server - WebDriver Chrome/Edge - Command W3C -> Edge Browser
        // 2. Session -> Run the Commands - GET -> GET Method w3c Protocol
        // 3. ChromeDriver/EdgeDriver (Server) -> Tell the Chrome/Edge browser
        // 4. Open a fresh copy of the Chrome/Edge browser
        // Open the URL - https://sdet.live
        // 5. Driver - Command (POST) Request - Shutdown the browser. SessionID == null

        //EdgeDriver driver = new EdgeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://courses.thetestingacademy.com/");
        driver.quit();
    }
}
