package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Annotaton_attributes {
    @Test(priority = 2,description = "THIS TEST CASE IS RELATED TO MOBILE BASES SYSTEM")
    public void TestCase1()
    {
        System.out.println("MOBILE-BASED LOGIN TEST CASES");
    }
    @Test(priority = 1,description = "THIS TEST CASE IS RELATED TO WEB BASES SYSTEM")
    public void TestCase2()
    {
        System.out.println("WEB-BASES LOGIN TEST CASES");
    }
    @Test(priority =3,timeOut = 200)
    public void TestCase3()
    {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("API-BASES LOGIN TEST CASES");
    }
    @Test
    public void login()
    {

        System.out.println("LOGIN FUNCTION");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "login")
    public void HOMEPAGE()
    {
        System.out.println("HOMEPAGE FUNCTION");
    }


}
