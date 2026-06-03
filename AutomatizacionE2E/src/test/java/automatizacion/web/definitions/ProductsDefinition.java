package automatizacion.web.definitions;

import automatizacion.web.base.DriverFactory;
import automatizacion.web.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsDefinition {

    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    @Then("se visualiza el home de la pagina")
    public void se_visualiza_el_home_de_la_pagina() throws Exception {
        productsPage.isDisplayedProductsPage();
    }

    @When("agrego el primer producto al carrito de compras")
    public void agrego_el_primer_producto_al_carrito_de_compras() throws Exception {
        productsPage.agregarPrimerProducto();
    }

    @When("ingreso al carrito de compras")
    public void ingreso_al_carrito_de_compras() throws Exception {
        productsPage.clicButtonCarritoCompras();
    }

    @Then("se visualiza el carrito de compras con {string} producto")
    public void se_visualiza_el_carrito_de_compras_con_un_producto(String cantidad) throws Exception {
        productsPage.isDisplayedCarritoComprasItems(cantidad);
    }

    @When("elimino un producto del carrito de compras")
    public void elimino_un_producto_del_carrito_de_compras() throws Exception {
        productsPage.eliminarProductoCarritoCompras();
    }

}
