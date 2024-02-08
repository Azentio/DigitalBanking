Feature: To verify the functionalities on International Transfer

  @AT_IT_001
  Scenario: To Verify the functionality of previous button  in corporate user
    And User7180 loads the test datasetup for the test case id AT_IT_001
    Given User7180 navigates to the omni_corporate_web_portal
    #And User7180 enters the Corpusername in the login page for omni_corp_portal
    #And User7180 enters the Corppassword in the login page for omni_corp_portal
    #And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 enters the maker username1 in the login page for omni_corporate_web_portal
    And User7180 enters the maker password1 in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 click on the AMANA payment screen in the homepage
    And User7180 click on the transfers under the AMANA payment screen
    And User7180 click on the international transfers under the Transfers
    And User7180 verify the From Accounts in International transfer screen
    And User7180 verify the To Accounts in International transfer screen
    #And User7180 verify the Currency in International transfer screen
    And User7180 verify the Amount in International transfer screen
    And User7180 verify the Purpose in International transfer screen
    #And User7180 verify the Exchange Amount in International transfer screen
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Validate the Save Button in Local credit card settlement
    And User7180 Validate the To beneficiary segement in Local credit card settlement
    And User7180 Validate the To other in Local credit card settlement
    #And User7180 verify the To Beneficiary seg in International transfer screen
    #And User7180 verify the To other in International transfer screen
    And User7180 click on the From accounts from the transfers within own accounts
    And User7180 selects the from account from the dropdown in transfers within own accounts
    And User7180 click on the To accounts from the transfers within own accounts
    And User7180 selects the To account from the dropdown in transfers within own accounts
    And User7180 enters the transaction amount in the transfers screen
    And User7180 enters the purpose of transaction in the transfers screen
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the From Account under summary in Local credit card settlement
    And User7180 Validate the To Account under summary in International Transfer
    And User7180 Validate the Amount under summary in Local credit card settlement
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 click the previous button display or not
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_IT_002
  Scenario: To Verify the functionality of Submit button  in corporate user
    And User7180 loads the test datasetup for the test case id AT_IT_002
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username1 in the login page for omni_corporate_web_portal
    And User7180 enters the maker password1 in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 click on the AMANA payment screen in the homepage
    And User7180 click on the transfers under the AMANA payment screen
    And User7180 click on the international transfers under the Transfers
    And User7180 click on the From accounts from the transfers within own accounts
    And User7180 selects the from account from the dropdown in transfers within own accounts
    And User7180 click on the To accounts from the transfers within own accounts
    And User7180 selects the To account from the dropdown in transfers within own accounts
    And User7180 enters the transaction amount in the transfers screen
    And User7180 enters the purpose of transaction in the transfers screen
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 verify the draft title is display or Not
    And User7180 verify the submit button is displaying or not
    And User7180 verify the cancel button is displaying or not
    And User7180 Click the cancel button in Draft screen
    And User7180 Click on sumbit button Save the Data
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_IT_003
  Scenario: To Verify the PDF file in corporate user
    And User7180 loads the test datasetup for the test case id AT_IT_003
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username1 in the login page for omni_corporate_web_portal
    And User7180 enters the maker password1 in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 click on the AMANA payment screen in the homepage
    And User7180 click on the transfers under the AMANA payment screen
    And User7180 click on the international transfers under the Transfers
    And User7180 click on the From accounts from the transfers within own accounts
    And User7180 selects the from account from the dropdown in transfers within own accounts
    And User7180 click on the To accounts from the transfers within own accounts
    And User7180 selects the To account from the dropdown in transfers within own accounts
    And User7180 enters the transaction amount in the transfers screen
    And User7180 enters the purpose of transaction in the transfers screen
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 verify the draft title is display or Not
    And User7180 verify the submit button is displaying or not
    And User7180 verify the cancel button is displaying or not
    And User7180 Click the cancel button in Draft screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Verify the Internal Ref in submission screen
    And User7180 Verify the Transfer From in submission screen
    And User7180 Verify the Transfer To in Submission screen
    And User7180 Verify the Amount in Submission screen
    And User7180 Verify the Currency in Submission screen
    And User7180 Verify the Purpose in Submission screen
    And User7180 Verify the Send to Self in Submission screen
    And User7180 Verify the Export in Submission screen
    And User7180 click the Export in Submission screen
    And User7180 Verify the PDF in Export screen
    And User7180 Verify the Excel in Export screen
    And User7180 Verify the Cancel in Export screen
    And User7180 click the PDF in Export screen
    And User7180 Verify the system should have the downloaded excel file

  @AT_IT_004
  Scenario: To Verify the PDF file in corporate user
    And User7180 loads the test datasetup for the test case id AT_IT_004
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username1 in the login page for omni_corporate_web_portal
    And User7180 enters the maker password1 in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 click on the AMANA payment screen in the homepage
    And User7180 click on the transfers under the AMANA payment screen
    And User7180 click on the international transfers under the Transfers
    And User7180 click on the From accounts from the transfers within own accounts
    And User7180 selects the from account from the dropdown in transfers within own accounts
    And User7180 click on the To accounts from the transfers within own accounts
    And User7180 selects the To account from the dropdown in transfers within own accounts
    And User7180 enters the transaction amount in the transfers screen
    And User7180 enters the purpose of transaction in the transfers screen
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Export in Submission screen
    And User7180 click the Excel in Export screen
    And User7180 Verify the system should have the downloaded excel file
    And User7180 Click the Send to Self in Submission screen
    And User7180 Verify the PDF in Export screen
    And User7180 Verify the Excel in Export screen
    And User7180 Verify the Cancel in Export screen
    And User7180 Click the cancel button in Draft screen

  @AT_ST_016
  Scenario: To verify invalid account validation in Scheduled Own Bank Transfer under To other screen
    And User7180 loads the test datasetup for the test case id AT_ST_016
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username1 in the login page for omni_corporate_web_portal
    And User7180 enters the maker password1 in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 click on the AMANA payment screen in the homepage
    And User7180 click on the transfers under the AMANA payment screen
		And User7180 click on Own Bank Transfer under Payment screen
		And User7180 click the From Bank in Own Bank Transfer screen
		And User7180 select the Account in Own Bank Transfer screen
		And User7180 click the To Other in Local credit card settlement
		And User7180 Enter the Iban Account Number in Own Bank Transfer screen
		And User7180 verify the Enter the value popup
		
		@AT_ST_017
  Scenario: To verify the functionality of terms and condition flag in Scheduled Other Bank Transfer
  
    And User7180 loads the test datasetup for the test case id AT_ST_016
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username1 in the login page for omni_corporate_web_portal
    And User7180 enters the maker password1 in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 click on the AMANA payment screen in the homepage
    And User7180 click on the transfers under the AMANA payment screen
		And User7180 click on Own Bank Transfer under Payment screen
		And User7180 verify the From Accounts in International transfer screen
    And User7180 verify the To Accounts in International transfer screen
    And User7180 verify the Amount in International transfer screen
    And User7180 verify the Purpose in International transfer screen
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Validate the Save Button in Local credit card settlement
    And User7180 Validate the To beneficiary segement in Local credit card settlement
    And User7180 Validate the To other in Local credit card settlement
    And User7180 click the From Bank in Own Bank Transfer screen
		And User7180 select the Account in Own Bank Transfer screen
		And User7180 click the To Other in Local credit card settlement
		And User7180 validate the Iban Account Number in Own Bank transfer screen
		And User7180 Validate the Save Beneficiary button in Local credit card settlement
    And User7180 verify the Amount in International transfer screen
    And User7180 verify the Purpose in International transfer screen
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Validate the Save Button in Local credit card settlement
    And User7180 Enter the Iban Account Number in Own Bank Transfer screen
     And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    
    
		