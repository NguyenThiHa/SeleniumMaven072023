package anhtester.com.thucHanh;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {
    //login CRM
    public static void singinCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    //Open Client page
    public static void openClientPage() {
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(2);
    }

    //Enter data on Add Client dialog
    public static void enterDataAddClient(String clientName) {
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(clientName);
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);
        sleep(2);
        driver.findElement(By.id("address")).sendKeys("DHĐT");
        driver.findElement(By.id("city")).sendKeys("Cao Lãnh");
        driver.findElement(By.id("state")).sendKeys("Đồng tháp");
        driver.findElement(By.id("zip")).sendKeys("81000");

        // cuộn chuột đến label ... để nhìn thấy các phần tử ở dưới  (vì nó bị che)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Client groups']")));

        driver.findElement(By.id("country")).sendKeys("VN");
        driver.findElement(By.id("phone")).sendKeys("12345555");
        driver.findElement(By.id("website")).sendKeys("hi");
        driver.findElement(By.id("vat_number")).sendKeys("0");
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("gold", Keys.ENTER);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    // search client after add
    public static void checkAddClient(String clientName) {
        sleep(2);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]//td[2]")).getText();
        System.out.println(clientNameInTable);
    }

    public static void checkMonthName(String monthName, String dayNumber){
        for(int i=1;i<12;i++){
            driver.findElement(By.xpath("//dive[@id='']")).click();
            String getMonthName = String.valueOf(driver.findElement(By.xpath("//div[@id='client']")));
            if(getMonthName.equals(monthName)){
                //click chọn ngày
                driver.findElement(By.xpath("//a[normalize-space()='"+ dayNumber+"']")).click();

                break;   //thoát khỏi vòng lặp
            }

        }
    }

    public static void main(String[] args) {
        createDriver();

        singinCRM();
        openClientPage();
        enterDataAddClient("haaa3");
        checkAddClient("haaa3");


        closeDriver();
    }
}
