package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoggedInHomePage {
	
	private static WebElement element = null;

	public static WebElement signOutButton(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        return element;
	}

	public static WebElement heading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
        return element;
	}

	public static WebElement tshirtsLink(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
        return element;
	}

	public static WebElement tShirtsHeading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]"));
        return element;
	}

	public static WebElement tShirtAddToCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div"));

        //Actions class

        Actions actions = new Actions(driver);

        //perform the hover

        actions.moveToElement(element).perform();

        //Click on the add cart

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]")).click();
        
        return element;
	}


	public static WebElement dressesLink(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
        return element;
	}

	public static WebElement AddToCartPopUp(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
        return element;
	}

	public static WebElement dressesHeading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]"));
        return element;
	}

	public static WebElement dressAddToCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div"));

        //Actions class

        Actions actions = new Actions(driver);

        //perform the hover

        actions.moveToElement(element).perform();

        //Click on the add cart

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
        
        return element;
	}


}
