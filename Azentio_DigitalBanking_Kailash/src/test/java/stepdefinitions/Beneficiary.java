package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import dataProvider.DataReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class Beneficiary {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);	
	String executionTestData;
	HashMap<String, String> testData;
	Actions action;
	
	@Given("User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary")
	public void user_626enters_the_CorporateUser_in_the_login_page_for_omni_web_portal_for_beneficiary() {
		// us.enterDataAndTab(driver,
		// DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);
		
	}

	@Given("User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary")
	public void user_626enters_the_CorporatePass_in_the_login_page_for_omni_web_portal_for_beneficiary() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}
	@And("User_626 loads the test datasetup for the test case id AT_BM_001")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_001() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_BM_002")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_002() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}

	@And("User_626 loads the test datasetup for the test case id AT_BM_003")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_003() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_BM_004")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_004() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_BM_005")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_005() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_BM_006")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_006() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}

	@Given("User_626 Click on the Beneficiary Management in the Home screen Retail User")
	public void user_click_on_the_beneficiary_management_in_the_home_screen_retail_user() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Beneficiay_Management"),false);
	}

	@Given("User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen")
	public void user_click_add_ineternal_beneficiary_below_the_beneficiary_management_bank_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"),false);
	}

	@Given("User_626 Enter the Valid Account number below the Add ineternal Beneficiary")
	public void user_enter_the_valid_account_number_below_the_add_ineternal_beneficiary() throws InterruptedException {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),testData.get("AccountNumber"),false);
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process"));
		Thread.sleep(20000);
	}

	@Given("User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary")
	public void user_enter_the_valid_name_of_beneficiary_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"),testData.get("NameOfBeneficiary"),false);
	}

	@Given("User_626 click on the country for selecting below the Add ineternal Beneficiary")
	public void user_click_on_the_country_for_selecting_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Country"),false);
	}

	@Given("User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown")
	public void user_enter_the_country_code_for_mobile_number_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Mobilecode"),false);
	}

	@Given("User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary")
	public void user_select_the_mobile_number_code_for_enter_the_mobile_no_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
	}
	@Given("User_626 Enter the Mobile Invalid number below the Add ineternal Beneficiary")
	public void user_enter_the_mobile_Invalid_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("InvalidACC"),false);
	}
	@Given("User_626 Validate the Invalid Number Validation below the Add ineternal Beneficiary")
	public void User_626_Validate_the_Invalid_Number_Validation_below_the_Add_ineternal_Beneficiary() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"));
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ValueMissing_forValidation"));
		
	}

	@Given("User_626 Enter the Mobile number below the Add ineternal Beneficiary")
	public void user_enter_the_mobile_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("MobileNumber"),false);
	}

	@Given("User_626 Enter the Purpose of the Add Internal Beneficiary Bank")
	public void user_enter_the_purpose_of_the_add_internal_beneficiary_bank() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),testData.get("Purpose"),false);
		for (int i = 0; i <50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"))).sendKeys(Keys.BACK_SPACE);	
		}
		
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),testData.get("Purpose"),false);
	}

	@Given("User_626 Validate the Saved data in beneficiary Management")
	public void User626_Validate_the_Saved_data_in_beneficiary_Management() {
		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]";
		   us.elementIsVisible(driver, xpath);
	}
	@Given("User_626 Enter the InValid Account number below the Add ineternal Beneficiary")
	public void user_enter_the_in_valid_account_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),testData.get("InvalidACC"),false);
	}

	@Given("User_626 Validate the Invalid Account Number below the Add ineternal Beneficiary")
	public void user_validate_the_invalid_account_number_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("OK_Invalid"),false);
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	



