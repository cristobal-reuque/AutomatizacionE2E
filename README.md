# Desafio Automatizacion E2E
Framework de Automatizacion E2E Utilizando Selenium WebDriver + Cucumber + Junit + Maven

Pagina utlizada para los test: https://www.saucedemo.com/

## Objetivo: 
Automatizar escenarios funcionales sobre la web SauceDemo, usando buenas prácticas como: 
- Page Object Model (POM)
- separación de responsabilidades
- ejecución por navegador
- generación de reportes
- captura de evidencias

## Tecnologías utilizadas
- Java -> 17
- Maven -> 3.9.15
- Selenium WebDriver -> 4.11.0
- Cucumber -> 6.8.2
- JUnit -> 4
- WebDriverManager -> 5.8.0



## Estructura del proyecto

```text
src
 ├── main
 └── test
     ├── java
     │   ├── base
     │   │   └── DriverFactory.java
     │   ├── definitions
     │   │   └── CheckoutDefinition.java
     │   │   └── LoginDefinition.java
     │   │   └── ProductsDefinition.java
     │   │   └── TestContext.java
     │   ├── pages
     │   │   └── BasePage.java
     │   │   └── CheckoutPage.java
     │   │   └── LoginPage.java
     │   │   └── ProductsPage.java
     │   ├── runners
     │   │   └── TestRunner.java
     └── resources
         ├── features
         │   └── TestSauceDemo.feature
         ├── cucumber.properties
         ├── extent.properties
         ├── extent-config.xml
```

## Requisitos previos
Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java 17 o superior
- Maven 3.9+ 
- Google Chrome / Firefox / Edge
- Git

- Verificar versiones:

```bash
java -version
mvn -version
git --version
```

## Instalación

Clonar el repositorio:

```bash
git clone https://github.com/cristobal-reuque/AutomatizacionE2E.git
```

Ingresar al proyecto:

```bash
cd AutomatizacionE2E
```

Instalar dependencias:

```bash
mvn clean install
```

## Ejecución de pruebas

### Ejecutar todos los escenarios

```bash
mvn clean test
```

### Ejecutar por navegador

Chrome:

```bash
mvn clean test -Dbrowser=chrome
```

Firefox:

```bash
mvn clean test -Dbrowser=firefox
```

Edge:

```bash
mvn clean test -Dbrowser=edge
```

## Reportes

Después de la ejecución, los reportes pueden encontrarse en:

```text
results\reports 2026-jun.-04 01-05-26-624\test-output\index.html
```
