package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page uploadPage = new tc_002Page();

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario selecciona un archivo {string} en formato válido")
    public void el_usuario_selecciona_un_archivo_en_formato_valido(String fileName) {
        uploadPage.selectFile(fileName);
    }
    
    @Then("el archivo debería cargarse correctamente")
    public void el_archivo_deberia_cargarse_correctamente() {
        Assert.assertTrue(uploadPage.isFileUploaded());
    }

    @Then("la vista previa debe mostrar el nombre {string}, tamaño y tipo")
    public void la_vista_previa_debe_mostrar_el_nombre_tamano_y_tipo(String fileName) {
        Assert.assertTrue(uploadPage.isFilePreviewDisplayed(fileName));
    }
}