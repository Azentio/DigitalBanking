package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class AccountTransferSteps_612 {

	WebDriver driver = BaseClass.driver;
	 UserUtility_614 us  = new UserUtility_614 (driver);
	 String  ExecutionTestData ;
	 HashMap<String,String>testData;
	 
	 
	 
	 @And("user_612 loads the test datasetup for the test case id AT_002")
	 public void user_loads_the_test_datasetup_for_the_test_case_id_at_02()  {
		 ExecutionTestData = DataReader .executionTestData.get("AT_002");
		 testData =  DataReader.testDataMap.get("AccountTransferOmni").get(ExecutionTestData);
	     
	    
	 }
	 @And("user_612 loads the test datasetup for the test case id AT_005")
	 public void user_loads_the_test_datasetup_for_the_test_case_id_at05()  {
		 ExecutionTestData = DataReader .executionTestData.get("AT_005");
		 testData =  DataReader.testDataMap.get("AccountTransferOmni").get(ExecutionTestData);
	       
	 }
	 @And("user_612 loads the test datasetup for the test case id AT_008")
	 public void user_loads_the_test_datasetup_for_the_test_case_id_at08()  {
		 ExecutionTestData = DataReader .executionTestData.get("AT_008");
		 testData =  DataReader.testDataMap.get("AccountTransferOmni").get(ExecutionTestData);
	       
	 }
	 @And("user_612 loads the test datasetup for the test case id AT_011")
	 public void user_loads_the_test_datasetup_for_the_test_case_id_at011()  {
		 ExecutionTestData = DataReader .executionTestData.get("AT_011");
		 testData =  DataReader.testDataMap.get("AccountTransferOmni").get(ExecutionTestData);
	       
	 }
	 @Given("^user_612 navigates to the omni_corporate_web_portal$")
		public void user_612NavigatesToTheOmni_Corporate_Web_Portal() {
			driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

		}
		
		@And("^user_612 enters the maker user_612name1 in the login page for omni_corporate_web_portal$")
		public void user_612EntersTheMakeruser_612name1InTheLoginPageForOmni_Corporate_Web_Portal() {
			us.enterData(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
					testData.get("UserName1"),
					true);
		}
		

		@And("^user_612 enters the maker password1 in the login page for omni_corporate_web_portal$")
		public void user_612EntersTheMakerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
			us.enterDataAndEnter(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
					testData.get("Password1"),
					true);
		}
		@And("^user_612 enters the maker username1 in the login page for omni_corporate_web_portal$")
		public void user_612EntersTheMakerusername1InTheLoginPageForOmni_Corporate_Web_Portal() {
			us.enterData(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
					testData.get("UserName1"),
					true);
		}
		@And("^user_612 click on the loggin button in the login page for omni_corporate_web_portal$")
		public void user_612ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
			Thread.sleep(5000);
			try {
				us.clickOnElementNoWait(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
						20,
						true);
			} catch (Exception e) {
			}
		}
		
		@And("^user_612 click on the force logout btn in the login page for omni_corporate_web_portal$")
		public void user_612ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
			try {
				us.clickOnElementNoWait(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
						20,
						true);
			} catch (Exception e) {
			}
		}
		
		@And("^user_612 click on the ok button for the successful login page for omni_corporate_web_portal$")
		public void user_612ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), 
					true);
		}
		
		@And("^user_612 click on the AMANA payment screen in the homepage$")
		public void user_612ClickOnTheAmanaPaymentScreenInTheHomepage() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("AMANAPayments_HomeScreen"), 
					false);
		}
		
		@And("^user_612 click on the transfers under the AMANA payment screen$")
		public void user_612ClickOnTheTransfersUnderTheAmanaPaymentScreen() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Transfers_AMANAPayments"), 
					false);
		}
		
		@And("^user_612 click on the transfers within own accounts under transfer_Amana payment screen$")
		public void user_612ClickOnTheTransfersWithinOwnAccountsUnderTransfer_AmanaPaymentScreen() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("TransferWithinOwnAccounts_Transfers_AMANAPaymnets"), 
					false);
		}
		
		@And("^user_612 click on the From accounts from the transfers within own accounts$")
		public void user_612ClickOnTheFromAccountsFromTheTransfersWithinOwnAccounts() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("FromAcc_TransferWithinOwnAccountTransfer"), 
					true);
		}
		
		@And("^user_612 click on the To accounts from the transfers within own accounts$")
		public void user_612ClickOnTheToAccountsFromTheTransfersWithinOwnAccounts() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ToAcc_TransferWithinOwnAccountTransfer"), 
					true);
		}
		
		@And("^user_612 selects the from account from the dropdown in transfers within own accounts$")
		public void user_612SelectsTheFromAccountFromTheDropdownInTransfersWithinOwnAccounts() {
			
			String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectFromAccountInOwnAccountTransfer"), 
					"TESTDATAVARIABLE", 
					testData.get("FromAccount1"));
			us.clickOnElement(driver, xpath, false);
			
		}
		
		@And("^user_612 selects the To account from the dropdown in transfers within own accounts$")
		public void user_612SelectsTheToAccountFromTheDropdownInTransfersWithinOwnAccounts() {
			
			String xpath = us.textReplacer(DataReader.locatorsMap.get("OmniScreen_Login").get("SelectToAccountInOwnAccountTransfer"), 
					"TESTDATAVARIABLE", 
					testData.get("ToAccount1"));
			us.clickOnElement(driver, xpath, false);
			
		}
		
		@And("^user_612 enters the transaction amount in the transfers screen$")
		public void user_612EntersTheTransactionAmountInTheTransfersScreen() {
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"), 
					testData.get("TransferAmount"), 
					false);
			
		}
		
		@And("^user_612 enters the purpose of transaction in the transfers screen$")
		public void user_612EntersThePurposeOfTransactionInTheTransfersScreen() {
			us.enterData(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"), 
					testData.get("PurposeOfTrnx"), 
					false);

		}
		
		@And("^user_612 click on next btn in the transfers screen$")
		public void user_612ClickOnNextBtnInTheTransfersScreen() throws InterruptedException {
			Thread.sleep(5000);
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer"), 
					true);
		}
		
		@And("^user_612 click on submit btn in the transfers screen$")
		public void user_612ClickOnSubmitBtnInTheTransfersScreen() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ClickSubmitBtnInOwnAccountTransfer"), 
					true);
		}
		
		@And("^user_612 enters the checker user_612name1 in the login page for omni_corporate_web_portal$")
		public void user_612EntersTheCheckeruser_612name1InTheLoginPageForOmni_Corporate_Web_Portal() {
			us.enterData(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
					testData.get("UserName2"),
					true);
		}
		
		@And("^user_612 enters the checker password1 in the login page for omni_corporate_web_portal$")
		public void user_612EntersTheCheckerPassword1InTheLoginPageForOmni_Corporate_Web_Portal() {
			us.enterDataAndEnter(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen"),
					testData.get("Password2"),
					true);
		}
		
		@And("^user_612 enters the checker username1 in the login page for omni_corporate_web_portal$")
		public void user_612EntersTheCheckerusername1InTheLoginPageForOmni_Corporate_Web_Portal() {
			us.enterData(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen"),
					testData.get("UserName2"),
					true);
		}
		

		
		@And("^user_612 waits for the confirmation on the submission report$")
		public void user_612WaitsForTheConfirmationOnTheSubmissionReport() throws InterruptedException{
			Thread.sleep(10000);
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
		public void user_612ClicksOnLogoutBtnToLogoutFromOmniWebPortal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb"), 
					true);
		} 
		@And("^user_612 click on the TODO icon in homescreen on omni web portal$")
		public void user_612ClickOnTheTodoIconInHomescreenOnOmniWebPortal() {
			us.clickOnElement(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen"), 
					true);
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

//At008
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
	 
	 
	 //@At011
		@And("^user_612 click on the international bank transfer under transfer_Amana payment screen$")
		public void User_612ClickOnTheInternationalBankTransferUnderTransfer_AmanaPaymentScreen() throws InterruptedException {
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
          	
        	
//        	AT_014
        	
        	@And("^user_612 loads the test datasetup for the test case id AT_014$")
        	public void user_612LoadsTheTestDatasetupForTheTestCaseIdAt_014() {
        		ExecutionTestData = DataReader.executionTestData.get("AT_014");
        		testData =	DataReader.testDataMap.get("AccountTransferOmni").get(ExecutionTestData);
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
        	public void user_612ClickOnThePeriodicityDropdownInScheduledTransfer() {
        		us.clickOnElement(driver, 
        				DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityDropdown_ScheduledTransfer"), 
        				false);
        	}
        	@And("^user_612 click on the single future date from the dropdown in scheduled transfer$")
        	public void user_612ClickOnTheSingleFutureDateFromTheDropdownInScheduledTransfer() {
        		us.clickOnElement(driver, 
        				DataReader.locatorsMap.get("OmniScreen_Login").get("SelectSingleFutureDate_ScheduledTransfer"), 
        				false);
        	}
        	
        	@And("^user_612  click on the I agree to terms and conditions checkbox$")
        	public void user_612ClickOnTheIAgreeToTermsAndConditionsCheckbox() {
        		us.clickOnElement(driver, 
        				DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 
        				false);
        	}
        	
        	@And("^user_612 waits for the confirmation on the submission report for scheduled own account transfer$")
        	public void user_612WaitsForTheConfirmationOnTheSubmissionReportForScheduledOwnAccountTransfer() {
        		us.clickOnElement(driver, 
        				DataReader.locatorsMap.get("OmniScreen_Login").get("ReportConfirmationInScheduledOwnAccountTransfer"), 
        				false);
        	}         	
          	
          	
          	
          	
          	
}
                                                                                                                                                        