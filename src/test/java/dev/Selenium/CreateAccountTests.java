package dev.Selenium;

import dev.Selenium.pages.CreateAccountModal;
import dev.Selenium.pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CreateAccountTests extends MainDriver {
    HomePage homePage;
    CreateAccountModal createAccountModal;

    @Test
    public void negativeTests() {
        homePage = new HomePage(driver);

        homePage.header().clickRegisterButton();

        createAccountModal = new CreateAccountModal(driver);
        /*JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.5'");*/
        createAccountModal.clickCreate();

        createAccountModal.setFirstName("asdasdas");

    }
}

// на девБГ 1 регистрация и 2 хоум > automation QA > филтър за fully remote > Варна > проверяваме за филтър лейбълите
// explicitly wait и wait until
