package anhtester.com.bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckElementEnable {

    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMS
        driver.get("https://dofactory.com/html/button/disabled");

        //bắt element Email (object)
        WebElement buttonClickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));

        //kiểm tra trạng thái nút copy
        System.out.println(buttonClickMe.isEnabled());


        //Thread.sleep(2000);


        //Tắt browser
        driver.quit();
    }


}
