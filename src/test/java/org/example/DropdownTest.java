package org.example;

import org.example.pages.DropdownPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class DropdownTest {
    private WebDriver driver;
    private DropdownPage dropdownPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void testDropdownSelection() {
        dropdownPage.selectOptionByValue("2");
        assertEquals("Option 2", dropdownPage.getSelectedOption());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
