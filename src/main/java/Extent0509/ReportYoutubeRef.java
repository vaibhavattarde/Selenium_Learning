package Extent0509;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class ReportYoutubeRef
{
    @Test
    public void extentTest() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\User\\IdeaProjects\\SeleniumMaven2\\src\\main\\java\\Extent0509\\ReportYoutubeRef.java");
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Extent Rport -Neo");
        extent.attachReporter(spark);

        ExtentTest test = extent.createTest("Login Test").assignAuthor("Vaibhav Attarde").assignCategory("Smoke Testing").assignDevice("Chrome");//create test node in the report
        test.pass("Login Test Started successfully");
        test.info("URL Is Loaded");
        test.info("Values Entered");
        test.pass("Login Test completed Succesfully");
        test.pass((MarkupHelper.createLabel("Login Test completed Succesfully", ExtentColor.GREEN)));

        ExtentTest test1 = extent.createTest("HomePage Test").assignAuthor("Rohit Gaikwad").assignCategory("Regression Testing").assignDevice("Firefox");//create test node in the report
        test1.pass("Home Page Started successfully");
        test1.info("URL Is Loaded");
        test1.info("Values Entered");
        test1.fail("Home Page Failed");
        test1.fail((MarkupHelper.createLabel("home Page Failed", ExtentColor.RED)));

        extent.flush();//unless you call this method ur report will not writtern with logs
    }

    }



