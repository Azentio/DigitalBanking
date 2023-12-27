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
	@And("^user_5679 click on the TODO icon in homescreen on omni web portal$")
	public void user_5679ClickOnTheTodoIconInHomescreenOnOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen1"), 
				false);
	}
	
	@And("^user_5679 click on the 1st pending item in the list$")
	public void user_5679ClickOnThe1StPendingItemInTheList() throws InterruptedException {
		
		Thread.sleep(30000);
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FirstItemFrmPendingTransferList"), 
				true);
	}
	
	@And("^user_5679 click on the approve btn for the pending transfer request from the maker$")
	public void user_5679ClickOnTheApproveBtnForThePendingTransferRequestFromTheMaker() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ApproveBtnForPendingTransfer"), 
				true);
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

	
@And("user_5679 Click the To other button to non predefined beneficiary under own bank transfer")
public void user_5679click_the_to_other_button_to_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ToOtherBeneficiaryAccountClick"), 
					true);
			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}
}

@And("user_5679 Select the bank to non predefined beneficiary under own bank transfer")
public void user_5679select_the_bank_to_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			
			us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToOtherBeneficiaryAccountClick"), testData.get("Bank"), true);

			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}
}

@And("user_5679 Click and enter the iban_Account number of non predefined beneficiary under own bank transfer")
public void user_5679click_and_enter_the_iban_account_number_of_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			
			us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("enterBeneficiaryAccountNumber"), testData.get("ToAccount1"), true);

			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}
}

@And("user_5679 click the save beneficiary button of non predefined beneficiary under own bank transfer")
public void user_5679click_the_save_beneficiary_button_of_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ownBank_ToOthers_SaveBeneficiary"), 
					true);
			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}
}

@And("user_5679 Enter the test of non predefined beneficiary under own bank transfer")
public void user_5679enter_the_ghanda_test_of_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			
			us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ownBank_ToOthers_GhandaTest"), testData.get("GhandaTest"), true);

			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}
}

@And("user_5679 click and check the I Aggree on terms and condition checkbox of non predefined beneficiary under own bank transfer")
public void user_5679click_and_check_the_i_aggree_on_terms_and_condition_checkbox_of_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 
					true);
			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	} 
} 
@Given("user_5679 click on nextButton of non predefined beneficiary under own bank transfer")
public void user_5679click_on_next_button_of_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ownBank_ToOthers_Second_NextButton"), 
					true);
			break;
		} 
		catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}  
}


@And("user_5679 click the submit button of non predefined beneficiary under own bank transfer")
public void user_5679click_the_submit_button_of_non_predefined_beneficiary_under_own_bank_transfer() {
	for (int i = 0; i < 200; i++) {
		try {
			
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer1"), 
					true);
			break;
		} catch (Exception e) {
			if (i==200)
			{
                   Assert.fail(e.getMessage());

		}
		}
	}  
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
	public void User5679EntersTheMakerUsername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		
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
	@And("^user_5679 enters the maker username2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheMakerUsername2InTheLoginPageForOmni_Corporate_Web_Portal() {
		
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
				testData.get("UserName2"),
				true);
	}
	@And("^user_5679 enters the maker password2 in the login page for omni_corporate_web_portal$")
	public void UserEntersTheMakerPassword2InTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		try {
			us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"), testData.get("Password2"), true);
			
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
			us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
					20,
					true);
		} catch (Exception e) {
			
		}
	}
	
	@And("^user_5679 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void UserClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);
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
		   for (int i = 0; i <2000; i++){
			try{
				  us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
				  us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
				   break;
			} catch (Exception e){
				if (i==1999){
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
	public void user_5679_click_log_out_button() throws Exception {
		us.clickWebElementUsingText(driver,"Logout");
	}
	
	@And("user_5679 loads the test datasetup for the test case id AT_071")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_071() {
		executionTestData = DataReader.executionTestData.get("AT_071_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@Given("user_5679 click the International Transfer under AMANA Payment")
	public void user_5679_click_the_international_transfer_under_amana_payment() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("InternationalTransfer_Transfers_AMANAPaymnets"), false);
	}
	@Given("user_5679 select from account under international bank transfer")
	public void user_5679_select_from_account_under_international_bank_transfer() throws InterruptedException {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), true);
		   String xpath ="//ion-label[contains(text(),'International Transfer')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
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
		   Thread.sleep(6000);
		
	}
	@Given("user_5679 click To other Benefeciary details under international bank transfer")
	public void user_5679_click_to_other_benefeciary_details_under_international_bank_transfer() throws InterruptedException {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("To_otherBeneficiary"), true);
	}
	@Given("user_5679 enter BIC swift code under international bank transfer")
	public void user_5679_enter_bic_swift_code_under_international_bank_transfer() {
		for (int i = 0; i <200; i++) {
			try {
				us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("BicSwiftCode"), testData.get("BicSwiftCode"), true);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Given("user_5679 enter iban Account no under international bank transfer")
	public void user_5679_enter_iban_account_no_under_international_bank_transfer() throws InterruptedException {
		for (int i = 0; i <2000; i++) {
			try {
				us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("IbanAccountNum"), testData.get("IbanAccountNo"), true);
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		
	}
	@Given("user_5679 select beneficiary currency under international bank transfer")
	public void user_5679_select_beneficiary_currency_under_international_bank_transfer() throws Exception { 
		String jsPath ="document.querySelectorAll('ion-label').length";
		int length=0;
		for (int i = 0; i <2000; i++) {
			try {
				 String label = us.executeJavaScriptReturnObject(jsPath).toString();
				 System.out.println(label);
				length = Integer.parseInt(label);
				if (length!=0) {
					System.err.println(length);
					break;
				}
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <length ; i++) {
			String jsPath1 ="document.querySelectorAll('ion-label')["+i+"].innerText";
			String label = us.executeJavaScriptReturnObject(jsPath1).toString();
			System.out.println(label);
			if (label.trim().contentEquals("Beneficiary_currency *")) {
				String jsPath2 ="document.querySelectorAll('ion-label')["+i+"]";
				System.out.println(jsPath2);
				us.clickOnElement(driver, jsPath2, true);
				break;
			}
			
		}
	}
	@Given("user_5679 enter amount under International transfer")
	public void user_5679_enter_amount_under_international_transfer() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_InternationalTransfer"), testData.get("TransferAmount"), true);
	}

	@Given("user_5679 enter purpose under internatioanl transfer")
	public void user_5679_enter_purpose_under_internatioanl_transfer() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("InternationalTransfer_Purpose"), testData.get("PurposeOfTrnx"), true);
	}

	@Given("user_5679 click next button under internatioanl transfer")
	public void user_5679_click_next_button_under_internatioanl_transfer() {
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

	@Given("user_5679 click submit button under internatioanl transfer")
	public void user_5679_click_submit_button_under_internatioanl_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer1"), false);
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
	@And("user_5679 loads the test datasetup for the test case id AT_074")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_074() {
		executionTestData = DataReader.executionTestData.get("AT_074_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@And("user_5679 loads the test datasetup for the test case id AT_073")
	public void user_loads_the_test_datasetup_for_the_test_case_id_at_073() {
		executionTestData = DataReader.executionTestData.get("AT_073_01");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@And("user_5679 click on the own bank transfer under the Transfer")
	public void user_click_on_the_own_bank_transfer_under_the_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("OwnbankTransfers_Transfers_AMANAPaymnets"), false);
	}

	@And("user_5679 click on From account and select the account for own bank transfer")
	public void user_click_on_from_account_and_select_the_account_for_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_ownBankTransfer"), false);
	}
	
	@And("user_5679 loads the test datasetup for the test case id CRD_019")
	public void user_loads_the_test_datasetup_for_the_test_case_id_crd_019() {
		executionTestData = DataReader.executionTestData.get("CRD_019");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	@And("user_5679 loads the test datasetup for the test case id CRD_020")
	public void user_loads_the_test_datasetup_for_the_test_case_id_crd_020() {
		executionTestData = DataReader.executionTestData.get("CRD_020");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	@And("user_5679 loads the test datasetup for the test case id CRD_021")
	public void user_loads_the_test_datasetup_for_the_test_case_id_crd_021() {
		executionTestData = DataReader.executionTestData.get("CRD_021");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	
	@Given("user_5679 click on the My Cards under Cards in the homepage")
	public void user_5679_click_on_the_my_cards_under_cards_in_the_homepage() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"), false);
	    }
	@Given("user_5679 click on the Show More button in Debit cards page")
	public void user_5679_click_on_the_show_more_button_in_debit_cards_page() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCard_CreditCards_MyCards_Cards_OmniHomeScreen"), false);
	    }
	@Given("user_5679 click on the block for block the selected Debit Card")
	public void user_5679_click_on_the_block_to_block_the_selected_debit_card() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("BlockIcon_ActiveCreditCard"), false);
	    }

	@Given("user_5679 click on the Block card reason in Block Card page")
	public void user_5679_click_on_the_block_card_reason_in_block_card_page() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("CardBlockReason_DebitCard"), false);
	    }

	@Given("user_5679 Select the Block card reason in Block Card page")
	public void user_5679_select_the_block_card_reason_in_block_card_page() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Select_CardBlockReason_DebitCard"), false);
	    
	}

	@Given("user_5679 click on the Next button in Block Card page")
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
	@Given("user_5679 click submit button under Block Card page")
	public void user_5679click_submit_button_under_block_card_page() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer1"), false);
	}
	@Given("user_5679 click ok on User privileges in Afer Sumbit")
	public void user_5679click_ok_on_user_privileges_in_afer_sumbit() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
				true);
	 }
	@And("user_5679 loads the test datasetup for the test case id CRD_022")
	public void user_loads_the_test_datasetup_for_the_test_case_id_crd_022() {
		executionTestData = DataReader.executionTestData.get("CRD_022");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	@And("user_5679 loads the test datasetup for the test case id CRD_023")
	public void user_loads_the_test_datasetup_for_the_test_case_id_crd_023() {
		executionTestData = DataReader.executionTestData.get("CRD_023");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	@And("user_5679 loads the test datasetup for the test case id TDO_017")
	public void user_loads_the_test_datasetup_for_the_test_case_id_tdo_017() {
		executionTestData = DataReader.executionTestData.get("TDO_017");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	    }
	@Given("user_5679 click on the From accounts from the transfers for international bank transfer")
	public void user_5679_click_on_the_from_accounts_from_the_transfers_for_international_bank_transfer() {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
				30,
				true);
	    
	}

	@Given("user_5679 selects the from account from the dropdown in transfers for international bank transfer")
	public void user_5679_selects_the_from_account_from_the_dropdown_in_transfers_for_international_bank_transfer() {
		try {
			String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInTransfersToOtherBankAccount"), 
					"TESTDATAVARIABLE", 
					testData.get("FromAccount1"));
			us.clickOnElementNoWait(driver, xpath,30, false);
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
	    

	@Given("user_5679 click on the To accounts from the transfers for international bank transfer")
	public void user_5679_click_on_the_to_accounts_from_the_transfers_for_international_bank_transfer() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_InternationalBankTransfer"), 
				true);
	    
	}

	@Given("user_5679 selects the To account from the dropdown in transfers for international bank transfer")
	public void user_5679_selects_the_to_account_from_the_dropdown_in_transfers_for_international_bank_transfer() {
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectBeneficiaryAccountInTransfersToOtherBankAccount"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
	}
	@And("user_5679 loads the test datasetup for the test case id ALR_002")
	public void user_5679_loads_the_test_datasetup_for_the_test_case_id_alr_002() {
		executionTestData = DataReader.executionTestData.get("ALR_002");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	@Given("user_5679 Click on the Transfer to other bank account in Transfer screen")
	public void user_5679_click_on_the_transfer_to_other_bank_account_in_trnasfer_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Transfer_Other_Bank_Account_Report"), 
				false);
	}

	@Given("user_5679 Select the From account in Transafer to other bank account")
	public void user_5679_select_the_from_account_in_transafer_to_other_bank_account() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
				true);
	}

	@Given("user_5679 Account in from value in Bank")
	public void user_5679_account_in_from_value_in_bank() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Account_From_Number"), 
				true);
	}

	@Given("user_5679 Select the To Account in Transafer to other bank account")
	public void user_5679_select_the_to_account_in_transafer_to_other_bank_account() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransfersToOtherBankAccount"), 
				true);
	}

	@Given("user_5679 Account To value in Bank")
	public void user_5679_account_to_value_in_bank() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Account_To_Number_value"), 
				true);
	}

	@Given("user_5679 Enter the Amount in Transafer")
	public void user_5679_enter_the_amount_in_transafer() throws InterruptedException {
		Thread.sleep(3000);
		us.enterDataAndEnter(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
				testData.get("EnterAmount"),
				false);
	}
	
	@Given("user_5679 click on the Purpose in transfer account")
	public void user_5679click_on_the_purpose_in_transfer_account() {
		us.enterDataAndEnter(
				driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
				testData.get("Purpose_Account_Transafer"),
				false);
	}

	@Given("user_5679 click on the Next button in transfer account")
	public void user_5679_click_on_the_next_button_in_transfer_account() {
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
	

	@Given("user_5679 click on Agree box")
	public void user_5679_click_on_agree_box() {
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("Agree_on_teams_conditions"), 30, true);
	}

	@Given("user_5679 Click on Submit button in transfer account")
	public void user_5679_click_on_submit_button_in_transfer_account() throws InterruptedException {
		Thread.sleep(6000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 30, true);
	}

	@Given("user_5679 click on the profile Info in ALR")
	public void user_5679_click_on_the_profile_info_in_alr() throws InterruptedException {
		Thread.sleep(3000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("Profile_Info_ALR"), 30, false);
	}

	@Given("user_5679 Click on the Active Log in Transfer")
	public void user_5679_click_on_the_active_log_in_transafer() {
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("Active_Log_Report_box"), 30, false);
	}

	@Given("user_5679 click on the My Active log Report in profile")
	public void user_5679_click_on_the_my_active_log_report_in_profile() throws InterruptedException {
		Thread.sleep(6000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("MY_Active_log_Report"), 30, false);
	}

	@Given("user_5679 click on the Export button in ALR")
	public void user_5679_click_on_the_export_button_in_alr() throws InterruptedException {
		Thread.sleep(6000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ALR_Export_click"), 30, false);
	}
	@And("user_5679 loads the test datasetup for the test case id ALR_001")
	public void user_5679_loads_the_test_datasetup_for_the_test_case_id_alr_001() {
		executionTestData = DataReader.executionTestData.get("ALR_002");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	    }
	@Given("user_5679 Get the Time value of the Activity Log Report and verify the value")
	public void user_get_the_time_value_of_the_activity_log_report_and_verify_the_value() {
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
	@And("user_5679 loads the test datasetup for the test case id ALR_006")
	public void user_5679_loads_the_test_datasetup_for_the_test_case_id_alr_006() {
		executionTestData = DataReader.executionTestData.get("ALR_006");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@And("user_5679 loads the test datasetup for the test case id BEN_002")
	public void user_5679_loads_the_test_datasetup_for_the_test_case_id_BEN_002() {
		executionTestData = DataReader.executionTestData.get("BEN_002");
		System.out.println(executionTestData);
		testData =	DataReader.testDataMap.get("CardsOmni").get(executionTestData);
		}
	
	@Given("user_5679 Get The Value of USD in text and verify")
	public void user_get_the_value_of_usd_in_text_and_verify() {
		String OwnBank_USD=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("own_USD_VERIFY"),true);
		   for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(OwnBank_USD.contains("USD"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@Given("user_5679 Get The TO Account Value of USD in text and verify")
	public void user_get_the_to_account_value_of_usd_in_text_and_verify() {
		String OwnBankto_USD=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("own_to_USD_VERIFY"),true);
		   for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(OwnBankto_USD.contains("MRU"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@Given("user_5679 Click on the Transfer to other bank account Under Transfer")
	public void user_click_on_the_transfer_to_other_bank_account_under_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Other_bank_Transfers"), true);
	}
	@Given("user_5679 click on the To accounts from the transfers Other bank accounts")
	public void user_click_on_the_to_accounts_from_the_transfers_other_bank_accounts() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("To_Beneficiary"), true);
	}
	@Given("user_5679 Get The TO Account Value of Other Bank USD in text and verify")
	public void user_get_the_to_account_value_of_other_bank_usd_in_text_and_verify() {
		String OwnBankto_USD=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Other_to_USD_VERIFY"),true);
		   for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(OwnBankto_USD.contains("MRU"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		   }	
	@Given("user_5679 Get The Value of money mru in text and verify")
	public void user_get_the_value_of_money_mru_in_text_and_verify() {
		String OwnBank_USD=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("inter_from_VERIFY"),true);
		   for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(OwnBank_USD.contains("MRU"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		   }
	@Given("user_5679 click on the to account in international transfer")
	public void user_click_on_the_to_account_in_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("inter_beneficiary"), true);
	}
	@Given("user_5679 Get The TO Account Value of International USD in text and verify")
	public void user_5679_get_the_to_account_value_of_international_usd_in_text_and_verify(Integer int1) {
		String OwnBank_USD=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("inter_beneficiary_Select"),true);
		   for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(OwnBank_USD.contains("USD"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@Given("user_5679 Get The Value of Scheduled own Money MRU in text and verify")
	public void user_get_the_value_of_scheduled_own_money_mru_in_text_and_verify() {
		String OwnBank_USD=us.getText(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Scheduled_Own_MRU"),true);
		   for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(OwnBank_USD.contains("MRU"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@Given("user_5679 click Scheduled other bank transfer Under scheduled transfer")
	public void user_click_scheduled_other_bank_transfer_under_scheduled_transfer() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Scheduled_other_bank"), 
				true);
	}
	@Given("user_5679 click from account international transfers")
	public void user_click_from_account_international_transfers() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("International_from_account"), 
				true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
