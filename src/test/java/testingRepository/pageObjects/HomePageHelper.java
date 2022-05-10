package testingRepository.pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePage {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }
/*

    public void goToEatStreet() {
        driver.get("https://eatstreet.com/");
      }

       public AmazonSearchResultsPage search(String objectForSearch) {
           getSearchField().sendKeys(objectForSearch);
          getSearchIconBtn().click();

          return new AmazonSearchResultsPage(driver);
        }
 */
}