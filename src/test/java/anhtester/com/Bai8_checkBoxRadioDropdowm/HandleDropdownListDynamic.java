package anhtester.com.Bai8_checkBoxRadioDropdowm;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);

        //click vào dropdown CataGory
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        sleep(1);

        //search giá trị cần hconj
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/parent::div//input")).sendKeys("hotels");
        sleep(1);

        //click chọn Text đã search
        //driver.findElement(By.xpath("//li[@class = 'active-result highlighted']")).click();

        Actions action = new Actions(driver) ;
        action.sendKeys(Keys.ENTER).perform();    //cách Enter dùng cho TH chỉ hiện thị 1 giá trị lựa chọn
        sleep(1);

        closeDriver();
    }
}
