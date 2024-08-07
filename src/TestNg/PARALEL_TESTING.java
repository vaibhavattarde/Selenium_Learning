package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;



public class PARALEL_TESTING {
    WebDriver driver = new ChromeDriver();
    @Parameters({"browser"})
    @BeforeClass
    public void openurl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    }
        @Test
        public void test1()
        {
            WebElement Source1 = driver.findElement(By.id("box6")); //rome
            WebElement Destination1 = driver.findElement(By.id("box106"));//Italy
            Actions act = new Actions(driver);
            act.dragAndDrop(Source1, Destination1).perform();
        }

        @Test
        public void DD2 ()
        {

            WebElement Source2 = driver.findElement(By.id("box5")); //seol
            WebElement Destination2 = driver.findElement(By.id("box105"));//sk
            Actions act2 = new Actions(driver);
            act2.dragAndDrop(Source2, Destination2).perform();
        }
        @AfterClass
        public void close()
        {
            driver.close();
        }


    }



