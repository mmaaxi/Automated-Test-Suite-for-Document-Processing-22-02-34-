package steps;

import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("el usuario ha subido los documentos necesarios")
    public void el_usuario_ha_subido_los_documentos_necesarios() {
        page.subirDocumentos();
    }

    @When("el sistema procesa los documentos")
    public void el_sistema_procesa_los_documentos() {
        page.procesarDocumentos();
    }

    @Then("se genera el 'Slip de salida'")
    public void se_genera_el_slip_de_salida() {
        assertTrue(page.esSlipGenerado());
    }

    @Then("los documentos originales y los datos extraídos se guardan en el historial de la solicitud")
    public void los_documentos_originales_y_los_datos_extraidos_se_guardan_en_el_historial_de_la_solicitud() {
        assertTrue(page.estaInformacionGuardadaEnHistorial());
    }
}