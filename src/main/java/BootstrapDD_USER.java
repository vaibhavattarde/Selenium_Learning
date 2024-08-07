package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class BootstrapDD_USER {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");


        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
        List<WebElement> dropdownElements  = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dropdown option you want to select: ");
        String desiredOption = scanner.nextLine();


        boolean optionFound = false;
        for (WebElement dropdown :dropdownElements  ) {
            String optionText = dropdown.getText();
            if (optionText.equalsIgnoreCase(desiredOption)) {
                dropdown.click();
                optionFound = true;
                break;
            }
        }

        if (!optionFound) {
            System.out.println("Option not found in the dropdown.");
        }


        driver.quit();
    }

}
