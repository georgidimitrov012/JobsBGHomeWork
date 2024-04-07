package dev.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BasePage{

    @FindBy(css = ".header-right>.subscriber-register-btn")
    private WebElement registerButton;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

}
