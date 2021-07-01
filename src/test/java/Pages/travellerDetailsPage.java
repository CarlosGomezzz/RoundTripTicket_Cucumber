package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class travellerDetailsPage {

	public travellerDetailsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//p[@CLASS='tvlr-heading make_flex space_between alC LatoBold']/span")
	public WebElement travelerDetailsText;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[1]/div[1]/div/input")
	public WebElement firstName;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[1]/div[2]/div/input")
	public WebElement lastName;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[1]/div[3]/div/div/label[1]")
	public WebElement Male;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[2]/div/div/div")
	public WebElement meal;

	@FindBy(xpath = "//*[@id=\"MANUAL_f2cd2113-10dc-4f24-90d7-9bf8d0f8cce0\"]/div[2]/div/div[2]/div[1]/div/div/div/div[2]")
	public WebElement mealList;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[2]/div[3]/div/div")
	public WebElement nationality;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[2]/div[4]/div/div/div[1]")
	public WebElement birthDate;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[2]/div[4]/div/div/div[2]")
	public WebElement birthMonth;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[2]/div[4]/div/div/div[3]")
	public WebElement birthYear;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[3]/div/div/input")
	public WebElement passportNum;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[3]/div[2]/div/div/div")
	public WebElement passportCountryDropDown;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[3]/div[2]/div/div/div/div/div/div/div/input")
	public WebElement passportCountryInput;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[3]/div[3]/div/div/div[1]")
	public WebElement expiryDate;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[3]/div[3]/div/div/div[2]")
	public WebElement expiryMonth;

	@FindBy(xpath = "//div[@class='collapse in']/div/div[3]/div[3]/div/div/div[3]")
	public WebElement expiryYear;

	@FindBy(xpath = "///div[@id='contactDetailsCard']/div/div/div[2]/div/input")
	public WebElement MobileNumBox;

	@FindBy(xpath = "//div[@id='contactDetailsCard']/div/div/div[3]/div/input")
	public WebElement EmailBox;

	@FindBy(xpath = "//button[@class='ack-cta btn fli_primary_btn text-uppercase']")
	public WebElement continueButton;

	@FindBy(xpath = "//p[@class='reviewDtlsOverlayBtn']/a[2]")
	public WebElement confirmButton;
}
