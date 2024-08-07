package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNg.ListnersClass.class)
public class Listner_demo {

    @Test
    public void verifytitle()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        String Actualurl = driver.getTitle();
        String expectedurl ="Google";
        Assert.assertEquals(Actualurl,expectedurl);
        driver.close();
    }
    @Test
    public void FailTest()
    {
        System.out.println("this is fail testcase ");
        Assert.assertTrue(false);
    }
    @Test
    public void skiptestcase()
    {
        System.out.println("this is skip test case");
        throw new SkipException("skip exception ");
    }
}
