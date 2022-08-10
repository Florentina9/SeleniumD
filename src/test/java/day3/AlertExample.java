package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.switchTo().frame(driver.findElement(By.id("gdpr-consent-notice")));
        Thread.sleep(3000l);
        driver.findElement(By.id("save")).click();
        driver.findElement(By.name("cusid")).sendKeys("12334");
        driver.findElement(By.name("submit")).click();


        Alert alert = driver.switchTo().alert();
       alert.accept();
       alert.accept();


    }
}
