package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.CucumberHooks;

import java.util.List;

public class HomePage {
    public WebElement loginBTN(){
        return CucumberHooks.driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]"));
    }

//    public WebElement facebookLink(){
//        return
//    }
    public WebElement slider(String sliderNum){
        return CucumberHooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }


    public WebElement myAccountEle() {
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]"));
    }

    public void currencyListEle(String arg0) {
        WebElement element = CucumberHooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        Select select = new Select(element);
        select.selectByVisibleText(arg0);
    }

    public List verifyProductsEles() {
        return CucumberHooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement searchFieldEle() {
        return CucumberHooks.driver.findElement(By.id("small-searchterms"));
    }

    public List relevantResults() {
        return CucumberHooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }

    public WebElement productInSearchResultEle() {
        return CucumberHooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
    }

    public WebElement skuEle() {
        return CucumberHooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
    }

    public WebElement mainCategoryEle() {
        return CucumberHooks.driver.findElement(By.xpath("//div [@class=\"header-menu\"]  //ul[@class]"));
    }

    public WebElement subCategoryEle() {
        return CucumberHooks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }

    public WebElement desktopCategory() {
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
    }

    public String subCategoryTitle() {
        return CucumberHooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText();
    }

    public WebElement facebookLink() {
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitterLink() {
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rssLink() {
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtubeLink() {
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}
