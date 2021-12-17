package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce1 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.xpath("//*[@title='Show products in category Notebooks']")).click();
        driver.findElement(By.xpath("//*[@title='Show details for Apple MacBook Pro 13-inch']")).click();
        driver.findElement(By.id("product_enteredQuantity_4")).click();
        driver.findElement(By.id("add-to-cart-button-4")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }
}
