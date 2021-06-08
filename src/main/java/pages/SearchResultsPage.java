package pages;

import jdk.jfr.Experimental;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//article[@class='hm-product-item']")
    private WebElement searchResult;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearchResult() {
        searchResult.click();
    }

    public WebElement getSearchResult(){
        return searchResult;
    }

}
