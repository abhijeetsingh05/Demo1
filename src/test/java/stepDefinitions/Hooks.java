package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseConfig.GenericUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public static void beforeStep() throws IOException {

		driver = GenericUtils.setBrowser();
	}

	@After
	public void doLast() {
		driver.quit();
	}

}
