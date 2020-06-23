package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotYourPasswordPage {
	
	private static WebElement element = null;

	public static WebElement enterYourEmailField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div/input"));
        return element;
	}

	public static WebElement retrievePasswordButton(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/p/button"));
        return element;
	}

	public static WebElement successAlert(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p"));
        return element;
	}

	public static WebElement backToLoginButton(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li/a"));
        return element;
	}

	public static WebElement heading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1"));
        return element;
	}

}