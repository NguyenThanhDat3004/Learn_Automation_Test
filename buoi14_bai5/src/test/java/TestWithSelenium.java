import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestWithSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // https://ezluyenthi.id.vn/login
        webDriver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        webDriver.findElement(By.id("password")).sendKeys("secret-sauce");
        Thread.sleep(2000);
        webDriver.findElement(By.name("login-button")).click();
        Thread.sleep(5000);
        webDriver.quit(); // ham tat trinh duyet
    }
}
