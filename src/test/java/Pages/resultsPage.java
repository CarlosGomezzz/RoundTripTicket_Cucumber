package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class resultsPage {

	public resultsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='flight_list_item_0_RKEY:f7bea2ca-ee56-48b9-8cbd-731a8ac812b0:8_0']/div/div[2]/div[2]/div/button")
	public WebElement viewPricesButton;
}
