package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public static final String CART_POPUP_LOCATOR = "//div[@es-cart]";
    public static final String LOGO_IMG = "//img[@alt='EatStreet Logo']";
    public static final String PARTNER_WITH_US = "//a[@class='partners-link ng-scope']";
    public static final String CART = "//div[@role='button']//img[contains(@alt, 'cart')]";
    public static final String SIGN_IN = "//div[@class='is-clickable']//a[@id='menu-signin']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isElementDisplayed(String locator) {
        return driver.findElements(By.xpath(locator)).size() > 0;
    }

    //Header elements
    public WebElement getLogoImage() {
        return driver.findElement(By.xpath(LOGO_IMG));
    }

    public WebElement getPartnerWithUs() {
        return driver.findElement(By.xpath(PARTNER_WITH_US));
    }

    public WebElement getCart() {
        return driver.findElement(By.xpath(CART));
    }

    public WebElement getCartPopUp() {
        return driver.findElement(By.xpath(CART_POPUP_LOCATOR));
    }

    public WebElement getSignIn() {
        return driver.findElement(By.xpath(SIGN_IN));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}