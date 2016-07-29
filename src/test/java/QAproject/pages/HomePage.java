package QAproject.pages;

import QAproject.util.PropertyLoader;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

  protected static String baseUrl;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }

  public void openPage() throws Exception{
    baseUrl = PropertyLoader.loadProperty("site.url");
    driver.get(baseUrl);
  }
}
