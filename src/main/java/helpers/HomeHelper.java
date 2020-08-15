package helpers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

public class HomeHelper extends BaseHelper {

  JavascriptExecutor js;
  HomePage homePage;

  public HomeHelper(WebDriver driver) {
    super(driver);
    this.homePage = new HomePage(driver);
    js = (JavascriptExecutor) driver;
  }

  public void waitForSignInButtonToBeVisibleAndClickOnSignInButton() {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(homePage.signInButton));
    homePage.signInButton.click();
  }

  public void waitForEmailAddressInputToBeVisibleAndFill() {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(homePage.emailAddressInput));
    homePage.emailAddressInput.sendKeys(BaseHelper.randomEmailAddress());
  }

  public void clickOnCreateAccountButton() {
    homePage.createAnAccountButton.click();
  }

  public void getPopularProducts() {
    assertEquals(homePage.getCountOfPopularProducts().size(), 7, "Product count not equal to 7");
  }

  public void getBestSellers() {
    assertEquals(homePage.getCountOfBestSellers().size(), 7, "Best sellers count not equal to 7");
  }

  public void enterSearchCriteria() {
    homePage.searchInput.sendKeys("Printed dresses");
    homePage.searchIcon.click();
  }
}
