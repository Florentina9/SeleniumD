package firstday;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExampleName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("alia.jarjis@endava.com");
        driver.findElement(By.name("inputPassword")).sendKeys("12345679");

        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(3000l);
        System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();//adaugi info pe site
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Alia Jarjis");
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("aliajarjis@endava.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("072359559");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("072359559");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("hello123");
        driver.findElement(By.xpath("//button[contains(@class,'signBtn')]")).click();
        driver.findElement(By.xpath("form input")).sendKeys("aliajarjis@endava.com");

    }
}
