package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookExample {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize(); //for window to maximize
    }

    @Test
    void applySelectors() throws InterruptedException {
//        driver.findElement(By.cssSelector("input#email")).sendKeys("9390165536");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("9390165536");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("96345494515@gamil.com");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("96765736554");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("button._42ft[name=login]")).click();
//        Thread.sleep(1000);



    }

@AfterClass
        void close() {

            driver.close();
        }

    }
    //symatx to write relative xpath and absolute path
//tagname[@attribute="value"]==//input[@id='user-name']

