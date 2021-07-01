package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class itineraryPage {

	public itineraryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//p[@class='rvw-heading LatoBold']")
	public WebElement itineraryText;

	@FindBy(xpath = "//div[@class='append_bottom15 make_relative blocked_traveller_booking']/button")
	public WebElement continueButton;
}
