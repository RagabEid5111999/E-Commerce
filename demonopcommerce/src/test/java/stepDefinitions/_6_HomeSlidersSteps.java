package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;

public class _6_HomeSlidersSteps {
    HomePage home = new HomePage();
    @When("user click on first slider")
    public void userClickOnFirstSlider() {
        home.slider("1").click();
    }

    @Then("relative product for first slider was displayed")
    public void relativeProductForFirstSliderWasDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("http://demo.nopcommerce.com/iphone_s6", CucumberHooks.driver.getCurrentUrl());
    }

    @When("user click on second slider")
    public void userClickOnSecondSlider() {
        home.slider("2").click();
    }

    @Then("relative product for second slider was displayed")
    public void relativeProductForSecondSliderWasDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("http://demo.nopcommerce.com/nokia-lumia-1020", CucumberHooks.driver.getCurrentUrl());
    }
}
