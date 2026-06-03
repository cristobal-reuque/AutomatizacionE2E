@Regression
Feature: Validar pagina SauceDemo

  Background: Login app
    Given ingreso a la pagina de SauceDemo
    When se visualiza el formulario de login

  @Test001
  Scenario: Login en SauceDemo
    Given ingreso mi usuario y contrasena
    And hago clic en el boton Login
    Then se visualiza el home de la pagina

  @Test002
  Scenario: Validar que se pueda agregar un producto al carrito de compras
    Given ingreso mi usuario y contrasena
    And hago clic en el boton Login
    And se visualiza el home de la pagina
    When agrego el primer producto al carrito de compras
    And ingreso al carrito de compras
    Then se visualiza el carrito de compras con "1" producto

  @Test003
  Scenario: Validar que se pueda eliminar un producto del carrito de compras
    Given ingreso mi usuario y contrasena
    And hago clic en el boton Login
    And se visualiza el home de la pagina
    And agrego el primer producto al carrito de compras
    And ingreso al carrito de compras
    When se visualiza el carrito de compras con "1" producto
    Then elimino un producto del carrito de compras

  @Test004
  Scenario: Validar que se pueda comprar un producto
    Given ingreso mi usuario y contrasena
    And hago clic en el boton Login
    And se visualiza el home de la pagina
    And agrego el primer producto al carrito de compras
    And ingreso al carrito de compras
    And se visualiza el carrito de compras con "1" producto
    And hago clic en el boton checkout
    And completo el formulario con mi informacion
    And hago clic en el boton continue
    And se visualiza la pantalla de Overview con la informacion de compra
    When hago clic en el boton Finish
    Then se visualiza la pantalla de exito de compra