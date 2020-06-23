package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSection {
	
	private static WebElement element = null;

	public static WebElement totalPrice(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[7]/td[2]/span"));
        return element;
	}

	public static WebElement tAndCTickBox(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
        return element;
	}

	public static WebElement addressPageHeading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
        return element;
	}

	public static WebElement shippingPageHeading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1"));
        return element;
	}

	public static WebElement proceedToCheckoutButton0(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
        return element;
	}

	public static WebElement proceedToCheckoutButton1(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
        return element;
	}

	public static WebElement proceedToCheckoutButton2(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
        return element;
	}

	public static WebElement payByBankWireButton(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
        return element;
	}

	public static WebElement confirmMyOrder(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
        return element;
	}

	public static WebElement backToOrders(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p/a"));
        return element;
	}

	public static WebElement pleaseChooseYourPaymentMethod(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
		return element;
	}

	public static WebElement orderSummaryHeading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
		return element;
	}

	public static WebElement orderConfirmationHeading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
		return element;
				
	}

	public static WebElement orderHistoryPageHeading(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
				return element;
	}

}
