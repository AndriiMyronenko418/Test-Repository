package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageFooter extends BasePage{
    public HomePageFooter(WebDriver driver) {
        super(driver);
    }

    public static final String SECTION_HEADER = "//h6[contains(@class, 'es-footer')]";
    public static final String SECTION_OPTIONS = "//div[@class='es-footer__top']//a[contains(@ui-sref, '')]";

    public static final String COPYRIGHT = "//div[@class='es-footer__copyright']";
    public static final String FACEBOOK_ICON = "//a[@aria-label='Facebook']";
    public static final String TWITTER_ICON = "//a[@aria-label='Twitter']";
    public static final String INSTAGRAM_ICON = "//a[@aria-label='Instagram']";

    public List<WebElement> getSectionHeaders(){
        return driver.findElements(By.xpath(SECTION_HEADER));
    }

    public List<WebElement> getSectionOptions(){
        return driver.findElements(By.xpath(SECTION_OPTIONS));
    }
    public WebElement getCopyright() {
        return driver.findElement(By.xpath(COPYRIGHT));
    }

    public WebElement getFacebookIcon() {
        return driver.findElement(By.xpath(FACEBOOK_ICON));
    }

    public WebElement getTwitterIcon() {
        return driver.findElement(By.xpath(TWITTER_ICON));
    }

    public WebElement getInstagramIcon() {
        return driver.findElement(By.xpath(INSTAGRAM_ICON));
    }
}
