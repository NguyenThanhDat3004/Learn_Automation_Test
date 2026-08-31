import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver webDriver; // dieu khien mot trinh duyet nao do
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // vao url
        // nao hoc fill tiep =)))
    }
}
