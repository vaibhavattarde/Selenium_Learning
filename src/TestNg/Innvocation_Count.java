package TestNg;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Innvocation_Count {
    @Test(invocationCount=4 ,threadPoolSize = 2)

    public void Demo(ITestContext context)
    {
        int invocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println( invocation + " " +"THIS IS A TEST CASE ");

    }
    @Test(invocationCount = 2)
    public void Demo2(ITestContext context)
    {
        int extent = context.getAllTestMethods()[1].getCurrentInvocationCount();
        System.out.println(extent+"  "+"THIS IS TEST CASE 2");
    }

}
