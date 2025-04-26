package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage extends BasePage {
    private final By checkbox = By.id("checkbox");
    private final By removeButton = By.xpath("//button[text()='Remove']");
    private final By addButton = By.xpath("//button[text()='Add']");
    private final By message = By.id("message");
    private final By inputField = By.xpath("//form[@id='input-example']/input");
    private final By enableButton = By.xpath("//form[@id='input-example']/button");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    public void removeCheckbox() {
        driver.findElement(removeButton).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkbox));
    }

    public void addCheckbox() {
        driver.findElement(addButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(checkbox));
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }

    public void enableInput() {
        driver.findElement(enableButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(inputField));
    }

    public boolean isInputEnabled() {
        return driver.findElement(inputField).isEnabled();
    }
}
