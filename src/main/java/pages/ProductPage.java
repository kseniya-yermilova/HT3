package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//span[@class='icon icon-shopping-bag-white']")
    private WebElement addButton;

    @FindBy(xpath = "//button[@class='trigger-button    picker-trigger js-picker-trigger small']")
    private WebElement sizeField;

    @FindBy(xpath = "//span[text()='XS']")
    private WebElement size;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddButton(){
        addButton.click();
    }

    public WebElement getAddButton(){
        return addButton;
    }

    public void clickSize(){
        size.click();
    }

    public void clickSizeField(){
        sizeField.click();
    }
}
