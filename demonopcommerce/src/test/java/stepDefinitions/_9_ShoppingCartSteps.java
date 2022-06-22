package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.ShoppingCartPage;

import java.util.concurrent.TimeUnit;

public class _9_ShoppingCartSteps {
    ShoppingCartPage shop = new ShoppingCartPage();

    @When("User choose a random product and click on add to shopping cart button")
    public void userChooseRandom() throws InterruptedException {
        shop.MC().click();
        shop.cart().click();
        CucumberHooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(1000);
    }

    @Then("message appears says The product has been added to your shopping cart")
    public void messageAppearsSaysTheProductHasBeenAddedToYourShoppingCart() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(shop.notification_new().getText(),"The product has been added to your shopping cart");
        soft.assertEquals(shop.notification().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
