package automatizacion.web.definitions;

import automatizacion.web.base.DriverFactory;
import automatizacion.web.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {

	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("ingreso a la pagina de SauceDemo")
	public void ingreso_a_la_pagina_de_SauceDemo() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}
	
    @When("se visualiza el formulario de login")
    public void se_visualiza_el_formulario_de_login() throws Exception {
		loginPage.isDisplayedLoginPage();
    }

	@Given("ingreso mi usuario y contrasena")
	public void ingreso_mi_usuario_y_contrasena() throws Exception {
		loginPage.ingresarCredenciales();
	}

	@Given("hago clic en el boton Login")
	public void hago_clic_en_el_boton_login() throws Exception {
		loginPage.clicButtonLogin();
	}

}
