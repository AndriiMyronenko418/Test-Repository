package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageCities extends BasePage{
    public HomePageCities(WebDriver driver) {
        super(driver);
    }

    public static final String HEADER = "//h2[contains(text(), 'Taking Hungry')]";
    public static final String STATE = "//section[contains(@class, 'top-cities')]//h3[contains(@id, '')]";
    public static final String CITY = "//section[contains(@class, 'top-cities')]//a[contains(@class, 'ng-binding')]";

    public WebElement getHeader() {
        return driver.findElement(By.xpath(HEADER));
    }

    public List<WebElement> getStates(){
        return driver.findElements(By.xpath(STATE));
    }

    public List<WebElement> getCities(){
        return driver.findElements(By.xpath(CITY));
    }
}
