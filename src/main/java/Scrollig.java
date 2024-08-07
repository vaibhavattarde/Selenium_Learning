package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

import static java.awt.SystemColor.*;

public class Scrollig {

    WebDriver driver;
@Test
    public void Bypixel() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.calculator.net/");
        JavascriptExecutor js = (JavascriptExecutor)driver; //TYPECAST
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)"); //pixel

    }
    @Test
    public void visiilityofelement() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.calculator.net/");
        JavascriptExecutor js = (JavascriptExecutor)driver; //TYPECAST

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(By.linkText("BMI Calculator"));
        js.executeScript("arguments[0].scrollIntoView();",element); //pixel

    }
    @Test
    public void bottomofpage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.calculator.net/");
        JavascriptExecutor js = (JavascriptExecutor)driver; //TYPECAST

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

}

