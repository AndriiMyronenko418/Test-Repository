package testingRepository.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testingRepository.pageObjects.*;

public class TestHomePageSections extends TestInit {

    @Test
    public void checkSections() {

        HomePage homePage = new HomePage(driver);
        HomePageSearchBar homePageSearchBar = new HomePageSearchBar(driver);
        HomePagePartnerWithUs homePagePartnerWithUs = new HomePagePartnerWithUs(driver);
        HomePageHungry homePageHungry = new HomePageHungry(driver);
        HomePageSignUp homePageSignUp = new HomePageSignUp(driver);
        HomePageCities homePageCities = new HomePageCities(driver);
        HomePageFooter homePageFooter = new HomePageFooter(driver);

        goToEatStreet();

        //Checking header
        Assert.assertTrue(homePage.getLogoImage().isDisplayed());
        Assert.assertTrue(homePage.getPartnerWithUs().isDisplayed());
        Assert.assertTrue(homePage.getSignIn().isDisplayed());
        Assert.assertTrue(homePage.getPartnerWithUs().isDisplayed());

        //Checking search section
        Assert.assertTrue(homePageSearchBar.getDeliveryTakeoutToggleBtn().isDisplayed());
        Assert.assertTrue(homePageSearchBar.getSearchField().isDisplayed());
        Assert.assertTrue(homePageSearchBar.getLocationBtn().isDisplayed());
        Assert.assertTrue(homePageSearchBar.getGetFedBtn().isDisplayed());

        //Checking “Partner with us“ section
        Assert.assertTrue(homePagePartnerWithUs.getHeader().isDisplayed());
        Assert.assertTrue(homePagePartnerWithUs.verifyFirstOption());
        Assert.assertTrue(homePagePartnerWithUs.verifySecondOption());
        Assert.assertTrue(homePagePartnerWithUs.verifyThirdOption());

        //Checking “Hungry. Happy. EatStreet.” section
        Assert.assertTrue(homePageHungry.getHeader().isDisplayed());
        Assert.assertTrue(homePageHungry.getText().isDisplayed());

        //Checking “Sign up“ section
        Assert.assertTrue(homePageSignUp.getHeader().isDisplayed());
        Assert.assertTrue(homePageSignUp.getSignUpBtn().isDisplayed());
        Assert.assertTrue(homePageSignUp.getEmailField().isDisplayed());

        //Checking city list
        Assert.assertTrue(homePageCities.getHeader().isDisplayed());
        Assert.assertEquals(homePageCities.getStates().size(), 39);
        Assert.assertEquals(homePageCities.getCities().size(), 132);

        //Checking footer
        Assert.assertEquals(homePageFooter.getSectionHeaders().size(), 4);
        Assert.assertEquals(homePageFooter.getSectionOptions().size(), 16);
        Assert.assertTrue(homePageFooter.getCopyright().isDisplayed());
        Assert.assertTrue(homePageFooter.getFacebookIcon().isDisplayed());
        Assert.assertTrue(homePageFooter.getInstagramIcon().isDisplayed());
        Assert.assertTrue(homePageFooter.getTwitterIcon().isDisplayed());
    }
}
