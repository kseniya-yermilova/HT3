package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 90;

    @Test
    public void checkSignInPopup(){
        getHomePage().openSignInPopup();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getSignInPopup());
        Assert.assertTrue(getHomePage().isEmailFieldVisible());
        Assert.assertTrue(getHomePage().isPasswordFieldVisible());

    }
}
