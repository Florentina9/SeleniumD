package windowshandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandleExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();//[parentid,childid1,childid2]

        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId).getTitle();

        String email = driver.findElement(By.className("red"))
                .getText()
                .split("at")[1]
                .trim()
                .split(" ")[0];

        System.out.println(email);

        driver.switchTo().window(parentId).getTitle();
        driver.findElement(By.className("form-control")).sendKeys(email);



    }
}
