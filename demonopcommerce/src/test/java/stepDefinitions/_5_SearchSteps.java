package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.HomePage;


import java.util.List;

public class _5_SearchSteps {
    HomePage home = new HomePage();

    @Given("click on search field to insert something inside")
    public void clickOnSearchFieldToInsertSomethingInside() {
        home.searchFieldEle().click();
    }

    @When("search for any product like {string}")
    public void searchForAnyProductLike(String arg0) {
        home.searchFieldEle().sendKeys(arg0);
        home.searchFieldEle().sendKeys(Keys.ENTER);
    }

    @Then("url contains {string}")
    public void urlContains(String arg0) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(CucumberHooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();
    }

    @And("search shows relevant results {string}")
    public void searchShowsRelevantResults(String arg0) {
        System.out.println("input : "+arg0);
        List list = home.relevantResults();
        int size = list.size();
        for (int i = 0; i< size; i++) {
            WebElement element = (WebElement) list.get(i);
            System.out.println("Element : "+element.getText());
            Assert.assertTrue(element.getText().contains(arg0));

        }
    }

    @When("search for any sku {string}")
    public void searchForAnySku(String arg0) {
        home.searchFieldEle().sendKeys(arg0);
        home.searchFieldEle().sendKeys(Keys.ENTER);
    }

    @And("click on the product in search result")
    public void clickOnTheProductInSearchResult() {
        home.productInSearchResultEle().click();
    }

    @Then("Verify the sku {string}")
    public void verifyTheSku(String arg0) {
        Assert.assertTrue(home.skuEle().getText().contains(arg0));
    }
}
