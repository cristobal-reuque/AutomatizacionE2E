package automatizacion.web.definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import automatizacion.web.base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestContext {

	@Before
	public void setUp() {
		String browser = System.getProperty("browser", "chrome");
		DriverFactory.initDriver(browser);
	}

	@After
	public void tearDown(Scenario scenario) {
		if(!scenario.isFailed()){
			generateEvidence("[SUCCESS] Final Test ScreenShot", scenario);
		}
		DriverFactory.quitDriver();
	}
	
	private void generateEvidence(String imageRefName, Scenario scenario) {
		try {
			byte[] screenShot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", imageRefName + " " + DriverFactory.getDriver().getCurrentUrl());
		} catch (Exception e) {
			System.out.println("Fallo al intentar sacar screenshot" + e);
		}
	}

}
