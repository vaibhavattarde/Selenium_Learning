package main.java;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.time.Duration;

public class TESTNG {


    @AfterClass
    public void classlevel1()
    {
        System.out.println("This is  After -class level");
    }
    @BeforeMethod
    public void method()
    {
        System.out.println("This is before method");
    }


    @BeforeSuite
    public void globally_Login()
    {
        System.out.println("This declared globally-login");
    }

    @BeforeTest
    public void login()
    {
        System.out.println("login to the page");
    }
    @Parameters({"URL"}) //PARAMETERIZATION
    @Test
    public void checkmenu1(String URLNAME)
    {
        System.out.println("checking the menu-men");
        System.out.println(URLNAME);
    }
    @Test(groups = "Smoke")
    public void checkmenu2()
    {
        System.out.println("checking the menu-women");
    }
    @Test(enabled = false)
    public void checkmenu3()
    {
        System.out.println("checking the menu-child");
    }

    @Test(groups = "Regression")
    public void checkmenu4()
    {
        System.out.println("checking the menu-Adult");
    }
    @AfterTest
    public void logout()
    {
        System.out.println("logout to the page");
    }
    @AfterSuite
    public void globally_Logout()
    {
        System.out.println("This declared globally-logout");
    }
    @AfterMethod
    public void method2()
    {
        System.out.println("This is After method");
    }

    @BeforeClass
    public void classlevel2()
    {
        System.out.println("This is  Before - class level");
    }

}