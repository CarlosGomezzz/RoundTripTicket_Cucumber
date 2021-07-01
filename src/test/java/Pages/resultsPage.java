package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class resultsPage {

	public resultsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='listingRhs']/p")
	public WebElement flightsFromToText;

	@FindBy(xpath = "(//button[contains(@id,'bookbutton')])[1]")
	public WebElement viewPricesButton;

	@FindBy(xpath = "(//button[contains(@id,'bookbutton')])[2]")
	public WebElement bookNowButton;
}