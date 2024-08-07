package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGE_WITHPF {
    WebDriver driver;
    LOGINPAGE_WITHPF(WebDriver d)
    {
        driver=d;
        PageFactory.initElements(driver,this);  //this method will create web element
    }
    //webelement find
    @FindBy(id="user-name")
    static WebElement username;

    @FindBy(id="password")
    static WebElement password;

    @FindBy(id="login-button")
    static WebElement button ;

    public static void enterusername(String uname)
    {
        username.sendKeys(uname);
    }

    public static void password(String pass)
    {
        password.sendKeys(pass);
    }

    public static void  button()
    {
        button.click();
    }


}
