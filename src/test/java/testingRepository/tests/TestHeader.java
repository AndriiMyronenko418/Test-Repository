package testingRepository.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import testingRepository.pageObjects.HomePage;
import testingRepository.pageObjects.SignInElements;

public class TestHeader extends TestInit {

    @Test
    public void checkHeader() {

        HomePage homePageElements = new HomePage(driver);
        SignInElements signInElements = new SignInElements(driver);

        //Checking “Cart“ btn
        goToEatStreet();
        homePageElements.getCart().click();
        Assert.assertTrue(homePageElements.getCartPopUp().isDisplayed());
        homePageElements.getCart().click();
        sleep(2);
        Assert.assertFalse(homePageElements.isElementDisplayed(homePageElements.CART_POPUP_LOCATOR));

        //Checking “Sign in“ btn
        homePageElements.getSignIn().click();
        Assert.assertEquals(homePageElements.getUrl(), "https://eatstreet.com/signin");
        Assert.assertTrue(signInElements.getHeaderTitle().isDisplayed());

        //Checking Logo
        homePageElements.getLogoImage().click();
        sleep(1);
        Assert.assertEquals(homePageElements.getUrl(), "https://eatstreet.com/");

        //Checking “Partner with us“ btn
        sleep(2);
        homePageElements.getPartnerWithUs().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long positionAfterScrolling = (Long) js.executeScript("return window.pageYOffset;");
        Assert.assertTrue(positionAfterScrolling > 0);
    }
}
