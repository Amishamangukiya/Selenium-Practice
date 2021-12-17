package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys();
        driver.findElement(By.id("FirstName")).sendKeys("Sanvi");
        driver.findElement(By.id("LastName")).sendKeys("Mangukiya");
        driver.findElement(By.id("Email")).sendKeys("sanvi08@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("san2014");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("san2014");
        driver.findElement(By.name("register-button")).click();
        String registers=driver.findElement(By.className("result")).getText();

    }
}
