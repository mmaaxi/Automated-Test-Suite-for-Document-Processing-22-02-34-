package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_002Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadInputBox = By.id("uploadFileInput");
    By uploadButton = By.id("uploadButton");
    By filePreview = By.id("filePreview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFile(String fileName) {
        WebElement uploadInput = driver.findElement(uploadInputBox);
        uploadInput.sendKeys("/path/to/" + fileName);
    }

    public boolean isFileUploaded() {
        WebElement button = driver.findElement(uploadButton);
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(filePreview)).isDisplayed();
    }

    public boolean isFilePreviewDisplayed(String fileName) {
        WebElement preview = driver.findElement(filePreview);
        return preview.getText().contains(fileName);
    }
}