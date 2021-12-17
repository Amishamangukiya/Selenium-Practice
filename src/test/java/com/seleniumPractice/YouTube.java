package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YouTube {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//*[@aria-label='Agree to the use of cookies and other data for the purposes described']")).click();

        driver.manage().window().maximize();
        WebElement searchBtn = driver.findElement(By.name("search_query"));
        searchBtn.click();
        searchBtn.sendKeys("ajib dastan hain kahan shuru kahan khatam ");
        driver.findElement(By.id("search-icon-legacy")).click();
        driver.findElement(By.className("style-scope yt-img-shadow")).click();




    }

}