package com.telran.qa11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver wd;
@BeforeMethod
    public void setUp(){
    wd=new ChromeDriver();
    wd.get("https://yandex.ru/");

    }
   @Test
    public void openYandex(){
        System.out.println("Site opened");
    }

    @AfterMethod (enabled=false)
    public void tearDown(){
    wd.quit();
    }
}
