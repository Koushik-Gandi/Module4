package com.capg.stepdefinition;

import org.junit.Assert;
import com.capg.pomfiles.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition {
	static ConferenceRegistration reg = null;
	static PaymentDetails payDet = null;

	@Given("^user is registering$")
	public void user_is_registering() throws Throwable {
		DriverInitialiser.setBrowserName();
		DriverInitialiser.setBrowserConfig();
		DriverInitialiser.runTest();
		reg = new ConferenceRegistration(DriverInitialiser.driver);
		payDet = new PaymentDetails(DriverInitialiser.driver);

	}

	@When("^title of page is conference registration$")
	public void title_of_page_is_conference_registration() throws Throwable {
		String title = DriverInitialiser.driver.getTitle();
		Assert.assertEquals("Conference Registration", title);
	}

	@Then("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		reg.clickNext();
		reg.giveFirstName();
	}

	@Then("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		reg.clickNext();
		reg.giveLastName();
	}

	@Then("^user enters email$")
	public void user_enters_email() throws Throwable {
		reg.clickNext();
		reg.giveEmail();
	}

	@Then("^user enters contact number$")
	public void user_enters_contact_number() throws Throwable {
		reg.clickNext();
		reg.giveContactNo();
	}

	@Then("^user selects no of people$")
	public void user_selects_no_of_people() throws Throwable {
		reg.clickNext();
		reg.giveNoOfPeople();
	}

	@Then("^user enters building name and room no$")
	public void user_enters_building_name_and_room_no() throws Throwable {
		reg.clickNext();
		reg.giveBuildingName();
	}

	@Then("^user enters area name$")
	public void user_enters_area_name() throws Throwable {
		reg.clickNext();
		reg.giveAreaName();
	}

	@Then("^user selects city$")
	public void user_selects_city() throws Throwable {
		reg.clickNext();
		reg.giveCity();
	}

	@Then("^user selects state$")
	public void user_selects_state() throws Throwable {
		reg.clickNext();
		reg.giveState();
	}

	@Then("^user selects conference access$")
	public void user_selects_conference_access() throws Throwable {
		reg.clickNext();
		reg.giveConferenceAccess();
	}

	@Then("^click on next$")
	public void click_on_next() throws Throwable {
		reg.clickNext();
	}

	@Then("^title of page is payment details$")
	public void title_of_page_is_payment_details() throws Throwable {
		String title = DriverInitialiser.driver.getTitle();
		Assert.assertEquals("Payment Details", title);
	}

	@Then("^user enters card holder name$")
	public void user_enters_card_holder_name() throws Throwable {
		payDet.clickNext();
		payDet.giveCardHolderName();
	}

	@Then("^user enters debit card number$")
	public void user_enters_debit_card_number() throws Throwable {
		payDet.clickNext();
		payDet.giveDebitCardName();
	}

	@Then("^user enters cvv number$")
	public void user_enters_cvv_number() throws Throwable {
		payDet.clickNext();
		payDet.giveCvvNumber();
	}

	@Then("^user enters card expiration month$")
	public void user_enters_card_expiration_month() throws Throwable {
		payDet.clickNext();
		payDet.giveCardExpiryMonth();
	}

	@Then("^user enters card expiration year$")
	public void user_enters_card_expiration_year() throws Throwable {
		payDet.clickNext();
		payDet.giveCardExpiryYear();
	}

	@Then("^click on make payment$")
	public void click_on_make_payment() throws Throwable {
		payDet.clickNext();
	}
	
	@Then("^closing browser$")
	public void closing_the_Window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverInitialiser.quitTest();
	  
	}
}
