package stepDefinitionFiles;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testData.DataFile;
import cucumber.api.java.en.Then;

import pageObjectModels.HomePageNotLoggedIn;
import pageObjectModels.LoggedInHomePage;
import pageObjectModels.AuthenticationPage;
import pageObjectModels.AddToCartPopUp;
import pageObjectModels.CheckoutSection;

public class SelectingAndBuyingStepDefinition {

	private WebDriver driver = null;

	// PicoContainer injects BaseStep class
	public SelectingAndBuyingStepDefinition(BaseStepDefinition baseStepDefinition) {
		this.driver = baseStepDefinition.driver;
	}

	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		HomePageNotLoggedIn.signInButton(driver).click();
		Assert.assertEquals(DataFile.authenticationPageHeading, AuthenticationPage.heading(driver).getText());
		AuthenticationPage.emailAlreadyRegisteredField(driver).sendKeys(DataFile.emailAddress);
		Assert.assertEquals(DataFile.emailAddress,
				AuthenticationPage.emailAlreadyRegisteredField(driver).getAttribute("value"));
		AuthenticationPage.passwordAlreadyRegisteredField(driver).sendKeys(DataFile.password);
		Assert.assertTrue(
				AuthenticationPage.passwordAlreadyRegisteredField(driver).getAttribute("type").equals("password"));
		AuthenticationPage.signInButton(driver).click();
	}

	@And("^I am at the homepage1$")
	public void i_am_at_the_homepage1() throws Throwable {
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());
	}

	@When("^I click T-shirts link$")
	public void i_click_T_shirts_link() throws Throwable {
		LoggedInHomePage.tshirtsLink(driver).click();
	}

	@Then("^the T-Shirts page is shown$")
	public void the_T_Shirts_page_is_shown() throws Throwable {
		Assert.assertEquals(DataFile.tShirtsHeading, LoggedInHomePage.tShirtsHeading(driver).getText());
	}

	@When("^I add a T-shirt to the cart$")
	public void i_add_a_T_shirt_to_the_cart() throws Throwable {
		LoggedInHomePage.tShirtAddToCartButton(driver).click();
		Thread.sleep(2000);
	}

	@Then("^A pop up is shown with the message Product successfully added to your shopping cart$")
	public void a_pop_up_is_shown_with_the_message_Product_successfully_added_to_your_shopping_cart() throws Throwable {
		Assert.assertEquals(DataFile.addToCartPopupMessage, AddToCartPopUp.addToCartPopUpMessage(driver).getText());
	}

	@When("^I click Continue Shopping$")
	public void i_click_Continue_Shopping() throws Throwable {
		AddToCartPopUp.continueShoppingButton(driver).click();
	}

	@Then("^I remain on T-Shirt page$")
	public void i_remain_on_T_Shirt_page() throws Throwable {
		Assert.assertEquals(DataFile.tShirtsHeading, LoggedInHomePage.tShirtsHeading(driver).getText());
	}

	@When("^Click the Dresses link$")
	public void click_the_Dresses_link() throws Throwable {
		LoggedInHomePage.dressesLink(driver).click();
	}

	@Then("^The dresses page is shown$")
	public void the_dresses_page_is_shown() throws Throwable {
		Assert.assertEquals(DataFile.dressesHeading, LoggedInHomePage.dressesHeading(driver).getText());
	}

	@When("^Add a dress to the cart$")
	public void add_a_dress_to_the_cart() throws Throwable {
		LoggedInHomePage.dressAddToCartButton(driver).click();
		Thread.sleep(2000);
	}

	@Then("^A pop up is shown with the message Product successfully added to your shopping cart\\.$")
	public void a_pop_up_is_shown_with_the_message_Product_successfully_added_to_your_shopping_cart1()
			throws Throwable {
		Assert.assertEquals(DataFile.addToCartPopupMessage, AddToCartPopUp.addToCartPopUpMessage(driver).getText());
	}

	@When("^Click Proceed to checkout$")
	public void click_Proceed_to_checkout() throws Throwable {
		AddToCartPopUp.proceedToCheckoutButton(driver).click();
	}

	@Then("^A summary page is shown with the correct total amount shown$")
	public void a_summary_page_is_shown_with_the_correct_total_amount_shown() throws Throwable {
		Assert.assertEquals(DataFile.totalPrice, CheckoutSection.totalPrice(driver).getText());
	}

	@When("^Click Proceed to checkout1$")
	public void click_Proceed_to_checkout1() throws Throwable {
		CheckoutSection.proceedToCheckoutButton0(driver).click();
	}

	@Then("^User is on the ADDRESSES page$")
	public void user_is_on_the_ADDRESSES_page() throws Throwable {
		Assert.assertEquals(DataFile.addressPageHeading, CheckoutSection.addressPageHeading(driver).getText());
	}

	@When("^Click Proceed to checkout2$")
	public void click_Proceed_to_checkout2() throws Throwable {
		CheckoutSection.proceedToCheckoutButton1(driver).click();
	}

	@Then("^User is on the SHIPPING page$")
	public void user_is_on_the_SHIPPING_page() throws Throwable {
		Assert.assertEquals(DataFile.shippingPageHeading, CheckoutSection.shippingPageHeading(driver).getText());
	}

	@When("^Tick the terms and conditions$")
	public void tick_the_terms_and_conditions() throws Throwable {
		CheckoutSection.tAndCTickBox(driver).click();
	}

	@Then("^The tick box is ticked$")
	public void the_tick_box_is_ticked() throws Throwable {
		Assert.assertTrue(CheckoutSection.tAndCTickBox(driver).isSelected());
	}

	@When("^Click Proceed to checkout3$")
	public void click_Proceed_to_checkout3() throws Throwable {
		CheckoutSection.proceedToCheckoutButton2(driver).click();
	}

	@Then("^User is on the PLEASE CHOOSE YOUR PAYMENT METHOD$")
	public void user_is_on_the_PLEASE_CHOOSE_YOUR_PAYMENT_METHOD() throws Throwable {
		Assert.assertEquals(DataFile.chooseYourPaymentHeading,
				CheckoutSection.pleaseChooseYourPaymentMethod(driver).getText());
	}

	@When("^Click pay by bank wire$")
	public void click_pay_by_bank_wire() throws Throwable {
		CheckoutSection.payByBankWireButton(driver).click();
	}

	@Then("^User is on order summary page$")
	public void user_is_on_order_summary_page() throws Throwable {
		Assert.assertEquals(DataFile.orderSummaryHeading, CheckoutSection.orderSummaryHeading(driver).getText());
	}

	@When("^Click I confirm my order$")
	public void click_I_confirm_my_order() throws Throwable {
		CheckoutSection.confirmMyOrder(driver).click();
	}

	@Then("^User is on order confirmation page$")
	public void user_is_on_order_confirmation_page() throws Throwable {
		Assert.assertEquals(DataFile.orderConfirmationHeading,
				CheckoutSection.orderConfirmationHeading(driver).getText());
	}

	@When("^Click Back to orders$")
	public void click_Back_to_orders() throws Throwable {
		CheckoutSection.backToOrders(driver).click();
	}

	@Then("^User is directed to the order history page with the order showing with the correct amount shown$")
	public void user_is_directed_to_the_order_history_page_with_the_order_showing_with_the_correct_amount_shown()
			throws Throwable {
		Assert.assertEquals(DataFile.orderHistoryPageHeading,
				CheckoutSection.orderHistoryPageHeading(driver).getText());
	}

}
