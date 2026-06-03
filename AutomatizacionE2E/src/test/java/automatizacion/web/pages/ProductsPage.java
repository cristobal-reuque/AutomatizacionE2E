package automatizacion.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "inventory_container")
    WebElement contenedorProducts;

    @FindBy(xpath = "(//div[@class='inventory_item']//button[text()='Add to cart'])[1]")
    WebElement buttonAddToCartPrimerProducto;

    @FindBy(id = "shopping_cart_container")
    WebElement buttonCarritoCompras;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement buttonCarritoComprasItems;

    @FindBy(xpath = "//button[text()='Remove']")
    WebElement buttonRemoveCarritoCompras;

    public void isDisplayedProductsPage() throws Exception {
        elementIsPresentDOM(contenedorProducts);
    }

    public void agregarPrimerProducto() throws Exception {
        elementIsPresentDOM(buttonAddToCartPrimerProducto);
        buttonAddToCartPrimerProducto.click();
    }

    public void clicButtonCarritoCompras() throws Exception {
        elementIsPresentDOM(buttonCarritoCompras);
        buttonCarritoCompras.click();
    }

    public void isDisplayedCarritoComprasItems(String cantidad) throws Exception {
        elementIsPresentDOM(buttonCarritoComprasItems);
        if(!buttonCarritoComprasItems.getText().equals(cantidad)){
            throw new Exception("[ERROR] La cantidad no es correcta");
        }
    }

    public void eliminarProductoCarritoCompras() throws Exception {
        elementIsPresentDOM(buttonRemoveCarritoCompras);
        buttonRemoveCarritoCompras.click();
    }
}
