package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossbrowsing {
    WebDriver driver;
    @BeforeMethod
    @Parameters({"browser"})

    public void Launch( String browser)
    {

        switch (browser.toLowerCase())
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

            default:
                driver=null;
                break;

        }
    }
    @Test(alwaysRun = true)
    public void title()
    {
        driver.get("https://www.google.com/");
        String Actualurl = driver.getTitle();
        String expectedurl ="Google";
        Assert.assertEquals(Actualurl,expectedurl);
    }
    @AfterMethod
    public void teardown()
    {
        driver.close();
    }
}
