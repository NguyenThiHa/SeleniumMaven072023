package anhtester.com.Bai8_checkBoxRadioDropdowm;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //kiểm tra checkbox mặc đinh
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxstatusBefore =  checkboxOne.isSelected();
        System.out.println(checkboxstatusBefore);

        //nếu checkbox chưa chọn thì click chọn
        if (checkboxstatusBefore == false){
            checkboxOne.click();
        }

        //kiểm tra lại kết quả sau khi click chọn
        boolean checkboxstatusAfter =  checkboxOne.isSelected();
        System.out.println(checkboxstatusAfter);

        //kiểm tra thông báo liên quan với kết quả khi đã chọn
        WebElement mess = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println(mess.isDisplayed());
        System.out.println(mess.getText());
        closeDriver();
    }
}
