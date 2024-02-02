package stepdefinitions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataprovider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class AcitivitylogreportSteps_612 {
	
	
	
WebDriver driver = BaseClass.driver;
	
	UserUtility_614 us = new UserUtility_614(driver);
	
	String executionTestData;
	HashMap<String, String> testData;
	
	
	@And("^user_612 enters the maker username1 in the login page for omni_corporate_web_portalA$")
	public void user_612EntersTheMakerusername1InTheLoginPageForOmni_Corporate_Web_PortalA() {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),testData.get("UserName1"),false);
		
	}
	

	@And("^user_612 enters the maker password1 in the login page for omni_corporate_web_portalA$")
	public void user_612EntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_PortalA() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	}

	
    @And("^user_612 loads the test datasetup for the test case id ALR_015$")
    public void User_612LoadsTheTestDatasetupForTheTestCaseIdALR_015() {
    	executionTestData = DataReader.executionTestData.get("ALR_015");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
    }
   
    
	@And("^user_612 selects the from account from the dropdown in transfers within own accountsA$")
	public void user_612SelectsTheFromAccountFromTheDropdownInTransfersWithinOwnAccountsA() throws Throwable {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("FromAccount1"));
		us.clickOnElement(driver, xpath, false);
		Thread.sleep(2000);
	}
	
	
	@And("^user_612 selects the To account from the dropdown in transfers within own accountsA$")
	public void user_612SelectsTheToAccountFromTheDropdownInTransfersWithinOwnAccountsA() throws Throwable {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectToAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
			Thread.sleep(5000);	
	}
	@And("^user_612 enters the transaction amount in the transfers screenA$")
	public void user_612EntersTheTransactionAmountInTheTransfersScreenA() {
		us.enterDataAndTab(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
				testData.get("TransferAmount"), 
				false);
		
	}
	
	@And("^user_612 enters the purpose of transaction in the transfers screenA$")
	public void user_612EntersThePurposeOfTransactionInTheTransfersScreenA() throws InterruptedException {
		us.enterDataAndTab(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
				testData.get("PurposeOfTrnx"), 
				false);
		
		Thread.sleep(3000);
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
	
//	DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    LocalDate date =LocalDate.now();
//    String format = date.format(dtFormatter);
//       ///csmtransaction_612.CSMDateInUserRunningDate_612().sendKeys(format);
   
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
