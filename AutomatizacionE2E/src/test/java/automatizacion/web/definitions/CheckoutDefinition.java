package automatizacion.web.definitions;

import automatizacion.web.base.DriverFactory;
import automatizacion.web.pages.CheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutDefinition {

    CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());

    @Given("hago clic en el boton checkout")
    public void hago_clic_en_el_boton_checkout() throws Exception {
        checkoutPage.clickButtonCheckout();
    }

    @Given("completo el formulario con mi informacion")
    public void completo_el_formulario_con_mi_informacion() throws Exception {
        checkoutPage.completeInformationCheckout();
    }

    @Given("hago clic en el boton continue")
    public void hago_clic_en_el_boton_continue() throws Exception {
        checkoutPage.clickButtonContinueCheckout();
    }

    @Given("se visualiza la pantalla de Overview con la informacion de compra")
    public void se_visualiza_la_pantalla_de_overview_con_la_informacion_de_compra() throws Exception {
        checkoutPage.isDisplayedCheckoutOverview();
    }

    @When("hago clic en el boton Finish")
    public void hago_clic_en_el_boton_finish() throws Exception {
        checkoutPage.clickButtonFinish();
    }

    @Then("se visualiza la pantalla de exito de compra")
    public void se_visualiza_la_pantalla_de_exito_de_compra() throws Exception {
        checkoutPage.isDisplayedCheckoutCompletePage();
    }
}
