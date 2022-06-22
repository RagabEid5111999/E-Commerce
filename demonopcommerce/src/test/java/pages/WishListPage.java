package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.CucumberHooks;

public class WishListPage {
    public WebElement HTC() {
        return CucumberHooks.driver.findElement(By.cssSelector("img[title=\"Show details for HTC One M8 Android L 5.0 Lollipop\"]"));
    }

    public WebElement wishlist() {
        return CucumberHooks.driver.findElement(By.cssSelector("button[id=\"add-to-wishlist-button-18\"]"));
    }

    public WebElement messageTXT() {
        return CucumberHooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//p"));
    }

    public WebElement backgroundMessage() {
        return CucumberHooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//div"));
    }

    public WebElement wishlistLapol() {
        return CucumberHooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }

    public WebElement QTYEle() {
        return CucumberHooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }

    public WebElement closeMessage() {
        return CucumberHooks.driver.findElement(By.cssSelector("span[title=\"Close\"]"));
    }
}
