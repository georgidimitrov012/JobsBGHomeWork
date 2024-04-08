package dev.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class MainDriver {
        public WebDriver driver;


        @BeforeMethod
        public void setUp() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless=true");
            driver = new ChromeDriver(options);
            driver.get("https://dev.bg/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        }


        @AfterMethod
        public void tearDown() {
            //driver.quit();
        }

}
