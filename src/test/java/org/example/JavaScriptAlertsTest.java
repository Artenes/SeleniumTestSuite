package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.JavaScriptAlertsPage;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class JavaScriptAlertsTest {
    private WebDriver driver;
    private JavaScriptAlertsPage alertsPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        alertsPage = new JavaScriptAlertsPage(driver);
    }

    @Test
    public void testAcceptJSAlert() {
        alertsPage.clickJSAlert();
        assertEquals("You successfully clicked an alert", alertsPage.getResultText());
    }

    @Test
    public void testDismissJSConfirm() {
        alertsPage.clickJSConfirm(false);
        assertEquals("You clicked: Cancel", alertsPage.getResultText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
