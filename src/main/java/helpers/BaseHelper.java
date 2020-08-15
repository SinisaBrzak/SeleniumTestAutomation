package helpers;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseHelper {

  WebDriver driver;

  public BaseHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void maximizeCurrentWindow() {
    driver.manage().window().maximize();
  }

  public static String randomEmailAddress() {
    return String.format("%s@%s.%s", randomAlphabeticString(7),
        randomAlphabeticString(5),
        randomAlphabeticString(3));
  }

  public static String randomNameLastName(int count) {
    return RandomStringUtils.randomAlphabetic(count);
  }

  public static String randomAlphanumericString(int count) {
    return RandomStringUtils.randomAlphanumeric(count);
  }

  public static String randomNumericString(int count) {
    return RandomStringUtils.randomNumeric(count);
  }

  private static String randomAlphabeticString(int count) {
    return RandomStringUtils.randomAlphabetic(count);
  }
}
