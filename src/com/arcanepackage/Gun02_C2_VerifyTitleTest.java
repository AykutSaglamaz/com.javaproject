package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C2_VerifyTitleTest {
        /*
    path'i set et
    Chrome driver'i olustur/ac
    window'u maximize et
    https://www.google.com/ anasayfasini ac
    Google basliginin  "google" oldugunu dogrula
     */
        public static void main(String[] args) {
            //Path'i set et
            System.setProperty("webdriver.chrome.driver", "C:/Users/guler/Documents/selenium dependencies/drivers/chromedriver.exe");
            //Chrome driver olustur
            WebDriver driver = new ChromeDriver();

//            Window'u Maximize et
            driver.manage().window().maximize();

//            https://www.google.com/ anasayfasini ac
            driver.get("https://www.google.com/");

//            Google basliginin  "google" oldugunu dogrula
            String expectedTitle ="google";
             String actualTitle =   driver.getTitle();

             if (expectedTitle.equals(actualTitle)){
                 System.out.println("Basarili");
             }else{
                 System.out.println("Basarisiz");
                 System.out.println("Beklenen: "+ expectedTitle);
                 System.out.println("Gercekte: "+ actualTitle);
             }
             driver.close();
       /*
       Eger yazdigimiz scriptler basarisiz olursa

       1)- Script'leri tekrar tekrar kosturuyoruz
       2)- Manuel testing yapiyoruz
       3)- Business Analist(BA) ve Urunun sahibi belirler (Acceptance Criteria)
        Bir Tester olarak sizin goreviniz Dokumanlarda bulunan yanlislari duzeltmek degildir,
        Sizin misyonunuz bug veya kusur bulacak script (kod) yazmak,
        */
        }
}
