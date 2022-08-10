package firstday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.cssSelector;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();//adaugi info pe site
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Alia Jarjis");
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("alia.jarjis@endava.com");
    //    driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("0759358568");
       driver.findElement(By.xpath("//form/input[3]")).sendKeys("0759358568");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("hello123");
        driver.findElement(By.cssSelector("//button[contains(@class,'signBtn')]")).click();
        driver.findElement(By.cssSelector("form input")).sendKeys("alia.jarjis@endava.com");
        driver.findElement(By.cssSelector("//.go-to-login-btn")).click();
        driver.findElement(By.cssSelector("//.go-to-login-btn")).click();
    }
}
