package dev.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CookiesComponent extends BasePage{

@FindBy(css = ".cmplz-accept")
private WebElement cookiesBtn;
    public CookiesComponent(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        cookiesBtn.click();
    }
}
