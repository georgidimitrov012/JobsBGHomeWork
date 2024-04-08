package dev.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent header() {
        return new HeaderComponent(driver);
    }

    public CookiesComponent cookies() {
        return new CookiesComponent(driver);
    }


}
