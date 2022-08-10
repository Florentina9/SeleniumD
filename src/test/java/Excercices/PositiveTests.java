package Excercices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public  void loginTests() throws InterruptedException {
        System.out.println("Starting loginTest");

        //create driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//driver variable

        Thread.sleep(3000l);

        //maximize browser window
        driver.manage().window().maximize();

        //  open test page
        String url = "http://the-internet.herokuapp.com/login";
        driver.get(url);

        //sleep for 3 seconds
        Thread.sleep(3000l);


        Thread.sleep(3000l);
        System.out.println("The page is opened!");


//
//       succesful login message
        driver.quit();

    }
}

