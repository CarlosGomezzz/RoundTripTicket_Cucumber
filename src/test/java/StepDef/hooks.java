package StepDef;

import java.util.concurrent.TimeUnit;

import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before
	public void init() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void end() {
		Driver.closeDriver();
	}

}
