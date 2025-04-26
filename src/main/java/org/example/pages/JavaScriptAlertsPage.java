package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePage {
    private final By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By resultText = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void clickJSAlert() {
        driver.findElement(jsAlertButton).click();
        driver.switchTo().alert().accept();
    }

    public void clickJSConfirm(boolean accept) {
        driver.findElement(jsConfirmButton).click();
        if (accept) {
            driver.switchTo().alert().accept();
        } else {
            driver.switchTo().alert().dismiss();
        }
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}
