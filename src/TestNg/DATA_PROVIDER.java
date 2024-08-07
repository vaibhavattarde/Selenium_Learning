package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DATA_PROVIDER {
    @Test(dataProvider = "SEARCHDATAPAIR")
    public void GoogleSearchTopic(String Country ,String Monument) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));//USER
        search.sendKeys(Country + "  " + Monument);//CLICK
        WebElement click = driver.findElement(By.name("btnK"));//PASS
        click.click();
        driver.close();
    }
    @DataProvider(name="SEARCHDATAPAIR")
    public Object[][] searchdata()
    { //india-fort
        //italy = lake
        // USA -STATUE
        Object[][] searchkeypair = new Object[3][2];
        searchkeypair[0][0]="india";
        searchkeypair[0][1]="fort";

        searchkeypair[1][0]="Italy";
        searchkeypair[1][1]="Lake";

        searchkeypair[2][0]="USA";
        searchkeypair[2][1]="HILLS";

        return searchkeypair;

    }
}
