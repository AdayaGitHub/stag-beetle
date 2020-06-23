package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import data.DataFile;
import driverUtilities.DriverUtilities;

import org.junit.Assert;

import pageobjects.HomePageNotLoggedIn;
import pageobjects.LoggedInHomePage;
import pageobjects.RegisterPage;
import pageobjects.AuthenticationPage;



public class RegistrationTests {

	WebDriver driver; // This needs to be at the class level else you can’t use it 	in the methods below

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
	public void ResgistrationTests() throws InterruptedException { 	
		// Method definition 		
		// Create instance of WebDriver
		
		//Step 1
		HomePageNotLoggedIn.signInButton(driver).click();
Assert.assertEquals(DataFile.authenticationPageHeading,AuthenticationPage.heading(driver).getText());
		
		//Step 2
		AuthenticationPage.emailField(driver).sendKeys(DataFile.emailAddress);
Assert.assertEquals(DataFile.emailAddress, AuthenticationPage.emailField(driver).getAttribute("value"));
		
		
		//Step 3
		AuthenticationPage.createAccountButton(driver).click();
		Thread.sleep(2000);//Should use an explicit wait here - i have used a thread as to not complicate this first demo - in projects never use Threads always waits
Assert.assertEquals(DataFile.registrationPageHeading, RegisterPage.heading(driver).getText());
		
		//Step 4
		RegisterPage.mrTickbox(driver).click();
		Assert.assertTrue(RegisterPage.mrTickbox(driver).isSelected());
		
		//Step 5
RegisterPage.firstNamePersonalInfoField(driver).sendKeys(DataFile.firstName);
Assert.assertEquals(DataFile.firstName, RegisterPage.firstNamePersonalInfoField(driver).getAttribute("value"));
		
		//Step 6
				  RegisterPage.lastNamePersonalInfoField(driver).sendKeys(DataFile.lastName);
Assert.assertEquals(DataFile.lastName, RegisterPage.lastNamePersonalInfoField(driver).getAttribute("value"));
Assert.assertEquals(DataFile.emailAddress, RegisterPage.emailAddressField(driver).getAttribute("value"));
		
		
		//Step 7
		RegisterPage.passwordField(driver).sendKeys(DataFile.password);
		Assert.assertTrue(RegisterPage.passwordField(driver).getAttribute("type").equals("password"));
		Assert.assertEquals(DataFile.firstName,RegisterPage.firstNameYourAddressField(driver).getAttribute("value"));
		Assert.assertEquals(DataFile.lastName, RegisterPage.lastNameYourAddressField(driver).getAttribute("value"));
		
		//Split step 7 into 7.1, 7.2, 7.3 etc
		
		//Step 8
		RegisterPage.addressField(driver).sendKeys(DataFile.address);
		Assert.assertEquals(DataFile.address, RegisterPage.addressField(driver).getAttribute("value"));
		
		//Step 9
		RegisterPage.cityField(driver).sendKeys(DataFile.city);
		Assert.assertEquals(DataFile.city, RegisterPage.cityField(driver).getAttribute("value"));
		
		
		//Step 10
		Select stateFieldSelect = new Select(RegisterPage.stateDropDown(driver));
		stateFieldSelect.selectByVisibleText(DataFile.state);
		//Take a screenshot here
		
		//Step 11
		RegisterPage.postCodeField(driver).sendKeys(DataFile.postalCode);
		Assert.assertEquals(DataFile.postalCode, RegisterPage.postCodeField(driver).getAttribute("value"));

		//Step 12
		RegisterPage.mobilePhoneField(driver).sendKeys(DataFile.mobileNumber);
		Assert.assertEquals(DataFile.mobileNumber, RegisterPage.mobilePhoneField(driver).getAttribute("value"));
	
		//Step 13
		RegisterPage.registerButton(driver).click();
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());
		
		//should put sleep statement when moving from page to page
		
		//Step 14
		LoggedInHomePage.signOutButton(driver).click();
		Assert.assertEquals(DataFile.authenticationPageHeading,AuthenticationPage.heading(driver).getText());

		//Step 15
		AuthenticationPage.emailAlreadyRegisteredField(driver).sendKeys(DataFile.emailAddress);
		Assert.assertEquals(DataFile.emailAddress, AuthenticationPage.emailAlreadyRegisteredField(driver).getAttribute("value"));
		
		//Step 16
		AuthenticationPage.passwordAlreadyRegisteredField(driver).sendKeys(DataFile.password);
		Assert.assertTrue(AuthenticationPage.passwordAlreadyRegisteredField(driver).getAttribute("type").equals("password"));

		//Step 17
		AuthenticationPage.signInButton(driver).click();
		//should probably put sleep here
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());

		
	}

	
	@After					
	public void tearDown() { 			
		// Typical functionality is to close the browser after you have finished the test
		driver.quit();

	
	
	}
}
