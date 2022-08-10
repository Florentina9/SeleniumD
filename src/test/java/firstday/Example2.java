package firstday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maresc fereastra
        driver.manage().window().maximize();

        //deschid site ul endava
        driver.get("https://www.endava.com");
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        //deschide fereastra
        driver.navigate().to("https://www.selenium.dev/");

        System.out.println(driver.getTitle());

        driver.navigate().back();
        //inchide doar fereastra curenta
        driver.close();

        //inchide toate ferestrele deschise si browserul
        driver.quit();


    }
}