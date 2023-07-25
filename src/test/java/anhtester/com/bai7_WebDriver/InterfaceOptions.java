package anhtester.com.bai7_WebDriver;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class InterfaceOptions extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://anhtester.com");

        //add a new cookie
        Cookie cookie = new Cookie("customerName", "88383838383");
        driver.manage().addCookie(cookie);

        System.out.println(driver.manage().getCookieNamed("customerName"));

        //get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.toString());
        closeDriver();
    }
}
