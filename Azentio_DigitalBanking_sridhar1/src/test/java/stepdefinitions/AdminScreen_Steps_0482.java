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

public class AdminScreen_Steps_0482 {
	
	WebDriver driver = BaseClass.driver;
	
	UserUtility_614 us = new UserUtility_614(driver);
	
	String executionTestData;
	HashMap<String, String> testData;
		
		

	
	
	@And("^user_482 navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA$")
	public void User_482_NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials_Rida() {
		
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
	
	@And("user_482 loads the test datasetup for the test case id AT_020")
	public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_020_01() {
		executionTestData = DataReader.executionTestData.get("AT_021_01");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_482 loads the test datasetup for the test case id AT_019_01")
	public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_019_01() {
		executionTestData = DataReader.executionTestData.get("AT_021_01");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_482 loads the test datasetup for the test case id AT_020_02")
	public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_020_02() {
		executionTestData = DataReader.executionTestData.get("AT_021_02");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_482 loads the test datasetup for the test case id AT_036")
	public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_036() {
		executionTestData = DataReader.executionTestData.get("AT_036");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	
	@And("^user_482 click on the parameters features in the OmniScreen admin page$")
	public void User_482_ClickOnTheParametersFeaturesInTheOmniscreenAdminPage() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("ParametersLabel_AdminScreen"), false);

	}
	
	@And("^user_482 click on the user management label in the admin screen$")
	public void User_482_ClickOnTheUserManagementLabelInTheAdminScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("UserManagement_ParametersLabel_AdminScreen"), false);
	}
	
	@And("^user_482 click on the cutomer approval matrix feature under the parameters$")
	public void User_482_ClickOnTheCutomerApprovalMatrixFeatureUnderTheParameters() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("Customer_ApprovalMatrix_UserManagement_ParametersLabel"), false);

	}
	@And("^user_482 click on the search icon in the customer approval matrix$")
	public void User_482_ClickOnTheSearchIconInTheCustomerApprovalMatrix() {
		us.clickOnElement(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("searchIcon_Customer_ApprovalMatrix_UserManagement"), false);
	}
	@And("^user_482 enters the approval matrix code in the code field and click on the enter button$")
	public void User_482_EntersTheApprovalMatrixCodeInTheCodeFieldAndClickOnTheEnterButton() {
		us.enterDataAndEnter(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("approvalMatrixCodeField_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("ApprovalMatrixCode"),
				false);
	}
	@And("^user_482 selects the inputed code from the search result and double click on it$")
	public void User_482_SelectsTheInputedCodeFromTheSearchResultAndDoubleClickOnIt() {
		String xpath = us.textReplacer(
				DataReader.locatorsMap.get("Omni_Admin").get("selectTheApprovalMatrixCode_approvalMatrixCodeField_Customer_ApprovalMatrix"),
				"TESTDATAVARIABLE",
				testData.get("ApprovalMatrixCode"));
		
		us.doubleClickOnElement(driver, xpath, false);		
	}
	
	@And("^user_482 selects the already defined limit types and delete if anything is already defined$")
	public void User_482_SelectsTheAlreadyDefinedLimitTypesAndDeleteIfAnythingIsAlreadyDefined() {
		
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
	@And("^user_482 click on the add button and add the first limit type in the customer approval matrix$")
	public void User_482_ClickOnTheAddButtonAndAddTheFirstLimitTypeInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("addBtn_Customer_ApprovalMatrix_UserManagement_ParametersLabel"), 
				false);
	}
	
	@And("^user_482 click on the limit type and select the range option in customer approval matrix$")
	public void User_482_ClickOnTheLimitTypeAndSelectTheRangeOptionInCustomerApprovalMatrix() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_UserManagement"),
				false);
		
		us.selectFromDropdown(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_SelectDropDown_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("LimitType1"));
	}
	
	@And("^user_482 enter the minimum amount in customer approval matrix for first row$")
	public void User_482_EnterTheMinimumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("minimumfield_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("MinimumAmount1"), false);
	}
	@And("^user_482 enter the maximum amount in customer approval matrix for first row$")
	public void User_482_EnterTheMaximumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("maximumfield_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("MaximumAmount1"), false);
	}
	@And("^user_482 enter the group id in customer approval matrix for first row$")
	public void User_482_EnterTheGroupIdInCustomerApprovalMatrixForFirstRow() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("groupCode_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("GroupCode1"), false);
	}
	@And("^user_482 enter the number of user in the customer approval matrix for first row$")
	public void User_482_EnterTheNumberOfUserInTheCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("noOfUsers_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("noOfUsers1"), false);
	}
	
	@And("^user_482 click on the save button in the customer approval matrix$")
	public void User_482_ClickOnTheSaveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("saveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);		
	}	
	
	@And("^user_482 click on the ok button for the warning popup in the customer approval matrix$")
	public void User_482_ClickOnTheOkButtonForTheWarningPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	@And("^user_482 click on the ok button for the Success popup in the customer approval matrix$")
	public void User_482_ClickOnTheOkButtonForTheSuccessPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("successPopupOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	@And("^user_482 clicks on the approve button in the customer approval matrix$")
	public void User_482_ClicksOnTheApproveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("approveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@And("^user_482 navigates to the omni_corporate_web_portal$")
	public void User_482_NavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("^user_482 enters the maker username1 in the login page for omni_corporate_web_portal$")
	public void User_482_EntersTheMakerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		
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
	

	@And("^user_482 enters the maker password1 in the login page for omni_corporate_web_portal$")
	public void User_482_EntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
		
		
		
	}
	@And("user_482 enters the maker checker username1 in the login page for omni_corporate_web_portal")
	public void user_enters_the_maker_checker_username1_in_the_login_page_for_omni_corporate_web_portal() {
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

	@And("user_482 enters the maker checker password1 in the login page for omni_corporate_web_portal")
	public void user_enters_the_maker_checker_password1_in_the_login_page_for_omni_corporate_web_portal() {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
	}
	
	@And("^user_482 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void User_482_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
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
	
	@And("^user_482 click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void User_482_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
					20,
					true);
		} catch (Exception e) {
			
		}
	}
	
	@And("^user_482 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void User_482_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
				true);
	}
	
	@And("^user_482 click on the AMANA payment screen in the homepage$")
	public void User_482_ClickOnTheAmanaPaymentScreenInTheHomepage() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("AMANAPayments_HomeScreen"), 
				false);
	}
	
	@And("^user_482 click on the transfers under the AMANA payment screen$")
	public void User_482_ClickOnTheTransfersUnderTheAmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Transfers_AMANAPayments"), 
				false);
	}
	
	@And("^user_482 click on the transfers within own accounts under transfer_Amana payment screen$")
	public void User_482_ClickOnTheTransfersWithinOwnAccountsUnderTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransferWithinOwnAccounts_Transfers_AMANAPaymnets"), 
				false);
	}
	
	@And("^user_482 click on the From accounts from the transfers within own accounts$")
	public void User_482ClickOnTheFromAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_482 click on the To accounts from the transfers within own accounts$")
	public void User_482_ClickOnTheToAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user selects the from account from the dropdown in transfers within own accounts$")
	public void UserSelectsTheFromAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("FromAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@And("^user selects the To account from the dropdown in transfers within own accounts$")
	public void UserSelectsTheToAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectToAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@And("^user enters the transaction amount in the transfers within own accounts$")
	public void UserEntersTheTransactionAmountInTheTransfersWithinOwnAccounts() {
		us.enterData(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
				testData.get("TransferAmount"), 
				false);
		
	}
	
	@And("^user enters the purpose of transaction in the transfers within own accounts$")
	public void UserEntersThePurposeOfTransactionInTheTransfersWithinOwnAccounts() {
		us.enterData(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
				testData.get("PurposeOfTrnx"), 
				false);

	}
	
	@And("^user click on next btn in the transfers within own accounts$")
	public void UserClickOnNextBtnInTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer"), 
				true);
	}
	
	@And("^user click on submit btn in the transfers within own accounts$")
	public void UserClickOnSubmitBtnInTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 
				true);
	}
	
	@And("^user enters the checker username1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName2"),
				true);
	}
	
	@And("^user enters the checker password1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password2"),
				true);
	}
	
	@And("^user enters the checker username2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerUsername2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName3"),
				true);
	}
	
	@And("^user enters the checker password2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheCheckerPassword2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password3"),
				true);
	}
	
	@And("^user waits for the confirmation on the submission report$")
	public void UserWaitsForTheConfirmationOnTheSubmissionReport() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOwnAccountTransfer"));
	}
	
	@And("^user gets the reference number from the submission report$")
	public void UserGetsTheReferenceNumberFromTheSubmissionReport() {
		String refNumber = us.getText(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("RefNo_ConfirmationInOwnAccountTransfer"), 
				false);
		System.out.println(refNumber);
	}
	
	@And("^user clicks on logout btn to logout from omni web portal$")
	public void UserClicksOnLogoutBtnToLogoutFromOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb"), 
				true);
	}
	
	@And("^user click on the TODO icon in homescreen on omni web portal$")
	public void UserClickOnTheTodoIconInHomescreenOnOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen"), 
				true);
	}
	
	@And("^user click on the 1st pending item in the list$")
	public void UserClickOnThe1StPendingItemInTheList() throws InterruptedException {
		
		Thread.sleep(30000);
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FirstItemFrmPendingTransferList"), 
				true);
	}
	
	@And("^user click on the approve btn for the pending transfer request from the maker$")
	public void UserClickOnTheApproveBtnForThePendingTransferRequestFromTheMaker() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ApproveBtnForPendingTransfer"), 
				true);
	}
	
	
	//021
	
	@And("user_482 click scheduled transfer under AMANA payment screen")
	public void user_482_click_scheduled_transfer_under_amana_payment_screen() {
	    us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledTransfers_Transfers_AMANA"), false);
	}
	@And("user_482 click scheduled other bank transfer under the AMANA payment screen")
	public void user_482_click_scheduled_other_bank_transfer_under_the_amana_payment_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOtherBankTransfer"), 
				false);
	}
	@And("user_482 click scheduled own Account transfer under the AMANA payment screen")
	public void user_482_click_scheduled_own_account_transfer_under_the_amana_payment_screen() throws InterruptedException {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnAccountTransfer"), 
				false);
	}


	@And("user_482 select from account under scheduled other bank transfer")
	public void user_482_select_from_account_under_scheduled_other_bank_transfer() throws Exception {	
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
	@And("user_482 select from account under scheduled own bank transfer")
	public void user_482_select_from_account_under_scheduled_own_bank_transfer() throws Exception {	
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
	@And("user_482 select beneficiary under scheduled other bank transfer")
	public void user_482_select_beneficiary_under_scheduled_other_bank_transfer() {
	   
	   String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
	   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"')]";
	   
	   for (int i = 0; i <2000; i++) {
			try {
				  us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Benefi_ScheduledOtherBankTransfer"), true);
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
	@And("user_482 select To account under scheduled own bank transfer")
	public void user_select_to_account_under_scheduled_own_bank_transfer() {
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

	@And("user_482 enter transfer amount under scheduled other bank transfer")
	public void user_482_enter_transfer_amount_under_scheduled_other_bank_transfer() throws InterruptedException {
	   Thread.sleep(5000);
	   us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	    
	}

	@And("user_482 enter purpose of transfer under scheduled other bank transfer")
	public void user_482_enter_purpose_of_transfer_under_scheduled_other_bank_transfer() throws InterruptedException {
	   us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
	   
	}

	@And("user_482 click next button under scheduled other bank transfer")
	public void user_482_click_next_button_under_scheduled_other_bank_transfer() {
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
	@And("user_482 click next button1 under scheduled other bank transfer")
	public void user_click_next_button1_under_scheduled_other_bank_transfer() {
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

	@And("user_482 select periodicity under scheduled other bank transfer")
	public void user_482_select_periodicity_under_scheduled_other_bank_transfer() {
	   
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

	@And("user_482 enter number of payments under scheduled other bank transfer")
	public void user_482_enter_number_of_payments_under_scheduled_other_bank_transfer() {
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

	@And("user_482 click submit button under scheduled other bank transfer")
	public void user_482_click_submit_button_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}

	@And("user_482 click ok button for request submitted successfully or request time")
	public void user_482_click_ok_button_for_request_submitted_successfully_or_request_time() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnRequestTimeOut"), true);
	}

	@And("user_482 click i agree on terms and conditions")
	public void user_482_click_i_agree_on_terms_and_conditions() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTC"), true);
	}
	@And("user_482 click log out button")
	public void user_click_log_out_button(Integer int1) {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("LogOutButton"), false);
	}
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@And("user_072 loads the test datasetup for the test case id AT_076")
	public void user_072_loads_the_test_datasetup_for_the_test_case_id_at_076() {
		executionTestData = DataReader.executionTestData.get("AT_076_01");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_072 loads the test datasetup for the test case id AT_077")
	public void user_072_loads_the_test_datasetup_for_the_test_case_id_at_077() {
		executionTestData = DataReader.executionTestData.get("AT_077_01");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user_072 loads the test datasetup for the test case id AT_078")
	public void user_072_loads_the_test_datasetup_for_the_test_case_id_at_078() {
		executionTestData = DataReader.executionTestData.get("AT_078_01");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("^user_072 navigates to the omni_corporate_web_portal$")
	public void user_072_NavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal")
	public void user_072_enters_the_maker_checker_username1_in_the_login_page_for_omni_corporate_web_portal() {
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
	
	
	@And("user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal")
	public void user_072_enters_the_maker_checker_password1_in_the_login_page_for_omni_corporate_web_portal() {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
	}
	
	
	@And("^user_072 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void user_072_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
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
		@And("^user_072 click on the force logout btn in the login page for omni_corporate_web_portal$")
		public void user_072_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
			try {
				us.clickOnElementNoWait(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
						20,
						true);
			} catch (Exception e) {
				
			}
		}
		@And("^user_072 click on the ok button for the successful login page for omni_corporate_web_portal$")
		public void user_072_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
					true);
		}

		@And("user_072 click on the Beneficiary Management details for web_portal")
		public void user_072_click_on_the_beneficiary_management_details_for_web_portal() {
		us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Beneficiay_Management"), 
					false);
		}

		@And("user_072 click on the Local filed in Beneficiary for web_portal")
		public void user_072_click_on_the_local_filed_in_beneficiary_for_web_portal() {
	        us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Local_Beneficiary"), 
					true);
		}

		@And("user_072 click on the Add_Local_Beneficiary for web_portal")
		public void user_click_on_the_add_local_beneficiary_for_web_portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Add_Local_Beneficiary"), 
					true);
		}

		@Given("user_072 Select the Bank Name in Benficiary for web_portal")
		public void user_select_the_bank_name_in_benficiary_for_web_portal() throws InterruptedException {
		Thread.sleep(3000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Select_Bank_Name"), 30, false);
		}

		@Given("user_072 select the ISVAN in Bank Namefor Benficiary for web_portal")
		public void user_select_the_isvan_in_bank_namefor_benficiary_for_web_portal() {
			try {
				us.clickOnElementNoWait(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Select_ISKAN_Bank"), 30,
						false);
			} catch (Exception e) {
				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Select_Bank_Name"), false);

				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Select_Bank_Name"), false);

				us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Select_ISKAN_Bank"),
				false);
				
			}

		}
		
	//}
	
//		@And("user_072 click on the Bank Name in Benficiary for web_portal")
//		public void user_click_on_the_bank_name_in_benficiary_for_web_portal() {
//		//us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("Bank_Name"), true);
//		   String xpath ="//ion-label[contains(text(),'"+testData.get("SelectPeriodicity")+"')]";
//		   for (int i = 0; i < 200; i++) {
//				try {
//					if (i==0||i==20||i==40||i==60||i==80||i==100
//							||i==120||i==140||i==140||i==160||i==180||i==199) {
//						us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("ISKAN_Bank"), false);
//					}
//					
//					if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
//						break;
//						}
//					} catch (Exception e) {
//					if (i==199) {
//							Assert.fail(e.getMessage());
//					}
//					}
//				}
//			   
//		   us.clickOnElement(driver, xpath, false);
//		}
		@And("user_072 enter the Beneficiary Bank BVN filed in Benficiary for web_portal")
		public void user_enter_the_beneficiary_bank_bvn_filed_in_benficiary_for_web_portal() {
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Beneficiary_BVN_No"),testData.get("BVN_Number"), true);
		}

		@And("user_072 enter the Account Number in Benficiary for web_portal")
		public void user_enter_the_account_number_in_benficiary_for_web_portal() throws Exception {
			
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Account No_BVN"),testData.get("Account_Number"), true);
		}

		@And("user_072 enter the Currency value in Benficiary for web_portal")
		public void user_enter_the_currency_value_in_benficiary_for_web_portal() {
			//Thread.sleep(3000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Currency_Name"), 30, false);
			
		}
		
		@Given("user_072 select the MVI in Bank Namefor Benficiary for web_portal")
		public void user_select_the_MVI_in_bank_namefor_benficiary_for_web_portal() {
			try {
				us.clickOnElementNoWait(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Select_MRU_Management"), 30,
						false);
			} catch (Exception e) {
				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Currency_Name"), false);

				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Currency_Name"), false);

				us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Select_MRU_Management"),
				false);
				
			}

		}
		

		@And("user_072 enter the Name Of Beneficiary in Benficiary for web_portal")
		public void user_enter_the_name_of_beneficiary_in_benficiary_for_web_portal() {
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Name_Of_Beneficiary_Management"),testData.get("Name_of_Beneficiary"), false);
		}
		
		

		@And("user_072 enter the Country in Benficiary for web_portal")
		public void user_enter_the_country_in_benficiary_for_web_portal() {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Country_Name"), 30, false);
		}
		@Given("user_072 select the Country in Bank Namefor Benficiary for web_portal")
		public void user_select_the_Country_in_bank_namefor_benficiary_for_web_portal() {
			try {
				us.clickOnElementNoWait(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Select_Country_Management"), 30,
						false);
			} catch (Exception e) {
				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Country_Name"), false);

				us.clickOnElement(driver,
						DataReader.locatorsMap.get("OmniScreen_Login").get("Country_Name"), false);

				us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Select_Country_Management"),
				false);
				
			}

		}

		@And("user_072 enter the Moblie Number in Benficiary for web_portal")
		public void user_enter_the_moblie_number_in_benficiary_for_web_portal() {
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Moblie_Number"),testData.get("Moblie_Number_Benficiary"), true);
		}

		@And("user_072 enter the Purpose in Benficiary for web_portal")
		public void user_enter_the_purpose_in_benficiary_for_web_portal() throws InterruptedException {
			Thread.sleep(3000);
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Purpose_Name"),testData.get("Purpose_Beneficiary_Management"), false);
		}

		@And("user_072 click the Next in Benficiary for web_portal")
		public void user_click_the_next_in_benficiary_for_web_portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer"), 
					true);
		}

		@And("user_072 click save button in Benficiary for web_portal")
		public void user_click_save_button_in_benficiary_for_web_portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("SaveBeneficiary_TransfersToOtherBankAccount"), 
					true);
		}

		@And("user_072 click the submit button in Benficiary for web_portal")
		public void user_click_the_submit_button_in_benficiary_for_web_portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 
					true);
		}

	//cards
		@And("user_072 loads the test datasetup for the test case id CRD_013")
		public void user_072_loads_the_test_datasetup_for_the_test_case_id_CRD_013() {
			executionTestData = DataReader.executionTestData.get("CRD_013");
			testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
		}
		@And("user_072 loads the test datasetup for the test case id CRD_014")
		public void user_072_loads_the_test_datasetup_for_the_test_case_id_CRD_014() {
			executionTestData = DataReader.executionTestData.get("CRD_014");
			testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
		}
		@And("^user_072 navigates to the omni_corporate_web_portal_13$")
		public void user_072_NavigatesToTheOmni_Corporate_Web_Portal_13() {
			driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

		}
		
		@And("user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal_13")
		public void user_072_enters_the_maker_checker_username1_in_the_login_page_for_omni_corporate_web_portal_13() {
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
		
		
		@And("user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal_13")
		public void user_072_enters_the_maker_checker_password1_in_the_login_page_for_omni_corporate_web_portal_13() {
			try {
				us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
				
			} catch (Exception e) {
				Assert.fail("password not entered");
			}
		}
		
		
		@And("^user_072 click on the loggin button in the login page for omni_corporate_web_portal_13$")
		public void user_072_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal_13() throws InterruptedException {
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
			@And("^user_072 click on the force logout btn in the login page for omni_corporate_web_portal_13$")
			public void user_072_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal_13() {
				try {
					us.clickOnElementNoWait(driver, 
							DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
							20,
							true);
				} catch (Exception e) {
					
				}
			}
			@And("^user_072 click on the ok button for the successful login page for omni_corporate_web_portal_13$")
			public void user_072_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal_13() {
				us.clickOnElement(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
						true);
			}
		@Given("user_072 Click on the Cards in authentication Matrix")
		public void user_click_on_the_cards_in_authentication_matrix() throws Exception {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"), 
					false);
		}

		@Given("user_072 click on the My Cards in authentication Matrix")
		public void user_click_on_the_my_cards_in_authentication_matrix() throws Exception {
			Thread.sleep(3000);
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"), 
					false);
		}
		@Given("user_072 click on the credit card request in matrix")
		public void user_click_on_the_credit_card_request_in_matrix() {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Creditcards_Blockcard_debit"), 30,
					true);
		}
		@Given("user_072 click on the Active in authentication Matrix")
		public void user_click_on_the_active_in_authentication_matrix() throws InterruptedException {
			Thread.sleep(3000);
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Active_Debitcard"), 
					false);
		}

		@Given("user_072 CLick on the Show Less option in authentication Matrix")
		public void user_c_lick_on_the_show_less_option_in_authentication_matrix() throws Exception {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCard_CreditCards_MyCards_Cards_OmniHomeScreen"), 
					false);
		}
		
		

		@Given("user_072 click on the Block the debit card in authentication Matrix")
		public void user_click_on_the_block_the_debit_card_in_authentication_matrix() throws Exception {
			Thread.sleep(3000);
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("BlockIcon_ActiveCreditCard"), 
					false);
		}

		@Given("user_072 click on the card block reason in authentication Matrix")
		public void user_select_the_card_block_reason_in_authentication_matrix() {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("CardBlockReason_DebitCard"), 30, false);
		}

        @Given("user_072 select the please card block in reason")
        public void user_select_the_please_card_block_in_reason() throws InterruptedException {
        	Thread.sleep(3000);
        	us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Select_CardBlockReason_DebitCard"), 30, false);
        	
        	
        	
//        	Thread.sleep(3000);
//        	try {
//				us.clickOnElementNoWait(driver,
//						DataReader.locatorsMap.get("CardsOmni").get("Block_card_Reason"), 30,
//						false);
//			} catch (Exception e) {
//				us.clickOnElement(driver,
//						DataReader.locatorsMap.get("OmniScreen_Login").get("CardBlockReason_DebitCard"), false);
//
//				us.clickOnElement(driver,
//						DataReader.locatorsMap.get("OmniScreen_Login").get("CardBlockReason_DebitCard"), false);
//
//				us.clickOnElement(driver,
//					DataReader.locatorsMap.get("CardsOmni").get("Block_card_Reason"), false);
//				
//			}
//
		}
        
//		@Given("user_072 click the Next box in authentication Matrix")
//		public void user_click_the_next_box_in_authentication_matrix() throws Exception {
//			us.clickOnElementNoWait(driver,
//					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer"), 30, true);
//		}
        @Given("user_072 click on the Next button in Block Card page")
    	public void user_5679_click_on_the_next_button_in_block_card_page() {
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

		@Given("user_072 click the I agree button in authentication Matrix")
		public void user_click_the_i_agree_button_in_authentication_matrix()  {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Agree_on_teams_conditions"), 30, true);
		}

		@Given("user_072 click the submit button in authentication Matrix")
		public void user_click_the_submit_button_in_authentication_matrix() throws Exception {
			Thread.sleep(3000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 30, true);
		}

		@Given("user_072 enter the OTP in Block card to verify")
		public void user_enter_the_otp_in_block_card_to_verify() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("user_072 click the verify button in block card")
		public void user_click_the_verify_button_in_block_card(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
	
		
		//Transafer
		
		@And("user_0072 loads the test datasetup for the test case id ALR_003")
		public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_ALR_003() {
			executionTestData = DataReader.executionTestData.get("ALR_003");
			testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
		}
		@And("user_0072 loads the test datasetup for the test case id ALR_004")
		public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_ALR_004() {
			executionTestData = DataReader.executionTestData.get("ALR_003");
			testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
		}
		@And("user_0072 loads the test datasetup for the test case id ALR_005")
		public void user_482_loads_the_test_datasetup_for_the_test_case_id_at_ALR_005() {
			executionTestData = DataReader.executionTestData.get("ALR_003");
			testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
		}
		
		@And("^user_0072 navigates to the omni_corporate_web_portal$")
		public void user_0072_NavigatesToTheOmni_Corporate_Web_Portal() {
			driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

		}
		@And("^user_0072 enters the maker username1 in the login page for omni_corporate_web_portal$")
		public void user_0072_EntersTheMakerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
			
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
		@And("^user_0072 enters the maker password1 in the login page for omni_corporate_web_portal$")
		public void user_0072_EntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
			try {
				us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
				
			} catch (Exception e) {
				Assert.fail("password not entered");
			}
			
			
			
		}
		@And("^user_0072 click on the loggin button in the login page for omni_corporate_web_portal$")
		public void user_0072_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
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
		@And("^user_0072 click on the force logout btn in the login page for omni_corporate_web_portal$")
		public void user_0072_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
			try {
				us.clickOnElementNoWait(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
						20,
						true);
			} catch (Exception e) {
				
			}
		}
			
		@And("^user_0072 click on the ok button for the successful login page for omni_corporate_web_portal$")
		public void user_0072_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
					true);
		}
		@And("^user_0072 click on the AMANA payment screen in the homepage in ALR$")
		public void User_482_ClickOnTheAmanaPaymentScreenInTheHomepage_in_ALR() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("AMANAPayments_HomeScreen"), 
					false);
		}
		@And("user_0072 click on the Transafer in AMANA payment screen")
		public void user_click_on_the_transafer_in_amana_payment_screen() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Transfers_AMANAPayments"), 
					false);
		}

		@Given("user_0072 Click on the Transfer to other bank account in Trnasfer screen")
		public void user_click_on_the_transfer_to_other_bank_account_in_trnasfer_screen() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Transfer_Other_Bank_Account_Report"), 
					false);
		}

		@Given("user_0072 Select the From account in Transafer to other bank account")
		public void user_select_the_from_account_in_transafer_to_other_bank_account() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
					true);
		}

		@Given("user_0072 Account in from value in Bank")
		public void user_account_in_from_value_in_bank() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Account_From_Number"), 
					true);
		}

		@Given("user_0072 Select the To Account in Transafer to other bank account")
		public void user_select_the_to_account_in_transafer_to_other_bank_account() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransfersToOtherBankAccount"), 
					true);
		}

		@Given("user_0072 Account To value in Bank")
		public void user_account_to_value_in_bank() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Account_To_Number_value"), 
					true);
		}

		@Given("user_0072 Enter the Amount in Transafer")
		public void user_enter_the_amount_in_transafer() throws InterruptedException {
			Thread.sleep(3000);
			us.enterDataAndEnter(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
					testData.get("Transfer_amount_values"),
					false);
		}
		
		@Given("user_0072 click on the Purpose in transfer account")
		public void user_click_on_the_purpose_in_transfer_account() {
			us.enterDataAndEnter(
					driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
					testData.get("Purpose_Account_Transafer"),
					false);
		}

		@Given("user_0072 click on the Next button in trnasfer account")
		public void user_click_on_the_next_button_in_trnasfer_account() {
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
		

		@Given("user_0072 click on Agree box")
		public void user_click_on_agree_box() {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Agree_on_teams_conditions"), 30, true);
		}

		@Given("user_0072 Click on Submit button in transfer account")
		public void user_click_on_submit_button_in_transfer_account() throws InterruptedException {
			Thread.sleep(6000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 30, true);
		}

		@Given("user_0072 click on the profile Info in ALR")
		public void user_click_on_the_profile_info_in_alr() throws InterruptedException {
			Thread.sleep(3000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Profile_Info_ALR"), 30, false);
		}

		@Given("user_0072 Click on the Active Log in Transafer")
		public void user_click_on_the_active_log_in_transafer() {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("Active_Log_Report_box"), 30, false);
		}

		@Given("user_0072 click on the My Active log Report in profile")
		public void user_click_on_the_my_active_log_report_in_profile() throws InterruptedException {
			Thread.sleep(6000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("MY_Active_log_Report"), 30, false);
		}

		@Given("user_0072 click on the Export button in ALR")
		public void user_click_on_the_export_button_in_alr() throws InterruptedException {
			Thread.sleep(6000);
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("ALR_Export_click"), 30, false);
		}

}
