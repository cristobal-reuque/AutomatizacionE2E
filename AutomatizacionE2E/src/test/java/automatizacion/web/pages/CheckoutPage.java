package automatizacion.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "checkout")
    WebElement buttonCheckout;

    @FindBy(id = "first-name")
    WebElement inputFirstName;

    @FindBy(id = "last-name")
    WebElement inputLastName;

    @FindBy(id = "postal-code")
    WebElement inputPostalCode;

    @FindBy(id = "continue")
    WebElement buttonContinue;

    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    WebElement tituloOverview;

    @FindBy(xpath = "//div[@class='cart_item']")
    WebElement contenedorItem;

    @FindBy(xpath = "//div[text()='Payment Information:']")
    WebElement labelPaymentInformation;

    @FindBy(xpath = "//div[text()='Shipping Information:']")
    WebElement labelShippingInformation;

    @FindBy(xpath = "//div[text()='Price Total']")
    WebElement labelPriceTotal;

    @FindBy(id = "finish")
    WebElement buttonFinish;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    WebElement labelThankYouForYourOrder;

    public void clickButtonCheckout() throws Exception {
        elementIsPresentDOM(buttonCheckout);
        buttonCheckout.click();
    }

    public void completeInformationCheckout() throws Exception {
        elementIsPresentDOM(inputFirstName);
        inputFirstName.sendKeys("Juan");
        elementIsPresentDOM(inputLastName);
        inputLastName.sendKeys("Perez");
        elementIsPresentDOM(inputPostalCode);
        inputPostalCode.sendKeys("10101010");
    }

    public void clickButtonContinueCheckout() throws Exception {
        elementIsPresentDOM(buttonContinue);
        buttonContinue.click();
    }

    public void isDisplayedCheckoutOverview() throws Exception {
        elementIsPresentDOM(tituloOverview);
        elementIsPresentDOM(contenedorItem);
        elementIsPresentDOM(labelPaymentInformation);
        elementIsPresentDOM(labelShippingInformation);
        elementIsPresentDOM(labelPriceTotal);
    }

    public void clickButtonFinish() throws Exception{
        elementIsPresentDOM(buttonFinish);
        buttonFinish.click();
    }

    public void isDisplayedCheckoutCompletePage() throws Exception {
        elementIsPresentDOM(labelThankYouForYourOrder);
    }

}
