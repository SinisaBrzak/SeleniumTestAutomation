package com.example.selenium.test.project.tests;

import helpers.BaseHelper;
import helpers.HomeHelper;
import helpers.RegistrationHelper;
import helpers.SearchResultsHelper;
import internal.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UiTests extends BaseTest {

  public BaseHelper baseHelper;
  public HomeHelper homeHelper;
  public RegistrationHelper registrationHelper;
  public SearchResultsHelper searchResultsHelper;

  @BeforeEach
  public void setUp() {
    super.setUp();
    baseHelper = new BaseHelper(getDriver());
    homeHelper = new HomeHelper(getDriver());
    registrationHelper = new RegistrationHelper(getDriver());
    searchResultsHelper = new SearchResultsHelper(getDriver());
  }

  @Test
  public void openHomePageAndMaximizeWindow() {
    baseHelper.maximizeCurrentWindow();
  }

  @Test
  public void fillRegistrationFormAndVerifyRegistration() {
    homeHelper.waitForSignInButtonToBeVisibleAndClickOnSignInButton();
    homeHelper.waitForEmailAddressInputToBeVisibleAndFill();
    homeHelper.clickOnCreateAccountButton();
    registrationHelper.clickOnMrRadioButton();
    registrationHelper.enterFirstName();
    registrationHelper.enterLastName();
    registrationHelper.verifyEmailIsFilled();
    registrationHelper.enterPassword(6);
    registrationHelper.enterDateOfBirth();
    registrationHelper.signUpForNewsletter();
    registrationHelper.receiveSpecialOffers();
    registrationHelper.verifyFirstNameAddressIsFilled();
    registrationHelper.verifyLastNameAddressIsFilled();
    registrationHelper.enterCompanyName();
    registrationHelper.enterAddress();
    registrationHelper.enterAddress2();
    registrationHelper.enterCity();
    registrationHelper.selectState();
    registrationHelper.enterZipCode();
    registrationHelper.selectCountry();
    registrationHelper.enterAdditionalInformation();
    registrationHelper.enterPhoneNumber();
    registrationHelper.enterMobileNumber();
    registrationHelper.enterAddressAlias();
    registrationHelper.clickRegisterButton();
    registrationHelper.verifySignOutButtonIsVisible();
  }

  @Test
  public void verifyNumberOfProductsAndBestsellers() {
    homeHelper.getPopularProducts();
    homeHelper.getBestSellers();
  }

  /**
   * File is saved into resources folder under name printed_dresses.txt
   */
  @Test
  public void writeSearchResultsIntoFile() {
    homeHelper.enterSearchCriteria();
    searchResultsHelper.writeSearchedResultsIntoFile();
  }
}
