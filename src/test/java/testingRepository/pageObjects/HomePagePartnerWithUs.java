package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePartnerWithUs extends BasePage {

    public HomePagePartnerWithUs(WebDriver driver) {
        super(driver);
    }

    //private static final String FIRST_HEADER = "Sign Up Your Restaurant";
    public static final String HEADER = "//h1[@class='section-header text-center']";
    public static final String LEFT_OPTION_IMG = "//img[contains(@alt,'Yellow-brick')]";
    public static final String LEFT_OPTION_TITLE = "//h3[contains(text(),'Sign Up')]";
    public static final String LEFT_OPTION_TEXT = "//*[contains(text(),'Increase your')]";
    public static final String LEFT_OPTION_LINK = "//a[contains(text(),'Learn More')]";

    public static final String CENTER_OPTION_IMG = "//img[contains(@alt,'Orange')]";
    public static final String CENTER_OPTION_TITLE = "//h3[contains(text(),'Become An')]";
    public static final String CENTER_OPTION_TEXT = "//*[contains(text(),'As a W-2')]";
    public static final String CENTER_OPTION_LINK = "//a[contains(text(),'Apply Now')]";

    public static final String RIGHT_OPTION_IMG = "//img[contains(@alt,'Laptop')]";
    public static final String RIGHT_OPTION_TITLE = "//h3[contains(text(),'Download')]";
    public static final String RIGHT_OPTION_TEXT = "//*[contains(text(),'Find your')]";
    public static final String RIGHT_OPTION_LINK = "//a[contains(text(),'Get The App')]";

    public WebElement getHeader() {
        return driver.findElement(By.xpath(HEADER));
    }

    public WebElement getLeftOptionImage() {
        return driver.findElement(By.xpath(LEFT_OPTION_IMG));
    }

    public WebElement getLeftOptionTitle() {
        return driver.findElement(By.xpath(LEFT_OPTION_TITLE));
    }

    public WebElement getLeftOptionText() {
        return driver.findElement(By.xpath(LEFT_OPTION_TEXT));
    }

    public WebElement getLeftOptionLink() {
        return driver.findElement(By.xpath(LEFT_OPTION_LINK));
    }

    public boolean verifyFirstOption() {
        boolean isImgDisp = getLeftOptionImage().isDisplayed();
        boolean isOptionTitleDisp = getLeftOptionTitle().isDisplayed();
        boolean isOptionTextDisp = getLeftOptionText().isDisplayed();
        boolean isOptionLinkDisp = getLeftOptionLink().isDisplayed();

        return isImgDisp && isOptionTitleDisp && isOptionTextDisp && isOptionLinkDisp;
    }

    public WebElement getCenterOptionImage() {
        return driver.findElement(By.xpath(CENTER_OPTION_IMG));
    }

    public WebElement getCenterOptionTitle() {
        return driver.findElement(By.xpath(CENTER_OPTION_TITLE));
    }

    public WebElement getCenterOptionText() {
        return driver.findElement(By.xpath(CENTER_OPTION_TEXT));
    }

    public WebElement getCenterOptionLink() {
        return driver.findElement(By.xpath(CENTER_OPTION_LINK));
    }

    public boolean verifySecondOption() {
        boolean isImgDisp = getCenterOptionImage().isDisplayed();
        boolean isOptionTitleDisp = getCenterOptionTitle().isDisplayed();
        boolean isOptionTextDisp = getCenterOptionText().isDisplayed();
        boolean isOptionLinkDisp = getCenterOptionLink().isDisplayed();

        return isImgDisp && isOptionTitleDisp && isOptionTextDisp && isOptionLinkDisp;
    }

    public WebElement getRightOptionImage() {
        return driver.findElement(By.xpath(RIGHT_OPTION_IMG));
    }

    public WebElement getRightOptionTitle() {
        return driver.findElement(By.xpath(RIGHT_OPTION_TITLE));
    }

    public WebElement getRightOptionText() {
        return driver.findElement(By.xpath(RIGHT_OPTION_TEXT));
    }

    public WebElement getRightOptionLink() {
        return driver.findElement(By.xpath(RIGHT_OPTION_LINK));
    }

    public boolean verifyThirdOption() {
        boolean isImgDisp = getRightOptionImage().isDisplayed();
        boolean isOptionTitleDisp = getRightOptionTitle().isDisplayed();
        boolean isOptionTextDisp = getRightOptionText().isDisplayed();
        boolean isOptionLinkDisp = getRightOptionLink().isDisplayed();

        return isImgDisp && isOptionTitleDisp && isOptionTextDisp && isOptionLinkDisp;
    }
}
