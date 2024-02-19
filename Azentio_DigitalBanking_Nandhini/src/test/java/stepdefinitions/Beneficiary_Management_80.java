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
//	@And("^User7180 click on the loggin button in the login page for omni_corporate_web_portal$")
//	public void user7180_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
//		//Thread.sleep(5000);
//		us.clickOnElement(driver, 
//				DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
//				true);
//		for (int i = 0; i <200; i++) {
//			try {
//				if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("loginValidation"))).isDisplayed()) {
//					break;
//				}
//			} catch (Exception e) {
//				if (i==199) {
//					us.clickOnElement(driver, 
//							DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
//							true);
//				}
//			}
//		}
//		
//		
//					
//		
//	}
//	
//	@And("^User7180 click on the force logout btn in the login page for omni_corporate_web_portal$")
//	public void user7180_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
//		try {
//			us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
//					20,
//					true);
//		} catch (Exception e) {
//			
//		}
//	}
//	
//	@And("^User7180 click on the ok button for the successful login page for omni_corporate_web_portal$")
//	public void user7180__ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
//		us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);
//	
//	}
	@Given("User7180 Click on the Beneficiary Management in the Home screen Retail User")
	public void user7180_click_on_the_beneficiary_management_in_the_home_screen_retail_user() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Beneficiay_Management"),false);
	}

	@Given("User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen")
	public void user7180_click_add_ineternal_beneficiary_below_the_beneficiary_management_bank_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"),false);
	}
	@Given("User7180 Enter the Valid Account number below the Add ineternal Beneficiary")
	public void user7180_enter_the_valid_account_number_below_the_add_ineternal_beneficiary() throws InterruptedException {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),testData.get("AccountNumber"),false);
		//System.out.println(DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process"));
		for (int i = 0; i <= 2000; i++) {
			try {
				driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get(" ValidationinProcess")));				
			}
			catch (NoSuchElementException e) {
				if (i>300) {
					break;
				}
				
			}
			
			}
		
	}

	@Given("User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary")
	public void user7180_enter_the_valid_name_of_beneficiary_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"),testData.get("NameOfBeneficiary"),false);
	}
	@Given("User7180 click on the country for selecting below the Add ineternal Beneficiary")
	public void user7180_click_on_the_country_for_selecting_below_the_add_ineternal_beneficiary() throws Throwable {
		Thread.sleep(3000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Country"),false);
	}

	@Given("User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown")
	public void user7180_enter_the_country_code_for_mobile_number_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Mobilecode"),false);
	}

	@Given("User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary")
	public void user7180_select_the_mobile_number_code_for_enter_the_mobile_no_below_the_add_ineternal_beneficiary() {
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
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("ShowMore_BenefManage"),false);
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

	@Given("User7180 Validate the Details in Home screen")
	public void user7180_validate_the_details_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Details_BenefManage"));
	}
	@Given("User7180 Click the Details in Home screen")
	public void user7180_click_the_details_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Details_BenefManage"));
	}

	@Given("User7180 Validate the Edit in Home screen")
	public void user7180_validate_the_edit_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Edit_BenefManage"));
	}

	@Given("User7180 Validate the Pay in Home screen")
	public void user7180_validate_the_pay_in_home_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Beneficiary").get("Pay_BenefManage"));
	}
	@Given("User7180 Click the Pay in Home screen")
	public void user7180_click_the_pay_in_home_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Pay_BenefManage"),false);
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
		us.enterData(driver,DataReader.locatorsMap.get("BeneficiaryManagement").get("Cards_CSS_EnterAmount"),testData.get("Amount"),false);
	}
	@Given("User7180 Enter the Purpose of the Beneficiary Management")
	public void user7180_enter_the_purpose_of_the_beneficiary_management() {
		us.enterData(driver,DataReader.locatorsMap.get("BeneficiaryManagement").get("PurposeTxtDesc"),testData.get("Purpose"),false);
	}
	@Given("User7180 verify the record save in TO DO List for draft Data in Beneficiary Management")
	public void user7180_verify_the_record_save_in_to_do_list_for_draft_data_in_beneficiary_Management() {
		
		us.elementIsVisible(driver,DataReader.locatorsMap.get("BeneficiaryManagement").get("Verify_TODO_list"));
	}

}
