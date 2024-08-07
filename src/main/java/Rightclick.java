package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
@Test
public class Rightclick {
    WebDriver driver;

    public void RightClick() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.orangehrm.com/");

        //RIGHT CLICK
        WebElement clickfunction = driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
        Actions act = new Actions(driver);
        act.contextClick(clickfunction).perform();

        //DOUBLE CLICK
//        WebElement doubleclickfunction = driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
//        Actions act2 = new Actions(driver);
//        act2.doubleClick(doubleclickfunction).perform();



    }
}
