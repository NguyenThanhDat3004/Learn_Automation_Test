package bai5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuongDoi {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.get("https://crm.anhtester.com/admin/authentication/");
        // dung tuong doi
        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
        webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1111111");
        webDriver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
//        webDriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        // contains
        webDriver.findElement(By.xpath("//button[contains(normalize-space(), 'Log')]")).click();
        // @id la dung de tim boi ten thuoc tinh (xpath)
        // normalize-space() lay text cua thuoc tinh, sau do tim theo tu trong '' (xpath)
        // contains tim theo text (chi can chua trong thuoc tinh khong can ghi day du)
        // or va and: ghep noi dieu kien (viet thuong khong viet hoa)
        webDriver.findElement(By.xpath("//button[contains(normalize-space(), 'Log') or contains(normalize-space(), 'begin')]")).click();
        webDriver.findElement(By.xpath("//button[contains(normalize-space(), 'Log') and contains(normalize-space(), 'begin')]")).click();

    }
}
