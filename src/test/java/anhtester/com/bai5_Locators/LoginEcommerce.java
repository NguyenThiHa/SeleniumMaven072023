package anhtester.com.bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEcommerce {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang eCommerce
        driver.get("https://demo.activeitzone.com/ecommerce/login");

        //Điền email - tìm locator theo id: By.id()
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //Điền password - tìm Locator theo name: By.name()
        driver.findElement(By.name("password")).sendKeys("123456");

        //click link "Forgot Password?" By.LinkText()
        //driver.findElement(By.linkText("Forgot password ?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
