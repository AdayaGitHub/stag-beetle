package stepDefinitionFiles;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import pageObjectModels.HomePageNotLoggedIn;
import pageObjectModels.LoggedInHomePage;
import pageObjectModels.AuthenticationPage;
import pageObjectModels.RegisterPage;
import testData.DataFile;
public class RegisterAndLoginStepDefinition {

	private WebDriver driver = null;
	
	// PicoContainer injects BaseStep class
		public RegisterAndLoginStepDefinition(BaseStepDefinition baseStepDefinition) {
		this.driver = baseStepDefinition.driver;
	}

@Given("^I am at the homepage$")
public void i_am_at_the_homepage() throws Throwable {

}

@When("^I click the Sign in button$")
public void i_click_the_Sign_in_button() throws Throwable {
	HomePageNotLoggedIn.signInButton(driver).click();

}

@Then("^I am directed to the Authentication page$")
public void i_am_directed_to_the_Authentication_page() throws Throwable {
	Assert.assertEquals(DataFile.authenticationPageHeading,AuthenticationPage.heading(driver).getText());

}

@When("^I enter a valid \"([^\"]*)\" in the Email address field$")
public void i_enter_a_valid_in_the_Email_address_field(String arg1) throws Throwable {
	AuthenticationPage.emailField(driver).sendKeys(arg1);
}

@Then("^\"([^\"]*)\" is shown in the Email address field$")
public void is_shown_in_the_Email_address_field(String arg1) throws Throwable {
	Assert.assertEquals(arg1, AuthenticationPage.emailField(driver).getAttribute("value"));
}

@When("^I click the Create an account button$")
public void i_click_the_Create_an_account_button() throws Throwable {
	AuthenticationPage.createAccountButton(driver).click();
}

@Then("^I am directed to the Create An Account page$")
public void i_am_directed_to_the_Create_An_Account_page() throws Throwable {
	Thread.sleep(2000);
	Assert.assertEquals(DataFile.registrationPageHeading, RegisterPage.heading(driver).getText());
}

@When("^I select a checkbox for title$")
public void i_select_a_checkbox_for_title() throws Throwable {
	RegisterPage.mrTickbox(driver).click();
}

@Then("^The appropriate checkbox had been highlighted$")
public void the_appropriate_checkbox_had_been_highlighted() throws Throwable {
	Assert.assertTrue(RegisterPage.mrTickbox(driver).isSelected());

}

@When("^I enter a First name into the First name field$")
public void i_enter_a_First_name_into_the_First_name_field() throws Throwable {
	RegisterPage.firstNamePersonalInfoField(driver).sendKeys(DataFile.firstName);

}

@Then("^The First name appears in the First name field$")
public void the_First_name_appears_in_the_First_name_field() throws Throwable {
	Assert.assertEquals(DataFile.firstName, RegisterPage.firstNamePersonalInfoField(driver).getAttribute("value"));

}

@When("^I enter a Last name into the Last name field$")
public void i_enter_a_Last_name_into_the_Last_name_field() throws Throwable {
	  RegisterPage.lastNamePersonalInfoField(driver).sendKeys(DataFile.lastName);

}

@Then("^The Last name appears in the Last name field\\.$")
public void the_Last_name_appears_in_the_Last_name_field() throws Throwable {
	Assert.assertEquals(DataFile.lastName, RegisterPage.lastNamePersonalInfoField(driver).getAttribute("value"));
  
}

@Then("^The Email address field is pre-populated with \"([^\"]*)\"$")
public void the_Email_address_field_is_pre_populated_with(String arg1) throws Throwable {
	Assert.assertEquals(arg1, RegisterPage.emailAddressField(driver).getAttribute("value"));
}

@When("^I Enter a valid password$")
public void i_Enter_a_valid_password() throws Throwable {
	RegisterPage.passwordField(driver).sendKeys(DataFile.password);

}

@Then("^The password appears but is dotted$")
public void the_password_appears_but_is_dotted() throws Throwable {
	Assert.assertTrue(RegisterPage.passwordField(driver).getAttribute("type").equals("password"));

}

@Then("^The first name appears in the first name filed under your address\\.$")
public void the_first_name_appears_in_the_first_name_filed_under_your_address() throws Throwable {
	Assert.assertEquals(DataFile.firstName,RegisterPage.firstNameYourAddressField(driver).getAttribute("value"));

}

@Then("^The last name appears under the last name section of your address$")
public void the_last_name_appears_under_the_last_name_section_of_your_address() throws Throwable {
	Assert.assertEquals(DataFile.lastName, RegisterPage.lastNameYourAddressField(driver).getAttribute("value"));

}

@When("^I enter a valid address$")
public void i_enter_a_valid_address() throws Throwable {
	RegisterPage.addressField(driver).sendKeys(DataFile.address);

}

@Then("^The address appears in the Address field$")
public void the_address_appears_in_the_Address_field() throws Throwable {
	Assert.assertEquals(DataFile.address, RegisterPage.addressField(driver).getAttribute("value"));

}

@When("^I enter a valid city$")
public void i_enter_a_valid_city() throws Throwable {
	RegisterPage.cityField(driver).sendKeys(DataFile.city);

}

@Then("^The city appears in the City field$")
public void the_city_appears_in_the_City_field() throws Throwable {
	Assert.assertEquals(DataFile.city, RegisterPage.cityField(driver).getAttribute("value"));

}

@When("^I enter a valid state$")
public void i_enter_a_valid_state() throws Throwable {
	Select stateFieldSelect = new Select(RegisterPage.stateDropDown(driver));
	stateFieldSelect.selectByVisibleText(DataFile.state);

}

@Then("^The state appears in the State field$")
public void the_state_appears_in_the_State_field() throws Throwable {
	Assert.assertEquals(DataFile.stateNumber, RegisterPage.stateDropDown(driver).getAttribute("value"));

}

@When("^I enter a valid Postal Code$")
public void i_enter_a_valid_Postal_Code() throws Throwable {
	RegisterPage.postCodeField(driver).sendKeys(DataFile.postalCode);

}

@Then("^The postal code appears in the Zip/Postal Code field\\.$")
public void the_postal_code_appears_in_the_Zip_Postal_Code_field() throws Throwable {
	Assert.assertEquals(DataFile.postalCode, RegisterPage.postCodeField(driver).getAttribute("value"));

}

@When("^I enter a valid mobile phone number$")
public void i_enter_a_valid_mobile_phone_number() throws Throwable {
	RegisterPage.mobilePhoneField(driver).sendKeys(DataFile.mobileNumber);

}

@Then("^The mobile phone number appears in the mobile phone number field\\.$")
public void the_mobile_phone_number_appears_in_the_mobile_phone_number_field() throws Throwable {
	Assert.assertEquals(DataFile.mobileNumber, RegisterPage.mobilePhoneField(driver).getAttribute("value"));

}

@When("^I click register$")
public void i_click_register() throws Throwable {
	RegisterPage.registerButton(driver).click();

}

@Then("^The user is logged in to MY ACCOUNT page$")
public void the_user_is_logged_in_to_MY_ACCOUNT_page() throws Throwable {
	Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());

}

@When("^I click Sign out button$")
public void i_click_Sign_out_button() throws Throwable {
	LoggedInHomePage.signOutButton(driver).click();

}

@Then("^The user is logged out and is on the AUTHENTICATION page$")
public void the_user_is_logged_out_and_is_on_the_AUTHENTICATION_page() throws Throwable {
	Assert.assertEquals(DataFile.authenticationPageHeading,AuthenticationPage.heading(driver).getText());

}

@When("^I enter the \"([^\"]*)\" registered under ALREADY REGISTERED\\? Section$")
public void i_enter_the_registered_under_ALREADY_REGISTERED_Section(String arg1) throws Throwable {
	AuthenticationPage.emailAlreadyRegisteredField(driver).sendKeys(arg1);
}

@Then("^\"([^\"]*)\" is entered into the Email address field$")
public void is_entered_into_the_Email_address_field(String arg1) throws Throwable {
	Assert.assertEquals(arg1, AuthenticationPage.emailAlreadyRegisteredField(driver).getAttribute("value"));
}


@When("^I enter the password registered under ALREADY REGISTERED\\? Section$")
public void i_enter_the_password_registered_under_ALREADY_REGISTERED_Section() throws Throwable {
	AuthenticationPage.passwordAlreadyRegisteredField(driver).sendKeys(DataFile.password);

}

@Then("^Password is entered into the Password field and shown in dots\\.$")
public void password_is_entered_into_the_Password_field_and_shown_in_dots() throws Throwable {
	Assert.assertTrue(AuthenticationPage.passwordAlreadyRegisteredField(driver).getAttribute("type").equals("password"));

}

@When("^I click the Sign in button for login$")
public void i_click_the_Sign_in_button_for_login() throws Throwable {
	AuthenticationPage.signInButton(driver).click();
	
}

@Then("^The user is logged in to MY ACCOUNT page\\.$")
public void the_user_is_logged_in_to_my_account_page() throws Throwable {
	Thread.sleep(5000);
	Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());
}


}

