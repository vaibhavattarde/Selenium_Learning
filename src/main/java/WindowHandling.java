package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandling {
    WebDriver driver;
@Test
    public void windowhandle()
        {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");
        System.out.println("Title" + driver.getTitle());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.co.in/");
        System.out.println("Title"+" "+ driver.getTitle());
        //handling operations
       Set <String> windowhandles = driver.getWindowHandles();
       List <String> Handles = new ArrayList<String>();
       Handles.addAll(windowhandles);
       driver.switchTo().window(Handles.get(0));
       System.out.println(driver.getTitle());


    }
}