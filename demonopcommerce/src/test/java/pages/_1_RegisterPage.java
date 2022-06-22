package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.CucumberHooks;

public class _1_RegisterPage {
    Select select;
    public WebElement registerLink(){
        return CucumberHooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    public WebElement genderType(String type) {
        WebElement element = null;
        if (type.contains("male")) {
            element = CucumberHooks.driver.findElement(By.id("gender-male"));
        } else if(type.contains("female")) {
            element = CucumberHooks.driver.findElement(By.id("gender-female"));
        }return element;
    }

    public WebElement firstName() {
        return  CucumberHooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName() {
        return  CucumberHooks.driver.findElement(By.id("LastName"));
    }

    public void birthDay() {
        WebElement birthDay = CucumberHooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        select = new Select(birthDay);
        select.selectByIndex(5);
    }

    public void birthMonth() {
        WebElement birthMonth = CucumberHooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        select = new Select(birthMonth);
        select.selectByValue("11");
    }

    public void birthYear() {
        WebElement birthYear = CucumberHooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        select = new Select(birthYear);
        select.selectByVisibleText("1999");
    }

    public WebElement writeEmail() {
        return  CucumberHooks.driver.findElement(By.xpath("// input[@id=\"Email\"]"));
    }

    public WebElement enterPassword() {
        return  CucumberHooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword() {
        return  CucumberHooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBTN() {
        return  CucumberHooks.driver.findElement(By.id("register-button"));
    }


    public WebElement result() {
        return  CucumberHooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement companyName() {
        return CucumberHooks.driver.findElement(By.id("Company"));
    }
}
