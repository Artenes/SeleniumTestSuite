package org.example;

import org.example.pages.DynamicControlsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DynamicControlsTest {
    private WebDriver driver;
    private DynamicControlsPage dynamicPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        dynamicPage = new DynamicControlsPage(driver);
    }

    @Test
    public void testCheckboxRemoveAdd() {
        dynamicPage.removeCheckbox();
        assertEquals("It's gone!", dynamicPage.getMessage());

        dynamicPage.addCheckbox();
        assertEquals("It's back!", dynamicPage.getMessage());
    }

    @Test
    public void testEnableInputField() {
        dynamicPage.enableInput();
        assertTrue(dynamicPage.isInputEnabled());
        assertEquals("It's enabled!", dynamicPage.getMessage());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
