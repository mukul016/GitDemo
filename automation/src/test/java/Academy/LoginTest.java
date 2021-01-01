package Academy;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import PageObjects.LogIn;
import resources.InitDriver;

public class LoginTest extends InitDriver {

	WebDriver driver;
	@Before	
	public void Presetup() throws IOException
	{
		driver= initDriver();
		String url= prop.getProperty("URL");
		driver.get(url);
	}
	
	@org.junit.Test
	public void loginTest()
	{
		LogIn lg= new LogIn(driver);
		lg.getLogin().click();
		lg.getEmail().sendKeys("abc@gmail.com");
		lg.getPassword().sendKeys("adfff");
		lg.getSubmit().click();
	}
}
