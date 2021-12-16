package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");

        WebElement emailsearchbutton = driver.findElement(By.id("email"));
        driver.manage().window().maximize();
        emailsearchbutton.click();
        emailsearchbutton.sendKeys("amishamangukiya@gmail.com");
        WebElement password = driver.findElement(By.name("passwd"));
        password.click();
        password.sendKeys("123saumya");
        WebElement signinbutton = driver.findElement(By.id("SubmitLogin"));
        signinbutton.click();
        driver.close();
    }
}
