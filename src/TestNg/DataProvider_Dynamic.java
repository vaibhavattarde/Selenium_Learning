package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProvider_Dynamic {
    public static WebDriver driver;

    @BeforeMethod
    public void opening() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(dataProvider = "loginData",priority = 1)
    public void loginTest(String username, String password) {


        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submit"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // Add assertions or further actions based on the test result.
        // For example, you can check if login was successful.
    }

    @DataProvider(name = "loginData")
    public Object[][] getDataFromExcel() throws IOException {
        String filePath = "C:\\Users\\User\\Desktop\\Book1.xlsx";
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = row.getCell(j).toString();
            }
        }

        workbook.close();
        fis.close();

        return data;
    }
    @Test(priority = 2,dependsOnMethods ="loginTest" )
    public void verifttitle()
    {
        Assert.assertEquals(driver.getTitle(),"Test Login | Practice Test Automation");
    }
    @Test(priority = 3,dependsOnMethods ="loginTest")
    public void verifylogo()
    {
        driver.findElement(By.cssSelector("a.custom-logo-link")).isDisplayed();
    }
    @AfterMethod
    public void teardown()
    {
        driver.close();
    }

}
