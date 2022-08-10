package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1 ");
        driver.findElement(By.xpath("//div@id='start']/button")).click();
        driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed();//clasa parinte cu ce reprezinta parintele este egal

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement helloText = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if ((driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed())) {
                    return driver.findElement(By.xpath("//div[@id='finish']/h4"));
                } else
                    return null;
            }
        });
        System.out.println(helloText.getText());

    }


}