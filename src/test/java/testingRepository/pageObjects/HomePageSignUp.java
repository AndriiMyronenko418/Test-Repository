package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSignUp extends BasePage {
    public HomePageSignUp(WebDriver driver) {
        super(driver);
    }

    public static final String HEADER = "//h2[contains(text(), 'Miss Delectable')]";
    public static final String EMAIL_FIELD = "//input[@id='new-email']";
    public static final String SIGN_UP_BTN = "//button[@type='submit']";

    public WebElement getHeader() {
        return driver.findElement(By.xpath(HEADER));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath(EMAIL_FIELD));
    }

    public WebElement getSignUpBtn() {
        return driver.findElement(By.xpath(SIGN_UP_BTN));
    }
}
