package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("selecciona opción {string}")
    public void seleccionaOpcion(String opcion) {
        page.selectOption(opcion);
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void sistemaMuestraOpcionesDeCarga() {
        page.verifySingleAndMultipleUploadOptionsDisplayed();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void habilitaUnicoRecuadroParaSubir() {
        page.verifySingleUploadBoxEnabled();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void muestraMultiplesRecuadros() {
        page.verifyMultipleUploadBoxesDisplayed();
    }
}