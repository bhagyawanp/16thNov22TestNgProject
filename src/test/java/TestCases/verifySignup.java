package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.signupPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifySignup extends baseClass{
	
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.clickOntryForFreee().click();
		
		signupPageObjects spo=new signupPageObjects(driver);
		
		Thread.sleep(5000);
		
		spo.enterFirstname().sendKeys(constants.firstname);
	
		/*
		Select s=new Select(spo.selectEmployee());
		s.selectByIndex(1);
		
	
		Select s1=new Select(spo.selectCountry());
		s1.selectByIndex(1);
		*/
		
		
		
		commonMethods.selectDropdown(spo.selectEmployee(), 1);
		
		commonMethods.selectDropdown(spo.selectCountry(), 2);
		
	
		
		
		
		
		
	}

}
