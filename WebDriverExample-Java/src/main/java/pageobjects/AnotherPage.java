package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnotherPage {
	
	public static WebElement element = null;

	public static WebElement anotherButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		return element;
	}

}
