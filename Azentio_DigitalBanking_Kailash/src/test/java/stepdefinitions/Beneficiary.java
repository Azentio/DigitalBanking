package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

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
	@And("User_626 loads the test datasetup for the test case id AT_BM_032")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_BM_032() {
		executionTestData = DataReader.executionTestData.get("AT_BM_032");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("BeneficiaryManagement").get(executionTestData);
	}
	@Given("User_626 Click on the Beneficiary Management in the Home screen Retail User")
	public void user_626_click_on_the_beneficiary_management_in_the_home_screen_retail_user() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Beneficiay_Management"),false);
	}

	@Given("User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen")
	public void user_626_click_add_ineternal_beneficiary_below_the_beneficiary_management_bank_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"),false);
	}

	@Given("User_626 Enter the Valid Account number below the Add ineternal Beneficiary")
	public void user_626_enter_the_valid_account_number_below_the_add_ineternal_beneficiary() throws Exception {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),testData.get("AccountNumber"),false);
//		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process"));
//		Thread.sleep(30000);
		System.out.println(DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process"));
		for (int i = 0; i <= 3000; i++) {
			try {
				driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process")));				
			}
			catch (NoSuchElementException e) {
				if (i>400) {
					break;
				}
				
			}
			
			} 
			
		
		
	}

	@Given("User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary")
	public void user_626_enter_the_valid_name_of_beneficiary_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"),testData.get("NameOfBeneficiary"),false);
	}
	@Given("User_626 click on the country for selecting below the Add ineternal Beneficiary")
	public void user_626_click_on_the_country_for_selecting_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Country"),false);
	}
	@Given("User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown")
	public void user_626_enter_the_country_code_for_mobile_number_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Mobilecode"),false);
	}

	@Given("User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary")
	public void user_626_select_the_mobile_number_code_for_enter_the_mobile_no_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
	}
	@Given("User_626 Enter the Mobile Invalid number below the Add ineternal Beneficiary")
	public void user_626_enter_the_mobile_Invalid_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("InvalidACC"),false);
	}
	@Given("User_626 Validate the Invalid Number Validation below the Add ineternal Beneficiary")
	public void User_626_Validate_the_Invalid_Number_Validation_below_the_Add_ineternal_Beneficiary() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"));
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ValueMissing_forValidation"));
	}
	@Given("User_626 Enter the Mobile number below the Add ineternal Beneficiary")
	public void user_626_enter_the_mobile_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("MobileNumber"),false);
		for (int i = 0; i <50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("MobileNum"))).sendKeys(Keys.BACK_SPACE);	
		}
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),testData.get("MobileNumber"),false);
	}
	@Given("User_626 Enter the Purpose of the Add Internal Beneficiary Bank")
	public void user_626_enter_the_purpose_of_the_add_internal_beneficiary_bank() {
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
	public void user_626_enter_the_in_valid_account_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),testData.get("InvalidACC"),false);
	}
	@Given("User_626 Validate the Invalid Account Number below the Add ineternal Beneficiary")
	public void user_626_validate_the_invalid_account_number_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("OK_Invalid"),false);
	}
	
	@Given("User_626 Verify the Cancel button in Beneficiary Screen")
	public void user_626_verify_the_cancel_button_in_the_limit_update_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cancel_DebitDetailsLUS"));
	}
	
	@Given("User_626 Enter Draft Name for save the Beneficiary request")
	public void user_626_enter_draft_name_for_save_the_debit_detail_request() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),testData.get("DraftName"),false);
		for (int i = 0; i <50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"))).sendKeys(Keys.BACK_SPACE);	
		}
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),
				testData.get("DraftName"),false);
	}
	
	
	@Given("User_626 Click on the local bank transfer in beneficiary management")
	public void User_626_Click_on_the_local_bank_transfer_in_beneficiary_management() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Local_Transfer_beneficiary"),true);
	}
	@Given("User_626 Click on the Bank dropdown below the local beneficiary")
	public void user_click_on_the_bank_dropdown_below_the_local_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"),false);
	}

	@Given("User_626 Search bank name and select the bank in the dropdown")
	public void user_search_bank_name_and_select_the_bank_in_the_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("BankName"),false);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
	}

	@Given("User_626 Click on the currency dropdown for select Currency")
	public void user_click_on_the_currency_dropdown_for_select_currency() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"),false);
	}

	@Given("User_626 Search Currency and select the Currency in the dropdown")
	public void user_search_currency_and_select_the_currency_in_the_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Currency"),false);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
	}

	
	@Given("User_626 Verify the saved Local Transfer Beneficiary data")
	public void user_verify_the_saved_local_transfer_beneficiary_data() {
		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]";
		   us.elementIsVisible(driver, xpath);
	}

	@Given("User_626 Click on the saved data showmore button")
	public void user_click_on_the_saved_data_showmore_button() {
		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content//ion-label[text()=' show more ']";
		   us.clickOnElement(driver, xpath,false);
	}

	@Given("User_626 Verify the currency field in record of beneficiary")
	public void user_verify_the_currency_field_in_record_of_beneficiary() {
		String xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-header//span[contains(text(),'"+testData.get("Currency")+"')]";
		   us.elementIsVisible(driver, xpath);
	}

	@Given("User_626 Verify the Status field in record of beneficiary")
	public void user_verify_the_status_field_in_record_of_beneficiary() {
	String Xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-header//ion-label[text()=' Active ']";
	us.elementIsVisible(driver, Xpath);
	}

	@Given("User_626 Verify the Name of the beneficiary field in record of beneficiary")
	public void user_verify_the_name_of_the_beneficiary_field_in_record_of_beneficiary() {
		String Xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content//ion-label[text()=' Benef_name ']";
		us.elementIsVisible(driver, Xpath);
	}

	@Given("User_626 Verify the Bank Name field in record of beneficiary")
	public void user_verify_the_bank_name_field_in_record_of_beneficiary() {
		String Xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content//ion-label[text()=' Bank ']";
		us.elementIsVisible(driver, Xpath);
	}
	@Given("User_626 Verify the Bank Verification number field in record of beneficiary")
	public void user_verify_the_bank_verification_number_field_in_record_of_beneficiary() {
		String Xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content//ion-label[text()=' Beneficiary Bank Verification Number ']";
		us.elementIsVisible(driver, Xpath);
	}

	@Given("User_626 Verify the branch field in record of beneficiary")
	public void user_verify_the_branch_field_in_record_of_beneficiary() {
		String Xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-content/ion-label[text()=' Beneficiary Bank Verification Number ']";
		us.elementIsVisible(driver, Xpath);
	}
	@Given("User_626 Verify the Edit Field in record of beneficiary")
	public void user_626_verify_the_edit_field_in_record_of_beneficiary() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("RecodEdit"));
		}

	@Given("User_626 Verify the pay Field in record of beneficiary")
	public void user_626_verify_the_pay_field_in_record_of_beneficiary() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("RecordPay"));
	}

	@Given("User_626 Verify the delete Field in record of beneficiary")
	public void user_626_verify_the_delete_field_in_record_of_beneficiary() {
		JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Beneficiary").get("RecordPay")).isDisplayed();
	}

	@Given("User_626 Verify the details Field in record of beneficiary")
	public void user_626_verify_the_details_field_in_record_of_beneficiary() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("RecordDetails"));
	}
	@Given("User_626 Click on the Add local beneficiary in beneficiary management")
	public void user_626_click_on_the_add_local_beneficiary_in_beneficiary_management() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddLocalBene"),false);
	}
	@Given("User_626 Enter the BVN Number below the Add Local Beneficiary")
	public void User_626_Enter_the_BVN_Number_below_the_Add_Local_Beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"),testData.get("BVN"),false);
	}
	@Given("User_626 Click on the edit button in Beneficiary")
	public void user_click_on_the_edit_button_in_beneficiary() {
		String Xpath ="//ion-label[contains(text(),'"+testData.get("AccountNumber")+"')]//ancestor::mat-card-header//ion-icon";
		us.clickOnElement(driver, Xpath, false);
		
	}

	@Given("User_626 Enter the Nick Name Below the beneficiary")
	public void user_enter_the_nick_name_below_the_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ChangeCardNameVisible_debitDetails"),testData.get("NickName"),false);
	}

	@Given("User_626 Save the nick Name Below the beneficiary")
	public void user_save_the_nick_name_below_the_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetails"),false);
	}
	@Given("User_626 click the details menu in saved beneficiary record")
	public void user_click_the_details_menu_in_saved_beneficiary_record() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("RecordDetails"),false);
	}
	@Given("User_626 Verify the summary screen of beneficiary management")
	public void user_verify_the_summary_screen_of_beneficiary_management() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("SummaryScreen"));
	}
	@Given("User_626 Verify the Previous functionality of beneficiary")
	public void user_verify_the_previous_functionality_of_beneficiary() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneDetailsPrevious"));
	}
	@Given("User_626 Click on the Pay in Beneficiary Details")
	public void user_click_on_the_pay_in_beneficiary_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("RecordPay"),false);
	}
	@Given("User_626 Click on the from Acc Below Transfer Details of Beneficiary")
	public void user_click_on_the_from_acc_below_transfer_details_of_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("FromACC_TransferDetails"),false); 
	}
	@Given("User_626 Select the from Acc Below Transfer Details of Beneficiary")
	public void user_select_the_from_acc_below_transfer_details_of_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Select_FromACC_TransferDetails"),false); 
	}
	@Given("User_626 Enter Amount Below Transfer Details of Beneficiary")
	public void user_enter_amount_below_transfer_details_of_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("TransactionAmount_CCS"),testData.get("EnterAmount"),false);
	}
	@Given("User_626 Click the Cancel button in draft Saving Screen")
	public void User_626_Click_the_Cancel_button_in_draft_Saving_Screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Draft_Cancel_PCR"),false);
	}
	@Given("User_626 Verify the functionality of the previous in Terms transfer Screen")
	public void user_verify_the_functionality_of_the_previous_in_terms_transfer_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("NavigationsecScreen"));
	}

	@Given("User_626 Verify the functionality of the previous in From Acc transfer Screen")
	public void user_verify_the_functionality_of_the_previous_in_from_acc_transfer_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("EnterAmount"));
	}	

@Given("User_626 Click on the edit button Below the showmore")
public void user_click_on_the_edit_button_below_the_showmore() throws InterruptedException {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("EDIT_Benef"),false);
	Thread.sleep(5000);
}

@Given("User_626 Verify the Bank_Edit_Summary field in Edit Beneficiary Screen")
public void user_verify_the_bank_edit_summary_field_in_edit_beneficiary_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Edit_Summary"));
}

@Given("User_626 Verify the BVN_Edit_Summary field in Edit Beneficiary Screen")
public void user_verify_the_bvn_edit_summary_field_in_edit_beneficiary_screen() {
   us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("BVN_Edit_Summary"));
}

@Given("User_626 Verify the ACC_NO_Edit_Summary field in Edit Beneficiary Screen")
public void user_verify_the_acc_no_edit_summary_field_in_edit_beneficiary_screen() {
   us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("ACC_NO_Edit_Summary"));
}

@Given("User_626 Verify the NameOfBeneficiary_Edit_Summary field in Edit Beneficiary Screen")
public void user_verify_the_name_of_beneficiary_edit_summary_field_in_edit_beneficiary_screen() {
   us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("NameOfBeneficiary_Edit_Summary"));
}

@Given("User_626 Verify the field MobNO_Edit_summary in Edit Beneficiary Screen")
public void user_verify_the_field_mob_no_edit_summary_in_edit_beneficiary_screen() {
   us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("MobNO_Edit_summary"));
}

@Given("User_626 Verify the Purpose_edit_summary field in Edit Beneficiary Screen")
public void user_verify_the_purpose_edit_summary_field_in_edit_beneficiary_screen() {
   us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_edit_summary"));
}
@Given("User_626 Click on the Show More button below the Edit Beneficiary details")
public void User_626_Click_on_the_Show_More_button_below_the_Edit_Beneficiary_details() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("ShowMore_Beneficiary"), false);
}
	
	
	
	
	
	
	
	
	
}
	
	
	



