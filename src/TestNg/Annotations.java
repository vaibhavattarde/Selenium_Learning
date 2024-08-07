package TestNg;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("BEFORE SUITE");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BEFORE TEST");
    }

    @BeforeClass
    public void beforeCLASS() {
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BEFORE METHOD");
    }

    @Test
    public void Test1() {
        System.out.println("THIS IS TEST CASE ___1");
    }

    @Test
    public void Test2() {
        System.out.println("THIS IS TEST CASE ___2");
    }

    @Test
    public void Test3() {
        System.out.println("THIS IS TEST CASE ___3");
    }

    @AfterClass
    public void AFTERCLASS() {
        System.out.println("AFTER CLASS");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AFTER METHOD");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AFTER TEST");
    }

    @AfterSuite
    public void Aftersuite()
    {
        System.out.println("AFTER SUITE");
    }

}
