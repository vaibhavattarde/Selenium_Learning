package main.java.Reports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class Links {
    WebDriver driver;

    @BeforeClass
    public void urlopen() throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void linkverify() {
        driver.get("https://india-region-dev.alvarezandmarsal.com/");
        WebElement footer = driver.findElement(By.xpath("//div[@class='am_footer-navigation']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);

        // Find all links in the footer
        List<WebElement> footerLinks = footer.findElements(By.tagName("a"));

        // Print the count of footer links
        int linkCount = footerLinks.size();
        System.out.println("Number of links in the footer: " + linkCount);
        System.out.println("---------------------------------------------------------");

        // Verify the count of footer links (assuming you expect a specific number, e.g., 14)
        int expectedLinkCount = 14;  // Replace with the expected number of links
        Assert.assertEquals(linkCount, expectedLinkCount, "The number of footer links does not match the expected count.");


    }

    @Test
    public void checkdropdown_country() {
        driver.get("https://www.alvarezandmarsal.com/#block-connect-with-us");
        WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='edit-country-of-residency']")); // Change to the actual ID

        Select select = new Select(countryDropdown);

        // select.selectByVisibleText("Brazil");

        List<WebElement> Allselectedoptions = select.getOptions();
        for (WebElement el : Allselectedoptions) {
            System.out.println(el.getText());
        }
        System.out.println("The Total Country Present in the drop down is " + Allselectedoptions.size());
        System.out.println("---------------------------------------------------------");

    }

    @Test
    public void checkdropdown_industry() {
        driver.get("https://www.alvarezandmarsal.com/#block-connect-with-us");
        WebElement industryDropdown = driver.findElement(By.xpath("//select[@id='edit-what-service-industry-c']")); // Change to the actual ID

        Select select = new Select(industryDropdown);

        List<WebElement> Allselectedoptions = select.getOptions();
        for (WebElement el : Allselectedoptions) {
            System.out.println(el.getText());
        }
        System.out.println("The Total Industry/Services Present in the drop down is " + Allselectedoptions.size());
        System.out.println("---------------------------------------------------------");
    }
    @Test
    public void checkdropdown_help() {
        driver.get("https://www.alvarezandmarsal.com/#block-connect-with-us");
        WebElement Helpsession_Dropdown = driver.findElement(By.xpath("//select[@id='edit-how-can-we-help-you-c']")); // Change to the actual ID

        Select select = new Select(Helpsession_Dropdown);

        List<WebElement> Allselectedoptions = select.getOptions();
        for (WebElement el : Allselectedoptions) {
            System.out.println(el.getText());
        }
        System.out.println("The Total Help_session_options Present in the drop down is " + Allselectedoptions.size());
        System.out.println("---------------------------------------------------------");
    }

    @Test
    public void checkdropdown_HearAboutUs() {
        driver.get("https://www.alvarezandmarsal.com/#block-connect-with-us");
        WebElement Helpsession_HearAboutUs = driver.findElement(By.cssSelector("#edit-how-did-you-hear-about-us-c")); // Change to the actual ID

        Select select = new Select( Helpsession_HearAboutUs);

        List<WebElement> Allselectedoptions = select.getOptions();
        for (WebElement el : Allselectedoptions) {
            System.out.println(el.getText());
        }
        System.out.println("The Total HearAboutUs_options Present in the drop down is " + Allselectedoptions.size());
        System.out.println("---------------------------------------------------------");
    }



    @AfterTest
    public void teardown() {
        driver.close();
    }
}

