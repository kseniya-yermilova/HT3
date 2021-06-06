package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "///nav[@class='menu']")
    private WebElement header;

    @FindBy(xpath = "//div[contains(@class,'footer-menu')]")
    private WebElement footer;

    @FindBy(xpath = "//a[@class='menu__myhm' and contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(xpath = "//a[contains(@class,'menu__bag')]")
    private WebElement shoppingBagButton;

    @FindBy(xpath = "//div[@data-remodal-content-id='signin']")
    private WebElement signInPopup;

    @FindBy(xpath = "//input[@id='main-search']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='modal-txt-signin-email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='modal-txt-signin-password']")
    private WebElement passwordField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public void openSignInPopup() {
        signInButton.click();
    }

    public WebElement getSignInPopup() {
        return signInPopup;
    }

    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

}
