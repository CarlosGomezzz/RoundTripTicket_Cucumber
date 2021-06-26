package Pages;

import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

}
