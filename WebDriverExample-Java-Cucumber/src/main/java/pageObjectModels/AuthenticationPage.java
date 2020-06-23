package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
	
	private static WebElement element = null;

	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input"));
		return element;
	}

	public static WebElement createAccountButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button\r\n"));
		return element;
	}

	public static WebElement emailAlreadyRegisteredField(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
		return element;
	}

	public static WebElement passwordAlreadyRegisteredField(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
		return element;
	}

	public static WebElement signInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button"));
		return element;
	}

	public static WebElement forgotYourPasswordLink(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[1]/a"));
		return element;
	}

	public static WebElement heading(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
		return element;
	}

}
