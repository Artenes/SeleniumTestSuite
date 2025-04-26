package org.example;

import org.example.pages.FileUploadPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadTest {
    private WebDriver driver;
    private FileUploadPage uploadPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        uploadPage = new FileUploadPage(driver);
    }

    @Test
    public void testFileUpload() {
        String filePath = new File("src/test/resources/testfile.txt").getAbsolutePath();
        uploadPage.uploadFile(filePath);
        assertEquals("testfile.txt", uploadPage.getUploadedFileName());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
