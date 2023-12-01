package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class AcitivitylogreportSteps_612 {
	
	
	
WebDriver driver = BaseClass.driver;
	
	UserUtility_614 us = new UserUtility_614(driver);
	
	String executionTestData;
	HashMap<String, String> testData;
	
    @And("^user_612 loads the test datasetup for the test case id ALR_015$")
    public void User_612LoadsTheTestDatasetupForTheTestCaseIdALR_015() {
    	executionTestData = DataReader.executionTestData.get("ALR_015");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
    }
	@Given("user_612 click on the profile Info in ALR")
	public void user_612_click_on_the_profile_info_in_alr() throws InterruptedException {
		Thread.sleep(3000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("Profile_Info_ALR"), 30, false);
	}

	@Given("user_612 Click on the Active Log in Transfer")
	public void user_612_click_on_the_active_log_in_transafer() {
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("Active_Log_Report_box"), 30, false);
	}

	@Given("user_612 click on the My Active log Report in profile")
	public void user_612_click_on_the_my_active_log_report_in_profile() throws InterruptedException {
		Thread.sleep(6000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("MY_Active_log_Report"), 30, false);
	}

	@Given("user_612 click on the Export button in ALR")
	public void user_612_click_on_the_export_button_in_alr() throws InterruptedException {
		Thread.sleep(6000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ALR_Export_click"), 30, false);
	}

@Given("user_612 Get the Time value of the Activity Log Report and verify the value")
public void user_612_get_the_time_value_of_the_activity_log_report_and_verify_the_value() {
   String verifyALR=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Verify_ActivityLog"),true);
   for (int i = 0; i <= 500; i++) {
		try {
			Assert.assertTrue(verifyALR.contains("10"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
	
	
	@And("user_612 click log out button")
	public void user_612_click_log_out_button() throws Exception {
		us.clickWebElementUsingText(driver,"Logout");
	}
}
