package testingRepository.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInElements extends BasePage {

    public SignInElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeaderTitle(){
        return driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
    }
}