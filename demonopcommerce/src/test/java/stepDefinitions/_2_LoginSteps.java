package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;

import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class _2_LoginSteps {
    HomePage home = new HomePage();
    LoginPage log = new LoginPage();

    @Given("user click on login button")
    public void userClickOnLoginButton() {
        home.loginBTN().click();
    }

    @When("user Enter Email")
    public void userEnterEmail() {
        log.enterEmail().sendKeys("email5111999@gmail.com");
    }

    @And("user enter password")
    public void userEnterPassword() {
        log.enterPassword().sendKeys("password");
    }

    @And("click enter key")
    public void clickEnterKey() {
        log.enterPassword().sendKeys(Keys.ENTER);
    }

    @Then("user login Successfully")
    public void userLoginSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(CucumberHooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        soft.assertTrue(home.myAccountEle().isDisplayed());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(log.errorMessage().getText().contains("Login was unsuccessful"));
        soft.assertEquals(Color.fromString(log.errorMessage().getCssValue("color")).asHex(), "#e4434b");
        soft.assertAll();
    }

    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        log.enterEmail().sendKeys(arg0);
        log.enterPassword().sendKeys(arg1);
    }
}
