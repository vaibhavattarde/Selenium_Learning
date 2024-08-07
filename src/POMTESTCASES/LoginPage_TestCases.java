package POMTESTCASES;

import POMPAGES.ADD_PAGE;
import POMPAGES.Home_Page;
import POMPAGES.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage_TestCases {
    public static WebDriver driver;

    @BeforeClass
    public void Launchbrowser() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    }
    @Test(priority = 1)
        public void login()
    {
        Login_Page om =new Login_Page(driver);
        om.Login();

    }

    @Test(priority = 2)
    public void ckickonbutton() throws InterruptedException {
        Home_Page hp = new Home_Page(driver);
        hp.Homepage();
    }
    @Test(priority  =3)
    public void addemp() throws InterruptedException {
        ADD_PAGE addPage = new ADD_PAGE(driver);
        addPage.ADDEMPDETAILS();
    }
}
