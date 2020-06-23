package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;


import data.DataFile;
import driverUtilities.DriverUtilities;

import org.junit.Assert;


import pageobjects.HomePageNotLoggedIn;
import pageobjects.AuthenticationPage;
import pageobjects.ForgotYourPasswordPage;


public class ResetPassword {


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
		public void resetPassword() throws InterruptedException { 	// Method definition 		
			// Create instance of WebDriver
			
			//Step 1
			HomePageNotLoggedIn.signInButton(driver).click();
	Assert.assertEquals(DataFile.authenticationPageHeading,AuthenticationPage.heading(driver).getText());
	
			//Step 2
			AuthenticationPage.forgotYourPasswordLink(driver).click();
			Assert.assertEquals(DataFile.forgotYourPasswordPageHeading, ForgotYourPasswordPage.heading(driver).getText());
			
			//Step 3
			ForgotYourPasswordPage.enterYourEmailField(driver).sendKeys(DataFile.emailAddress);
			Assert.assertEquals(DataFile.emailAddress, ForgotYourPasswordPage.enterYourEmailField(driver).getAttribute("value"));
			
			//Step 4
			ForgotYourPasswordPage.retrievePasswordButton(driver).click();
			Assert.assertEquals(DataFile.retrievePasswordSuccessAlert, ForgotYourPasswordPage.successAlert(driver).getText());
			
			//Step 5
			ForgotYourPasswordPage.backToLoginButton(driver).click();
			Assert.assertEquals(DataFile.authenticationPageHeading, AuthenticationPage.heading(driver).getText());

			
		}
		
		@After					
		public void tearDown() { 			
			// Typical functionality is to close the browser after you have finished the test
			driver.quit();

		
		
	}
	}



