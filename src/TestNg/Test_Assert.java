package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Assert{
    WebDriver driver;
    @Test
    public void verifypage()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        String Actual = driver.getTitle();
        String Expected ="Electronics, Cars, Fashion, Collectibles & More | eBay";
        //Assert.assertEquals(Actual,Expected);
        Assert.assertEquals(Expected,Actual);
        driver.close();
    }
}

