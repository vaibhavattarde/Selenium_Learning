package main.java.ExtentReportBS;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestScenarios extends ExtentReportBS.BaseTest {

    @Test(priority = 1)
    public void loginWithValidUserDetails() {

        startTest("Login With Valid User Details", "Rohan Aher", "Smoke Test");

        try {
            //  Create Test steps
            extentTest.log(Status.INFO, "Step 1: Open a web browser.");

            extentTest.log(Status.INFO, "Step 2: Go to Swag Labs login page: https://www.saucedemo.com/");
            driver.navigate().to("https://www.saucedemo.com");

            extentTest.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
            WebElement loginButton = driver.findElement(By.id("login-button"));

            extentTest.log(Status.INFO, "Step 4: Enter a valid username and password (e.g., standard_user / secret_sauce).");
            WebElement usernameField = driver.findElement(By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));
            usernameField.sendKeys("standard_user");
            passwordField.sendKeys("secret_sauce");

            extentTest.log(Status.INFO, "Step 5: Click the 'Login' button.");
            loginButton.click();
            Assert.assertTrue(true); // Pass


            // Capture screenshot and attach it to the Extent Report
            //extentTest.pass("Screenshot: LoginWithValidUserDetails", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotAsBase64()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void loginWithInvalidUserName() {

        startTest("Login With Invalid User Name", "Vaibhav", "Sanity Test");

        try {
            //  Create Test steps
            extentTest.log(Status.INFO, "Step 1: Open a web browser.");

            extentTest.log(Status.INFO, "Step 2: Go to Swag Labs login page.");
            driver.navigate().to("https://www.saucedemo.com");

            extentTest.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
            WebElement loginButton = driver.findElement(By.id("login-button"));
            Assert.assertTrue(false); // Expected failure

            extentTest.log(Status.INFO, "Step 4: Enter an invalid username (e.g., invalid_user) and a valid password.");
            WebElement usernameField = driver.findElement(By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));
            usernameField.sendKeys("invalid_user");
            passwordField.sendKeys("secret_sauce");

            extentTest.log(Status.INFO, "Step 5: Click the 'Login' button.");
            loginButton.click();
            Assert.assertTrue(false); // Expected failure
            extentTest.warning("Please Enter All the Details.");

            // Capture screenshot and attach it to the Extent Report
            // extentTest.pass("Screenshot: LoginWithInvalidUserName", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotAsBase64()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void loginWithInvalidPassword() {

        startTest("Login With Invalid Password", "Rohit Gaikwad", "Regression");

        try {
            //  Create Test steps
            extentTest.log(Status.INFO, "Step 1: Open a web browser.");

            extentTest.log(Status.INFO, "Step 2: Go to Swag Labs login page.");
            driver.navigate().to("https://www.saucedemo.com");

            extentTest.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
            WebElement loginButton = driver.findElement(By.id("login-button"));
            Assert.assertTrue(false); // Expected failure

            extentTest.log(Status.INFO, "Step 4: Enter a valid username (e.g., standard_user) and an invalid password (e.g., invalid_password).");
            WebElement usernameField = driver.findElement(By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));
            usernameField.sendKeys("standard_user");
            passwordField.sendKeys("invalid_password");

            extentTest.log(Status.INFO, "Step 5: Click the 'Login' button.");
            loginButton.click();
            Assert.assertTrue(false); // Expected failure
            extentTest.warning("Please Enter All the Details.");

            // Capture screenshot and attach it to the Extent Report
            //extentTest.pass("Screenshot: LoginWithInvalidPassword", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotAsBase64()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void loginWithBlankUsernameAndPassword() {

        startTest("Login With Blank Username and Password", "Rohan Aher", "Regression");

        // Define a condition to skip the test
        boolean skipTest = true; // Set to true to skip, false to execute

        if (skipTest) {
            extentTest.log(Status.SKIP, "Test skipped as per request.");
            throw new SkipException("Skipping this test case with exception");
        } else {
            //  Create Test steps
            extentTest.log(Status.INFO, "Step 1: Open a web browser.");

            extentTest.log(Status.INFO, "Step 2: Go to Swag Labs login page.");
            driver.navigate().to("https://www.saucedemo.com");

            extentTest.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
            long startTime = System.currentTimeMillis();
            WebElement loginButton = driver.findElement(By.id("login-button"));
            Assert.assertTrue(loginButton.isDisplayed()); // Verification

            extentTest.log(Status.INFO, "Step 4: Leave both username and password fields blank.");
        }
    }

    @Test(priority = 5)
    public void loginWithValidUsernameBlankPassword() {

        startTest("Login With Valid Username Blank Password", "Rohan Aher", "Smoke Test");

        try {
            //  Create Test steps
            extentTest.log(Status.INFO, "Step 1: Open a web browser.");

            extentTest.log(Status.INFO, "Step 2: Go to Swag Labs login page.");
            driver.navigate().to("https://www.saucedemo.com");

            extentTest.log(Status.INFO, "Step 3: Verify Swag Labs login page.");
            WebElement loginButton = driver.findElement(By.id("login-button"));
            Assert.assertTrue(loginButton.isDisplayed()); // Verification

            extentTest.log(Status.INFO, "Step 4: Enter a valid username (e.g., standard_user) and leave the password field blank.");
            WebElement usernameField = driver.findElement(By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));
            usernameField.sendKeys("standard_user");

            extentTest.log(Status.INFO, "Step 5: Click the 'Login' button (even if disabled).");
            loginButton.click();
            Assert.assertTrue(false); // Expected failure
            extentTest.warning("Please Enter All the Details.");

            // Capture screenshot and attach it to the Extent Report
            //extentTest.pass("Screenshot: LoginWithValidUsernameBlankPassword", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotAsBase64()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 6)
    public void testNullPointerException() {
        startTest("Test NullPointerException", "Vaibhav", "Exception Handling");

        try {
            // Create a scenario that leads to a NullPointerException
            extentTest.log(Status.INFO, "Step 1: Simulate a NullPointerException by accessing a null object.");
            String str = null;
            int length = str.length(); // This will throw a NullPointerException

            // If NullPointerException is not thrown, fail the test
            Assert.fail("Expected NullPointerException was not thrown.");
        } catch (NullPointerException e) {
            // Catch and handle the NullPointerException
            extentTest.log(Status.FAIL, "Caught NullPointerException: " + e.getMessage());
            extentTest.log(Status.FAIL, "Test failed due to a NullPointerException.");
        }
    }

    @Test(priority = 7)
    public void testIOException() {
        startTest("Test IOException", "Rohan", "Exception Handling");

        try {
            // Create a scenario that leads to an IOException
            extentTest.log(Status.INFO, "Step 1: Simulate an IOException by attempting to read a non-existent file.");
            FileReader fileReader = new FileReader("nonexistentfile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            // If IOException is not thrown, fail the test
            Assert.fail("Expected IOException was not thrown.");
        } catch (IOException e) {
            // Catch and handle the IOException
            extentTest.log(Status.FAIL, "Caught IOException: " + e.getMessage());
            extentTest.log(Status.FAIL, "Test failed due to an IOException.");
        }
    }
}