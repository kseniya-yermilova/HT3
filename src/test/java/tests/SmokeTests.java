package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 90;
    private String FAIL_EMAIL = "lalala";
    private String EMAIL = "lalala@gmail.com";
    private String KEYWORD = "shorts";
    private String ART_NO = "0987161007";

    @Test
    public void checkSignInPopup(){
        getHomePage().openSignInPopup();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getSignInPopup());
        Assert.assertTrue(getHomePage().isEmailFieldVisible());
        Assert.assertTrue(getHomePage().isPasswordFieldVisible());
        Assert.assertTrue(getHomePage().isSignInButtonVisible());
        Assert.assertTrue(getHomePage().isRegistrationButtonVisible());
        getHomePage().enterTextInEmailField(EMAIL);
        getHomePage().clickSignInBigButton();
        Assert.assertTrue(getHomePage().isErrorPasswordVisible());
        getHomePage().clearEmailField();
        getHomePage().enterTextInEmailField(FAIL_EMAIL);
        getHomePage().clickSignInBigButton();
        Assert.assertTrue(getHomePage().isErrorEmailVisible());

    }

    @Test
    public void checkMainComponentsOnHomePage(){
        Assert.assertTrue(getHomePage().isHeaderVisible());
        Assert.assertTrue(getHomePage().isFooterVisible());
        Assert.assertTrue(getHomePage().isSignInButtonVisible());
        Assert.assertTrue(getHomePage().isShoppingBagButtonVisible());
        Assert.assertTrue(getHomePage().isFavouritesButtonVisible());
        Assert.assertTrue(getHomePage().isSearchFieldVisible());
    }

    @Test
    public void checkAddToShoppingBag(){
        getHomePage().clickAcceptCookieButton();
        getHomePage().searchByKeyword(ART_NO);
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().scrollPageToElement(getSearchResultsPage().getSearchResult());
        getSearchResultsPage().clickOnSearchResult();
        getProductPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getProductPage().scrollPageToElement(getProductPage().getAddButton());
        getProductPage().clickSizeField();
        getProductPage().clickSize();
        getProductPage().clickAddButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        Assert.assertEquals(getHomePage().getShoppingBagText(),"1");
    }
}
