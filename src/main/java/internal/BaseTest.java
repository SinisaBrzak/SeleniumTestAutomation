package internal;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {

  public static final String ENV_PROPERTIES_FILE = "env.properties";

  public static final String CHROME_DRIVER_EXE_PROPERTY = "webdriver.chrome.driver";
  public static final String FIREFOX_DRIVER_EXE_PROPERTY = "webdriver.gecko.driver";
  public static final String IMPLICIT_WAIT = "webdriver.implicitWait";
  public static final String BROWSER_TYPE = "webdriver.browserType";
  public static final String BASE_URL = "base.url";

  protected final Properties properties;

  protected BaseTest() {
    properties = new Properties();

    try {
      properties.load(Thread.currentThread()
          .getContextClassLoader()
          .getResourceAsStream(ENV_PROPERTIES_FILE));
    } catch (IOException e) {
      System.out.println("Unable to load: " + ENV_PROPERTIES_FILE);
      e.printStackTrace();
    }
  }

  static {
    System.setProperty(CHROME_DRIVER_EXE_PROPERTY, "src/main/resources/exec/chromedriver");
    System.setProperty(FIREFOX_DRIVER_EXE_PROPERTY, "src/main/resources/exec/geckodriver");
  }

  private enum BrowserType {
    Firefox,
    Safari,
    Chrome
  }

  private WebDriver driver;

  protected void initializeDriver(BrowserType browserType) {
    switch (browserType) {
      case Safari:
        driver = new SafariDriver();
        break;
      case Firefox:
        driver = new FirefoxDriver();
        break;
      case Chrome:
        driver = new ChromeDriver();
        break;
    }

    driver.manage()
        .timeouts()
        .implicitlyWait(Integer.parseInt(properties.getProperty(IMPLICIT_WAIT)), TimeUnit.SECONDS);
  }

  @BeforeEach
  protected void setUp() {
    initializeDriver(BrowserType.valueOf(properties.getProperty(BROWSER_TYPE)));
    getDriver().manage()
        .window()
        .maximize();
    goToBasePage();
  }

  @AfterEach
  protected void tearDown() {
    driver.quit();
  }

  protected WebDriver getDriver() {
    return driver;
  }

  protected void goToBasePage() {
    getDriver().get(properties.get(BASE_URL).toString());
  }
}
