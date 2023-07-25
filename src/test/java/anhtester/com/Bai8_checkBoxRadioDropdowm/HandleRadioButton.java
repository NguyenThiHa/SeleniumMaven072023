package anhtester.com.Bai8_checkBoxRadioDropdowm;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement radioButton = driver.findElement(By.xpath("//h4[normalize-space()='Sex :']//parent::div/label[normalize-space()='Male']/input"));
        if(radioButton.isSelected() == false) {
            radioButton.click();
        }
        System.out.println(radioButton.isSelected());

        WebElement GroupButton1 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']//parent::div/label[normalize-space()='0 to 5']/input"));
        WebElement GroupButton2 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']//parent::div/label[normalize-space()='5 to 15']/input"));
        WebElement GroupButton3 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']//parent::div/label[normalize-space()='15 to 50']/input"));
        GroupButton1.click();
        System.out.println("Trang thái Radio 0 to 5: " + GroupButton1.isSelected()); //sau này dùng assert của test NG kiểm tra
        System.out.println("Trang thái Radio 5 to 15: " +GroupButton2.isSelected()); //sau này dùng assert của test NG kiểm tra
        System.out.println("Trang thái Radio 15 to 50: " +GroupButton3.isSelected()); //sau này dùng assert của test NG kiểm tra

        closeDriver();
    }
}
