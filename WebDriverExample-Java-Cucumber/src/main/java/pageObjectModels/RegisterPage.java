package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	private static WebElement element = null;

	public static WebElement mrTickbox(WebDriver driver) {
		element = driver.findElement(By.id("id_gender1"));
		return element;

	}

	public static WebElement firstNamePersonalInfoField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input"));
		return element;
	}

	public static WebElement lastNamePersonalInfoField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input"));
		return element;

	}

	public static WebElement emailAddressField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[4]/input"));
		return element;
	}

	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.id("passwd"));
		return element;
	}

	public static WebElement firstNameYourAddressField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[1]/input"));
		return element;
	}

	public static WebElement lastNameYourAddressField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[2]/input"));
		return element;
	}

	public static WebElement addressField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input"));
		return element;
	}

	public static WebElement cityField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input"));
		return element;
	}

	public static WebElement stateDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select"));
		return element;
	}

	public static WebElement postCodeField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input"));
		return element;
	}

	public static WebElement mobilePhoneField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input"));
		return element;
	}

	public static WebElement registerButton(WebDriver driver) {
		element = driver.findElement(By.id("submitAccount"));
		return element;
	}

	public static WebElement heading(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1"));
		return element;
	}

}
