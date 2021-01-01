package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Courses {
	
	public WebDriver driver;
	By login=By.xpath("//a[@class='theme-btn register-btn']");
	By search=By.id("search-courses");
	By sbutton= By.id("search-course-button");
	By category= By.xpath("//button[@class='btn btn-default btn-lg btn-course-filter dropdown-toggle'");
	
	public WebElement clickLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
	public WebElement getSearchButton()
	{
		return driver.findElement(sbutton);
	}
	
	public WebElement findCategory()
	{
		return driver.findElement(category);
	}
	
	
}
