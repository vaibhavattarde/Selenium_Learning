package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicDropDown {
    WebDriver driver;
    @BeforeClass
    public void urlopen () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //driver.get("https://www.facebook.com/signup");
    }

    @Test //BASICAUTH
    public void SimpleALERT () throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement From = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
       From.sendKeys("Ad");
        From.sendKeys(Keys.ARROW_DOWN);
        From.sendKeys(Keys.ENTER);
    }
}
