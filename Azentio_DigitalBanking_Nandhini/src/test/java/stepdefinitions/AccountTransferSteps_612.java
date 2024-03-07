package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataprovider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;
import java.io.File;
import org.testng.asserts.SoftAssert;
public class  AccountTransferSteps_612 {
	
	WebDriver driver = BaseClass.driver;
	SoftAssert softAssert = new SoftAssert();
	UserUtility_614 us = new UserUtility_614(driver);
	
	String executionTestData;
	HashMap<String, String> testData;
	
	@Given("^user_612 navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA$")
	public void user_612NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials_Rida() {
		
		driver.get(DataReader.configFileMap.get("omni_adminScreen"));
		
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("user_612NameField_LogginScreen"), 
				DataReader.userCredentialsMap.get("VimalAdmin").get("user_612Name"), false);
		
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
	
	@And("^user_612 loads the test datasetup for the test case id AT_002$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_002() {
		executionTestData = DataReader.executionTestData.get("AT_002");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_IT_001")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_IT_001() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_IT_002")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_IT_002() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_IT_003")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_IT_003() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_IT_004")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_IT_004() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_ST_016")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_ST_016() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_ST_017")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_ST_017() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_ST_014")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_ST_014() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User7180 loads the test datasetup for the test case id AT_ST_015")
    public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_ST_015() {
        executionTestData = DataReader.executionTestData.get("AT_IT_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("^user_612 click on the parameters features in the OmniScreen admin page$")
	public void user_612ClickOnTheParametersFeaturesInTheOmniscreenAdminPage() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("ParametersLabel_AdminScreen"), false);
	}
	
	@And("^user_612 click on the user_612 management label in the admin screen$")
	public void user_612ClickOnTheuser_612ManagementLabelInTheAdminScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("user_612Management_ParametersLabel_AdminScreen"), false);
	}
	
	@And("^user_612 click on the cutomer approval matrix feature under the parameters$")
	public void user_612ClickOnTheCutomerApprovalMatrixFeatureUnderTheParameters() {
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("Customer_ApprovalMatrix_user_612Management_ParametersLabel"), false);

	}
	@And("^user_612 click on the search icon in the customer approval matrix$")
	public void user_612ClickOnTheSearchIconInTheCustomerApprovalMatrix() {
		us.clickOnElement(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("searchIcon_Customer_ApprovalMatrix_user_612Management"), false);
	}
	@And("^user_612 enters the approval matrix code in the code field and click on the enter button$")
	public void user_612EntersTheApprovalMatrixCodeInTheCodeFieldAndClickOnTheEnterButton() {
		us.enterDataAndEnter(
				driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("approvalMatrixCodeField_Customer_ApprovalMatrix_user_612Management"), 
				testData.get("ApprovalMatrixCode"),
				false);
	}
	@And("^user_612 selects the inputed code from the search result and double click on it$")
	public void user_612SelectsTheInputedCodeFromTheSearchResultAndDoubleClickOnIt() {
		String xpath = us.textReplacer(
				DataReader.locatorsMap.get("Omni_Admin").get("selectTheApprovalMatrixCode_approvalMatrixCodeField_Customer_ApprovalMatrix"),
				"TESTDATAVARIABLE",
				testData.get("ApprovalMatrixCode"));
		
		us.doubleClickOnElement(driver, xpath, false);		
	}
	
	@And("^user_612 selects the already defined limit types and delete if anything is already defined$")
	public void user_612SelectsTheAlreadyDefinedLimitTypesAndDeleteIfAnythingIsAlreadyDefined() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_user_612Management"),
				false);
		
		us.checkAndDeleteRecord(
				driver,
				2,
				DataReader.locatorsMap.get("Omni_Admin").get("noOfRows_customer_ApprovalMatrix_user_612Management"), 
				DataReader.locatorsMap.get("Omni_Admin").get("DeleteBtn_Customer_ApprovalMatrix_user_612Management_ParametersLabel"), 
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_user_612Management")
				);
	}
	@And("^user_612 click on the add button and add the first limit type in the customer approval matrix$")
	public void user_612ClickOnTheAddButtonAndAddTheFirstLimitTypeInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("addBtn_Customer_ApprovalMatrix_user_612Management_ParametersLabel"), 
				false);
	}
	
	@And("^user_612 click on the limit type and select the range option in customer approval matrix$")
	public void user_612ClickOnTheLimitTypeAndSelectTheRangeOptionInCustomerApprovalMatrix() {
		
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_Customer_ApprovalMatrix_user_612Management"),
				false);
		
		us.selectFromDropdown(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("limitfield_SelectDropDown_Customer_ApprovalMatrix_user_612Management"), 
				testData.get("LimitType1"));
	}
	
	@And("^user_612 enter the minimum amount in customer approval matrix for first row$")
	public void user_612EnterTheMinimumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("minimumfield_Customer_ApprovalMatrix_user_612Management"), 
				testData.get("MinimumAmount1"), false);
	}
	@And("^user_612 enter the maximum amount in customer approval matrix for first row$")
	public void user_612EnterTheMaximumAmountInCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("maximumfield_Customer_ApprovalMatrix_user_612Management"), 
				testData.get("MaximumAmount1"), false);
	}
	@And("^user_612 enter the group id in customer approval matrix for first row$")
	public void user_612EnterTheGroupIdInCustomerApprovalMatrixForFirstRow() throws InterruptedException {
		Thread.sleep(5000);
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("groupCode_Customer_ApprovalMatrix_user_612Management"), 
				testData.get("GroupCode1"), false);
	}
	@And("^user_612 enter the number of user_612 in the customer approval matrix for first row$")
	public void user_612EnterTheNumberOfuser_612InTheCustomerApprovalMatrixForFirstRow() {
		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("noOfuser_612s_Customer_ApprovalMatrix_user_612Management"), 
				testData.get("noOfuser_612s1"), false);
	}
	
	@And("^user_612 click on the save button in the customer approval matrix$")
	public void user_612ClickOnTheSaveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("saveBtn_Customer_ApprovalMatrix_user_612Management"),
				false);		
	}	
	
	@And("^user_612 click on the ok button for the warning popup in the customer approval matrix$")
	public void user_612ClickOnTheOkButtonForTheWarningPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("warningOkBtn_Customer_ApprovalMatrix_user_612Management"),
				false);
	}
	@And("^user_612 click on the ok button for the Success popup in the customer approval matrix$")
	public void user_612ClickOnTheOkButtonForTheSuccessPopupInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("successPopupOkBtn_Customer_ApprovalMatrix_user_612Management"),
				false);
	}
	@And("^user_612 clicks on the approve button in the customer approval matrix$")
	public void user_612ClicksOnTheApproveButtonInTheCustomerApprovalMatrix() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("approveBtn_Customer_ApprovalMatrix_user_612Management"),
				false);
	}
	
	
	
	@Given("^user_612 navigates to the omni_corporate_web_portal$")
	public void user_612NavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	
	@And("^User7180 enters the maker username1 in the login page for omni_corporate_web_portal$")
	public void user7180_EntersTheMakerusername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),testData.get("UserName1"),false);
		
	}
	

	@And("^User7180 enters the maker password1 in the login page for omni_corporate_web_portal$")
	public void user7180_EntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	}
	
	@And("^user_612 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void user_612ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		Thread.sleep(5000);
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn1"), 
					20,
					false);
		} catch (Exception e) {
		}
	}
	@And("^User7180 click on the loggin button in the login page for omni_corporate_web_portal$")
	public void user7180_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
		us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("LoginBtn2"),true);
         for (int i = 0; i <200; i++) {
		try {
			if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("loginValidation"))).isDisplayed()) {
				break;
			}
		} catch (Exception e) {
			if (i==199) {
				us.clickOnElement(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("LoginBtn2"), 
						true);
			}
	}
}

	}
	
	
	@And("^User7180 click on the force logout btn in the login page for omni_corporate_web_portal$")
	public void user7180_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
		try {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
					false);
		} catch (Exception e) {
//			try {
//				us.clickOnElement(driver, 
//						DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
//						false);
//			} catch (Exception e1) {
//			}
		}
	}
	
	@And("^user_612 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void user_612ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);
		
//		try {
//			us.clickOnElementNoWait(driver, 
//					DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin1"), 
//					45,
//					false);
//		} 
//		
//		catch (Exception e) {
//			try {
//				us.clickOnElementNoWait(driver, 
//						DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin2"),
//						10,
//						false);
//			} catch (Exception X) {
//				try {
//					us.clickOnElementNoWait(driver, 
//							DataReader.locatorsMap.get("OmniScreen_Login").get("SomethingWentWrong_OKbtn_omni"), 
//							20,
//							false);
//				} catch (Exception e11) {
//					
//					try {
//						us.clickOnElementNoWait(driver, 
//								DataReader.locatorsMap.get("OmniScreen_Login").get("SecurityAlert_OKbtn_Omni"), 
//								20,
//								false);
//					} catch (Exception e111) {
//						try {
//							
//							us.clickOnElementNoWait(driver, 
//									DataReader.locatorsMap.get("OmniScreen_Login").get("SessionReloaded_Omni"), 
//									20,
//									false);
//							
//						} catch (Exception e2) {
//							try {								us.clickOnElementNoWait(driver, 
//										DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin1"), 
//										45,
//										false);
//							} 
//							
//							catch (Exception e1111) {
//									us.clickOnElementNoWait(driver, 
//											DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin2"),
//											10,
//											false);
//							
//					}
//				}
//			}
//		}
//		
			//}
		//}
		
	}
	@And("^User7180 click on the ok button for the successful login page for omni_corporate_web_portal$")
	public void user7180_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);
		
	}

	
	@And("^User7180 click on the AMANA payment screen in the homepage$")
	public void user7180_ClickOnTheAmanaPaymentScreenInTheHomepage() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("PaymentforInternationalTransfer"),false);
	}
	
	@And("^User7180 click on the transfers under the AMANA payment screen$")
	public void user7180_ClickOnTheTransfersUnderTheAmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransferunderPayment"), false);
	}
	
	@And("^user_612 click on the transfers within own banks under transfer_Amana payment screen$")
	public void user_612ClickOnTheTransfersWithinOwnBanksUnderTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("OwnbankTransfers_Transfers_AMANAPaymnets"), 
				false);
	}
	
	@And("^user_612 click on the transfers within own accounts under transfer_Amana payment screen$")
	public void user_612ClickOnTheTransfersWithinOwnAccountsUnderTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransferWithinOwnAccounts_Transfers_AMANAPaymnets"), 
				false);
	}
	
	@And("^User7180 click on the From accounts from the transfers within own accounts$")
	public void user7180_ClickOnTheFromAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
		 DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer1"),false);
	}
	
	@And("^User7180 click on the To accounts from the transfers within own accounts$")
	public void user7180_ClickOnTheToAccountsFromTheTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
		  DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer1"),false);
	}
	@And("^User7180 click on the To accounts from the transfers$")
	public void user7180_ClickOnTheToAccountsFromTheTransfers() {
		us.clickOnElement(driver, 
		  DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_InternationalTransfer"),false);
	}
	
	@And("^User7180 selects the from account from the dropdown in transfers within own accounts$")
	public void user7180_SelectsTheFromAccountFromTheDropdownInTransfersWithinOwnAccounts() throws Throwable {
		
//		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInOwnAccountTransfer"), "TESTDATAVARIABLE",
//		testData.get("FromAccount1"));
//		us.clickOnElement(driver, xpath, false);
		us.clickOnElement(driver, 
			DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), false);
	}
	
	@And("^User7180 selects the To account from the dropdown in transfers within own accounts$")
	public void user7180_SelectsTheToAccountFromTheDropdownInTransfersWithinOwnAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Cards").get("Select_ToAccount_InternationalTransfer"), false);
	}
	@And("^User7180 selects the To account from the dropdown in transfers$")
	public void user7180_SelectsTheToAccountFromTheDropdownInTransfers() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Cards").get("ToAccountonOwnBank"), false);
	}
	
	@And("^User7180 enters the transaction amount in the transfers screen$")
	public void user7180_EntersTheTransactionAmountInTheTransfersScreen() throws Throwable {
		Thread.sleep(2000);
		us.enterDataAndTab(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"),
				testData.get("TransferAmount"), false);
		
	}
	
	@And("^User7180 enters the purpose of transaction in the transfers screen$")
	public void user7180_EntersThePurposeOfTransactionInTheTransfersScreen() throws InterruptedException {
		us.enterDataAndTab(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
				testData.get("PurposeOfTrnx"), false);
		Thread.sleep(3000);
	}
	
	@And("^User7180 click on next btn in the transfers screen$")
	public void user7180_ClickOnNextBtnInTheTransfersScreen() throws InterruptedException {
		us.clickOnElement(driver, 
				   DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);
//		for(int i=0;i<200;i++) {
//			try {
//		us.clickOnElement(driver, 
//			   DataReader.locatorsMap.get("Cards").get("Cards_CSS_LCSS_NextButton"),false);
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//	}
	}
	
	@And("^user_612 click on submit btn in the transfers screen$")
	public void user_612ClickOnSubmitBtnInTheTransfersScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer1"),false);
	}
	
	@And("^user_612 enters the checker username1 in the login page for omni_corporate_web_portal$")
	public void user_612EntersTheCheckerusername1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName2"),false);
	}
	
	@And("^user_612 enters the checker password1 in the login page for omni_corporate_web_portal$")
	public void user_612EntersTheCheckerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password2"),false);
	}
	
	@And("^user_612 enters the checker username2 in the login page for omni_corporate_web_portal$")
	public void user_612EntersTheCheckerusername2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName3"),false);
	}
	
	@And("^user_612 enters the checker password2 in the login page for omni_corporate_web_portal$")
	public void user_612EntersTheCheckerPassword2InTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password3"),false);
	}
	
	@And("^user_612 waits for the confirmation on the submission report$")
	public void user_612WaitsForTheConfirmationOnTheSubmissionReport() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOwnAccountTransfer"));
	}
	
	@And("^user_612 waits for the confirmation on the submission report for other bank transfer$")
	public void user_612WaitsForTheConfirmationOnTheSubmissionReportForOtherBankTransfer() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOtherBankTransfer"));
	}
	
	
	@And("^user_612 gets the reference number from the submission report$")
	public void user_612GetsTheReferenceNumberFromTheSubmissionReport() {
		String refNumber = us.getText(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("RefNo_ConfirmationInOwnAccountTransfer"), 
				false);
		System.out.println(refNumber);
	}
	
	@And("^user_612 clicks on logout btn to logout from omni web portal$")
	public void user_612ClicksOnLogoutBtnToLogoutFromOmniWebPortal() throws InterruptedException {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb1"), 
				false);
		Thread.sleep(30000);
	}
	
	@And("^user_612 click on the TODO icon in homescreen on omni web portal$")
	public void user_612ClickOnTheTodoIconInHomescreenOnOmniWebPortal() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen1"), 
				false);
	}
	
	@And("^user_612 click on the 1st pending item in the list$")
	public void user_612ClickOnThe1StPendingItemInTheList() throws InterruptedException {
		
		Thread.sleep(30000);
		
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FirstItemFrmPendingTransferList"), 
				true);
	}
	
	@And("^user_612 click on the approve btn for the pending transfer request from the maker$")
	public void user_612ClickOnTheApproveBtnForThePendingTransferRequestFromTheMaker() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ApproveBtnForPendingTransfer"), 
				true);
	}
	
	@And("^user_612 click on the transfers to other bank accounts under transfer_Amana payment screen$")
	public void user_612ClickOnTheTransfersToOtherBankAccountsUnderTransfer_AmanaPaymentScreen() throws InterruptedException {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("TransfersToOtherBankAccount_Transfers_AMANAPaymnets"), 
				false);
		
		Thread.sleep(10000);
	}
	@And("^user_612 click on the From accounts from the transfers to other bank accounts$")
	public void user_612ClickOnTheFromAccountsFromTheTransfersToOtherBankAccounts() throws InterruptedException {
		Thread.sleep(5000);
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
				30,
				true);
	}
	@And("^user_612 selects the from account from the dropdown in transfers to other bank accounts$")
	public void user_612SelectsTheFromAccountFromTheDropdownInTransfersToOtherBankAccounts() {
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
	@And("^user_612 click on the To accounts from the transfers to other bank accounts$")
	public void user_612ClickOnTheToAccountsFromTheTransfersToOtherBankAccounts() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransfersToOtherBankAccount"), 
				true);
	}
	@And("^user_612 selects the To account from the dropdown in transfers to other bank accounts$")
	public void user_612SelectsTheToAccountFromTheDropdownInTransfersToOtherBankAccounts() {
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectBeneficiaryAccountInTransfersToOtherBankAccount"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
	}
	
	@And("^user_612 loads the test datasetup for the test case id AT_005$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_005() {
		executionTestData = DataReader.executionTestData.get("AT_005");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	@And("^user_612 loads the test datasetup for the test case id AT_008$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_008() {
		executionTestData = DataReader.executionTestData.get("AT_008");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("^user_612 loads the test datasetup for the test case id AT_058$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_058() {
		executionTestData = DataReader.executionTestData.get("AT_058");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	@And("^user_612 loads the test datasetup for the test case id AT_011$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_011() {
		executionTestData = DataReader.executionTestData.get("AT_011");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	@And("^user_612 loads the test datasetup for the test case id AT_034$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_034() {
		executionTestData = DataReader.executionTestData.get("AT_034");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	@And("^user_612 loads the test datasetup for the test case id AT_039$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_039() {
		executionTestData = DataReader.executionTestData.get("AT_039");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("^user_612 loads the test datasetup for the test case id AT_044$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_044() {
		executionTestData = DataReader.executionTestData.get("AT_044");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("^user_612 loads the test datasetup for the test case id AT_047$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_047() {
		executionTestData = DataReader.executionTestData.get("AT_047");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	@And("^user_612 click on the international bank transfer under transfer_Amana payment screen$")
	public void user_612ClickOnTheInternationalBankTransferUnderTransfer_AmanaPaymentScreen() throws InterruptedException {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("InternationalTransfer_Transfers_AMANAPaymnets"), 
				false);
		
		Thread.sleep(10000);
	}
	
	
	
	@And("^user_612 click on the From accounts from the transfers for international bank transfer$")
	public void user_612ClickOnTheFromAccountsFromTheTransfersForInternationalBankTransfer() throws InterruptedException {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransfersToOtherBankAccount"), 
				30,
				true);
	}
	@And("^user_612 selects the from account from the dropdown in transfers for international bank transfer$")
	public void user_612SelectsTheFromAccountFromTheDropdownInTransfersForInternationalBankTransfer() {
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
	@And("^user_612 click on the To accounts from the transfers for international bank transfer$")
	public void user_612ClickOnTheToAccountsFromTheTransfersForInternationalBankTransfer() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_InternationalBankTransfer"), 
				true);
	}
	@And("^user_612 selects the To account from the dropdown in transfers for international bank transfer$")
	public void user_612SelectsTheToAccountFromTheDropdownInTransfersForInternationalBankTransfer() {
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectBeneficiaryAccountInTransfersToOtherBankAccount"), 
				"TESTDATAVARIABLE", 
				testData.get("ToAccount1"));
		us.clickOnElement(driver, xpath, false);
	}
	
	@And("^user_612 waits for the confirmation on the submission report for international bank transfer$")
	public void user_612WaitsForTheConfirmationOnTheSubmissionReportForInternationalBankTransfer() {
		us.elementIsVisible(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInInternationalBankTransfer"));
	}
	
//	AT_014
	
	@And("^user_612 loads the test datasetup for the test case id AT_014$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_014() {
		executionTestData = DataReader.executionTestData.get("AT_014");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	@And("^user_612 click on the scheduled transfers under the AMANA payment screen$")
	public void user_612ClickOnTheScheduledTransfersUnderTheAmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledTransfers_Transfers_AMANA"), 
				false);
	}
	
	@And("^user_612 click on the scheduled transfers within own accounts under scheduled transfer_Amana payment screen$")
	public void user_612ClickOnTheScheduledTransfersWithinOwnAccountsUnderScheduledTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("OwnAccountTransfer_ScheduledTransfers_Transfers_AMANA"), 
				false);
	}
	
	@And("^user_612 click on the periodicity dropdown in scheduled transfer$")
	public void user_612ClickOnThePeriodicityDropdownInScheduledTransfer() throws InterruptedException {
		Thread.sleep(3000);
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), 
				30,
				false);
		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"),30, false);
	
				    
	}
	@And("^user_612 click on the single future date from the dropdown in scheduled transfer$")
	public void user_612ClickOnTheSingleFutureDateFromTheDropdownInScheduledTransfer() {
				
		//us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransf
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("SelectSingleFutureDate_ScheduledTransfer"), 
					30,
					false);
		} catch (Exception e) {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), 
					false);
			
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), 
					false);
			
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("SelectSingleFutureDate_ScheduledTransfer"), 
					false);
			
		}
	}
	
	@And("^user_612  click on the I agree to terms and conditions checkbox$")
	public void user_612ClickOnTheIAgreeToTermsAndConditionsCheckbox() {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 
					30,
					false);
			
			Thread.sleep(5000);
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer1"), 
					false);
			
		} catch (Exception e) {
			
		}
	}
	
	@And("^user_612 waits for the confirmation on the submission report for scheduled own account transfer$")
	public void user_612WaitsForTheConfirmationOnTheSubmissionReportForScheduledOwnAccountTransfer() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInScheduledOwnAccountTransfer"), false);
	}
	@And("^user_612 waits for the confirmation on the submission report for own bank transfer$")
	public void User_612WaitsForTheConfirmationOnTheSubmissionReportForOwnBankTransfer() {
		us.elementIsVisible(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInOwnBankTransfer"));
	}
	
//	AT_017
	
	@And("^user_612 loads the test datasetup for the test case id AT_017$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_017() {
		executionTestData = DataReader.executionTestData.get("AT_017");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}
	
	@And("^user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen$")
	public void user_612ClickOnTheScheduledTransfersWithinOwnBankTransferUnderScheduledTransfer_AmanaPaymentScreen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnBankTransfer_ScheduledTransfer"), false);
	}
	//024
	@And("^user_612 loads the test datasetup for the test case id AT_024$")
	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_024() {
		executionTestData = DataReader.executionTestData.get("AT_024");
		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(executionTestData);
	}

	@Given("User7180 click on the international transfers under the Transfers")
	public void user7180_click_on_the_international_transfers_under_the_transfers() throws Throwable {
		 us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("InternationalTransfer_Transfers_AMANAPaymnets"), false);
	}
	
	@Given("User7180 verify the From Accounts in International transfer screen")
	public void user7180_verify_the_from_accounts_in_international_transfer_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_InternationalTransfer"));	
		}

	@Given("User7180 verify the To Accounts in International transfer screen")
	public void user7180_verify_the_to_accounts_in_international_transfer_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_InternationalTransfer"));
	}

//	@Given("User7180 verify the Currency in International transfer screen")
//	public void user7180_verify_the_currency_in_international_transfer_screen() {
//		us.elementIsVisible(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer1"));
//	}

	@Given("User7180 verify the Amount in International transfer screen")
	public void user7180_verify_the_amount_in_international_transfer_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_Amount"));
	}

	@Given("User7180 verify the Purpose in International transfer screen")
	public void user7180_verify_the_purpose_in_international_transfer_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("Purpose_InternationalTransfer"));
		}

//	@Given("User7180 verify the Exchange Amount in International transfer screen")
//	public void user7180_verify_the_exchange_amount_in_international_transfer_screen() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Given("User7180 verify the To Beneficiary seg in International transfer screen")
	public void user7180_verify_the_to_beneficiary_seg_in_international_transfer_screen() {
		//us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToBeneficiary"));
	}
	@Given("User7180 verify the To other in International transfer screen")
	public void user7180_verify_the_to_other_in_international_transfer_screen() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther"));
	}


	@And("user_612 select from account under international transfers")
	public void user_select_from_account_under_international_transfers() {	
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_InternationalTransfer"), false);
		 String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
			   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"' )]";
			   us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
			   us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
	}

		

	@And("user_612 select beneficiary under international transfer")
	public void user_select_beneficiary_under_international_transfer() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Benefi_internationalTransfer"), false);
	String xpath ="//ion-label[contains(text(),' Scheduled Other Bank Transfer ')]/ancestor::div[@id='main-header']/following-sibling::div[@id='main-content']"
	   		+ "//ion-label[contains(text(),'"+testData.get("ToAccount1")+"' )]";
	   us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
	   us.doubleClickOnElement(driver, driver.findElement(By.xpath(xpath)));
	
	}

	@And("user_612 enter transfer amount under international transfer")
	public void user_enter_transfer_amount_under_international_transfer() {
		 us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	}

	@And("user_612 enter purpose of transfer under international transfer")
	public void user_enter_purpose_of_transfer_under_international_transfer() throws InterruptedException {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
		  Thread.sleep(15000);
	}

	@And("user_612 click next button under international transfer")
	public void user_click_next_button_under_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
	}

	@And("user_612 click submit button under international transfer")
	public void user_click_submit_button_under_international_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}
  	
////At44

	@And("user_612 click scheduled transfer under AMANA payment screen")
	public void user_612_click_scheduled_transfer_under_amana_payment_screen() {
	    us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledTransfers_Transfers_AMANA"), false);
	}
	@And("user_612 click Scheduled own bank transfer Under scheduled transfer")
	public void user_click_scheduled_own_bank_transfer_under_scheduled_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnBankTransfer_ScheduledTransfer"), false);
		
	}

	@And("user_612 select from account under Scheduled own bank transfer")
	public void user_612_select_from_account_under_scheduled_own_bank_transfer() {
//		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), false);
//		String xpath ="//ion-label[contains(text(),'"+testData.get("FromAccount1")+"')]";
//		 //us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
//		 us.clickOnElement(driver, driver.findElement(By.xpath(xpath)));
//		
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("sched_ownAccountTransfer_from"), 
				"TESTDATAVARIABLE", 
				testData.get("FromAccount1"));
		us.clickOnElement(driver, xpath, false);
		
	}
	
	@Given("user_612 click on beneficiary under Scheduled own bank transfer")
	public void user_612_click_on_beneficiary_under_scheduled_own_bank_transfer( ) {
					us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Sch_ownAccounTransfer_Beneficiary"), false);
	    
	}

	@And("user_612 select beneficiary under Scheduled own bank transfer")
	public void user_select_beneficiary_under_scheduled_own_bank_transfer() {
//		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer"), true);
//		String xpath ="//ion-label[contains(text(),'"+testData.get("ToAccount1")+"')]";
//		 us.scrollDownTillElement(driver, driver.findElement(By.xpath(xpath)));
//		 us.clickOnElement(driver, driver.findElement(By.xpath(xpath)));
		String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("Sch_ownAccounTransfer_Beneficiary_toAcc"), 
				"TESTDATAVARIABLE", 
				testData.get("FromAccount1"));
		us.clickOnElement(driver, xpath, false);
	}

	@And("user_612 enter transfer amount under Scheduled own bank transfer")
	public void user_612_enter_transfer_amount_under_scheduled_own_bank_transfer() {
		 us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Amount_ScheduledOtherBankTransfer"), testData.get("TransferAmount"), true);
	}

	@And("user_612 enter purpose of transfer under Scheduled own bank transfer")
	public void user_enter_purpose_of_transfer_under_scheduled_own_bank_transfer() throws InterruptedException   {
		us.enterData(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), testData.get("PurposeOfTrnx"), false);
		  Thread.sleep(3000);
	}

	@And("user_612 click next button under Scheduled own bank transfer")
	public void user_612_click_next_button_under_scheduled_own_bank_transfer() throws InterruptedException {
		  Thread.sleep(5000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PurposeNXT_ScheduledOtherBankTransfer"), false);
	}

	@And("user_612 click submit button under Scheduled own bank transfer")
	public void user612_click_submit_button_under_scheduled_own_bank_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}
	@Given("user_612 select periodicity under scheduled own bank transfer")
	public void user_612_select_periodicity_under_scheduled_own_bank_transfer( ) {
		 
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

	@Given("user_612 enter number of payments under scheduled own bank transfer")
	public void user_612_enter_number_of_payments_under_scheduled_own_bank_transfer( ) {
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
	@And("user_612 click submit button under scheduled own bank transfer")
	public void user_612_click_submit_button_under_scheduled_own_bank_transfer() {
	   us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("NoOfPayments_SUB_ScheduledOtherBankTransfer"), true);
	}

	@And("user_612 click ok button for request submitted successfully or request time")
	public void user_612_click_ok_button_for_request_submitted_successfully_or_request_time() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnRequestTimeOut"), true);
	}
//	@Given("user_612 click ok button for request submitted successfully or request time")
//	public void user_click_ok_button_for_request_submitted_successfully_or_request_time( ) {
//	    
//	   
//	}
	
	@And("^user_614 click on the periodicity dropdown in scheduled transfer$")
	public void User_614ClickOnThePeriodicityDropdownInScheduledTransfer() throws InterruptedException {
		Thread.sleep(3000);
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), 30, false);
	}

	@And("^user_614 click on the single future date from the dropdown in scheduled transfer$")
	public void User_614ClickOnTheSingleFutureDateFromTheDropdownInScheduledTransfer() {

		try {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("SelectSingleFutureDate_ScheduledTransfer"), 30,
					false);
		} catch (Exception e) {
			us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), false);

			us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), false);

			us.clickOnElement(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("SelectSingleFutureDate_ScheduledTransfer"),
					false);

		}
	}

	
	@And("user_612 Click the To other button to non predefined beneficiary under own bank transfer")
	public void user_612click_the_to_other_button_to_non_predefined_beneficiary_under_own_bank_transfer() {
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

	@And("user_612 Select the bank to non predefined beneficiary under own bank transfer")
	public void user_612select_the_bank_to_non_predefined_beneficiary_under_own_bank_transfer() {
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

	@And("user_612 Click and enter the iban_Account number of non predefined beneficiary under own bank transfer")
	public void user_612click_and_enter_the_iban_account_number_of_non_predefined_beneficiary_under_own_bank_transfer() {
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

	@And("user_612 click the save beneficiary button of non predefined beneficiary under own bank transfer")
	public void user_612click_the_save_beneficiary_button_of_non_predefined_beneficiary_under_own_bank_transfer() {
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

	@And("user_612 Enter the ghanda test of non predefined beneficiary under own bank transfer")
	public void user_612enter_the_ghanda_test_of_non_predefined_beneficiary_under_own_bank_transfer() {
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

	@And("user_612 click and check the I Aggree on terms and condition checkbox of non predefined beneficiary under own bank transfer")
	public void user_612click_and_check_the_i_aggree_on_terms_and_condition_checkbox_of_non_predefined_beneficiary_under_own_bank_transfer() {
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
	@Given("user_612 click on nextButton of non predefined beneficiary under own bank transfer")
	public void user_612click_on_next_button_of_non_predefined_beneficiary_under_own_bank_transfer() {
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
	

	@And("user_612 click the submit button of non predefined beneficiary under own bank transfer")
	public void user_612click_the_submit_button_of_non_predefined_beneficiary_under_own_bank_transfer() {
		
		
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
	@Given("User7180 Validate the To Account under summary in International Transfer")
	public void user7180_validate_the_to_account_under_summary_in_international_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ToAccount_InternationalTransfer_summary"));
	}
	@Given("User7180 Click the cancel button in Draft screen")
	public void user7180_click_the_cancel_button_in_draft_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Cards").get("CreditCardDetails_PinChange_CancelButton"), false);
	}

	@Given("User7180 Verify the Internal Ref in submission screen")
	public void user7180_verify_the_internal_ref_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("InternalRef_ScheduledTransfer"));
	}

	@Given("User7180 Verify the Transfer From in submission screen")
	public void user7180_verify_the_transfer_from_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Transferredfrom"));
	}

	@Given("User7180 Verify the Transfer To in Submission screen")
	public void user7180_verify_the_transfer_to_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_TransferredTO"));
	}

	@Given("User7180 Verify the Amount in Submission screen")
	public void user7180_verify_the_amount_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Amount"));
	}

	@Given("User7180 Verify the Currency in Submission screen")
	public void user7180_verify_the_currency_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Currency"));
	}

	@Given("User7180 Verify the Purpose in Submission screen")
	public void user7180_verify_the_purpose_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Purpose"));
	}

	@Given("User7180 Verify the Send to Self in Submission screen")
	public void user7180_verify_the_send_to_self_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SendToSelf"));
	}

	@Given("User7180 Verify the Export in Submission screen")
	public void user7180_verify_the_export_in_submission_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_EXport"));
	}
	@Given("User7180 click the Export in Submission screen")
	public void user7180_click_the_export_in_submission_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_EXport"), false);
	}

	@Given("User7180 Verify the PDF in Export screen")
	public void user7180_verify_the_pdf_in_export_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Pdf"));
	}

	@Given("User7180 Verify the Excel in Export screen")
	public void user7180_verify_the_excel_in_export_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Excel"));
	}

	@Given("User7180 Verify the Cancel in Export screen")
	public void user7180_verify_the_cancel_in_export_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Cancel"));
	}

	@Given("User7180 click the Excel in Export screen")
	public void user7180_click_the_excel_in_export_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Excel"), false);
	}
	@Given("User7180 click the PDF in Export screen")
	public void user7180_click_the_pdf_in_export_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("SubReport_Pdf"), false);
	}
	@Given("User7180 Verify the system should have the downloaded excel file")
	public void user7180_verify_the_system_should_have_the_downloaded_excel_file() throws Throwable{
		String homepath=System.getProperty("user.home");
		String filePath = homepath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("MorginMoneyDataFile_export_")) {
				//System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("International Transfer"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
		
	}

	@Given("User7180 Click the Send to Self in Submission screen")
	public void user7180_click_the_send_to_self_in_submission_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("SendToSelf"), false);
	}
	@Given("User7180 click on Own Bank Transfer under Payment screen")
	public void user7180_click_on_own_bank_transfer_under_payment_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("OwnBankTransfer_Payment"),false);
	}
	@Given("User7180 click the From Bank in Own Bank Transfer screen")
	public void user7180_click_the_from_bank_in_own_bank_transfer_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Cards").get("DropdownArrow"),false);
	}

	@Given("User7180 select the Account in Own Bank Transfer screen")
	public void user7180_select_the_account_in_own_bank_transfer_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), false);
	}
	@Given("User7180 select the Zero Balance Account in Own Bank Transfer screen")
	public void user7180_select_the_zero_balance_account_in_own_bank_transfer_screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ZeroBalanceAccount"), false);
	}


	@Given("User7180 Enter the Iban Account Number in Own Bank Transfer screen")
	public void user7180_enter_the_iban_account_number_in_own_bank_transfer_screen() {
		us.enterDataAndEnter(driver, 
		  DataReader.locatorsMap.get("OmniScreen_Login").get("AccountNo_TransfersToOtherBankAccount"), 
		  testData.get("TransferAmount"),false);
	}

	@Given("User7180 verify the Enter the value popup")
	public void user7180_verify_the_enter_the_value_popup() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Validate_okPopUp"));
	}
	@Given("User7180 validate the Iban Account Number in Own Bank transfer screen")
	public void user7180_validate_the_iban_account_number_in_own_bank_transfer_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("AccountNo_TransfersToOtherBankAccount"));
	}
	@Given("User7180 Enter the purpose in Own Bank Transfer screen")
	public void user7180_enter_the_purpose_in_own_bank_transfer_screen() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_purpose"),
					testData.get("Purpose_Account_Transafer"),false);
	}
	@Given("User7180 validate the invalid value popup in Own Bank Transfer screen")
	public void user7180_validate_the_invalid_value_popup_in_own_bank_transfer_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ValueMissing_forValidation"));
	}
	@Given("User7180 verify the Beneficiary currency in Own Bank Transfer screen")
	public void user7180_verify_the_beneficiary_currency_in_own_bank_transfer_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BeneficiaryCurrency_ownBankTransfer"));
	}
	@Given("User7180 verify the Recipient Name in Own Bank Transfer screen")
	public void user7180_verify_the_recipient_name_in_own_bank_transfer_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RecipientName"));
	}
}
