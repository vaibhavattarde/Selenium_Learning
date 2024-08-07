package Reports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrooling2 {

    WebDriver driver;

    public void urlopen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.calculator.net/");
        JavascriptExecutor js = (JavascriptExecutor)driver; //TYPECAST
        js.executeScript("window.scrollBy(0,500)");


    }
}