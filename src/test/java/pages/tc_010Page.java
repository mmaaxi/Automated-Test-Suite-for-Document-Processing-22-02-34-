package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    WebDriver driver;

    By uploadDocsButton = By.id("uploadDocs");
    By processDocsButton = By.id("processDocs");
    By slipGeneratedIndicator = By.id("slipGenerated");
    By historialInfoIndicator = By.id("historialInfo");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void subirDocumentos() {
        WebElement uploadButton = driver.findElement(uploadDocsButton);
        uploadButton.click();
        // Lógica adicional para cargar documentos
    }

    public void procesarDocumentos() {
        WebElement processButton = driver.findElement(processDocsButton);
        processButton.click();
        // Lógica adicional para procesar documentos
    }

    public boolean esSlipGenerado() {
        WebElement slipIndicator = driver.findElement(slipGeneratedIndicator);
        return slipIndicator.isDisplayed();
    }

    public boolean estaInformacionGuardadaEnHistorial() {
        WebElement historialInfo = driver.findElement(historialInfoIndicator);
        return historialInfo.isDisplayed();
    }
}