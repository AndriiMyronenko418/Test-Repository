package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageHungry extends BasePage{

    public HomePageHungry(WebDriver driver) {
        super(driver);
    }
    public static final String HEADER = "//h2[@class='section-header margin-bottom-25']";
    public static final String TEXT = "//p[contains(text(), 'EatStreet was born')]";

    public WebElement getHeader() {
        return driver.findElement(By.xpath(HEADER));
    }

    public WebElement getText() {
        return driver.findElement(By.xpath(TEXT));
    }
}
