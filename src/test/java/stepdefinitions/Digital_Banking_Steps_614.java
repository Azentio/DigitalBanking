package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class Digital_Banking_Steps_614 {
	
	WebDriver driver = BaseClass.driver;	
	
	UserUtility_614 us = new UserUtility_614(driver);
	
	@Given("^user navigates to the omni channel url$")
	public void UserNavigatesToTheOmniChannelUrl() {
		driver.get("https://imal.path-solutions.com:8543/omni_web_portal_omnichannel_qc_o19/#/omni-login");
	}
	
	@And("^user enters the username$")
	public void UserEntersTheUsername() {
		
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("userNameLoginScreen1"), DataReader.userCredentialsMap.get("Kamala").get("userName"), false);

	}
	
	@And("^user enters the password$")
	public void UserEntersThePassword() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("passwordLoginScreen1"), DataReader.userCredentialsMap.get("Kamala").get("Password"), false);
	}
	
	@And("^user click on the loggin button$")
	public void UserClickOnTheLogginButton() throws InterruptedException {
		Thread.sleep(10000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("loginBtn1") , false);
		
	}

}
