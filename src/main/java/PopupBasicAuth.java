package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PopupBasicAuth {

        WebDriver driver;
        @Test
        public void urlopen () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
            driver.get("https://www.facebook.com/signup");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }

        @Test //BASICAUTH
        public void SimpleALERT () throws InterruptedException {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //FIND ALERT BUTTON AND CLICK ON THE BUTTON
        driver.findElement(By.xpath("//input[@value=\"Alert\"]")).click();
        driver.switchTo().alert().accept(); //OK BUTTON ACCEPTED

    }
    }

