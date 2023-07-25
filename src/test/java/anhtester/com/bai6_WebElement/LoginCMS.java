package anhtester.com.bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMS
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        //get text của tiêu đề h1
        WebElement tieude = driver.findElement(By.xpath("//div[@class='card-body']//h1"));
        System.out.println(tieude.getText());

        //bắt element Email (object)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        System.out.println("email la " + inputEmail.getText());
        System.out.println("tag name: " + inputEmail.getTagName());

        driver.findElement(By.id("password")).sendKeys("123456");

        //kiểm tra trạng thái nút copy
        WebElement buttonCopy = driver.findElement(By.xpath("//button[normalize-space()='Copy']"));
        System.out.println(buttonCopy.isDisplayed());

        System.out.println(buttonCopy.getCssValue("color"));

        if(buttonCopy.isDisplayed() == true){
            //do button Login có type = submit nên thay vì click có thể dùng submit để login
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
        }


        Thread.sleep(1000);


        //Tắt browser
        driver.quit();
    }
}
