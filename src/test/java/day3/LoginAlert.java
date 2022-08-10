package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginAlert {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        String username = "admin";
        String password = "admin";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");


    }
}
