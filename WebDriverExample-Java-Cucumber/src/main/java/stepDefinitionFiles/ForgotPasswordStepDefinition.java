package stepDefinitionFiles;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import pageObjectModels.HomePageNotLoggedIn;
import pageObjectModels.AuthenticationPage;
import pageObjectModels.ForgotYourPasswordPage;
import testData.DataFile;

public class ForgotPasswordStepDefinition {

	private WebDriver driver = null;

	// PicoContainer injects BaseStep class
	public ForgotPasswordStepDefinition(BaseStepDefinition baseStepDefinition) {
		this.driver = baseStepDefinition.driver;
	}

	@Given("^I am at the AUTHENTICATION page$")
	public void i_am_at_the_AUTHENTICATION_page() throws Throwable {
		HomePageNotLoggedIn.signInButton(driver).click();
		Assert.assertEquals(DataFile.authenticationPageHeading, AuthenticationPage.heading(driver).getText());

	}

	@When("^I click the Forgot your password\\? link$")
	public void i_click_the_Forgot_your_password_link() throws Throwable {
		AuthenticationPage.forgotYourPasswordLink(driver).click();
	}

	@Then("^I am directed to the FORGOT YOUR PASSWORD\\? page$")
	public void i_am_directed_to_the_FORGOT_YOUR_PASSWORD_page() throws Throwable {
		Assert.assertEquals(DataFile.forgotYourPasswordPageHeading, ForgotYourPasswordPage.heading(driver).getText());
	}

	@When("^I enter a valid e-mail address in the Email address field$")
	public void i_enter_a_valid_e_mail_address_in_the_Email_address_field() throws Throwable {
		ForgotYourPasswordPage.enterYourEmailField(driver).sendKeys(DataFile.emailAddress);
	}

	@Then("^email address is shown in the email address field$")
	public void email_address_is_shown_in_the_email_address_field() throws Throwable {
		Assert.assertEquals(DataFile.emailAddress,
				ForgotYourPasswordPage.enterYourEmailField(driver).getAttribute("value"));
	}

	@When("^I click the retrieve password button$")
	public void i_click_the_retrieve_password_button() throws Throwable {
		ForgotYourPasswordPage.retrievePasswordButton(driver).click();
	}

	@Then("^I am taken to a confirmation page which shows the customers email address that they have used to reset$")
	public void i_am_taken_to_a_confirmation_page_which_shows_the_customer_s_email_address_that_they_have_used_to_reset()
			throws Throwable {
		Assert.assertEquals(DataFile.retrievePasswordSuccessAlert,
				ForgotYourPasswordPage.successAlert(driver).getText());
	}

	@When("^I click the Back to Login button$")
	public void i_click_the_Back_to_Login_button() throws Throwable {
		ForgotYourPasswordPage.backToLoginButton(driver).click();
	}

	@Then("^I am directed to the AUTHENTICATION PAGE$")
	public void i_am_directed_to_the_AUTHENTICATION_PAGE() throws Throwable {
		Assert.assertEquals(DataFile.authenticationPageHeading, AuthenticationPage.heading(driver).getText());
	}

}
