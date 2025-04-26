package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    
    private final By uploadInput = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedMessage = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedMessage).getText();
    }
}
