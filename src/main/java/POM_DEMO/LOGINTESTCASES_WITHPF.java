package PAGES;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.time.Duration;

public class LOGINTESTCASES_WITHPF {
    WebDriver driver;
@Test
    public void Bypixel() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PAGES.LOGINPAGE_WITHPF lp = new PAGES.LOGINPAGE_WITHPF(driver); //object created
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.saucedemo.com/v1/");
        PAGES.LOGINPAGE_WITHPF.enterusername("standard_user");
        PAGES.LOGINPAGE_WITHPF.password("secret_sauce");
        PAGES.LOGINPAGE_WITHPF.button();

    }


}
