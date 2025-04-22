package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadOptionButton = By.id("upload-option-btn");
    By singleUploadOption = By.id("single-upload-option");
    By multipleUploadOption = By.id("multiple-upload-option");
    By singleUploadBox = By.id("single-upload-box");
    By multipleUploadBoxes = By.className("multiple-upload-box");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("url_de_la_pagina_de_carga_de_documentos");
    }

    public void selectOption(String option) {
        driver.findElement(uploadOptionButton).click();
        if (option.equals("cargar documentos")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(singleUploadOption));
            wait.until(ExpectedConditions.visibilityOfElementLocated(multipleUploadOption));
        }
    }

    public void verifySingleAndMultipleUploadOptionsDisplayed() {
        WebElement singleOption = driver.findElement(singleUploadOption);
        WebElement multipleOption = driver.findElement(multipleUploadOption);
        if (!singleOption.isDisplayed() || !multipleOption.isDisplayed()) {
            throw new AssertionError("Las opciones de carga no están visibles");
        }
    }

    public void verifySingleUploadBoxEnabled() {
        WebElement singleBox = driver.findElement(singleUploadBox);
        if (!singleBox.isDisplayed()) {
            throw new AssertionError("El recuadro para carga única no está habilitado");
        }
    }

    public void verifyMultipleUploadBoxesDisplayed() {
        if (driver.findElements(multipleUploadBoxes).isEmpty()) {
            throw new AssertionError("No se muestran recuadros para múltiples documentos");
        }
    }
}