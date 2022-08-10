package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSugestive {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("Ca");

//        driver .findElements(By.xpath("//li[[@class='ul-menu-item']")).size();
        Thread.sleep(3000l);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
            if (options.get(i).getText().equalsIgnoreCase("Canada")) {
                options.get(i).click();
                break;}

            //  System.out.println(driver.findElements(By.xpath("//li[[@class='ul-menu-item'")).size());
        }
    }
}