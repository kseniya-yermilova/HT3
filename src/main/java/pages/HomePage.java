package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//nav[@class='menu']")
    private WebElement header;

    @FindBy(xpath = "//div[contains(@class,'footer-menu')]")
    private WebElement footer;

    @FindBy(xpath = "//a[@class='menu__myhm' and contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(xpath = "//button[@class='button large secondary']")
    private WebElement registrationButton;

    @FindBy(xpath = "//a[@class='menu__favorites']")
    private WebElement favouritesButton;

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

    @FindBy(xpath = "//span[@class='input-info invalid field-validation-message']")
    private WebElement errorPassword;

    @FindBy(xpath = "//span[@id='modal-txt-signin-email-email-format-error']")
    private WebElement errorEmail;

    @FindBy(xpath = "//button[@class='button large js-set-session-storage btn-login']")
    private WebElement signInBigButton;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookieButton;

    @FindBy(xpath = "//span[@class='shoppingbag-item-count']")
    private WebElement shoppingBagItem;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
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

    public boolean isSignInButtonVisible() {
        return signInButton.isDisplayed();
    }

    public boolean isRegistrationButtonVisible() {
        return registrationButton.isDisplayed();
    }

    public void enterTextInEmailField(String email) {
        emailField.sendKeys(email);
    }

    public boolean isErrorPasswordVisible() {
        return errorPassword.isDisplayed();
    }

    public boolean isErrorEmailVisible() {
        return errorEmail.isDisplayed();
    }

    public void clearEmailField() {
        emailField.clear();
    }

    public void clickSignInBigButton() {
        signInBigButton.click();
    }

    public boolean isShoppingBagButtonVisible() {
        return shoppingBagButton.isDisplayed();
    }

    public boolean isFavouritesButtonVisible() {
        return favouritesButton.isDisplayed();
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void searchByKeyword(String keyword) {
        searchField.sendKeys(keyword, Keys.ENTER);
    }

    public void clickAcceptCookieButton(){
        if (acceptCookieButton.isDisplayed()) acceptCookieButton.click();
    }

    public String getShoppingBagText() {
        return shoppingBagItem.getText();
    }

}
