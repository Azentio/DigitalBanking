package stepdefinitions;

import java.util.HashMap;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import helper.JavascriptHelper;
import dataprovider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class Beneficiary_Management_80 {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;
	Actions action;
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	
	@And("User7180 loads the test datasetup for the test case id AT_BM_006")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_006() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
	    System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_008")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_008() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_009")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_009() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_010")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_010() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_011")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_011() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_012")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_012() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_013")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_013() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_039")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_039() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_040")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_040() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_041")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_041() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_042")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_042() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_043")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_043() {
		executionTestData = DataReader.executionTestData.get("AT_BM_001");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_049")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_049() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_050")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_050() {
		executionTestData = DataReader.executionTestData.get("AT_BM_049");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_051")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_051() {
		executionTestData = DataReader.executionTestData.get("AT_BM_006");
		//System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_077")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_077() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_078")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_078() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_079")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_079() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_080")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_080() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_081")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_081() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}

	@And("User7180 loads the test datasetup for the test case id AT_BM_082")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_082() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}

	@And("User7180 loads the test datasetup for the test case id AT_BM_083")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_083() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_104")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_104() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_105")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_105() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_106")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_106() {
		executionTestData = DataReader.executionTestData.get("AT_BM_107");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_107")
	
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_107() {
		executionTestData = DataReader.executionTestData.get("AT_BM_107");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_108")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_108() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_109")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_109() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_BM_110")
	public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_BM_110() {
		executionTestData = DataReader.executionTestData.get("AT_BM_077");
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}




	@Given("^User7180 navigates to the omni_corporate_portal_retail$")
	public void user7180_NavigatesToTheOmni_corporate_portal_retail() {
		driver.get(DataReader.configFileMap.get("omni_web_portal"));
	}
	@Given("User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary")
	public void user7180_enters_the_CorporateUser_in_the_login_page_for_omni_web_portal_for_beneficiary() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);
	}
	@Given("User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary")
	public void user7180_enters_the_CorporatePass_in_the_login_page_for_omni_web_portal_for_beneficiary() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}
	@And("^User7180 enters the maker username in the login page for omni_corporate_web_portal$")
	public void user7180_EntersTheMakerusernameInTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),testData.get("UserName1"),false);
		
	}
	

	@And("^User7180 enters the maker password in the login page for omni_corporate_web_portal$")
	public void user7180_EntersTheMakerPasswordInTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	}
	@And("^User7180 click on the ok button for the Validation error popup$")
	public void user7180__click_on_the_ok_button_for_the_validation_error_popup() {
		try {
		us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);
		}
		catch (Exception e) {
		}
	}
	@Given("User7180 Click on the Beneficiary Management in the Home screen Retail User")
	public void user7180_click_on_the_beneficiary_management_in_the_home_screen_retail_user() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Beneficiay_Management"),false);
	}

	@Given("User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen")
	public void user7180_click_add_internal_beneficiary_below_the_beneficiary_management_bank_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"),false);
	}
	@Given("User7180 Click Add Local Beneficiary Below the Beneficiary Management Bank Screen")
	public void user7180_click_local_internal_beneficiary_below_the_beneficiary_management_bank_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddLocalBene"),false);
	}

	@Given("User7180 Enter the Valid Account number below the Add ineternal Beneficiary")
	public void user7180_enter_the_valid_account_number_below_the_add_ineternal_beneficiary() throws InterruptedException {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),testData.get("AccountNumber"),false);
		Thread.sleep(6000);
	}

	@Given("User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary")
	public void user7180_enter_the_valid_name_of_beneficiary_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"),testData.get("NameOfBeneficiary"),false);
	}
	@Given("User7180 click on the country for selecting below the Add ineternal Beneficiary")
	public void user7180_click_on_the_country_for_selecting_below_the_add_ineternal_beneficiary() throws Throwable {
		//Thread.sleep(3000);
		//us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Country"),false);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Country_BenefManage"),false);
	}

	@Given("User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown")
	public void user7180_enter_the_country_code_for_mobile_number_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Country"),false);
	}
	@Given("User7180 Enter the Currency code below the Add ineternal Beneficiary Dropdown")
	public void user7180_enter_the_currency_code_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Currency"),false);
	}

	@Given("User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown")
	public void user7180_search_the_country_code_for_mobile_number_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Mobilecode"),false);
	}
	@Given("User7180 Search the Bankcode below the Add ineternal Beneficiary Dropdown")
	public void user7180_search_the_bankcode_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("BankName"),false);
	}


	@Given("User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary")
	public void user7180_select_the_mobile_number_code_for_enter_the_mobile_no_below_the_add_ineternal_beneficiary() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
	}
	@Given("User7180 Enter the Mobile Invalid number below the Add ineternal Beneficiary")
	public void user7180_enter_the_mobile_Invalid_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("InvalidACC"),false);
	}
	@Given("User7180 Enter the Mobile number below the Add ineternal Beneficiary")
	public void user7180_enter_the_mobile_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("MobileNumber"),false);
	}

	@Given("User7180 Enter the Purpose of the Add Internal Beneficiary Bank")
	public void user7180_enter_the_purpose_of_the_add_internal_beneficiary_bank() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),testData.get("Purpose"),false);
//		for (int i = 0; i <50; i++) {
//			driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"))).sendKeys(Keys.BACK_SPACE);	
//		}
//		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),testData.get("Purpose"),false);
	}
	@Given("User7180 Enter the Purpose on Beneficiary Management screen")
	public void user7180_enter_the_purpose_on_beneficiary_management_screen() {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"))).sendKeys(Keys.BACK_SPACE);	
		    us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),testData.get("Purpose"),false);
	}
	
	@Given("User7180 Validate the Account Number in Beneficiary Management screen")
	public void user7180_validate_the_account_number_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("AccountNumber_Beneficiary"));
	}

	@Given("User7180 Validate the Name of Beneficiary in Beneficiary Management screen")
	public void user7180_validate_the_name_of_beneficiary_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("NameOfBeneficiary_Beneficiary"));
	}

	@Given("User7180 Validate the currency in Beneficiary Management screen")
	public void user7180_validate_the_currency_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Currency_Beneficiary"));
	}
	@Given("User7180 Click the currency in Beneficiary Management screen")
	public void user7180_click_the_currency_in_beneficiary_management_screen() {
		us.clickOnElement(driver,DataReader.locatorsMap.get("Beneficiary").get("Currency_Beneficiary"),false);
	}


	@Given("User7180 Validate the Mobile Number in Beneficiary Management screen")
	public void user7180_validate_the_mobile_number_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("MobileNo_Beneficiary"));
	}
	@Given("User7180 Validate the Home screen on Beneficiary Management")
	public void user7180_validate_the_home_screen_on_beneficiary_management() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"));
	}
	@Given("User7180 click the Show More option in Home screen")
	public void user7180_click_the_show_more_option_in_home_screen() {
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("ShowMore_BenefManage"),false);
		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content//ion-label[text()=' show more ']";
		   us.clickOnElement(driver, xpath,false);
	}
	@Given("User7180 Validate the Show More option in Home screen")
	public void user7180_validate_the_show_more_option_in_home_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"));
//		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content//ion-label[text()=' show more ']";
//		   us.clickOnElement(driver, xpath,false);
	}
	@Given("User7180 Verify the Record visible in Bank screen or not")
	public void user7180_verify_the_record_visible_in_bank_screen_or_not() {
		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')";
		us.elementIsVisible(driver, xpath);
	}
	@Given("User7180 Validate the Beneficiary account no key in Home screen")
	public void user7180_validate_the_beneficiary_account_no_key_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Benef_acc_no_key"));
	}

	@Given("User7180 Validate the Beneficiary Name in Home screen")
	public void user7180_validate_the_beneficiary_name_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Benef_name"));
	}

	@Given("User7180 Validate the Mobile No in Home screen")
	public void user7180_validate_the_mobile_no_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("MobileNo_BenefManage"));
	}

	@Given("User7180 Validate the Purpose in Home screen")
	public void user7180_validate_the_purpose_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Purpose_BenefManage"));
	}

	@Given("User7180 Validate the Delete in Home screen")
	public void user7180_validate_the_delete_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Delete_BenefManage"));
	}
	@Given("User7180 Click the Delete in Home screen")
	public void user7180_click_the_delete_in_home_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("RecordDelete"),true);
	}

	@Given("User7180 Validate the Details in Home screen")
	public void user7180_validate_the_details_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Details_BenefManage"));
	}
	@Given("User7180 Click the Details in Home screen")
	public void user7180_click_the_details_in_home_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("RecordDetails"),false);
	}

	@Given("User7180 Validate the Edit in Home screen")
	public void user7180_validate_the_edit_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Edit_BenefManage"));
	}
	@Given("User7180 Click the Edit in Home screen")
	public void user7180_click_the_edit_in_home_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Edit_BenefManage"),false);
	}

	@Given("User7180 Validate the Pay in Home screen")
	public void user7180_validate_the_pay_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Pay_BenefManage"));
	}
	@Given("User7180 Click the Pay in Home screen")
	public void user7180_click_the_pay_in_home_screen() {
		try{
		for(int i=0;i<200;i++) {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Pay_BenefManage"),false);
		}
		}
		catch(Exception e) {
			
		}
	}
	@Given("User7180 Enter Draft Name for save in Beneficiary Management")
	public void user7180_enter_draft_name_for_save_in_beneficiary_management() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),testData.get("DraftName"),false);
		for (int i = 0; i <50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"))).sendKeys(Keys.BACK_SPACE);	
		}
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),testData.get("DraftName"),false);
	}
	@Given("User7180 Click the Edit button in Home screen")
	public void user7180_click_the_edit_button_in_home_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Edit_icon_BenefManage"),false);
	}

	@Given("User7180 Enter the Name in Add NickName field in Home Screen")
	public void user7180_enter_the_name_in_add_nick_name_field_in_home_screen() {
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("Input_AddNickName"))).sendKeys(Keys.BACK_SPACE);
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("Input_AddNickName"),testData.get("DraftName"),false);
	}

	@Given("User7180 Validate the NickName whether it is change or not")
	public void user7180_validate_the_nick_name_whether_it_is_change_or_not() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("NickName_BenefManage"));
	}
	@Given("User7180 Enter the Amount under currency tab in Beneficiary Management")
	public void user7180_enter_the_amount_under_currency_tab_in_beneficiary_management() {
		us.enterData(driver,DataReader.locatorsMap.get("Beneficiary").get("Cards_CSS_EnterAmount"),testData.get("Amount"),false);
	}
	@Given("User7180 Enter the Purpose of the Beneficiary Management")
	public void user7180_enter_the_purpose_of_the_beneficiary_management() {
		us.enterData(driver,DataReader.locatorsMap.get("Beneficiary").get("PurposeTxtDesc"),testData.get("Purpose"),false);
	}
	@Given("User7180 verify the record save in TO DO List for draft Data in Beneficiary Management")
	public void user7180_verify_the_record_save_in_to_do_list_for_draft_data_in_beneficiary_Management() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("Verify_TODO_list"));
	}
	@Given("User7180 Click the record save in TO DO List for draft Data in Beneficiary Management")
	public void user7180_click_the_record_save_in_to_do_list_for_draft_data_in_beneficiary_Management() {
		us.clickOnElement(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_TODO_list"),false);
	}
	@Given("User7180 click the Local in the Home screen under Beneficiary Management")
	public void user7180_click_the_local_in_the_home_screen_under_beneficiary_management() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Local_Transfer_beneficiary"),true);
	}
	@Given("User7180 click the Bank in the Home screen under Beneficiary Management")
	public void user7180_click_the_Bank_in_the_home_screen_under_beneficiary_management() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_BenefManage"),true);
	}
	@Given("User7180 Validate the Bank in Beneficiary Management screen")
	public void user7180_validate_the_bank_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_Bank"));
	}
	@Given("User7180 Validate the Bank Name in Beneficiary Management screen")
	public void user7180_validate_the_bank_name_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_BankName"));
	}
	@Given("User7180 Validate the Beneficiary Bank verification number in Beneficiary Management screen")
	public void user7180_validate_the_beneficiary_bank_verification_number_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_BenefNo"));
	}
	@Given("User7180 Validate the Edit page in Beneficiary Management screen")
	public void user7180_validate_the_edit_page_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("BeneficiaryDetails"));
	}
	@Given("User7180 Click the ok button on popup message")
	public void user7180_click_the_ok_button_on_popup_message() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("OK_Invalid"),false);
	}
	@Given("User7180 Enter the Bic Swift Code in International Benef screen")
	public void user7180_enter_the_bic_swift_code_in_international_benef_screen() {
		us.enterData(driver, DataReader.locatorsMap.get("Beneficiary").get("Bic_Swift_code"), testData.get("InvalidACC"), false);
	}
	@Given("User7180 Enter the Bank Name in International Benef screen")
	public void user7180_enter_the_bank_name_in_international_benef_screen() {
		//us.enterData(driver, DataReader.locatorsMap.get("Beneficiary").get("BankName_BenefManage"), testData.get("BankName"), false);
		us.enterData(driver, DataReader.locatorsMap.get("Beneficiary").get("BankName_BenefManage"), testData.get("BankName"), false);
	}
	@Given("User7180 Enter the Branch Name in International Benef screen")
	public void user7180_enter_the_branch_name_in_international_benef_screen() {
	  us.enterData(driver, DataReader.locatorsMap.get("Beneficiary").get("BranchName_BenefManage"),testData.get("DraftName"), false);
	}

	@Given("User7180 Click the currency in International Benef screen")
	public void user7180_click_the_currency_in_international_benef_screen() throws Throwable {
		Thread.sleep(2000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Currency_Beneficiary_dropdown"),false);
	}

	@Given("User7180 Validate the Country in Beneficiary Management screen")
	public void user7180_validate_the_country_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_Country"));
	}

	@Given("User7180 Validate the Bic Swift code in Beneficiary Management screen")
	public void user7180_validate_the_bic_swift_code_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_BicSwiftCode"));
	}

	@Given("User7180 Validate the Branch in Beneficiary Management screen")
	public void user7180_validate_the_branch_in_beneficiary_management_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Verify_Branch"));
	}

	@Given("User7180 Enter the Password in the Verification screen")
	public void user7180_enter_the_password_in_the_verification_screen() {
		us.enterData(driver,DataReader.locatorsMap.get("Beneficiary").get("Password_SwiftSubmit"),testData.get("InvalidACC"),false);
	}

	@Given("User7180 Click the Verify button in the Verification screen")
	public void user7180_click_the_verify_button_in_the_verification_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("VerifyBtn"),true);
	}

	@Given("User7180 Click the I am Not a Robot checkBox in the Verification screen")
	public void user7180_click_the_i_am_not_a_robot_check_box_in_the_verification_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("IamNotRobot_checkbox"),false);
	}
	@Given("User7180 Click the Swift in Home screen under Beneficiary Management")
	public void user7180_click_the_swift_in_home_screen_under_beneficiary_management() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Swift_BeneficiaryManagement"),true);
	}

	@Given("User7180 Click the Add International Benef button under Swift screen")
	public void user7180_click_the_add_international_benef_button_under_swift_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Add_international_benef"),false);
	}
	@Given("User7180 Validate the invalid phone number error Message in International Benef screen")
	public void user7180_validate_the_invalid_phone_number_error_message_in_international_benef_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("InvalidPhoneNumber"));
	}
	@Given("User7180 Click the Bank in Local Beneficiary screen")
	public void user7180_click_the_bank_in_local_beneficiary_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"),false);
	}

	@Given("User7180 Enter the Bank Verifcation number in Local Beneficiary Screen")
	public void user7180_enter_the_bank_verifcation_number_in_local_beneficiary_screen() {
		us.enterData(driver,DataReader.locatorsMap.get("Beneficiary").get("BankVerificationNumber"),testData.get("InvalidACC"),false);
	}
}
