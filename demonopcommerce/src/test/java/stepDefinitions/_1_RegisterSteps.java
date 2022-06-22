package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages._1_RegisterPage;


public class _1_RegisterSteps {
    _1_RegisterPage rgp = new _1_RegisterPage();
    @Given("user click on register")
    public void userClickOnRegister() throws InterruptedException {
        rgp.registerLink().click();
        Thread.sleep(2000);
    }

    @When("user enter his data")
    public void userEnterHisData() throws InterruptedException {
        rgp.genderType("male").click();
        rgp.firstName().sendKeys("Ragab");
        rgp.lastName().sendKeys("Sayed");
        rgp.birthDay();
        rgp.birthMonth();
        rgp.birthYear();
        rgp.writeEmail().sendKeys("email5111999@gmail.com");
        rgp.companyName().sendKeys("Computer");
        rgp.enterPassword().sendKeys("password");
        rgp.confirmPassword().sendKeys("password");
        Thread.sleep(3000);
    }

    @And("user click submit")
    public void userClickSubmit() {
        rgp.registerBTN().click();
    }

    @Then("Your registration completed message")
    public void yourRegistrationCompletedMessage() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(rgp.result().getText().contains("Your registration completed"));
        soft.assertEquals("rgba(76, 177, 124, 1)", rgp.result().getCssValue("color"));
        soft.assertAll();
        Thread.sleep(3000);
    }
}
