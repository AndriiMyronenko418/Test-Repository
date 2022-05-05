package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePage {

    public static final String CART_POPUP_LOCATOR = "//div[@es-cart]";

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public boolean isElementDisplayed(String locator) {
        return driver.findElements(By.xpath(locator)).size() > 0;
    }

    public WebElement getLogoImage() {
        return driver.findElement(By.xpath("//img[@alt='EatStreet Logo']"));
    }

    public WebElement getPartnerWithUs() {
        return driver.findElement(By.xpath("//a[@class='partners-link ng-scope']"));
    }

    public WebElement getCart() {
        return driver.findElement(By.xpath("//div[@role='button']//img[contains(@alt, 'cart')]"));
    }

    public WebElement getCartPopUp() {
        return driver.findElement(By.xpath(CART_POPUP_LOCATOR));
    }

    public WebElement getSignIn() {
        return driver.findElement(By.xpath("//div[@class='is-clickable']//a[@id='menu-signin']"));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}