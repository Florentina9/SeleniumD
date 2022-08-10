package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000l);

        driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();

        //a@value= 'Bengaluru//a[@value='BLR']"));
        //a@value= 'Bagdogra//a[@value='IXB])';
    }
}
