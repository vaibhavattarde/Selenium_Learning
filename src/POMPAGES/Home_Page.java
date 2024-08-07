package POMPAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Home_Page {
    public static WebDriver driver=null;
   By Clickonpim = By.cssSelector("a[href*='pim/viewPim']");

    public Home_Page(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Homepage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Clickonpim).click();
    }

}
