package stepDefinitionFiles;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import driverUtilities.DriverUtilities;
import testData.DataFile;
import cucumber.api.java.After;

public class BaseStepDefinition {

	protected WebDriver driver = null;

	@Before
	public void setUp() throws Exception {
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get(DataFile.websiteURL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
