package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Bootstrap_DD {

    WebDriver driver;

    @BeforeClass
    public void urlopen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //driver.get("https://www.facebook.com/signup");

    }

    @Test
    public void BootstrapDD() throws InterruptedException {
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
        List<WebElement> VALUES = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
        System.out.println(VALUES.size());


        for (int i = 0; i < VALUES.size(); i++) {
            System.out.println(VALUES.get(i).getText());
            if (VALUES.get(i).getText().contains("jQuery")) {
                VALUES.get(i).click();
            } else {
                System.out.println("NOT CONTAINS IN THIS LIST");


                }

            }


    }
}