package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.constants;

public class Lookup {
	public WebDriver driver;

	public Lookup() {
		WebDriver driver = Hooks.driver;
	}

	@Given("^I am on the vehicle details page$")
	public void i_am_on_the_vehicle_details_page() {
		driver.get(constants.baseURL);
		driver.findElement(By.id("lph-cta-car")).click();
	}

	@Then("^the value returned for (\\d+) is (.*?)$")
	public void the_value_returned_for__is_(int inputNumber, int expectedOutput) {

		String outputValue = "";

		// TEST 1:
		// Return "Too small", "Just right" or "Too big" depending on the input
		// number.

		Assert.assertEquals(expectedOutput, outputValue);
	}

	@When("^I enter the name \"(.*?)\"$")
	public void i_enter_the_name(String inputName) {
		String name = inputName; // nothing to do here!
	}

	@Then("^the name I get back is \"(.*?)\"$")
	public void the_name_I_get_back_is(String expectedName) {
		String outputValue = "";

		// TEST 2:
		// Take the value from the global variable 'name',
		// change it into upper-case and put it backwards.
		
		Assert.assertEquals(expectedName, outputValue);
	}

	@When("^I send (\\d+) to my custom method$")
	public void i_send__to_my_custom_method(int customMethodInput) {
		int inputValue = customMethodInput; // nothing to do here!
	}

	@Then("^the number (\\d+) is returned$")
	public void the_number__is_returned(int expectedValue) {
		// TEST 3:
		// DO NOT MODIFY THIS DEFINITION!
		// Instead, write a custom function 'myFunction' which satisfies the
		// rules.
		
		/* int outputValue = myFunction(inputValue);
		Assert.assertEquals(expectedValue, outputValue); */
	}

	@Then("^this test prints \"(.*?)\"$")
	public void this_test_prints_(String expectedValue) {
		String outputValue = "";
		// TEST 4:
		// Return a countdown "10 9 8 7 6 5 4 3 2 1 LIFTOFF"

		Assert.assertEquals(expectedValue, outputValue);
	}

}
