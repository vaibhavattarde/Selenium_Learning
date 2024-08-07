package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragDrop {
    WebDriver driver;

    @Test
    public void RightClick() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement Source1 = driver.findElement(By.id("box6")); //rome
        WebElement Destination1 = driver.findElement(By.id("box106"));//Italy
        Actions act = new Actions(driver);
        act.dragAndDrop(Source1,Destination1).perform();
        //-------------------------------------------------------------------------------//
        WebElement Source2 = driver.findElement(By.id("box5")); //seol
        WebElement Destination2 = driver.findElement(By.id("box105"));//sk
        Actions act2 = new Actions(driver);
        act.dragAndDrop(Source2,Destination2).perform();
        //-------------------------------------------------------------------------------//
        WebElement Source3 = driver.findElement(By.id("box1")); //seol
        WebElement Destination3 = driver.findElement(By.id("box101"));//sk
        Actions act3 = new Actions(driver);
        act.dragAndDrop(Source3,Destination3).perform();
        //-------------------------------------------------------------------------------//
        WebElement Source4 = driver.findElement(By.id("box3")); //seol
        WebElement Destination4 = driver.findElement(By.id("box103"));//sk
        Actions act4 = new Actions(driver);
        act.dragAndDrop(Source4,Destination4).perform();
        //-------------------------------------------------------------------------------//
        WebElement Source5 = driver.findElement(By.id("box7"));
        WebElement destination5 = driver.findElement(By.id("box107"));
        Actions act5=new Actions(driver);
        act5.dragAndDrop(Source5,destination5).perform();
        //-------------------------------------------------------------------------------//
        WebElement Source6 = driver.findElement(By.id("box4"));
        WebElement destination6 = driver.findElement(By.id("box104"));
        Actions act6=new Actions(driver);
        act5.dragAndDrop(Source6,destination6).perform();
        //-------------------------------------------------------------------------------//
        WebElement Source7 = driver.findElement(By.id("box2"));
        WebElement destination7 = driver.findElement(By.id("box102"));
        Actions act7=new Actions(driver);
        act5.dragAndDrop(Source7,destination7).perform();


    }
}
