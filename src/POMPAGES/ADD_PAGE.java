package POMPAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ADD_PAGE {
    public static WebDriver driver=null;
   By AddEmp= By.xpath("//a[text()='Add Employee']");
  By firstname= By.xpath("//input[@name='firstName']");
  By middlename= By.xpath("//input[@name='middleName']");
  By surname =By.xpath("//input[@name='lastName']");

  By empid = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");

  By slider =By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");

  By username = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");

  By Enabled = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span");

  By password =By.xpath("(//input[@type='password'])[1]");

  By repeatPassword = By.xpath("(//input[@type='password'])[2]");

  By save =By.xpath("//button[@type='submit']");

    public ADD_PAGE(WebDriver driver)
    {
        this.driver=driver;
    }

    public void ADDEMPDETAILS() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(AddEmp).click();
        Thread.sleep(3000);
        driver.findElement(firstname).sendKeys("vaibhav");
        driver.findElement(middlename).sendKeys("pravin");
        driver.findElement(surname).sendKeys("Attarde");
        driver.findElement(empid).sendKeys("10909");
        driver.findElement(slider).click();
        driver.findElement(username).sendKeys("va1999");
        driver.findElement(Enabled).click();
        driver.findElement(password).sendKeys("01101999a");
        driver.findElement(repeatPassword).sendKeys("01101999a");
        driver.findElement(save).click();
    }



}
