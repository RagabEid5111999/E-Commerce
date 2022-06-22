package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.CucumberHooks;

public class LoginPage {
    public WebElement enterEmail() {
        return CucumberHooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }

    public WebElement enterPassword() {
        return CucumberHooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }

    public WebElement errorMessage() {
        return CucumberHooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
    }
}
