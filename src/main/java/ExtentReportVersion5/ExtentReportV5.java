package ExtentReportVersion5;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.annotations.Test.*;


public class ExtentReportV5 {
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\User\\IdeaProjects\\SeleniumMaven2\\src\\main\\java\\ExtentReportVersion5");
    WebDriver driver;
    ExtentTest Test;
    @BeforeTest
    public void f1()
    {

        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Extent Rport -Neo");
        extent.attachReporter(spark);
    }

    @Test
    public void LoginWithValidUserDetails()
    {
       Test =extent.createTest("Login With Valid users Details").assignAuthor("Vaibhav Attarde").assignCategory("Smoke Test").assignDevice("Chrome");
        Test.log(Status.INFO,"Step 1: Open a web browser.");
        driver = new ChromeDriver();
        Test.log(Status.INFO, "Step 2: Go to Swag Labs login page: https://www.saucedemo.com/");
        driver.get("https://www.saucedemo.com/");
        Test.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Assert.assertTrue(loginButton.isDisplayed());
        Test.log(Status.INFO, "Step 4: Enter a valid username and password (e.g., standard_user / secret_sauce).");
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        Test.log(Status.INFO, "Step 5: Click the 'Login' button.");
        loginButton.click();
    }
    @Test
    public void LoginWithInValidUserName() throws InterruptedException {
        Test =extent.createTest("Login With InValid uses Details").assignAuthor("Vaibhav Attarde").assignCategory("Smoke Test").assignDevice("Chrome");
        Assert.assertTrue(false);   //fail
        // Test Steps:
        Test.log(Status.INFO, "Step 1: Open a web browser.");
        driver = new ChromeDriver();
        Test.log(Status.INFO, "Step 2: Go to Swag Labs login page.");
        driver.get("https://www.saucedemo.com/");
        Test.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Assert.assertTrue(loginButton.isDisplayed());
        Test.log(Status.INFO, "Step 4: Enter an invalid username (e.g., invalid_user) and a valid password.");
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("invalid_user");
        passwordField.sendKeys("secret_sauce");
        Test.log(Status.INFO, "Step 5: Click the 'Login' button.");
        loginButton.click();
    }


    @AfterTest
    public void aftertest()
    {
        extent.flush();
    }
    @AfterMethod
    public void getTestResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
           Test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Fail", ExtentColor.RED));
            Test.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            Test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Pass", ExtentColor.GREEN));
        } else if (result.getStatus() == ITestResult.SKIP) {
            Test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Skip", ExtentColor.YELLOW));
        }


        if (driver != null) {
            driver.quit();
        }
    }

    }
