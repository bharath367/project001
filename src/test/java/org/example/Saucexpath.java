package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Saucexpath {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //for window to maximize
    }

    @Test
    public void googleTest() throws InterruptedException {
        //this is for absolute path
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("jkfbvjhdhv@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("jkfbvjhdhv@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
//        Thread.sleep(1000);
        //this is for relative path
        driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password' or @name='password1']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button' and @name='login-button']")).click();
        Thread.sleep(1000);


    }
}
