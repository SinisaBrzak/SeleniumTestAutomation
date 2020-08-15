package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

  public RegistrationPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(linkText = "CREATE AN ACCOUNT")
  public WebElement createAnAccountTitle;

  @FindBy(id = "id_gender1")
  public WebElement genderMr;

  @FindBy(id = "uniform-id_gender2")
  public WebElement genderMrs;

  @FindBy(id = "customer_firstname")
  public WebElement firstNameInput;

  @FindBy(id = "customer_lastname")
  public WebElement lastNameInput;

  @FindBy(id = "email")
  public WebElement email;

  @FindBy(id = "passwd")
  public WebElement passwordInput;

  @FindBy(id = "days")
  public WebElement dateOfBirthDays;

  @FindBy(id = "months")
  public WebElement dateOfBirthMonths;

  @FindBy(id = "years")
  public WebElement dateOfBirthYears;

  @FindBy(id = "newsletter")
  public WebElement newsletterCheckBox;

  @FindBy(id = "optin")
  public WebElement specialOffersCheckBox;

  @FindBy(id = "firstname")
  public WebElement firstNameAddress;

  @FindBy(id = "lastname")
  public WebElement lastNameAddress;

  @FindBy(id = "company")
  public WebElement company;

  @FindBy(id = "address1")
  public WebElement address1;

  @FindBy(id = "address2")
  public WebElement address2;

  @FindBy(id = "city")
  public WebElement city;

  @FindBy(id = "id_state")
  public WebElement state;

  @FindBy(id = "postcode")
  public WebElement zipCode;

  @FindBy(id = "id_country")
  public WebElement country;

  @FindBy(id = "other")
  public WebElement additional;

  @FindBy(id = "phone")
  public WebElement homeNumber;

  @FindBy(id = "phone_mobile")
  public WebElement mobileNumber;

  @FindBy(id = "alias")
  public WebElement addressAlias;

  @FindBy(id = "submitAccount")
  public WebElement registerButton;

  @FindBy(partialLinkText = "out")
  public WebElement signOutButton;
}
