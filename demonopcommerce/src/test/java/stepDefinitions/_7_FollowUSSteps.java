package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

import java.util.ArrayList;

public class _7_FollowUSSteps {
    HomePage home = new HomePage();

    @When("user opens facebook link")
    public void userOpensFacebookLink() {
        home.facebookLink().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        ArrayList Tabs = new ArrayList<>(CucumberHooks.driver.getWindowHandles());
        CucumberHooks.driver.switchTo().window((String) Tabs.get(1));
        Assert.assertEquals(arg0, CucumberHooks.driver.getCurrentUrl());
        CucumberHooks.driver.close();
        CucumberHooks.driver.switchTo().window((String) Tabs.get(0));
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        home.twitterLink().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        home.rssLink().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.youtubeLink().click();
    }
}
