package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class ListnersClass implements ITestListener {


    public void onTestStart(ITestContext Result)
    {
        System.out.println("on test start invoked"+ Result.getName());
    }

    public void onTestFailURE(ITestContext Result)
    {
        System.out.println("on test failure invoked" + Result.getName());
    }

    public void onTestSuccess(ITestContext Result)
    {
        System.out.println(" on test success invoked"+ Result.getName());
    }

    public void onTestSkipped(ITestContext Result)
    {
        System.out.println(" skipped test invoked"+ Result.getName());
    }

    public void onTestFailedutwithinsuccesspercentage(ITestContext Result)
    {
        System.out.println("this is failed within success percentage"+ Result.getName());
    }


}
