package POMPAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Employee_List {
    public static WebDriver driver=null;
    By EmplIST = By.xpath("//a[text()='Employee List']");
    By Empname = By.xpath("(//input[@placeholder=\"Type for hints...\"])[1]");

    By search = By.xpath("//button[@type=\"submit\"]");
    public Employee_List(WebDriver driver)
    {
        this.driver=driver;
    }

    public void searchemp()
    {
        driver.findElement(EmplIST).click();
        driver.findElement(Empname).sendKeys("vai");
        driver.findElement(Empname).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(Empname).sendKeys(Keys.ENTER);
        driver.findElement(search).click();
    }
}
