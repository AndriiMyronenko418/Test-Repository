package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSearchBar extends BasePage {

    public HomePageSearchBar(WebDriver driver) {
        super(driver);
    }

    public static final String DELIVERY_TAKEOUT_BTN = "//div[contains(@class,'food-search__toggle')]";
    public static final String SEARCH_FIELD = "//input[contains(@class,'enter-address__input')]";
    public static final String LOCATION_BTN = "//div[contains(@class,'my-location')]";
    public static final String GET_FED_BTN = "//a[@id='find-restaurants']";

    public WebElement getDeliveryTakeoutToggleBtn() {
        return driver.findElement(By.xpath(DELIVERY_TAKEOUT_BTN));
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath(SEARCH_FIELD));
    }

    public WebElement getLocationBtn() {
        return driver.findElement(By.xpath(LOCATION_BTN));
    }

    public WebElement getGetFedBtn() {
        return driver.findElement(By.xpath(GET_FED_BTN));
    }
}
