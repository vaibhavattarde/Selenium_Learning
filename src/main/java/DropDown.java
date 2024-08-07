import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropDown {

    WebDriver driver;

    @BeforeClass
    public void urlopen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //driver.get("https://www.facebook.com/signup");

    }
    @Test
    public  void Dropdown1() throws InterruptedException{
        driver.get("https://www.facebook.com/signup");
        WebElement DD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select sd = new Select(DD);
        sd.selectByValue("1");

    }@Test
    public  void Dropdown2() throws InterruptedException{
        //driver.get("https://www.facebook.com/signup");
        WebElement mm=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select sd2 = new Select(mm);
        sd2.selectByVisibleText("Jan");
    }
    @Test
    public  void Dropdown3() throws InterruptedException {
        //driver.get("https://www.facebook.com/signup");
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select sd3 = new Select(year);
        sd3.selectByVisibleText("2012");
        if(sd3.isMultiple() == true)
        {
            System.out.println("Drop Down is multiple");
        }
        else
        {
            System.out.println("Drop Down is Single");
        }
       List<WebElement> Allselectedoptions =sd3.getOptions();
        for (WebElement el:Allselectedoptions) {
            System.out.println(el.getText());
        }
        System.out.println(Allselectedoptions.size());



    }

}