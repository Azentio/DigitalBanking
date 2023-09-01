package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class AdminScreen_Steps_5679 {
	
	WebDriver driver = BaseClass.driver;
	
	UserUtility_614 us = new UserUtility_614(driver);
	
	String executionTestData;
	HashMap<String, String> testData;
		
		

	
	
	@Given("^user_5679navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA$")
	public void UserNavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials_Rida() {
		
		driver.get(DataReader.configFileMap.get("omni_adminScreen"));
		
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("userNameField_LogginScreen"), 
				DataReader.userCredentialsMap.get("VimalAdmin").get("userName"), false);
		
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("passwordField_LogginScreen"), 
				DataReader.userCredentialsMap.get("VimalAdmin").get("Password"), false);
		
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("logginBtn_LogginScreen"),false);
		
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("companyCode_AdminLoggin"), 
				DataReader.userCredentialsMap.get("VimalAdmin").get("CompanyCode"), false);
		
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnCompanyCode_AdminLoggin"), false);
		
		try {
			
			
			us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Omni_Admin").get("yesBtnForceLogout_AdminLoggin"),5, false);
		}
		
		catch(Exception e) {
			
		}
		
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnLastLoggin_AdminLoggin"), false);
		
		

	}
	
	@And("^user_5679loads the test datasetup for the test case id AT_003$")
	public void UserLoadsTheTestDatasetupForTheTestCaseIdAt_003() {
		executionTestData = DataReader.executionTestData.get("AT_003");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_5679 loads the test datasetup for the test case id AT_020")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_020_01() {
		executionTestData = DataReader.executionTestData.get("AT_020");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_5679 loads the test datasetup for the test case id AT_022")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_022() {
		executionTestData = DataReader.executionTestData.get("AT_022_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_5679 loads the test datasetup for the test case id AT_042")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_042() {
		executionTestData = DataReader.executionTestData.get("AT_042_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}

@Given("user_5679 loads the test datasetup for the test case id AT_045")
public void user_loads_the_test_datasetup_for_the_test_case_id_at_045() {
	executionTestData = DataReader.executionTestData.get("AT_045_01");
	System.out.println(executionTestData);
	testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
    
}
	
	
	@And("^user_5679click on the parameters features in the OmniScreen admin page$")
	public void UserClickOnTheParametersFeaturesInTheOmniscreenAdminPage() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("ParametersLabel_AdminScreen"), false);

	}
	
	@And("^user_5679click on the user_5679management label in the admin screen$")
	public void UserClickOnTheUserManagementLabelInTheAdminScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("UserManagement_ParametersLabel_AdminScreen"), false);
	}
	
	@And("^user_5679click on the cutomer approval matrix feature under the parameters$")
	public void UserClickOnTheCutomerApprovalMatrixFeatureUnderTheParameters() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("Customer_ApprovalMatrix_UserManagement_ParametersLabel"), false);

	}
	@And("^user_5679click on the search icon in the customer approval matrix$")
	public void UserClickOnTheSearchIconInTheCustomerApprovalMatrix() {
		us.clickOnElement(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("searchIcon_Customer_ApprovalMatrix_UserManagement"), false);
	}
	@And("^user_5679enters the approval matrix code in the code field and click on the enter button$")
	public void UserEntersTheApprovalMatrixCodeInTheCodeFieldAndClickOnTheEnterButton() {
		us.enterDataAndEnter(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("approvalMatrixCodeField_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("ApprovalMatrixCode"),
				false);
	}
	@And("^user_5679selects the inputed code from the search result and double click on it$")
	public void UserSelectsTheInputedCodeFromTheSearchResultAndDoubleClickOnIt() {
		String xpath = us.textReplacer(
				DataReader.locatorsMap.get("Omni_Admin").get("selectTheApprovalMatrixCode_approvalMatrixCodeField_Customer_ApprovalMatrix"),
				"TESTDATAVARIABLE",
				testData.get("ApprovalMatrixCode"));
		
		us.doubleClickOnElement(driver, xpath, false);		
	}
	
	@And("^user_5679selects the already defined limit types and delete if anything is already defined$")
	public void UserSelectsTheAlreadyDefinedLimitTypesAndDeleteIfAnythingIsAlreadyDefined() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_UserManagement"),
				false);
		
		us.checkAndDeleteRecord(
				driver,
				2,
				DataReader.locatorsMap.get("Omni_Admin").get("noOfRows_customer_ApprovalMatrix_UserManagement"), 
				DataReader.locatorsMap.get("Omni_Admin").get("DeleteBtn_Customer_ApprovalMatrix_UserManagement_ParametersLabel"), 
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_UserManagement")
				);
	}
	@And("^user_5679click on the add button and add the first limit type in the customer approval matrix$")
	public void UserClickOnTheAddButtonAndAddTheFirstLimitTypeInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("addBtn_Customer_ApprovalMatrix_UserManagement_ParametersLabel"), 
				false);
	}
	
	@And("^user_5679 click on the limit type and select the range option in customer approval matrix$")
	public void UserClickOnTheLimitTypeAndSelectTheRangeOptionInCustomerApprovalMatrix() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_UserManagement"),
				false);
		
		us.selectFromDropdown(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_SelectDropDown_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("LimitType1"));
	}
	
	@And("^user_5679 enter the minimum amount in customer approval matrix for first row$")
	public void UserEnterTheMinimumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("minimumfield_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("MinimumAmount1"), false);
	}
	@And("^user_5679enter the maximum amount in customer approval matrix for first row$")
	public void UserEnterTheMaximumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("maximumfield_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("MaximumAmount1"), false);
	}
	@And("^user_5679 enter the group id in customer approval matrix for first row$")
	public void UserEnterTheGroupIdInCustomerApprovalMatrixForFirstRow() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("groupCode_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("GroupCode1"), false);
	}
	@And("^user_5679 enter the number of user_5679in the customer approval matrix for first row$")
	public void UserEnterTheNumberOfUserInTheCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("noOfUsers_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("noOfUsers1"), false);
	}
	
	@And("^user_5679 click on the save button in the customer approval matrix$")
	public void UserClickOnTheSaveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("saveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);		
	}	
	
	@And("^user_5679 click on the ok button for the warning popup in the customer approval matrix$")
	public void UserClickOnTheOkButtonForTheWarningPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	@And("^user_5679 click on the ok button for the Success popup in the customer approval matrix$")
	public void UserClickOnTheOkButtonForTheSuccessPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("successPopupOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	@And("^user_5679 clicks on the approve button in the customer approval matrix$")
	public void UserClicksOnTheApproveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("approveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("^user_5679 navigates to the omni_corporate_web_portal$")
	public void UserNavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("^user_5679 enters the maker username1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheMakerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		
		for (int i = 0; i <2000; i++) {
			try {
				if (us.getTextFromExecuteJavaScript(DataReader.locatorsMap.get("OmniScreen_Login").get("LanguageValidationInLogin")).contains("English")) {
					break;
				}
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName1"),
				true);
	}
	

	@And("^user_5679 enters the maker password1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
		
		
		
	}
	
	@And("^user_5679 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void UserClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		//Thread.sleep(5000);
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
				true);
		for (int i = 0; i <200; i++) {
			try {
				if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("loginValidation"))).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i==199) {
					us.clickOnElement(driver, 
							DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
							true);
				}
			}
		}
		
		
					
		
	}
	
	@And("^user_5679 click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void UserClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
					20,
					true);
		} catch (Exception e) {
			
		}
	}
	
	@And("^user_5679 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void UserClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
				true);
	}
	
	@And("^user_5679 click on the AMANA payment screen in the homepage$")
	public void UserClickOnTheAmanaPaymentScreenInTheHomepage() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("AMANAPayments_HomeScreen"), 
				false);
	}
	
	@And("^user_5679 click on the transfers under the AMANA payment screen$")
	public void UserClickOnTheTransfersUnderTheAmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Transfers_AMANAPayments"), 
				false);
	}
	
	@And("^user_5679 click on the transfers within own accounts under transfer_Amana payment screen$")
	public void UserClickOnTheTransfersWithinOwnAccountsUnderTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransferWithinOwnAccounts_Transfers_AMANAPaymnets"), 
				false);
	}
	
	@And("^user_5679 click on the From accounts from the transfers within own accounts$")
	public void UserClickOnTheFromAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_5679 click on the To accounts from the transfers within own accounts$")
	public void UserClickOnTheToAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_5679 selects the from account from the dropdown in transfers within own accounts$")
	public void UserSelectsTheFromAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("FromAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@And("^user_5679 selects the To account from the dropdown in transfers within own accounts$")
	public void UserSelectsTheToAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectToAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@And("^user_5679 enters the transaction amount in the transfers within own accounts$")
	public void UserEntersTheTransactionAmountInTheTransfersWithinOwnAccounts() {
		us.enterData(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
				testData.get("TransferAmount"), 
				false);
		
	}
	
	@And("^user_5679 enters the purpose of transaction in the transfers within own accounts$")
	public void UserEntersThePurposeOfTransactionInTheTransfersWithinOwnAccounts() {
		us.enterData(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
				testData.get("PurposeOfTrnx"), 
				false);

	}
	
	@And("^user_5679 click on next btn in the transfers within own accounts$")
	public void UserClickOnNextBtnInTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_5679 click on submit btn in the transfers within own accounts$")
	public void UserClickOnSubmitBtnInTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_5679 enters the checker username1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName2"),
				true);
	}
	
	@And("^user_5679 enters the checker password1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password2"),
				true);
	}
	
	@And("^user_5679enters the checker username2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerUsername2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName3"),
				true);
	}
	
	@And("^user_5679enters the checker password2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerPassword2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password3"),
				true);
	}
	
	@And("^user_5679waits for the confirmation on the submission report$")
	public void UserWaitsForTheConfirmationOnTheSubmissionReport() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOwnAccountTransfer"));
	}
	
	@And("^user_5679gets the reference number from the submission report$")
	public void UserGetsTheReferenceNumberFromTheSubmissionReport() {
		String refNumber = us.getText(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("RefNo_ConfirmationInOwnAccountTransfer"), 
				false);
		System.out.println(refNumber);
	}
	
	@And("^user_5679clicks on logout btn to logout from omni web portal$")
	public void UserClicksOnLogoutBtnToLogoutFromOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb"), 
				true);
	}
	
	@And("^user_5679click on the TODO icon in homescreen on omni web portal$")
	public void UserClickOnTheTodoIconInHomescreenOnOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen"), 
				true);
	}
	
	@And("^user_5679click on the 1st pending item in the list$")
	public void UserClickOnThe1StPendingItemInTheList() throws InterruptedException {
		
		Thread.sleep(30000);
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FirstItemFrmPendingTransferList"), 
				true);
	}
	
	@And("^user_5679click on the approve btn for the pending transfer request from the maker$")
	public void UserClickOnTheApproveBtnForThePendingTransferRequestFromTheMaker() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ApproveBtnForPendingTransfer"), 
				true);
	}
	
	
	//021
	
	@And("user_5679 click scheduled transfer under AMANA payment screen")
	public void user_072_click_scheduled_transfer_under_amana_payment_screen() {
	    us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledTransfers_Transfers_AMANA"), false);
	}
	@And("user_5679 click scheduled other bank transfer under the AMANA payment screen")
	public void user_072_click_scheduled_other_bank_transfer_under_the_amana_payment_screen_072() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOtherBankTransfer"), 
				false);
	}

	@And("user_5679 select from account under scheduled other bank transfer")
	public void user_072_select_from_account_under_scheduled_other_bank_transfer() throws Exception {	
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), true);
	   String xpath="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']//ion-label[contains(text(),'"
	   		+ testData.get("FromAccount1")+"')]";
	   for (int i = 0; i <2000; i++) {
		try {
			  us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
			  us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
			   break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	 
	   
	    
	}
	@And("user_5679 select beneficiary under scheduled other bank transfer")
	public void user_072_select_beneficiary_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Benefi_ScheduledOtherBankTransfer"), true);
	   String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
	   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"' )]";
	   us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
	   us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
	}

	@And("user_5679 enter transfer amount under scheduled other bank transfer")
	public void user_072_enter_transfer_amount_under_scheduled_other_bank_transfer() {
	   us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	    
	}

	@And("user_5679 enter purpose of transfer under scheduled other bank transfer")
	public void user_072_enter_purpose_of_transfer_under_scheduled_other_bank_transfer() throws InterruptedException {
	   us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
	   Thread.sleep(15000);
	    
	}

	@And("user_5679 click next button under scheduled other bank transfer")
	public void user_072_click_next_button_under_scheduled_other_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
			}

	@And("user_5679 select periodicity under scheduled other bank transfer")
	public void user_072_select_periodicity_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), false);
	   String xpath ="//ion-label[contains(text(),'"+testData.get("SelectPeriodicity")+"')]";
	   us.clickOnElement(driver, xpath, false);
	    
	}

	@And("user_5679 enter number of payments under scheduled other bank transfer")
	public void user_072_enter_number_of_payments_under_scheduled_other_bank_transfer() {
	   us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_ScheduledOtherBankTransfer"),testData.get("NoOfPayments"), true);
	    
	}

	@And("user_5679 click submit button under scheduled other bank transfer")
	public void user_072_click_submit_button_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}

	@And("user_5679 click ok button for request submitted successfully or request time")
	public void user_072_click_ok_button_for_request_submitted_successfully_or_request_time() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnRequestTimeOut"), true);
	}
	@Given("user_5679 click on the international transfers under the Transfers")
	public void user_click_on_the_international_transfers_under_the_transfers() {
		 us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("InternationalTransfer_Transfers_AMANAPaymnets"), false);

	}

	@And("user_5679 select from account under international transfers")
	public void user_select_from_account_under_international_transfers() {	
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_InternationalTransfer"), false);
		 String xpath ="//ion-label[contains(text(),'"+testData.get("FromAccount1")+"')]";
		 us.clickOnElement(driver, xpath, false);
	}	

	@And("user_5679 select beneficiary under international transfer")
	public void user_select_beneficiary_under_international_transfer() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Benefi_internationalTransfer"), false);
	
	
	}

	@And("user_5679 enter transfer amount under international transfer")
	public void user_enter_transfer_amount_under_international_transfer() {
		 us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	}

	@And("user_5679 enter purpose of transfer under international transfer")
	public void user_enter_purpose_of_transfer_under_international_transfer() throws InterruptedException {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
		  Thread.sleep(15000);
	}

	@And("user_5679 click next button under international transfer")
	public void user_click_next_button_under_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
	}

	@And("user_5679 click submit button under international transfer")
	public void user_click_submit_button_under_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}

	@And("user_5679 click Scheduled own bank transfer Under scheduled transfer")
	public void user_click_scheduled_own_bank_transfer_under_scheduled_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnBankTransfer_ScheduledTransfer"), false);
		
	}

	@And("user_5679 select from account under Scheduled own bank transfer")
	public void user_select_from_account_under_scheduled_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), true);
		String xpath ="//ion-label[contains(text(),'"+testData.get("FromAccount1")+"')]";
		 //us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
		 us.clickOnElement(driver, driver.findElement(By.xpath(xpath)));
		
		
	}

	@And("user_5679 select beneficiary under Scheduled own bank transfer")
	public void user_select_beneficiary_under_scheduled_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer"), true);
		String xpath ="//ion-label[contains(text(),'"+testData.get("ToAccount1")+"')]";
		 us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
		 us.clickOnElement(driver, driver.findElement(By.xpath(xpath)));
	}

	@And("user_5679 enter transfer amount under Scheduled own bank transfer")
	public void user_enter_transfer_amount_under_scheduled_own_bank_transfer() {
		 us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	}

	@And("user_5679 enter purpose of transfer under Scheduled own bank transfer")
	public void user_enter_purpose_of_transfer_under_scheduled_own_bank_transfer() throws InterruptedException {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
		  Thread.sleep(15000);
	}

	@And("user_5679 click next button under Scheduled own bank transfer")
	public void user_click_next_button_under_scheduled_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
	}

	@And("user_5679 click submit button under Scheduled own bank transfer")
	public void user_click_submit_button_under_scheduled_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}
	
	@Given("user_5679 loads the test datasetup for the test case id AT_075")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_075() {
		executionTestData = DataReader.executionTestData.get("AT_075_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@And("^user_5679 enters the transaction amount in the transfers screen$")
	public void user_5679EntersTheTransactionAmountInTheTransfersScreen() {
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"),
				testData.get("TransferAmount"), false);
	}
	@And("^user_5679 enters the purpose of transaction in the transfers screen$")
	public void user_5679EntersThePurposeOfTransactionInTheTransfersScreen() throws InterruptedException {
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"),
				testData.get("PurposeOfTrnx"), false);
		Thread.sleep(3000);
	}
	@And("^user_5679 click on next btn in the transfers screen$")
	public void user_5679ClickOnNextBtnInTheTransfersScreen() throws InterruptedException {
		Thread.sleep(5000);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer1"), false);
	}
	@And("^user_5679  click on the I agree to terms and conditions checkbox$")
	public void User_5679ClickOnTheIAgreeToTermsAndConditionsCheckbox() {
		try {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 30, false);

			Thread.sleep(5000);
			us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer1"), false);

		} catch (Exception e) {

		}
	}
	@And("^user_5679 click on submit btn in the transfers screen$")
	public void user_5679ClickOnSubmitBtnInTheTransfersScreen() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer1"), false);
	}
	@And("^user_5679 waits for the confirmation on the submission report$")
	public void user_5679WaitsForTheConfirmationOnTheSubmissionReport() {
		us.elementIsVisible(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOwnAccountTransfer"));
	}
	@And("^user_5679 gets the reference number from the submission report$")
	public void user_5679GetsTheReferenceNumberFromTheSubmissionReport() {
		String refNumber = us.getText(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("RefNo_ConfirmationInOwnAccountTransfer"), false);
		System.out.println(refNumber);
	}
	@And("^user_5679 clicks on logout btn to logout from omni web portal$")
	public void user_5679ClicksOnLogoutBtnToLogoutFromOmniWebPortal() throws InterruptedException {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb1"), false);
		Thread.sleep(30000);
	}
	@Given("user_5679 loads the test datasetup for the test case id AT_037")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_037() {
		executionTestData = DataReader.executionTestData.get("AT_037_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@And("user_5679 click scheduled own Account transfer under the AMANA payment screen")
	public void user_5679_click_scheduled_own_account_transfer_under_the_amana_payment_screen() throws InterruptedException {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnAccountTransfer"), 
				false);
	}
	@And("user_5679 select from account under scheduled own account transfer")
	public void user_5679_select_from_account_under_scheduled_own_account_transfer() {
		 us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), true);
		   String xpath ="//ion-label[contains(text(),'Scheduled_own_account_transfer')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
					+ "//ion-label[contains(text(),'"+testData.get("FromAccount1")+"')]";
		   System.out.println(xpath);
		   for (int i = 0; i <2000; i++) {
			try {
				  us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
				  us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
				   break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		}

	@And("user_5679 select To account under scheduled own account transfer")
	public void user_5679_select_to_account_under_scheduled_own_account_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToTransferScheduledOwnTransfer"), false);
		String xpath ="//ion-label[contains(text(),'Scheduled_own_account_transfer')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
				+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"')]";
		   System.out.println(xpath);
		for (int i = 0; i <2000; i++) {
				try {
					  us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
					  us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
					   break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage()+"Check beneficiary account number");
					}
				}
			}
	}

	@And("user_5679 enter transfer amount under scheduled own account transfer")
	public void user_5679_enter_transfer_amount_under_scheduled_own_account_transfer() throws InterruptedException {
		Thread.sleep(5000);
		   us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	}
	@And("user_5679 enter purpose of transfer under scheduled own account transfer")
	public void user_5679_enter_purpose_of_transfer_under_scheduled_own_account_transfer() {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
	}

	@And("user_5679 click next button under scheduled own account transfer")
	public void user_5679_click_next_button_under_scheduled_own_account_transfer() {
		for (int i = 0; i <2000; i++) {
			try {
				driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"))).click();
				if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("PerodicityValidation"))).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_5679 select periodicity under scheduled own account transfer")
	public void user_5679_select_periodicity_under_scheduled_own_account_transfer() {

		   String xpath ="//ion-label[contains(text(),'"+testData.get("SelectPeriodicity")+"')]";
		   for (int i = 0; i < 200; i++) {
				try {
					if (i==0||i==20||i==40||i==60||i==80||i==100
							||i==120||i==140||i==140||i==160||i==180||i==199) {
						us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), false);
					}
					
					if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		   
		   us.clickOnElement(driver, xpath, false);
		    
		}

	@And("user_5679 enter number of payments under scheduled own account transfer")
	public void user_5679_enter_number_of_payments_under_scheduled_own_account_transfer() {
		for (int i = 0; i < 200; i++) {
			try {
				us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_ScheduledOtherBankTransfer"),testData.get("NoOfPayments"), false);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_5679 click next button1 under scheduled own account transfer")
	public void user_5679_click_next_button1_under_scheduled_own_account_transfer() {
		for (int i = 0; i <2000; i++) {
			try {
				driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"))).click();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_5679 click i agree on terms and conditions")
	public void user_5679_click_i_agree_on_terms_and_conditions() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTC"), true);
	}
	@And("user_5679 click log out button")
	public void user_5679_click_log_out_button() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("LogOutButton"), false);
	}
	
	@And("user_5679 loads the test datasetup for the test case id AT_072")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_072() {
		executionTestData = DataReader.executionTestData.get("AT_072_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@And("user_5679 click international scheduled transfer under scheduled transfer")
	public void user_click_international_scheduled_transfer_under_scheduled_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Scheduled_International_Transfer"), false);
	}

	@And("user_5679 select from account under scheduled international bank transfer")
	public void user_select_from_account_under_scheduled_international_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), true);
		   String xpath ="//ion-label[contains(text(),'Scheduled_international_transfer')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
					+ "//ion-label[contains(text(),'"+testData.get("FromAccount1")+"')]";
		   System.out.println(xpath);
		   for (int i = 0; i <2000; i++) {
			try {
				  us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
				  us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
				   break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	@And("user_5679 click on to other button for select non pre defined beneficiary")
	public void user_click_on_to_other_button_for_select_non_pre_defined_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("To_Other_Scheduled_International_Transfer"), true);
	}

	@And("user_5679 enter BIC swift code under scheduled international bank transfer")
	public void user_enter_bic_swift_code_under_scheduled_international_bank_transfer() {
	         
	   }

	@And("user_5679 enter iban Account no under scheduled international bank transfer")
	public void user_enter_iban_account_no_under_scheduled_international_bank_transfer() {
	    
	    
	}

	@And("user_5679 select beneficiary currency under scheduled international bank transfer")
	public void user_select_beneficiary_currency_under_scheduled_international_bank_transfer() {
	    
	    
	}

	@And("user_5679 enter amount under scheduled International transfer")
	public void user_enter_amount_under_scheduled_international_transfer() {
	    
	    
	}



	
	
	
	
	
	
	
	
	

	@And("user_5679 click on the own bank transfer under the Transfer")
	public void user_click_on_the_own_bank_transfer_under_the_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnBankTransfer_ScheduledTransfer"), false);
	}

	@And("user_5679 click on From account and select the account for own bank transfer")
	public void user_click_on_from_account_and_select_the_account_for_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_ownBankTransfer"), false);
	}
	
	
	
	
	
	
	
	
	
	
	

}
