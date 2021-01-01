package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitDriver {

	WebDriver driver;
	public Properties prop;
	public WebDriver initDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fs= new FileInputStream("C:\\GitHubWorkPlace\\automation\\src\\main\\java\\resources\\Global.properties");
		prop.load(fs);
		String browse= prop.getProperty("browser");
		System.setProperty("webdriver.gecko.driver", "C:\\Gargi\\geckoDriver\\geckodriver.exe");
		if(browse.equalsIgnoreCase("firefox"))
		{
			 driver= new FirefoxDriver();
			
		}
		return driver;
	}
}
