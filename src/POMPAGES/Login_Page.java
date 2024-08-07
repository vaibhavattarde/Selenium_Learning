package POMPAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    public static WebDriver driver=null;
  By Username = By.name("username");
  By Password = By.name("password");
  By loginButton =By.xpath("//button[@type='submit']");

  public Login_Page(WebDriver driver)
  {
      this.driver=driver;
  }

  public void Login()
  {
      driver.findElement(Username).sendKeys("Admin");
      driver.findElement(Password).sendKeys("admin123");
      driver.findElement(loginButton).click();
  }
}
