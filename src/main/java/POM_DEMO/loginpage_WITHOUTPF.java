package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class loginpage_WITHOUTPF {
    static WebDriver driver;   //constructor is sepecial type of method when ever we created a class it automatically calls constructor name class name is same
   //constructor
   public loginpage_WITHOUTPF(WebDriver d) //parameter
    {
        driver=d;
    }
    //locating web elements

    static By username = By.id("user-name");
    static By password =By.id("password");
    static By loginbutton =By.id("login-button");

    public static void enterusername(String uname)
    {
        driver.findElement(username).sendKeys(uname);
    }

    public static void password(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }

    public static void  button()
    {
        driver.findElement(loginbutton).click();
    }




}
