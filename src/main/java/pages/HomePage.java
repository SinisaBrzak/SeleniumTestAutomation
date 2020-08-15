package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  @FindBy(how = How.CLASS_NAME, using = "login")
  public WebElement signInButton;

  @FindBy(id = "email_create")
  public WebElement emailAddressInput;

  @FindBy(id = "SubmitCreate")
  public WebElement createAnAccountButton;

  @FindBy(id = "homefeatured")
  public WebElement popularProducts;

  @FindBy(id = "blockbestsellers")
  public WebElement bestSellers;

  @FindBy(className = "blockbestsellers")
  public WebElement bestSellersButton;

  public List<WebElement> getCountOfPopularProducts() {
    return popularProducts.findElements(By.tagName("li"));
  }

  public List<WebElement> getCountOfBestSellers() {
    return bestSellers.findElements(By.tagName("li"));
  }

  @FindBy(id = "search_query_top")
  public WebElement searchInput;

  @FindBy(name = "submit_search")
  public WebElement searchIcon;

}
