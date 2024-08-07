package main.java.POM_DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
public class logintestcases_WITHOUTPF {
    WebDriver driver;

    public void Bypixel() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PAGES.loginpage_WITHOUTPF lp = new PAGES.loginpage_WITHOUTPF(driver); //object created
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.saucedemo.com/v1/");
        PAGES.loginpage_WITHOUTPF.enterusername("standard_user");
        PAGES.loginpage_WITHOUTPF.password("secret_sauce");
        PAGES.loginpage_WITHOUTPF.button();

    }
}

