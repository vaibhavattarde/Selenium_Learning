package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ASSERTION_HARD {
    WebDriver driver;

    @BeforeClass
    public void urlopen()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dypatil.edu/schools");
    }
    @Test
    public void checkurl()
    {
        String Actualurl = driver.getTitle();
        Assert.assertEquals(Actualurl,"DY Patil");

    }
    @Test
    public void checklogo()
    {
        WebElement logo = driver.findElement(By.cssSelector(("a[class='logo h-[48px] nuxt-link-active']")));
        Assert.assertTrue(logo.isDisplayed());
    }
    @AfterClass
    public void close()
    {
        driver.close();
    }
}
