package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C1_FirstSeleniumClass {

    public static void main(String[] args) {

        //Driver'in Type ve Path icin System.setProperty() olustur
        System.setProperty("webdriver.chrome.driver", "C:/Users/guler/Documents/selenium dependencies/drivers/chromedriver.exe");

        //WebDriver object olustur. Atomation cade bu ZORUNLUDUR

        WebDriver driver = new ChromeDriver();

        //get() url'e gitmek icin kullanilir

        driver.get("https://www.google.com/");





    }
}
