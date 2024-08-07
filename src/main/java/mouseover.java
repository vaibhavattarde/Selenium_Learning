import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class mouseover {
    WebDriver driver;

    @Test
    public void openurl_searchProd() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Driver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.myntra.com/");
        //MOUSEACTION 1

        WebElement clickatmenu = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
        Thread.sleep(3000);
        Actions mouseover = new Actions(driver);
        mouseover.moveToElement(clickatmenu).perform();
        Thread.sleep(3000);

        //MOUSEACTION 2

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement clickatmenu2 = driver.findElement(By.xpath("//button[text()='Home']"));
        Actions mouseover2 =new Actions(driver);
        mouseover2.moveToElement(clickatmenu2).perform();
        clickatmenu2.click();

        //MOUSEACTION3

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement clickatmenu3 = driver.findElement(By.xpath("//button[text()='Signup']"));
        Actions mouseover3 =new Actions(driver);
        mouseover3.moveToElement(clickatmenu3).perform();
        clickatmenu3.click();

        //MOUSEACTION4

               driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/#top");
               WebElement clickatmenu4 = driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
               Actions act =new Actions(driver);
               act.moveToElement(clickatmenu3).perform();
               clickatmenu3.click();
    }
}
