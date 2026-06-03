package automatizacion.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "login_container")
    WebElement contenedorLogin;

    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement txtTituloPage;

    @FindBy(id = "user-name")
    WebElement inputUsuario;

    @FindBy(id = "password")
    WebElement inputContrasena;

    @FindBy(id = "login-button")
    WebElement buttonLogin;

    public void isDisplayedLoginPage() throws Exception{
        elementIsPresentDOM(contenedorLogin);
        elementIsPresentDOM(txtTituloPage);
        elementIsPresentDOM(inputUsuario);
        elementIsPresentDOM(inputContrasena);
    }

    public void ingresarCredenciales() throws Exception {
        elementIsPresentDOM(inputUsuario);
        inputUsuario.sendKeys("standard_user");
        elementIsPresentDOM(inputContrasena);
        inputContrasena.sendKeys("secret_sauce");
    }

    public void clicButtonLogin() throws Exception {
        elementIsPresentDOM(buttonLogin);
        buttonLogin.click();
    }

}
