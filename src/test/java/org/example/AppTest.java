package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.TestNGAntTask.Mode.junit;

public class AppTest{
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void googleTest() throws InterruptedException {

//        driver.findElement(By.id("user-name")).sendKeys("standard_user");//user-name
//        Thread.sleep(1000);
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");//user-name
//        Thread.sleep(1000);
//        driver.findElement(By.name("login-button")).click();
//        Thread.sleep(2000);
//        List<WebElement> list = driver.findElements(By.partialLinkText("Sauce"));
//        driver.findElements(By.tagName("a")).size();
//        driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();  //By using linkText
//        // driver.findElement(By.partialLinkText("Sauce")).click();            //By using partialLinkText
//        Thread.sleep(3000);
//        String a = driver.findElement(By.className("inventory_details_price")).getText();
//        System.out.printf(a);
//        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("shopping_cart_container")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("checkout")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("first-name")).sendKeys("Rohan");//firstname
//        driver.findElement(By.id("last-name")).sendKeys("kumar");//lastname
//        driver.findElement(By.id("postal-code")).sendKeys("123456");//pincode
//        Thread.sleep(2000);
//        driver.findElement(By.id("continue")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("finish")).click();
//        Thread.sleep(3000);
        //this is for absolute path
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("jkfbvjhdhv@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("jkfbvjhdhv@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
//        Thread.sleep(1000);
        //this is for relative path
//        driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).sendKeys("standard_user");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@id,user)]")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password' or @name='password1']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button' and @name='login-button']")).click();
        Thread.sleep(1000);







    }
    @AfterClass
    void close(){
        driver.close();
    }


}