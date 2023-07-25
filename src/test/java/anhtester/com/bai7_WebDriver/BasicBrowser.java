package anhtester.com.bai7_WebDriver;

import anhtester.com.common.BaseTest;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.navigate().to("https://anhtester.com/");
        closeDriver();
    }


}
