package helpers;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SearchResultsPage;

public class SearchResultsHelper extends BaseHelper {

  SearchResultsPage searchResultsPage;
  private final String OUTPUT_FILE = "src/main/resources/printed_dresses.txt";


  public SearchResultsHelper(WebDriver driver) {
    super(driver);
    searchResultsPage = new SearchResultsPage(driver);

  }

  public void writeSearchedResultsIntoFile() {
    List<WebElement> products = searchResultsPage.searchResultList;
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
      OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

      for (WebElement product : products) {
        outputStreamWriter.write(product.getText() + "\n");
      }
      outputStreamWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
