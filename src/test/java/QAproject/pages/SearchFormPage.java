package QAproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchFormPage extends Page {

    @FindBy(xpath = "//*[@id='lst-ib']")
    WebElement inputSearch;

    public SearchFormPage(WebDriver driver) {
        super(driver);
    }

    /** Inputs the query in the search line from parameter
     * @param Query
     */
    public void inputTheQueryInTheSearchBox(String Query){
        inputSearch.sendKeys(Query);
    }

}
