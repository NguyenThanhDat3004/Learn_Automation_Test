import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Check {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        // dieu huong
        webDriver.get("https://ezluyenthi.id.vn/login");
        System.out.println(webDriver.getPageSource());
    }
}
