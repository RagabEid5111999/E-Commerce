package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HomePage;

public class _4_HaverCategoriesSteps {
    Actions haverAction = new Actions(CucumberHooks.driver);
    HomePage home = new HomePage();
   String categoryText ;
    @When("user haver on computer category")
    public void userHaverOnComputerCategory(){
        haverAction.moveToElement(home.mainCategoryEle()).perform();
    }

    @And("after hovering, you need to select random one of the three sub categories like Desktops")
    public void afterHoveringYouNeedToSelectRandomOneOfTheThreeSubCategoriesLikeDesktops() {
        haverAction.moveToElement(home.subCategoryEle()).perform();
        haverAction.moveToElement(home.desktopCategory()).perform();
        categoryText = home.desktopCategory().getText();
        haverAction.click().build().perform();
    }

    @Then("Assert that the sub-category title is \\(equal or contains) the one you get it while selecting random sub-category")
    public void assertThatTheSubCategoryTitleIsEqualOrContainsTheOneYouGetItWhileSelectingRandomSubCategory() {
        System.out.println("Actionaly : :"+home.subCategoryTitle().toLowerCase().trim());
        System.out.println("Expected : :"+categoryText.toLowerCase().trim());
        Assert.assertEquals(home.subCategoryTitle().toLowerCase().trim(), categoryText.toLowerCase().trim());
    }
}
