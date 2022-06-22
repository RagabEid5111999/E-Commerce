package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;

import java.util.List;

public class _3_CurrenciesSteps {
    HomePage home = new HomePage();

    @When("user select {string}")
    public void userSelect(String arg0) {
        home.currencyListEle(arg0);
    }

    @Then("Verify Euro is shown in four product displayed in the home page")
    public void verifyEuroIsShownInProductDisplayedInTheHomePage() {
        List list = home.verifyProductsEles();
        int size = list.size();
        for (int i=0; i<size; i++){
            WebElement ele = (WebElement) list.get(i);
            Assert.assertTrue(ele.getText().contains("€"));
        }
    }
}
