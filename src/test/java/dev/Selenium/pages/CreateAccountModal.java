package dev.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountModal extends BasePage{
    @FindBy(className = "user-register-submit")
    private WebElement createButton;

    @FindBy(css = "input#fname")
    private WebElement firstNameInput;

    public CreateAccountModal(WebDriver driver) {
        super(driver);
    }

    public void clickCreate() {
        createButton.click();
    }

    public void setFirstName (String firstName) {
        firstNameInput.sendKeys(firstName);
    }
}
