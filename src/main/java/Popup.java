import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Popup {
    WebDriver driver;

    @BeforeClass
    public void urlopen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //driver.get("https://www.facebook.com/signup");
    }

    @Test //ALERTACCEPT //SIMPLEALERT
    public void SimpleALERT() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        //FIND ALERT BUTTON AND CLICK ON THE BUTTON
        driver.findElement(By.xpath("//input[@value=\"Alert\"]")).click();
        driver.switchTo().alert().accept(); //OK BUTTON ACCEPTED

    }
    @Test //CONFIRMALERT  //DISMISS
    public void CONFIRMALERTDISMISS() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        //FIND ALERT BUTTON AND CLICK ON THE BUTTON
        driver.findElement(By.xpath("//input[@value=\"Confirmation Box\"]")).click();
        driver.switchTo().alert().dismiss();  //DISSMISS BUTTON DECLINED
    }
    @Test //CONFIRMALERT  //accept
    public void CONFIRMALERTACCEPT() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        //FIND ALERT BUTTON AND CLICK ON THE BUTTON
        driver.findElement(By.xpath("//input[@value=\"Confirmation Box\"]")).click();
        driver.switchTo().alert().accept();  //DISSMISS BUTTON DECLINED
    }
    @Test //PROMPT ALERT
    public void PROMPTALERT() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        //FIND ALERT BUTTON AND CLICK ON THE BUTTON
        driver.findElement(By.name("prompt")).click();//prompt box open
        driver.switchTo().alert().sendKeys("vaibhav");
        driver.switchTo().alert().accept();
    }

}
