package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObjects {
	//added one new line for demo purpose
	
public WebDriver driver;
	
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By employee=By.xpath("//select[@name='CompanyEmployees']");
	private By country=By.xpath("//select[@name='CompanyCountry']");

	public signupPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement enterFirstname() {
		
		return driver.findElement(firstName);
	}
	
   public WebElement selectEmployee() {
		
		return driver.findElement(employee);
	}
	
   public WebElement selectCountry() {
		
 		return driver.findElement(country);
 	}
 	
	

}
