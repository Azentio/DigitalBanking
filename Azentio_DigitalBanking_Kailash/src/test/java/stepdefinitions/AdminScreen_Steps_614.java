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

public class AdminScreen_Steps_614 {
	
	WebDriver driver = BaseClass.driver;
	
	UserUtility_614 us = new UserUtility_614(driver);
	
	String executionTestData;
	HashMap<String, String> testData;
		
		

	
	
	@Given("^user navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA$")
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
	
	@And("^user loads the test datasetup for the test case id AT_003$")
	public void UserLoadsTheTestDatasetupForTheTestCaseIdAt_003() {
		executionTestData = DataReader.executionTestData.get("AT_003");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user loads the test datasetup for the test case id AT_020")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_020_01() {
		executionTestData = DataReader.executionTestData.get("AT_020");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user loads the test datasetup for the test case id AT_022")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_022() {
		executionTestData = DataReader.executionTestData.get("AT_022_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("user loads the test datasetup for the test case id AT_042")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_042() {
		executionTestData = DataReader.executionTestData.get("AT_042_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	
	@And("^user click on the parameters features in the OmniScreen admin page$")
	public void UserClickOnTheParametersFeaturesInTheOmniscreenAdminPage() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("ParametersLabel_AdminScreen"), false);

	}
	
	@And("^user click on the user management label in the admin screen$")
	public void UserClickOnTheUserManagementLabelInTheAdminScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("UserManagement_ParametersLabel_AdminScreen"), false);
	}
	
	@And("^user click on the cutomer approval matrix feature under the parameters$")
	public void UserClickOnTheCutomerApprovalMatrixFeatureUnderTheParameters() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("Customer_ApprovalMatrix_UserManagement_ParametersLabel"), false);

	}
	@And("^user click on the search icon in the customer approval matrix$")
	public void UserClickOnTheSearchIconInTheCustomerApprovalMatrix() {
		us.clickOnElement(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("searchIcon_Customer_ApprovalMatrix_UserManagement"), false);
	}
	@And("^user enters the approval matrix code in the code field and click on the enter button$")
	public void UserEntersTheApprovalMatrixCodeInTheCodeFieldAndClickOnTheEnterButton() {
		us.enterDataAndEnter(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("approvalMatrixCodeField_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("ApprovalMatrixCode"),
				false);
	}
	@And("^user selects the inputed code from the search result and double click on it$")
	public void UserSelectsTheInputedCodeFromTheSearchResultAndDoubleClickOnIt() {
		String xpath = us.textReplacer(
				DataReader.locatorsMap.get("Omni_Admin").get("selectTheApprovalMatrixCode_approvalMatrixCodeField_Customer_ApprovalMatrix"),
				"TESTDATAVARIABLE",
				testData.get("ApprovalMatrixCode"));
		
		us.doubleClickOnElement(driver, xpath, false);		
	}
	
	@And("^user selects the already defined limit types and delete if anything is already defined$")
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
	@And("^user click on the add button and add the first limit type in the customer approval matrix$")
	public void UserClickOnTheAddButtonAndAddTheFirstLimitTypeInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("addBtn_Customer_ApprovalMatrix_UserManagement_ParametersLabel"), 
				false);
	}
	
	@And("^user click on the limit type and select the range option in customer approval matrix$")
	public void UserClickOnTheLimitTypeAndSelectTheRangeOptionInCustomerApprovalMatrix() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_UserManagement"),
				false);
		
		us.selectFromDropdown(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_SelectDropDown_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("LimitType1"));
	}
	
	@And("^user enter the minimum amount in customer approval matrix for first row$")
	public void UserEnterTheMinimumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("minimumfield_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("MinimumAmount1"), false);
	}
	@And("^user enter the maximum amount in customer approval matrix for first row$")
	public void UserEnterTheMaximumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("maximumfield_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("MaximumAmount1"), false);
	}
	@And("^user enter the group id in customer approval matrix for first row$")
	public void UserEnterTheGroupIdInCustomerApprovalMatrixForFirstRow() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("groupCode_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("GroupCode1"), false);
	}
	@And("^user enter the number of user in the customer approval matrix for first row$")
	public void UserEnterTheNumberOfUserInTheCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("noOfUsers_Customer_ApprovalMatrix_UserManagement"), 
				testData.get("noOfUsers1"), false);
	}
	
	@And("^user click on the save button in the customer approval matrix$")
	public void UserClickOnTheSaveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("saveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);		
	}	
	
	@And("^user click on the ok button for the warning popup in the customer approval matrix$")
	public void UserClickOnTheOkButtonForTheWarningPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	@And("^user click on the ok button for the Success popup in the customer approval matrix$")
	public void UserClickOnTheOkButtonForTheSuccessPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("successPopupOkBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	@And("^user clicks on the approve button in the customer approval matrix$")
	public void UserClicksOnTheApproveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("approveBtn_Customer_ApprovalMatrix_UserManagement"),
				false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("^user navigates to the omni_corporate_web_portal$")
	public void UserNavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("^user enters the maker username1 in the login page for omni_corporate_web_portal$")
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
	

	@And("^user enters the maker password1 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password1"), true);
			
		} catch (Exception e) {
			Assert.fail("password not entered");
		}
		
		
		
	}
	
	@And("^user click on the loggin button in the login page for omni_corporate_web_portal$")
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
	
	@And("^user click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void UserClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
					20,
					true);
		} catch (Exception e) {
			
		}
	}
	
	@And("^user click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void UserClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
				true);
	}
	
	@And("^user click on the AMANA payment screen in the homepage$")
	public void UserClickOnTheAmanaPaymentScreenInTheHomepage() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("AMANAPayments_HomeScreen"), 
				false);
	}
	
	@And("^user click on the transfers under the AMANA payment screen$")
	public void UserClickOnTheTransfersUnderTheAmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Transfers_AMANAPayments"), 
				false);
	}
	
	@And("^user click on the transfers within own accounts under transfer_Amana payment screen$")
	public void UserClickOnTheTransfersWithinOwnAccountsUnderTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransferWithinOwnAccounts_Transfers_AMANAPaymnets"), 
				false);
	}
	
	@And("^user click on the From accounts from the transfers within own accounts$")
	public void UserClickOnTheFromAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user click on the To accounts from the transfers within own accounts$")
	public void UserClickOnTheToAccountsFromTheTransfersWithinOwnAccounts() {
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
	
	@And("user_072 click scheduled transfer under AMANA payment screen")
	public void user_072_click_scheduled_transfer_under_amana_payment_screen() {
	    us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledTransfers_Transfers_AMANA"), false);
	}
	@And("user_072 click scheduled other bank transfer under the AMANA payment screen")
	public void user_072_click_scheduled_other_bank_transfer_under_the_amana_payment_screen_072() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOtherBankTransfer"), 
				false);
	}

	@And("user_072 select from account under scheduled other bank transfer")
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
	@And("user_072 select beneficiary under scheduled other bank transfer")
	public void user_072_select_beneficiary_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Benefi_ScheduledOtherBankTransfer"), true);
	   String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
	   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"' )]";
	   us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
	   us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
	}

	@And("user_072 enter transfer amount under scheduled other bank transfer")
	public void user_072_enter_transfer_amount_under_scheduled_other_bank_transfer() {
	   us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	    
	}

	@And("user_072 enter purpose of transfer under scheduled other bank transfer")
	public void user_072_enter_purpose_of_transfer_under_scheduled_other_bank_transfer() throws InterruptedException {
	   us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
	   Thread.sleep(15000);
	    
	}

	@And("user_072 click next button under scheduled other bank transfer")
	public void user_072_click_next_button_under_scheduled_other_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
			}

	@And("user_072 select periodicity under scheduled other bank transfer")
	public void user_072_select_periodicity_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), false);
	   String xpath ="//ion-label[contains(text(),'"+testData.get("SelectPeriodicity")+"')]";
	   us.clickOnElement(driver, xpath, false);
	    
	}

	@And("user_072 enter number of payments under scheduled other bank transfer")
	public void user_072_enter_number_of_payments_under_scheduled_other_bank_transfer() {
	   us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_ScheduledOtherBankTransfer"),testData.get("NoOfPayments"), true);
	    
	}

	@And("user_072 click submit button under scheduled other bank transfer")
	public void user_072_click_submit_button_under_scheduled_other_bank_transfer() {
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}

	@And("user_072 click ok button for request submitted successfully or request time")
	public void user_072_click_ok_button_for_request_submitted_successfully_or_request_time() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnRequestTimeOut"), true);
	}
	@Given("user click on the international transfers under the Transfers")
	public void user_click_on_the_international_transfers_under_the_transfers() {
		 us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("InternationalTransfer_Transfers_AMANAPaymnets"), false);

	}

	@And("user select from account under international transfers")
	public void user_select_from_account_under_international_transfers() {	
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_InternationalTransfer"), false);
		 String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
			   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"' )]";
			   us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
			   us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
	}

		

	@And("user select beneficiary under international transfer")
	public void user_select_beneficiary_under_international_transfer() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Benefi_internationalTransfer"), false);
	String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
	   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"' )]";
	   us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
	   us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
	
	}

	@And("user enter transfer amount under international transfer")
	public void user_enter_transfer_amount_under_international_transfer() {
		 us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	}

	@And("user enter purpose of transfer under international transfer")
	public void user_enter_purpose_of_transfer_under_international_transfer() throws InterruptedException {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
		  Thread.sleep(15000);
	}

	@And("user click next button under international transfer")
	public void user_click_next_button_under_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
	}

	@And("user click submit button under international transfer")
	public void user_click_submit_button_under_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}

	
	

	
	
	
	
	
	
	
	
	
	

}
