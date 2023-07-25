package anhtester.com.bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginDevyellow {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang eCommerce
        driver.get("https://devyellow.restaurant365.com/#/user/login");
        Thread.sleep(10000);

        //Điền email - tìm locator theo id: By.id()
        driver.findElement(By.xpath("/html/body/div/section/form/div/div[2]/input")).sendKeys("cwhite");

        //Điền password - tìm Locator theo name: By.name()
        driver.findElement(By.xpath("/html/body/div/section/form/div/div[3]/input")).sendKeys("R3656mn");

        //click link "Forgot Password?" By.LinkText()
        //driver.findElement(By.linkText("Forgot password ?")).click();
        driver.findElement(By.xpath("/html/body/div/section/form/div/button")).click();

        Thread.sleep(5000);
        //Tắt browser
        driver.quit();
    }
}
