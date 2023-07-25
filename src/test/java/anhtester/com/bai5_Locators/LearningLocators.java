package anhtester.com.bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearningLocators {
    String xpathEmail = "//input[@id='email']";
    String xpathPassword = "//input[@id='password']";
    String xpathRememberMe = "//input[@id='remember']";
    String xpathLogin = "//button[normalize-space()='Login']";
    String xpathForgotPassword = "//a[normalize-space()='Forgot Password']";

    String xpathCustomerMenu = "span[normalize-space()='Customers']";
    String xpathSearch = "//input[@id='search_input']";
    String xpathCompany = "//input[@id='company']";
    String xpathVAT = "//input[@id='vat']";
    String xpathPhone = "//input[@id='phonenumber']";
    String xpathWebsite = "//input[@id='website']";
    String xpathGroups = "//div[@app-field-wrapper='groups_in[]']";
    String xpathCurency = "//button[@data-id='default_currency']";
    String xpathDefaultLanguage = "//button[@data-id='default_language']";
    String xpathAddress = "//textarea[@id='address']";
    String xpathCity = "//input[@id='city']";
    String xpathState = "//input[@id='state']";
    String xpathZip = "//input[@id='zip']";
    String xpathCountry = "//button[@data-id='country']";
    String xpathSave = "//button[normalize-space()='Save']";

    //xpath tương đối cách 6-10
    String xpathProjectMenu = "//li[@class='menu-item-tasks']//preceding-sibling::li[@class='menu-item-projects']";
    String xpathNewProjectButton = "//i[@class='fa-regular fa-plus tw-mr-1']";
    String xpathProjectName = "//input[@id = 'name']";
    String getXpathCustomer = "//button[@data-id='clientid']/child::div";





    public static void main(String[] args) throws InterruptedException {

    }
}
