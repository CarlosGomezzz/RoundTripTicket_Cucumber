package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//li[@data-cy='menu_Flights']")
	public WebElement flightButton;

	@FindBy(xpath = "//li[@data-cy='oneWayTrip']")
	public WebElement oneWayButton;

	@FindBy(xpath = "//input[@id='fromCity']")
	public WebElement fromButton;

	@FindBy(xpath = "//li[@data-cy='account']")
	public WebElement acctButton;

	@FindBy(xpath = "//input[@aria-controls='react-autowhatever-1']")
	public WebElement fromInputBox;

	@FindBy(xpath = "//li[@id='react-autowhatever-1-section-0-item-2']")
	public WebElement IAD;

	@FindBy(xpath = "//input[@aria-controls='react-autowhatever-1']")
	public WebElement toInputBox;

	@FindBy(xpath = "//li[@id='react-autowhatever-1-section-0-item-0']")
	public WebElement SEA;

	@FindBy(xpath = "//p[@class='font12 lightGreyText textCenter latoBold appendBottom15 defaultCursor']")
	public WebElement annoyingPopup;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/label/span")
	public WebElement departure;

	@FindBy(xpath = "//span[@aria-label='Next Month']")
	public WebElement nextMonth;
	
	@FindBy(xpath= "//div[@aria-label='Sun Mar 27 2022']")
	public WebElement Mar27;
	
	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	public WebElement searchButton;

}
