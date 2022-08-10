package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotsExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //  FileUtils.copyFile(src,new File("src/test/resources/chrome.png"));

        // driver.switchTo().frame(driver.findElement(By.id("backgroundImage")));
        driver.findElement(By.id("L2AGLb")).click();
        WebElement element = driver.findElement(By.className("gLFyf"));
        File scrFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/google.png"));
//        driver.quit();

    }
}
