package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C4_GetPageSource {
    public static void main(String[] args) {
        //Path'i set et
        System.setProperty("webdriver.chrome.driver","C:/Users/guler/Documents/selenium dependencies/drivers/chromedriver.exe");
        //chrome driver objesi olustur
        WebDriver driver = new ChromeDriver();
        // sayfayi maximize et
        driver.manage().window().maximize();
        // google anasayfasina git
        driver.get("https://www.google.com");
        // amazon sayfasina git
        driver.navigate().to("https:/www.amazon.com");

        //getPageSource(), page source String olarak dondurur
        // Tum sayfanin icinde istedigimiz bir text (metin) kullanilip  kullanilmanidigini verify edebilir
        //Note: pageSource icin assertion pek sik kullanilmaz cunku burada cok genel bilgi vardir ve bize yanlis (false) sonuc verebilir

        String  pageSource = driver.getPageSource();

//        System.out.println(pageSource);

//        System.out.println(pageSource.contains("Electronics"));

        if (pageSource.contains("Gaming accessories")){
            System.out.println("Basarili");
        }else {
            System.out.println("Basarisiz");
        }
        driver.close();

    }
}
