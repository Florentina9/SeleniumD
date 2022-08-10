package firstday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class LocatorsExampleId {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

       driver.findElement(id("inputUsername")).sendKeys("alia.jarjis@endava.com");
       driver.findElement(name("inputPassword")).sendKeys("1234569");

       driver.findElement(cssSelector("#chkboxOne")).click();
       driver.findElement(cssSelector("#chkboxTwo")).click();
//       driver.findElement(cssSelector("input[value='rmbrUsername']"));
//       driver.findElement(cssSelector("input[type='checkbox'][value='rmbrUsername']"));
       driver.findElement(cssSelector(".signInBtn")).click();

    }
}
