package anhtester.com.Bai8_checkBoxRadioDropdowm;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //Khởi tạo đối tượng select và giá trị là 1 webElement của thẻ select trong HTML
        Select select = new Select(selectElement);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của Select có phải Multuple không: " + select.isMultiple());
        System.out.println("Số lượng Option trong Select: "+ select.getOptions().size());

        //get option với các hàm hỗ trợ của class Select
        select.selectByVisibleText("Wednesday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("Monday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(1);  //bắt đầu từ vị trí 1, không có vị trí 0
        System.out.println(select.getFirstSelectedOption().getText());

        closeDriver();
    }
}
