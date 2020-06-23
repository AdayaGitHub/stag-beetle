package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverUtilities.DriverUtilities;

import org.junit.Assert;

public class Fun {

	WebDriver driver;
	WebElement element = null;

	@Before
	public void preConditions() {
		// The driver instantiation is moved to the preconditions
		// Doesn’t affect the outcome of the test so should be here
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("https://www.spotify.com/uk/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FunStuff() throws InterruptedException {
		signInButton(driver).click();
		Assert.assertEquals("login-to-continue", heading(driver).getAttribute("id"));
		emailField(driver).sendKeys("shahadya@gmail.com");
		passwordField(driver).sendKeys("Brooklynbaby123!");
		loginButton(driver).click();
		Thread.sleep(3000);
		spotifyOpenApp(driver).click();
		Thread.sleep(3000);
		openWebPlayer(driver).click();
		Thread.sleep(10000);	
		
		
	}
	

	

	private WebElement openWebPlayer(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div[3]/div/div[1]/a"));
		return element;
	}

	private WebElement heading(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/span"));
		return element;
	}

	private WebElement signInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul/li[6]/a"));
		return element;
	}
	
	private WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/div/input"));
		return element;
	}
	
	private WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/div/input"));
		return element;
	}
	
	private WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[3]/div[2]"));
		return element;
	}
	
	private WebElement spotifyOpenApp(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div/div[1]/a"));
		return element;
	}

	@After					
	public void tearDown() { 			
		// Typical functionality is to close the browser after you have finished the test
		driver.quit();
	}

	
}
