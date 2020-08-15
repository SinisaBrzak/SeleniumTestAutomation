package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

  public SearchResultsPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[@id='center_column']/ul/li//h5/a")
  public List<WebElement> searchResultList;
}
