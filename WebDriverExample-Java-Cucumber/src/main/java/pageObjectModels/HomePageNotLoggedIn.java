package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageNotLoggedIn {

	private static WebElement element = null;

	public static WebElement signInButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		return element;
		
	}

	public static WebElement heading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        return element;
	}

	//public static WebElement title(WebDriver driver) {
	//	element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[1]/a"));
	//	return element;}
	


}
