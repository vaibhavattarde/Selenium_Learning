package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Parameters {
    @Test
    @Parameters({"i","j"})
    public void addition(int a , int b)
    {
        System.out.println("add" +""+ (a+b));
    }
    @Test
    @Parameters({"i","j"})
    public void subtraction(int a , int b)
    {
        System.out.println("sub" +""+ (a-b));
    }
    @Test
    @Parameters({"i","j"})
    public void Multiplication(int a , int b)
    {
        System.out.println("Mul" +""+ (a*b));
    }
}
