package StepDef;

import static org.junit.Assert.assertEquals;

import Pages.HomePage;
import Utilities.BrowserUtilities;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buyInRupees {
	HomePage hp = new HomePage();

	@Given("user is at Make My Trip homepage.")
	public void user_is_at_make_my_trip_homepage() {
		String actPageTitle = Driver.getDriver().getTitle();
		assertEquals(ConfigReader.getProperty("expHPTitle"), actPageTitle);
	}

	@When("user clicks on flights and chooses time, date, departure for flight")
	public void user_clicks_on_flights_and_chooses_time_date_departure_for_flight() {
		hp.flightButton.click();
		hp.oneWayButton.click();
		hp.fromButton.click();
		hp.fromInputBox.sendKeys(ConfigReader.getProperty("fromAirport"));
		hp.IAD.click();
		BrowserUtilities.waitFor(2);
		hp.toInputBox.sendKeys(ConfigReader.getProperty("toAirport"));
		hp.SEA.click();
	}

	@When("user chooses a flight")
	public void user_chooses_a_flight() {
	}

	@When("user enters passanger info")
	public void user_enters_passanger_info() {
	}

	@When("user enters payment info")
	public void user_enters_payment_info() {
	}

	@Then("user gets failure message")
	public void user_gets_failure_message() {
	}

}
