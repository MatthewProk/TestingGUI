package QAproject;

import QAproject.pages.SearchFormPage;
import QAproject.pages.SerpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import QAproject.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  private SearchFormPage searchformpage;
  private SerpPage serppage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    searchformpage = PageFactory.initElements(driver, SearchFormPage.class);
    serppage = PageFactory.initElements(driver, SerpPage.class);
  }

  @BeforeMethod
  public void preparationForTheSearchAdn() throws Exception{
    homepage.openPage();
  }

  @Test
  public void shouldCheckThatTheFirstSnippetOfResultPageContainsTheNameOfQuery(){
    searchformpage.inputTheQueryInTheSearchBox("adsterra");
    serppage.checksThatTheFirstSnippetContainsTheNameOfQuery("adsterra");
  }
}
