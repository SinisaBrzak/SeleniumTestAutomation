package helpers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegistrationPage;

public class RegistrationHelper extends BaseHelper {

  RegistrationPage registrationPage;

  public RegistrationHelper(WebDriver driver) {
    super(driver);
    this.registrationPage = new RegistrationPage(driver);
  }

  public void clickOnMrRadioButton() {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(registrationPage.genderMr));
    registrationPage.genderMr.click();
  }

  public void enterFirstName() {
    registrationPage.firstNameInput.sendKeys(BaseHelper.randomNameLastName(6));
  }

  public void enterLastName() {
    registrationPage.lastNameInput.sendKeys(BaseHelper.randomNameLastName(6));
  }

  public void verifyEmailIsFilled() {
    // TODO add verification for previously entered email

    assertNotNull(registrationPage.email.getAttribute("value"));
  }

  public void enterPassword(int count) {
    registrationPage.passwordInput.sendKeys(BaseHelper.randomAlphanumericString(count));
  }

  public void enterDateOfBirth() {
    Select days = new Select(registrationPage.dateOfBirthDays);
    Select months = new Select(registrationPage.dateOfBirthMonths);
    Select years = new Select(registrationPage.dateOfBirthYears);
    days.selectByValue("27");
    months.selectByValue("10");
    years.selectByValue("1984");
  }

  public void signUpForNewsletter() {
    registrationPage.newsletterCheckBox.click();
  }

  public void receiveSpecialOffers() {
    registrationPage.specialOffersCheckBox.click();
  }

  public void verifyFirstNameAddressIsFilled() {
    // TODO add verification for previously entered first name

    assertNotNull(registrationPage.firstNameAddress.getAttribute("value"));
  }

  public void verifyLastNameAddressIsFilled() {
    // TODO add verification for previously entered last name

    assertNotNull(registrationPage.lastNameAddress.getAttribute("value"));
  }

  public void enterCompanyName() {
    registrationPage.company.sendKeys(BaseHelper.randomAlphanumericString(7));
  }

  public void enterAddress() {
    registrationPage.address1.sendKeys(BaseHelper.randomAlphanumericString(15));
  }

  public void enterAddress2() {
    registrationPage.address2.sendKeys(BaseHelper.randomAlphanumericString(15));
  }

  public void enterCity() {
    registrationPage.city.sendKeys(BaseHelper.randomAlphanumericString(7));
  }

  public void selectState() {
    Select state = new Select(registrationPage.state);
    state.selectByIndex(10);
  }

  public void enterZipCode() {
    registrationPage.zipCode.sendKeys(BaseHelper.randomNumericString(5));
  }

  public void selectCountry() {
    Select country = new Select(registrationPage.country);
    country.selectByIndex(1);
  }

  public void enterAdditionalInformation() {
    registrationPage.additional.sendKeys(BaseHelper.randomAlphanumericString(20));
  }

  public void enterPhoneNumber() {
    registrationPage.homeNumber.sendKeys(BaseHelper.randomNumericString(8));
  }

  public void enterMobileNumber() {
    registrationPage.mobileNumber.sendKeys(BaseHelper.randomNumericString(8));
  }

  public void enterAddressAlias() {
    registrationPage.addressAlias.sendKeys(BaseHelper.randomAlphanumericString(10));
  }

  public void clickRegisterButton() {
    registrationPage.registerButton.click();
  }

  public void verifySignOutButtonIsVisible() {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOf(registrationPage.signOutButton));
    registrationPage.signOutButton.isDisplayed();
  }
}
