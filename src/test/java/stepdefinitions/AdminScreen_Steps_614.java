package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

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
		
		

	
	
	@Given("^user_614 navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA$")
	public void user_614NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials_Rida() {
		
		driver.get(DataReader.configFileMap.get("omni_adminScreen"));
		
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("user_614NameField_LogginScreen"), 
				DataReader.userCredentialsMap.get("VimalAdmin").get("user_614Name"), false);
		
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
	
	@And("^user_614 loads the test datasetup for the test case id AT_003$")
	public void user_614LoadsTheTestDatasetupForTheTestCaseIdAt_003() {
		executionTestData = DataReader.executionTestData.get("AT_003");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	
	@And("^user_614 click on the parameters features in the OmniScreen admin page$")
	public void user_614ClickOnTheParametersFeaturesInTheOmniscreenAdminPage() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("ParametersLabel_AdminScreen"), false);

	}
	
	@And("^user_614 click on the user_614 management label in the admin screen$")
	public void user_614ClickOnTheuser_614ManagementLabelInTheAdminScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("user_614Management_ParametersLabel_AdminScreen"), false);
	}
	
	@And("^user_614 click on the cutomer approval matrix feature under the parameters$")
	public void user_614ClickOnTheCutomerApprovalMatrixFeatureUnderTheParameters() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("Customer_ApprovalMatrix_user_614Management_ParametersLabel"), false);

	}
	@And("^user_614 click on the search icon in the customer approval matrix$")
	public void user_614ClickOnTheSearchIconInTheCustomerApprovalMatrix() {
		us.clickOnElement(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("searchIcon_Customer_ApprovalMatrix_user_614Management"), false);
	}
	@And("^user_614 enters the approval matrix code in the code field and click on the enter button$")
	public void user_614EntersTheApprovalMatrixCodeInTheCodeFieldAndClickOnTheEnterButton() {
		us.enterDataAndEnter(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("approvalMatrixCodeField_Customer_ApprovalMatrix_user_614Management"), 
				testData.get("ApprovalMatrixCode"),
				false);
	}
	@And("^user_614 selects the inputed code from the search result and double click on it$")
	public void user_614SelectsTheInputedCodeFromTheSearchResultAndDoubleClickOnIt() {
		String xpath = us.textReplacer(
				DataReader.locatorsMap.get("Omni_Admin").get("selectTheApprovalMatrixCode_approvalMatrixCodeField_Customer_ApprovalMatrix"),
				"TESTDATAVARIABLE",
				testData.get("ApprovalMatrixCode"));
		
		us.doubleClickOnElement(driver, xpath, false);		
	}
	
	@And("^user_614 selects the already defined limit types and delete if anything is already defined$")
	public void user_614SelectsTheAlreadyDefinedLimitTypesAndDeleteIfAnythingIsAlreadyDefined() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_user_614Management"),
				false);
		
		us.checkAndDeleteRecord(
				driver,
				2,
				DataReader.locatorsMap.get("Omni_Admin").get("noOfRows_customer_ApprovalMatrix_user_614Management"), 
				DataReader.locatorsMap.get("Omni_Admin").get("DeleteBtn_Customer_ApprovalMatrix_user_614Management_ParametersLabel"), 
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_user_614Management")
				);
	}
	@And("^user_614 click on the add button and add the first limit type in the customer approval matrix$")
	public void user_614ClickOnTheAddButtonAndAddTheFirstLimitTypeInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("addBtn_Customer_ApprovalMatrix_user_614Management_ParametersLabel"), 
				false);
	}
	
	@And("^user_614 click on the limit type and select the range option in customer approval matrix$")
	public void user_614ClickOnTheLimitTypeAndSelectTheRangeOptionInCustomerApprovalMatrix() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_user_614Management"),
				false);
		
		us.selectFromDropdown(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_SelectDropDown_Customer_ApprovalMatrix_user_614Management"), 
				testData.get("LimitType1"));
	}
	
	@And("^user_614 enter the minimum amount in customer approval matrix for first row$")
	public void user_614EnterTheMinimumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("minimumfield_Customer_ApprovalMatrix_user_614Management"), 
				testData.get("MinimumAmount1"), false);
	}
	@And("^user_614 enter the maximum amount in customer approval matrix for first row$")
	public void user_614EnterTheMaximumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("maximumfield_Customer_ApprovalMatrix_user_614Management"), 
				testData.get("MaximumAmount1"), false);
	}
	@And("^user_614 enter the group id in customer approval matrix for first row$")
	public void user_614EnterTheGroupIdInCustomerApprovalMatrixForFirstRow() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("groupCode_Customer_ApprovalMatrix_user_614Management"), 
				testData.get("GroupCode1"), false);
	}
	@And("^user_614 enter the number of user_614 in the customer approval matrix for first row$")
	public void user_614EnterTheNumberOfuser_614InTheCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("noOfuser_614s_Customer_ApprovalMatrix_user_614Management"), 
				testData.get("noOfuser_614s1"), false);
	}
	
	@And("^user_614 click on the save button in the customer approval matrix$")
	public void user_614ClickOnTheSaveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("saveBtn_Customer_ApprovalMatrix_user_614Management"),
				false);		
	}	
	
	@And("^user_614 click on the ok button for the warning popup in the customer approval matrix$")
	public void user_614ClickOnTheOkButtonForTheWarningPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_user_614Management"),
				false);
	}
	@And("^user_614 click on the ok button for the Success popup in the customer approval matrix$")
	public void user_614ClickOnTheOkButtonForTheSuccessPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("successPopupOkBtn_Customer_ApprovalMatrix_user_614Management"),
				false);
	}
	@And("^user_614 clicks on the approve button in the customer approval matrix$")
	public void user_614ClicksOnTheApproveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("approveBtn_Customer_ApprovalMatrix_user_614Management"),
				false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("^user_614 navigates to the omni_corporate_web_portal$")
	public void user_614NavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("^user_614 enters the maker user_614name1 in the login page for omni_corporate_web_portal$")
	public void user_614EntersTheMakeruser_614name1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName1"),
				true);
	}
	

	@And("^user_614 enters the maker password1 in the login page for omni_corporate_web_portal$")
	public void user_614EntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password1"),
				true);
	}
	
	@And("^user_614 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void user_614ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		Thread.sleep(5000);
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
					20,
					true);
		} catch (Exception e) {
		}
	}
	
	@And("^user_614 click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void user_614ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
					20,
					true);
		} catch (Exception e) {
		}
	}
	
	@And("^user_614 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void user_614ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
				true);
	}
	
	@And("^user_614 click on the AMANA payment screen in the homepage$")
	public void user_614ClickOnTheAmanaPaymentScreenInTheHomepage() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("AMANAPayments_HomeScreen"), 
				false);
	}
	
	@And("^user_614 click on the transfers under the AMANA payment screen$")
	public void user_614ClickOnTheTransfersUnderTheAmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Transfers_AMANAPayments"), 
				false);
	}
	
	@And("^user_614 click on the transfers within own accounts under transfer_Amana payment screen$")
	public void user_614ClickOnTheTransfersWithinOwnAccountsUnderTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransferWithinOwnAccounts_Transfers_AMANAPaymnets"), 
				false);
	}
	
	@And("^user_614 click on the From accounts from the transfers within own accounts$")
	public void user_614ClickOnTheFromAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_614 click on the To accounts from the transfers within own accounts$")
	public void user_614ClickOnTheToAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_614 selects the from account from the dropdown in transfers within own accounts$")
	public void user_614SelectsTheFromAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("FromAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@And("^user_614 selects the To account from the dropdown in transfers within own accounts$")
	public void user_614SelectsTheToAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectToAccountInOwnAccountTransfer"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@And("^user_614 enters the transaction amount in the transfers screen$")
	public void user_614EntersTheTransactionAmountInTheTransfersScreen() {
		us.enterData(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
				testData.get("TransferAmount"), 
				false);
		
	}
	
	@And("^user_614 enters the purpose of transaction in the transfers screen$")
	public void user_614EntersThePurposeOfTransactionInTheTransfersScreen() {
		us.enterData(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
				testData.get("PurposeOfTrnx"), 
				false);

	}
	
	@And("^user_614 click on next btn in the transfers screen$")
	public void user_614ClickOnNextBtnInTheTransfersScreen() throws InterruptedException {
		Thread.sleep(5000);
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_614 click on submit btn in the transfers screen$")
	public void user_614ClickOnSubmitBtnInTheTransfersScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 
				true);
	}
	
	@And("^user_614 enters the checker user_614name1 in the login page for omni_corporate_web_portal$")
	public void user_614EntersTheCheckeruser_614name1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName2"),
				true);
	}
	
	@And("^user_614 enters the checker password1 in the login page for omni_corporate_web_portal$")
	public void user_614EntersTheCheckerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password2"),
				true);
	}
	
	@And("^user_614 enters the checker user_614name2 in the login page for omni_corporate_web_portal$")
	public void user_614EntersTheCheckeruser_614name2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
				testData.get("UserName3"),
				true);
	}
	
	@And("^user_614 enters the checker password2 in the login page for omni_corporate_web_portal$")
	public void user_614EntersTheCheckerPassword2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
				testData.get("Password3"),
				true);
	}
	
	@And("^user_614 waits for the confirmation on the submission report$")
	public void user_614WaitsForTheConfirmationOnTheSubmissionReport() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOwnAccountTransfer"));
	}
	
	@And("^user_614 waits for the confirmation on the submission report for other bank transfer$")
	public void User_614WaitsForTheConfirmationOnTheSubmissionReportForOtherBankTransfer() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOtherBankTransfer"));
	}
	
	
	@And("^user_614 gets the reference number from the submission report$")
	public void user_614GetsTheReferenceNumberFromTheSubmissionReport() {
		String refNumber = us.getText(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("RefNo_ConfirmationInOwnAccountTransfer"), 
				false);
		System.out.println(refNumber);
	}
	
	@And("^user_614 clicks on logout btn to logout from omni web portal$")
	public void user_614ClicksOnLogoutBtnToLogoutFromOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb"), 
				true);
	}
	
	@And("^user_614 click on the TODO icon in homescreen on omni web portal$")
	public void user_614ClickOnTheTodoIconInHomescreenOnOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen"), 
				true);
	}
	
	@And("^user_614 click on the 1st pending item in the list$")
	public void user_614ClickOnThe1StPendingItemInTheList() throws InterruptedException {
		
		Thread.sleep(30000);
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FirstItemFrmPendingTransferList"), 
				true);
	}
	
	@And("^user_614 click on the approve btn for the pending transfer request from the maker$")
	public void user_614ClickOnTheApproveBtnForThePendingTransferRequestFromTheMaker() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ApproveBtnForPendingTransfer"), 
				true);
	}
	
	@And("^user_614 click on the transfers to other bank accounts under transfer_Amana payment screen$")
	public void User_614ClickOnTheTransfersToOtherBankAccountsUnderTransfer_AmanaPaymentScreen() throws InterruptedException {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransfersToOtherBankAccount_Transfers_AMANAPaymnets"), 
				false);
		
		Thread.sleep(10000);
	}
	@And("^user_614 click on the From accounts from the transfers to other bank accounts$")
	public void User_614ClickOnTheFromAccountsFromTheTransfersToOtherBankAccounts() throws InterruptedException {
		Thread.sleep(5000);
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
				30,
				true);
	}
	@And("^user_614 selects the from account from the dropdown in transfers to other bank accounts$")
	public void User_614SelectsTheFromAccountFromTheDropdownInTransfersToOtherBankAccounts() {
		try {
			String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInTransfersToOtherBankAccount"), 
					"TESTDATAVARIABLE", 
					testData.get("FromAccount1"));
			us.clickOnElement(driver, xpath, false);
		} catch (Exception e) {
			
			us.doubleClickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
					true);
			
			String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInTransfersToOtherBankAccount"), 
					"TESTDATAVARIABLE", 
					testData.get("FromAccount1"));
			us.clickOnElement(driver, xpath, false);
		}
	}
	@And("^user_614 click on the To accounts from the transfers to other bank accounts$")
	public void User_614ClickOnTheToAccountsFromTheTransfersToOtherBankAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransfersToOtherBankAccount"), 
				true);
	}
	@And("^user_614 selects the To account from the dropdown in transfers to other bank accounts$")
	public void User_614SelectsTheToAccountFromTheDropdownInTransfersToOtherBankAccounts() {
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectBeneficiaryAccountInTransfersToOtherBankAccount"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
	}
	
	@And("^user_614 loads the test datasetup for the test case id AT_009$")
	public void User_614LoadsTheTestDatasetupForTheTestCaseIdAt_009() {
		executionTestData = DataReader.executionTestData.get("AT_009");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	
	
	
	
	
	
	

}
