package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
	public WebDriver driver;
	By login=By.xpath("//a[@class='theme-btn register-btn']");
	By email=By.id("user_email");
	By pwd= By.id("user_password");
	By submit= By.name("commit");
	
	public LogIn (WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
}
