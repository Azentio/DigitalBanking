package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class AccountTransfer_609 {
	
	WebDriver driver = BaseClass.driver;

	UserUtility_614 us = new UserUtility_614(driver);

	String executionTestData;
	HashMap<String, String> testData;

	
	
	@Given("^User_609 navigates to the omni_corporate_web_portal$")
	public void User_609_Navigates_To_The_Omni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("^User_609 Enters the maker username1 in the login page for omni_corporate_web_portal$")
	public void User_609_Enters_The_Maker_Username1_In_The_Login_Page_For_Omni_Corporate_Web_Portal() {
		
		for (int i = 0; i <2000; i++) {
			try {
				if (us.getTextFromExecuteJavaScript(DataReader.locatorsMap.get("OmniScreen_L").get("LanguageValidationInLogin")).contains("English")) {
					break;
				}
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_L").get("userNameLoginScreen"),
				testData.get("UserName1"),
				true); 
	}
	

	@And("^User_609 Enters the maker password1 in the login page for omni_corporate_web_portal$")
	public void User_609_Enters_The_Maker_Password1_In_The_Login_Page_For_Omni_Corporate_Web_Portal() throws InterruptedException {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_L").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
		
		
		
	}
	@Given("User_609 Enters the maker checker username1 in the login page for omni_corporate_web_portal")
	public void User_609_enters_the_maker_checker_username1_in_the_login_page_for_omni_corporate_web_portal() {
		for (int i = 0; i <2000; i++) {
			try {
				if (us.getTextFromExecuteJavaScript(DataReader.locatorsMap.get("OmniScreen_L").get("LanguageValidationInLogin")).contains("English")) {
					break;
				}
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_L").get("userNameLoginScreen"),
				testData.get("UserName1"),
				true);
	}

	@Given("User_609 Enters the maker checker password1 in the login page for omni_corporate_web_portal")
	public void user_609_Enters_the_maker_checker_password1_in_the_login_page_for_omni_corporate_web_portal() {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_L").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
	}
	
	@And("^User_609 Click on the loggin button in the login page for omni_corporate_web_portal$")
	public void User_609_Click_On_The_Loggin_Button_In_The_Login_Page_For_Omni_Corporate_Web_Portal() throws InterruptedException {
		//Thread.sleep(5000);
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_L").get("loginBtn"), 
				true);
		for (int i = 0; i <200; i++) {
			try {
				if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_L").get("loginValidation"))).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i==199) {
					us.clickOnElement(driver, 
							DataReader.locatorsMap.get("OmniScreen_L").get("loginBtn"), 
							true);
				}
			}
		}
		
		
					
		
	}
	
	@And("^User_609 Click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void User_609_Click_On_The_Force_Logout_Btn_In_The_Login_Page_For_Omni_Corporate_Web_Portal() {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_L").get("ForcelogoutLogginScreen"), 
					20,
					true);
		} catch (Exception e) {
			
		}
	}
	
	@And("^User_609 Click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void User_609_Click_On_The_Ok_Button_For_The_Successful_Login_Page_ForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_L").get("okBtnAfterSuccessLogin"), 
				true);
	}
	
	
	@Given("^User_609 navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA$")
	public void User_609_NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials_Rida() {

		driver.get(DataReader.configFileMap.get("omni_adminScreen"));

		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("userNameField_LogginScreen"),
				DataReader.userCredentialsMap.get("VimalAdmin").get("userName"), false);

		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("passwordField_LogginScreen"),
				DataReader.userCredentialsMap.get("VimalAdmin").get("Password"), false);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("logginBtn_LogginScreen"), false);

		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("companyCode_AdminLoggin"),
				DataReader.userCredentialsMap.get("VimalAdmin").get("CompanyCode"), false);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnCompanyCode_AdminLoggin"),
				false);

		try {

			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("Omni_Admin").get("yesBtnForceLogout_AdminLoggin"), 5, false);
		}

		catch (Exception e) {

		}

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnLastLoggin_AdminLoggin"),
				false);

	}

	@And("User_609 loads the test datasetup for the test case id AT_082_01")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_at_082_01() {
		executionTestData = DataReader.executionTestData.get("AT_082_01");
		testData = DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}

	@And("^User_609 click on the parameters features in the OmniScreen admin page$")
	public void User_609_ClickOnTheParametersFeaturesInTheOmniscreenAdminPage() {

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("ParametersLabel_AdminScreen"), false);

	}

	@And("^User_609 click on the user management label in the admin screen$")
	public void User_609_ClickOnTheUserManagementLabelInTheAdminScreen() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("UserManagement_ParametersLabel_AdminScreen"), false);
	}

	@And("^User_609 click on the cutomer approval matrix feature under the parameters$")
	public void User_609_ClickOnTheCutomerApprovalMatrixFeatureUnderTheParameters() {

		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Customer_ApprovalMatrix_UserManagement_ParametersLabel"),
				false);

	}

	@And("^User_609 click on the search icon in the customer approval matrix$")
	public void User_609_ClickOnTheSearchIconInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("searchIcon_Customer_ApprovalMatrix_UserManagement"),
				false);
	}

	@And("^User_609 enters the approval matrix code in the code field and click on the enter button$")
	public void User_609_EntersTheApprovalMatrixCodeInTheCodeFieldAndClickOnTheEnterButton() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin")
						.get("approvalMatrixCodeField_Customer_ApprovalMatrix_UserManagement"),
				testData.get("ApprovalMatrixCode"), false);
	}

	@And("^User_609 selects the inputed code from the search result and double click on it$")
	public void User_609_SelectsTheInputedCodeFromTheSearchResultAndDoubleClickOnIt() {
		String xpath = us.textReplacer(
				DataReader.locatorsMap.get("Omni_Admin")
						.get("selectTheApprovalMatrixCode_approvalMatrixCodeField_Customer_ApprovalMatrix"),
				"TESTDATAVARIABLE", testData.get("ApprovalMatrixCode"));

		us.doubleClickOnElement(driver, xpath, false);
	}

	@And("^User_609 selects the already defined limit types and delete if anything is already defined$")
	public void User_609_SelectsTheAlreadyDefinedLimitTypesAndDeleteIfAnythingIsAlreadyDefined() {

		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_UserManagement"),
				false);

		us.checkAndDeleteRecord(driver, 2,
				DataReader.locatorsMap.get("Omni_Admin").get("noOfRows_customer_ApprovalMatrix_UserManagement"),
				DataReader.locatorsMap.get("Omni_Admin")
						.get("DeleteBtn_Customer_ApprovalMatrix_UserManagement_ParametersLabel"),
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_UserManagement"));
	}

	@And("^User_609 click on the add button and add the first limit type in the customer approval matrix$")
	public void User_609_ClickOnTheAddButtonAndAddTheFirstLimitTypeInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("addBtn_Customer_ApprovalMatrix_UserManagement_ParametersLabel"), false);
	}

	@And("^User_609 click on the limit type and select the range option in customer approval matrix$")
	public void User_609_ClickOnTheLimitTypeAndSelectTheRangeOptionInCustomerApprovalMatrix() {

		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_UserManagement"),
				false);

		us.selectFromDropdown(driver,
				DataReader.locatorsMap.get("Omni_Admin")
						.get("limitfield_SelectDropDown_Customer_ApprovalMatrix_UserManagement"),
				testData.get("LimitType1"));
	}

	@And("^User_609 enter the minimum amount in customer approval matrix for first row$")
	public void User_609_EnterTheMinimumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("minimumfield_Customer_ApprovalMatrix_UserManagement"),
				testData.get("MinimumAmount1"), false);
	}

	@And("^User_609 enter the maximum amount in customer approval matrix for first row$")
	public void User_609_EnterTheMaximumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("maximumfield_Customer_ApprovalMatrix_UserManagement"),
				testData.get("MaximumAmount1"), false);
	}

	@And("^User_609 enter the group id in customer approval matrix for first row$")
	public void User_609_EnterTheGroupIdInCustomerApprovalMatrixForFirstRow() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("groupCode_Customer_ApprovalMatrix_UserManagement"),
				testData.get("GroupCode1"), false);
	}

	@And("^User_609 enter the number of user in the customer approval matrix for first row$")
	public void User_609_EnterTheNumberOfUserInTheCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("noOfUsers_Customer_ApprovalMatrix_UserManagement"),
				testData.get("noOfUsers1"), false);
	}

	@And("^User_609 click on the save button in the customer approval matrix$")
	public void User_609_ClickOnTheSaveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("saveBtn_Customer_ApprovalMatrix_UserManagement"), false);
	}

	@And("^User_609 click on the ok button for the warning popup in the customer approval matrix$")
	public void User_609_ClickOnTheOkButtonForTheWarningPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}

	@And("^User_609 click on the ok button for the Success popup in the customer approval matrix$")
	public void User_609_ClickOnTheOkButtonForTheSuccessPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("successPopupOkBtn_Customer_ApprovalMatrix_UserManagement"), false);
	}

	@And("^User_609 clicks on the approve button in the customer approval matrix$")
	public void User_609_ClicksOnTheApproveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("approveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}

	

	@Given("User_609 enters the maker checker username1 in the login page for omni_corporate_web_portal")
	public void user_enters_the_maker_checker_username1_in_the_login_page_for_omni_corporate_web_portal() {
		for (int i = 0; i < 2000; i++) {
			try {
				if (us.getTextFromExecuteJavaScript(
						DataReader.locatorsMap.get("OmniScreen_L").get("LanguageValidationInLogin"))
						.contains("English")) {
					break;
				}
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("userNameLoginScreen"),
				testData.get("UserName1"), true);
	}

	@Given("User_609 enters the maker checker password1 in the login page for omni_corporate_web_portal")
	public void user_enters_the_maker_checker_password1_in_the_login_page_for_omni_corporate_web_portal() {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_L").get("passwordLoginScreen"),
					testData.get("Password1"), true);

		} catch (Exception e) {
			Assert.fail("password not entered");
		}
	}

	@And("^user enters the checker username1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("userNameLoginScreen"),
				testData.get("UserName2"), true);
	}

	@And("^user enters the checker password1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("passwordLoginScreen"),
				testData.get("Password2"), true);
	}

	@And("^user enters the checker username2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerUsername2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("userNameLoginScreen"),
				testData.get("UserName3"), true);
	}

	@And("^user enters the checker password2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerPassword2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("passwordLoginScreen"),
				testData.get("Password3"), true);
	}

	@And("^User_609 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void User_609_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal()
			throws InterruptedException {
		// Thread.sleep(5000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("loginBtn"), true);
		for (int i = 0; i < 200; i++) {
			try {
				if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_L").get("loginValidation")))
						.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("loginBtn"), true);
				}
			}
		}
	}

	@And("^User_609 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void User_609_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("okBtnAfterSuccessLogin"), true);
	}

	@And("^User_609 click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void User_609_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
		try {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_L").get("ForcelogoutLogginScreen"), 20, true);
		} catch (Exception e) {

		}
	}

	// **** Scheduled transfer ****//

	@And("^User_609 Click on the AMANA payment screen in the homepage$")
	public void User_609_ClickOnTheAmanaPaymentScreenInTheHomepage() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("AMANAPayments_HomeScreen"),
				false);
	}

	@And("User_609 Click scheduled transfer under AMANA payment screen")
	public void User_609_click_scheduled_transfer_under_amana_payment_screen() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("OmniScreen_L").get("ScheduledTransfers_Transfers_AMANA"), false);
	}

	@And("User_609 Click scheduled other bank transfer under the AMANA payment screen")
	public void User_609_click_scheduled_other_bank_transfer_under_the_amana_payment_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("ScheduledOtherBankTransfer"),
				false);
	}

	@Given("User_609 Click scheduled other Account transfer under the AMANA payment screen")
	public void User_609_click_scheduled_own_account_transfer_under_the_amana_payment_screen()
			throws InterruptedException {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("ScheduledOwnAccountTransfer"),
				false);
	}

	@And("User_609 Select from account under scheduled other bank transfer")
	public void User_609_select_from_account_under_scheduled_other_bank_transfer() throws Exception {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("OmniScreen_L").get("FromAcc_TransferWithinOwnAccountTransfer"), true);
		String xpath = "//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']//ion-label[contains(text(),'"
				+ testData.get("FromAccount1") + "')]";
		for (int i = 0; i < 2000; i++) {
			try {
				us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
				us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_609 Click To other under scheduled other bank transfer")
	public void User_609_click_to_other_under_the_amana_payment_screen() throws InterruptedException {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("OmniScreen_L").get("ToOther_TransfersToOtherBankAccount"), true);
	}
	
	@And("User_609 Select Bank under scheduled other bank transfer")
	public void User_609_select_bank_under_scheduled_other_bank_transfer() {

		String xpath = "//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
				+ "//ion-label[contains(text(),'" + testData.get("ToAccount1") + "')]";

		for (int i = 0; i < 2000; i++) {
			try {
				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_L").get("Benefi_ScheduledOtherBankTransfer"), true);
				us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
				us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage() + "Check beneficiary account number");
				}
			}
		}
	}

	@And("User_609 Select beneficiary under scheduled other bank transfer")
	public void User_609_select_beneficiary_under_scheduled_other_bank_transfer() {

		String xpath = "//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
				+ "//ion-label[contains(text(),'" + testData.get("ToAccount1") + "')]";

		for (int i = 0; i < 2000; i++) {
			try {
				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_L").get("Benefi_ScheduledOtherBankTransfer"), true);
				us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
				us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage() + "Check beneficiary account number");
				}
			}
		}
	}

	@And("User_609 Select the Branch under scheduled other bank transfer")
	public void User_609_Select_the_Branch_under_scheduled_other_bank_transfer() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("Amount_ScheduledOtherBankTransfer"),
				testData.get("TransferAmount"), true);

	}

	@And("User_609 Select the BVN under scheduled other bank transfer")
	public void User_609_Select_the_BVN_under_scheduled_other_bank_transfer() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("Amount_ScheduledOtherBankTransfer"),
				testData.get("TransferAmount"), true);
	}

	@And("User_609 Enter the Account Number under scheduled other bank transfer")
	public void User_609_enter_the_account_number_under_scheduled_other_bank_transfer() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("Amount_ScheduledOtherBankTransfer"),
				testData.get("TransferAmount"), true);
	}

	@And("User_609 Select the Benificiary Currency under scheduled other bank transfer")
	public void User_609_select_the_Benificiary_Currency_number_under_scheduled_other_bank_transfer()
			throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("Amount_ScheduledOtherBankTransfer"),
				testData.get("TransferAmount"), true);

	}

	@And("User_609 Enable the Save Benificiary flag under scheduled other bank transfer")
	public void User_609_enable_the_save_Benificiary_flag_number_under_scheduled_other_bank_transfer()
			throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("Amount_ScheduledOtherBankTransfer"),
				testData.get("TransferAmount"), true);

	}

	@And("User_609 Enter transfer amount under scheduled other bank transfer")
	public void User_609_enter_transfer_amount_under_scheduled_other_bank_transfer() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("Amount_ScheduledOtherBankTransfer"),
				testData.get("TransferAmount"), true);

	}

	@And("User_609 Enter purpose of transfer under scheduled other bank transfer")
	public void User_609_enter_purpose_of_transfer_under_scheduled_other_bank_transfer() throws InterruptedException {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_L").get("EnterPurposeInOwnAccountTransfer"),
				testData.get("PurposeOfTrnx"), false);

	}

	@And("User_609 Click next button under scheduled other bank transfer")
	public void User_609_click_next_button_under_scheduled_other_bank_transfer() {
		for (int i = 0; i < 2000; i++) {
			try {
				driver.findElement(By.xpath(
						DataReader.locatorsMap.get("OmniScreen_L").get("PurposeNXT_ScheduledOtherBankTransfer")))
						.click();
				if (driver
						.findElement(
								By.xpath(DataReader.locatorsMap.get("OmniScreen_L").get("PerodicityValidation")))
						.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select periodicity under scheduled other bank transfer")
	public void User_609_select_periodicity_under_scheduled_other_bank_transfer() {

		String xpath = "//ion-label[contains(text(),'" + testData.get("SelectPeriodicity") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				if (i == 0 || i == 20 || i == 40 || i == 60 || i == 80 || i == 100 || i == 120 || i == 140 || i == 140
						|| i == 160 || i == 180 || i == 199) {
					us.clickOnElement(driver,
							DataReader.locatorsMap.get("OmniScreen_L").get("PeriodicityDropdown_ScheduledTransfer"),
							false);
				}

				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		us.clickOnElement(driver, xpath, false);
	}

	@And("User_609 Enter number of payments under scheduled other bank transfer")
	public void User_609_enter_number_of_payments_under_scheduled_other_bank_transfer() {
		for (int i = 0; i < 200; i++) {
			try {
				us.enterData(driver,
						DataReader.locatorsMap.get("OmniScreen_L").get("NoOfPayments_ScheduledOtherBankTransfer"),
						testData.get("NoOfPayments"), false);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_609 Click next button1 under scheduled other bank transfer")
	public void user_click_next_button1_under_scheduled_other_bank_transfer() {
		for (int i = 0; i < 2000; i++) {
			try {
				driver.findElement(By.xpath(
						DataReader.locatorsMap.get("OmniScreen_L").get("PurposeNXT_ScheduledOtherBankTransfer")))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click submit button under scheduled other bank transfer")
	public void User_609_click_submit_button_under_scheduled_other_bank_transfer() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("OmniScreen_L").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"),
				true);
	}

	@And("User_609 Click ok button for request submitted successfully or request time")
	public void User_609_click_ok_button_for_request_submitted_successfully_or_request_time() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("okBtnRequestTimeOut"), true);
	}

	@Given("User_609 Click i agree on terms and conditions")
	public void User_609_click_i_agree_on_terms_and_conditions() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("IAgreeTC"), true);
	}

	@Given("User_609 Click log out button")
	public void user_click_log_out_button(Integer int1) {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_L").get("LogOutButton"), false);
	}

	
	//********************************* Profile *********************************//
	
	@And("^User_609 Click on the Profile$")
	public void User_609_Click_on_the_Profile() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Profile"), true);
	}
	
	@And("^User_609 Click on the Security Settings$")
	public void User_609_Click_on_the_Security_Settings() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Profile_SecuritySettings"), true);
	}
	
	@And("^User_609 Click on the Account suspension under Security Settings$")
	public void User_609_Click_on_the_Account_suspension_under_Security_Settings() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Profile_SecuritySettings_Accountsuspension"), true);
		Thread.sleep(3000);
	}
	
	@And("^User_609 Select the Suspension Reason$")
	public void User_609_Select_the_Suspension_Reason() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Profile_SecuritySettings_Accountsuspension_SuspensionReason"), false);
		
		//ion-label[contains(text(),' arabic ')]
		String xpath = "//ion-label[contains(text(),'" +testData.get("Suspend Reason")+"']";
		//act.doubleClick(driver.findElement(By.xpath(xpath)));
		us.doubleClickOnElement(driver, xpath, false);
	}
	
	@And("^User_609 Enter the Comments under Security Settings$")
	public void User_609_Enter_the_Comments_under_Security_Settings() {
		us.enterData(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Profile_SecuritySettings_Accountsuspension_Comments"),
				testData.get("Comments"), true);
	}
	
	@And("^User_609 Click on Submit under Security Settings$")
	public void User_609_Click_on_Submit_under_Security_Settings() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Profile_SecuritySettings_Accountsuspension_Submit"), true);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Web_ConfirmOk"), true);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Web_Ok"), true);
	}
	
}
