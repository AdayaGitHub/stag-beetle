package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class AddToCartPopUp {
		
		private static WebElement element = null;

		public static WebElement continueShoppingButton(WebDriver driver) {
			element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"));
	        return element;
		}

		public static WebElement proceedToCheckoutButton(WebDriver driver) {
			element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
	        return element;
		}

		public static WebElement addToCartPopUpMessage(WebDriver driver) {
			element  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2"));
	        return element;
		}

		


}
