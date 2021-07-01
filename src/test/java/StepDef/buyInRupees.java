package StepDef;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;
import Pages.itineraryPage;
import Pages.resultsPage;
import Pages.travellerDetailsPage;
import Utilities.BrowserUtilities;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buyInRupees {
	HomePage hp = new HomePage();
	resultsPage rp = new resultsPage();
	itineraryPage ip = new itineraryPage();
	travellerDetailsPage tdp = new travellerDetailsPage();

	@Given("user is at Make My Trip homepage.")
	public void user_is_at_make_my_trip_homepage() {
		String actPageTitle = Driver.getDriver().getTitle();
		assertEquals(ConfigReader.getProperty("expHPTitle"), actPageTitle);
	}

	@When("user clicks on flights and chooses time, date, departure for flight")
	public void user_clicks_on_flights_and_chooses_time_date_departure_for_flight() {

		try {
			if (hp.annoyingPopup2.isDisplayed()) {
				hp.acctButton.click();

				BrowserUtilities.waitFor(3);

				hp.flightButton.click();
				hp.oneWayButton.click();
				hp.fromButton.click();
				hp.fromInputBox.sendKeys(ConfigReader.getProperty("fromAirport"));
				BrowserUtilities.waitFor(2);
				for (int i = 0; i < hp.fromAirportList.size(); i++) {
					String text = hp.fromAirportList.get(i).getText();
					if (text.contains("IAD")) {
						hp.fromAirportList.get(i).click();
					}
				}
				hp.toInputBox.sendKeys(ConfigReader.getProperty("toAirport"));
				BrowserUtilities.waitFor(2);
				hp.SEA.click();
				for (int i = 1; i <= 8; i++) {
					hp.nextMonth.click();
				}
				hp.Mar27.click();
				hp.searchButton.click();

				WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
				wait.until(ExpectedConditions.visibilityOf(rp.viewPricesButton));
				String fromIADtoSEAtext = rp.flightsFromToText.getText();
				assertEquals(ConfigReader.getProperty("flightsFromToText"), fromIADtoSEAtext);
				rp.viewPricesButton.click();
			}
		} catch (Exception e) {
			hp.flightButton.click();
			hp.oneWayButton.click();
			hp.fromButton.click();
			hp.fromInputBox.sendKeys(ConfigReader.getProperty("fromAirport"));
			BrowserUtilities.waitFor(2);
			for (int i = 0; i < hp.fromAirportList.size(); i++) {
				String text = hp.fromAirportList.get(i).getText();
				if (text.contains("IAD")) {
					hp.fromAirportList.get(i).click();
				}
			}
			hp.toInputBox.sendKeys(ConfigReader.getProperty("toAirport"));
			BrowserUtilities.waitFor(2);
			hp.SEA.click();
			for (int i = 1; i <= 8; i++) {
				hp.nextMonth.click();
			}
			hp.Mar27.click();
			hp.searchButton.click();
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
			wait.until(ExpectedConditions.visibilityOf(rp.viewPricesButton));
			String fromIADtoSEAtext = rp.flightsFromToText.getText();
			assertEquals(ConfigReader.getProperty("flightsFromToText"), fromIADtoSEAtext);
			rp.viewPricesButton.click();
		}
	}

	@When("user chooses a flight and confirms itinerary")
	public void user_chooses_a_flight_and_confirms_itinerary() {
		String parentTb = Driver.getDriver().getWindowHandle();
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(rp.bookNowButton));
		rp.bookNowButton.click();
		Set<String> s = Driver.getDriver().getWindowHandles();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String childTb = it.next();
			if (!parentTb.equals(childTb)) {
				Driver.getDriver().switchTo().window(childTb);
			}
		}
		String ipText = ip.itineraryText.getText();
		BrowserUtilities.waitFor(5);
		assertEquals(ConfigReader.getProperty("ipTextExpected"), ipText);
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(ip.continueButton));
		ip.continueButton.click();
	}

	@When("user enters passanger info")
	public void user_enters_passanger_info() {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(tdp.firstName));
		String tdpText = tdp.travelerDetailsText.getText();
		assertEquals(ConfigReader.getProperty("tdpTextExpected"), tdpText);
		tdp.firstName.sendKeys(ConfigReader.getProperty("firstName"));
		tdp.lastName.sendKeys(ConfigReader.getProperty("lastName"));
		tdp.Male.click();
		tdp.meal.click();

		wait.until(ExpectedConditions.visibilityOfAllElements(tdp.meal));
		tdp.meal.sendKeys(ConfigReader.getProperty("meal"));
		tdp.nationality.click();
		tdp.nationality.sendKeys(ConfigReader.getProperty("nationality"));
		BrowserUtilities.waitFor(10);

	}

	@When("user enters payment info")
	public void user_enters_payment_info() {
	}

	@Then("user gets failure message")
	public void user_gets_failure_message() {
	}

}
