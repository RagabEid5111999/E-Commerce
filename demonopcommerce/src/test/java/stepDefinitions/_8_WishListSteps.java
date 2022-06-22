package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.WishListPage;

import java.util.concurrent.TimeUnit;

public class _8_WishListSteps {
    WishListPage wishlist = new WishListPage();
    @When("User choose a random product and click on add to wishlist icon")
    public void userChooseARandomProductAndClickOnAddToWishlistIcon() throws InterruptedException {
        wishlist.HTC().click();
        wishlist.wishlist().click();
        CucumberHooks.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
    }

    @Then("message appears says The product has been added to your wishlist")
    public void messageAppearsSaysTheProductHasBeenAddedToYourWishlist() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(wishlist.messageTXT().getText(),"The product has been added to your wishlist");
        soft.assertEquals(Color.fromString(wishlist.backgroundMessage().getCssValue("background-color")).asHex(), "#4bb07a");
        soft.assertAll();
    }

    @And("Click on wishlist tab")
    public void clickOnWishlistTab() {
        CucumberHooks.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wishlist.closeMessage().click();
        wishlist.wishlistLapol().click();
    }

    @Then("Check QTY Number")
    public void checkQTYNumber() {
        Assert.assertTrue( Integer.parseInt(wishlist.QTYEle().getAttribute("value")) > 0);
    }
}
