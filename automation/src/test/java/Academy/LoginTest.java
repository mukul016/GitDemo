package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LogIn;
import resources.InitDriver;

public class LoginTest extends InitDriver {

	WebDriver driver;
	@BeforeTest	
	public void Presetup() throws IOException
	{
		driver= initDriver();
		String url= prop.getProperty("URL");
		driver.get(url);
	}
	
	@Test
	public void loginTest()
	{
		LogIn lg= new LogIn(driver);
		lg.getLogin().click();
		lg.getEmail().sendKeys("abc@gmail.com");
		lg.getPassword().sendKeys("adfff");
		lg.getSubmit().click();
	}
}
