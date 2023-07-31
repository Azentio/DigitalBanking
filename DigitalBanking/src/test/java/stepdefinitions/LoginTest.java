package stepdefinitions;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.AlertHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.CSMCommonWebElements;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	WebDriver driver = BaseClass.driver;

	CSMLogin csmLogin = new CSMLogin(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	AlertHelper alertHelper = new AlertHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	@Given("^navigate to CSM application and login with valid credentials$")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
//CSMUser1
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication("CSMUser1");
	}

	@Given("^navigate to CSM application and login with valid branch two credentials$")
	public void navigate_to_CSM_application_and_login_with_valid_branch_two_credentials() throws Throwable {
//CSMUser1
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication("CSMUser2");
	}

	@Given("user 076 navigate to CSM Aplication and login with teller account")
	public void user_navigate_to_csm_aplication_and_login_with_teller_account() throws IOException {
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication("CSMTellerUser");
	}

	@Given("^navigate to CSM application and login with valid teller credentials$")
	public void navigate_to_csm_application_and_login_with_valid_teller_credentials() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication("CSMTellerUser");
	}

	@Given("^navigate to CSM param application and login with valid credentials$")
	public void navigate_to_csm_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
		csmLogin.loginIntoCSMParamApplication("CSMParamUser1");
	}

	@Given("^navigate to CSM Param with populated user ID$")
	public void navigate_to_csm_param_with_populated_user_id() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
		csmLogin.loginIntoCSMParamApplication("CSMParamUser2");
	}

	@Given("^navigate to CSM sads application and login with valid credentials$")
	public void navigate_to_csm_sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getSADSApplicationUrl());

		csmLogin.loginIntoSadsApplication("Sadsuser1");
	}

	@Given("navigate to CSM sads application and login with valid credentials for approval")
	public void navigate_to_csm_sads_application_and_login_with_valid_credentials_for_approval() throws Throwable {
		driver.get(configFileReader.getSADSApplicationUrl());

		csmLogin.loginIntoSadsApplication("Sadsuser2");
	}

	@And("^logout from the application$")
	public void logout_from_the_application() throws Throwable {
		for (int i = 0; i < 2; i++) {

			driver.navigate().refresh();
			alertHelper.AcceptAlertIfPresent();
		}
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
				javascriptHelper.JSEClick(csmCommonWebElements.csmLogoutButton());
				System.out.println("Logout button got clicked");
				break;
			} catch (Exception e) {

				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

		// waitHelper.waitForElementwithFluentwaitForAlert(driver);
		for (int i = 0; i <= 50; i++) {
			try {

				alertHelper.AcceptAlertIfPresent();

				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
	}

}
