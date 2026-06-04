package automatizacion.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected final WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofSeconds(1));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void elementIsPresentDOM(WebElement wElement) throws Exception {
        try {
            wElement.isDisplayed();
        } catch (Exception e) {
            throw new Exception("element not found in DOM -> " + wElement.toString() + " " + e.getLocalizedMessage());
        }
    }
}
