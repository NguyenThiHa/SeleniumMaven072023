package anhtester.com.Bai8_checkBoxRadioDropdowm;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultipleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        sleep(1);
        //List<WebElement> listCheckboxes = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']//following-sibling::input[@type=checkbox]"));
        List<WebElement> listCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element']"));
        System.out.println(listCheckboxes.size());

        for (int i = 1;i<=listCheckboxes.size();i++){
            sleep(1);
            driver.findElement(By.xpath("//label[normalize-space()='Option " +i+ "']")).click();
        }

        for (int i = 1;i<=listCheckboxes.size();i++){
            sleep(1);
            boolean isSelected = driver.findElement(By.xpath("//label[normalize-space()='Option " +i+ "']/input")).isSelected();
            System.out.println(isSelected);
        }

        closeDriver();
    }
}
