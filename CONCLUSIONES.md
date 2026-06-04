## Conclusión Desafio Automatización E2E

Se implementó un framework de automatización web utilizando Selenium WebDriver, Cucumber, JUnit y Maven, orientado a la ejecución de pruebas funcionales en múltiples navegadores.

La solución desarrollada permite una mejor organización del código mediante el uso de Page Object Model, y una fábrica de drivers para soportar distintos navegadores. Además, se incorporó la toma de evidencias mediante capturas de pantalla, facilitando el análisis de errores y la trazabilidad de los resultados.

## Resultados de cada Scenario de prueba
### 1-. Scenario: Se espera validar el login de la pagina SauceDemo
```text
- Given ingreso a la pagina de SauceDemo
- When se visualiza el formulario de login
- Given ingreso mi usuario y contrasena
- And hago clic en el boton Login
- Then se visualiza el home de la pagina

[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.736 s
[INFO] Finished at: 2026-06-04T01:41:27-04:00
[INFO] ------------------------------------------------------------------------
```

### 2-. Scenario: Validar que se pueda agregar un producto al carrito de compras
```text
- Given ingreso a la pagina de SauceDemo
- When se visualiza el formulario de login
- Given ingreso mi usuario y contrasena
- And hago clic en el boton Login
- And se visualiza el home de la pagina
- When agrego el primer producto al carrito de compras
- And ingreso al carrito de compras
-Then se visualiza el carrito de compras con "1" producto

[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.422 s
[INFO] Finished at: 2026-06-04T01:48:10-04:00
[INFO] ------------------------------------------------------------------------
```
### 3-. Scenario: Validar que se pueda eliminar un producto del carrito de compras
```text
- Given ingreso a la pagina de SauceDemo
- When se visualiza el formulario de login
- Given ingreso mi usuario y contrasena
- And hago clic en el boton Login
- And se visualiza el home de la pagina
- And agrego el primer producto al carrito de compras
- And ingreso al carrito de compras
- When se visualiza el carrito de compras con "1" producto
-Then elimino un producto del carrito de compras

[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.308 s
[INFO] Finished at: 2026-06-04T01:49:01-04:00
[INFO] ------------------------------------------------------------------------
```
### 4-. Scenario: Validar que se pueda comprar un producto
```text
- Given ingreso a la pagina de SauceDemo
- When se visualiza el formulario de login
- Given ingreso mi usuario y contrasena
- And hago clic en el boton Login
- And se visualiza el home de la pagina
- And agrego el primer producto al carrito de compras
- And ingreso al carrito de compras
- And se visualiza el carrito de compras con "1" producto
- And hago clic en el boton checkout
- And completo el formulario con mi informacion
- And hago clic en el boton continue
- And se visualiza la pantalla de Overview con la informacion de compra
- When hago clic en el boton Finish
- Then se visualiza la pantalla de exito de compra

[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.627 s
[INFO] Finished at: 2026-06-04T01:49:35-04:00
[INFO] ------------------------------------------------------------------------
```

## Reporte de Ejecución
Después de la ejecución, los reportes pueden encontrarse en:

```text
results\reports 2026-jun.-04 01-05-26-624\test-output\index.html
```

## Logros alcanzados
- Implementación con Selenium, Cucumber y JUnit
- Soporte para múltiples navegadores
- Captura de evidencias
- Generación de reportes

## Beneficios obtenidos
- Reducción de pruebas manuales
- Mayor velocidad de validación
- Mejor organización del código
- Reutilización de componentes
