package anhtester.com.bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();

        Thread.sleep(1000);

        List<WebElement> listMenu = driver.findElements(By.xpath("//li[@class='aiz-side-nav-item']"));

        listMenu.get(0).click();
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i).getText());
        }
        closeDriver();
    }
}
