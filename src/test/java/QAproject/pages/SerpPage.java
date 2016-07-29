package QAproject.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static org.hamcrest.Matchers.containsString;

public class SerpPage extends Page {

    @FindBy(xpath = ".//*[@class='r']//h3//a")
    List<WebElement> headers;

    public SerpPage(WebDriver driver) {
        super(driver);
    }

    /** Checks that the first snippet contains the query from parameter
     * @param Query
     */
    public void checksThatTheFirstSnippetContainsTheNameOfQuery(String Query){
        Assert.assertThat(headers.get(0).getText().toLowerCase(),containsString(Query.toLowerCase()));
    }
}


