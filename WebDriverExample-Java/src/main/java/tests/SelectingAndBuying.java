package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import data.DataFile;
import driverUtilities.DriverUtilities;
import pageobjects.AuthenticationPage;
import pageobjects.LoggedInHomePage;
import pageobjects.AddToCartPopUp;
import pageobjects.CheckoutSection;
import pageobjects.HomePageNotLoggedIn;

import org.junit.Assert;

public class SelectingAndBuying {

	WebDriver driver;

	@Before
	public void preConditions() {
		// The driver instantiation is moved to the preconditions
		// Doesn’t affect the outcome of the test so should be here
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get(DataFile.websiteURL);
		driver.manage().window().maximize();
		// Add code to check if user is registered
	}

	@Test
	public void selectingAndBuying() throws InterruptedException { // Method definition
		// Create instance of WebDriver

		// Precondition
		HomePageNotLoggedIn.signInButton(driver).click();
		Assert.assertEquals(DataFile.authenticationPageHeading, AuthenticationPage.heading(driver).getText());

		// Step 1

		AuthenticationPage.emailAlreadyRegisteredField(driver).sendKeys(DataFile.emailAddress);
		Assert.assertEquals(DataFile.emailAddress,
				AuthenticationPage.emailAlreadyRegisteredField(driver).getAttribute("value"));

		// Step 2
		AuthenticationPage.passwordAlreadyRegisteredField(driver).sendKeys(DataFile.password);
		Assert.assertTrue(
				AuthenticationPage.passwordAlreadyRegisteredField(driver).getAttribute("type").equals("password"));

		// Step 3
		AuthenticationPage.signInButton(driver).click();
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());

		// Step 4
		LoggedInHomePage.tshirtsLink(driver).click();
		Assert.assertEquals(DataFile.tShirtsHeading, LoggedInHomePage.tShirtsHeading(driver).getText());

		// Step 5
		LoggedInHomePage.tShirtAddToCartButton(driver).click();
		Thread.sleep(2000);
		Assert.assertEquals(DataFile.addToCartPopupMessage, AddToCartPopUp.addToCartPopUpMessage(driver).getText());

		// Step 6
		AddToCartPopUp.continueShoppingButton(driver).click();
		Assert.assertEquals(DataFile.tShirtsHeading, LoggedInHomePage.tShirtsHeading(driver).getText());

		// Step 7
		LoggedInHomePage.dressesLink(driver).click();
		Assert.assertEquals(DataFile.dressesHeading, LoggedInHomePage.dressesHeading(driver).getText());
		// Assert.assertTrue(addToCartPopUp.totalPrice = addToCartPopUp.tShirtPrice +
		// addToCartPopUp.dressPrice + 2);

		// Step 8
		LoggedInHomePage.dressAddToCartButton(driver).click();
		Thread.sleep(2000);
		Assert.assertEquals(DataFile.addToCartPopupMessage, AddToCartPopUp.addToCartPopUpMessage(driver).getText());

		// Step 9
		AddToCartPopUp.proceedToCheckoutButton(driver).click();
		Assert.assertEquals(DataFile.totalPrice, CheckoutSection.totalPrice(driver).getText());

		// Step 10
		CheckoutSection.proceedToCheckoutButton0(driver).click();
		Assert.assertEquals(DataFile.addressPageHeading, CheckoutSection.addressPageHeading(driver).getText());

		// Step 11
		CheckoutSection.proceedToCheckoutButton1(driver).click();
		Assert.assertEquals(DataFile.shippingPageHeading, CheckoutSection.shippingPageHeading(driver).getText());

		// Step 12
		CheckoutSection.tAndCTickBox(driver).click();
		Assert.assertTrue(CheckoutSection.tAndCTickBox(driver).isSelected());

		// Step 13
		CheckoutSection.proceedToCheckoutButton2(driver).click();
		Assert.assertEquals(DataFile.chooseYourPaymentHeading,
				CheckoutSection.pleaseChooseYourPaymentMethod(driver).getText());

		// Step 14
		CheckoutSection.payByBankWireButton(driver).click();
		Assert.assertEquals(DataFile.orderSummaryHeading, CheckoutSection.orderSummaryHeading(driver).getText());

		// Step 15
		CheckoutSection.confirmMyOrder(driver).click();
		Assert.assertEquals(DataFile.orderConfirmationHeading,
				CheckoutSection.orderConfirmationHeading(driver).getText());

		// Step 16
		CheckoutSection.backToOrders(driver).click();
		Assert.assertEquals(DataFile.orderHistoryPageHeading,
				CheckoutSection.orderHistoryPageHeading(driver).getText());

	}

	@After
	public void tearDown() {
		// Typical functionality is to close the browser after you have finished the
		// test
		driver.quit();

	}

}
