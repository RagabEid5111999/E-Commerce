package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.CucumberHooks;

public class ShoppingCartPage {
    public WebElement MC() {
        return CucumberHooks.driver.findElement(By.xpath("//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]"));
    }

    public WebElement cart() {
        return CucumberHooks.driver.findElement(By.id("add-to-cart-button-4"));
    }

    public WebElement notification_new() {
        return CucumberHooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//p"));
    }

    public WebElement notification() {
        return CucumberHooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]//div"));
    }
}
