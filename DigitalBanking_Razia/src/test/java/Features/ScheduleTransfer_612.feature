Feature: Checking the functionalities of ScheduleTransfer

@AT_ST_010
Scenario: To Verify the Submisson Report in corporate user
And user_612 loads the test datasetup for the test case id AT_ST_010
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 Verify the Internal Ref field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the From Account field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the To Account field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Amount field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Purpose field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Send to Self field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Export field below the Submission Report of Scheduled own bank transfer
And user_612 Click on the Export below the Submission Report of Scheduled own bank transfer
And user_612 Verify the PDF field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Excel field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Cancel field below the Submission Report of Scheduled own bank transfer
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_011
Scenario: To Verify the PDF file in corporate user
And user_612 loads the test datasetup for the test case id AT_ST_010
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 Click on the Export below the Submission Report of Scheduled own bank transfer
And user_612 Click on the PDF below the Submission Report of Scheduled own bank transfer
And user_612 validate the downloaded report 
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_012
Scenario: To Verify the Excel File in corporate user
And user_612 loads the test datasetup for the test case id AT_ST_010
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
#And user_612  click on the I agree to terms and conditions checkbox
#And user_612 click on next btn in the transfers screen
#And user_612 click on submit btn in the transfers screen
#And user_612 waits for the confirmation on the submission report for scheduled own account transfer
#And user_612 gets the reference number from the submission report
And user_612 Click on sumbit button Save the Data
And user_612 Click on the Export below the Submission Report of Scheduled own bank transfer
And user_612 Click on the Excel below the Submission Report of Scheduled own bank transfer
And user_612 validate the downloaded report 
And user_612 clicks on logout btn to logout from omni web portal


@AT_ST_013
Scenario: To Verify Send to Self Button in corporate user
And user_612 loads the test datasetup for the test case id AT_ST_010
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 waits for the confirmation on the submission report for scheduled own account transfer
And user_612 gets the reference number from the submission report
And user_612 Click on the Send to Self  below the Submission Report of Scheduled own bank transfer
And user_612 Verify the PDF field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Excel field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Cancel field below the Submission Report of Scheduled own bank transfer
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_013_01
Scenario: To verify the functionalities of checker user
And user_612 loads the test datasetup for the test case id AT_ST_010
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username1 in the login page for omni_corporate_web_portal
And user_612 enters the checker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report for international bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_014
    Scenario: To verify the blank field validation in Scheduled Own Bank Transfer  
     And user_612 loads the test datasetup for the test case id AT_ST_014
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 click on the AMANApayment screen in the homepage
    And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
    And user_612 click on next btn in the transfers screen
      And user_612 validate the invalid value popup in Own Bank Transfer screen
      And user_612 clicks on logout btn to logout from omni web portal
  
  #pending
    @AT_ST_015
      Scenario: To verify the invalid amount validation in Scheduled Own Bank Transfer  
    And user_612 loads the test datasetup for the test case id AT_ST_015
     Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 click on the AMANApayment screen in the homepage
        And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen 
	And user_612 click on the From accounts from the transfers within own accounts
		And user_612 select the Zero Balance Account in Own Bank Transfer screen
		And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
#		And user_612 click on the To accounts from the transfers
    #And user_612 selects the To account from the dropdown in transfers
    #And user_612 Enter the Amount under currency tab in Local credit card settlement
    And user_612 enters the transaction amount in the transfers screen
    And user_612 verify the Enter the value popup
          And user_612 clicks on logout btn to logout from omni web portal
    
@AT_ST_028
Scenario: To Verify the functionality of Submit button  in corporate user
And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
 And User_612 Verify the Request Successfully Popup
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_029
Scenario: To Verify the Submisson Report and Export report in corporate user
 And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 Verify the Internal Ref field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the From Account field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the To Account field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Amount field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Purpose field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Send to Self field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Export field below the Submission Report of Scheduled own bank transfer
And user_612 Click on the Export below the Submission Report of Scheduled own bank transfer
And user_612 Verify the PDF field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Excel field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Cancel field below the Submission Report of Scheduled own bank transfer
And user_612 Click on the PDF below the Submission Report of Scheduled own bank transfer
And user_612 validate the downloaded report 
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_030
Scenario: To Verify the Excel File in corporate user
 And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 Click on the Export below the Submission Report of Scheduled own bank transfer
And user_612 Click on the Excel below the Submission Report of Scheduled own bank transfer
And user_612 validate the downloaded report 
And user_612 clicks on logout btn to logout from omni web portal


@AT_ST_031
Scenario:To Verify Send to Self Button in corporate user
 And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 Click on the Send to Self  below the Submission Report of Scheduled own bank transfer
And user_612 Verify the PDF field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Excel field below the Submission Report of Scheduled own bank transfer
And user_612 Verify the Cancel field below the Submission Report of Scheduled own bank transfer
And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_032
Scenario: To verify the blank field validation in Scheduled International Transfers 
And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on next btn in the transfers screen
 And user_612 validate the invalid value popup in Own Bank Transfer screen
      And user_612 clicks on logout btn to logout from omni web portal
#pending. popup is not coming
@AT_ST_033    
Scenario: To verify the invalid amount validation in Scheduled International Transfer
And user_612 loads the test datasetup for the test case id AT_ST_033
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 verify the Enter the value popup
 And user_612 clicks on logout btn to logout from omni web portal

@AT_ST_033_01
Scenario: To verify the logout button
And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
 And user_612 clicks on logout btn to logout from omni web portal
 
 @AT_ST_034
 Scenario: To verify the field level validation in Scheduled International Transfer under To other screen
  And user_612 loads the test datasetup for the test case id AT_ST_028
 Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANApayment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within Scheduled International Transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
#And user_612 click on the To accounts from the transfers within own accounts
#And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 click  the to other button within Scheduled International Transfer screen
And user_612 verify the swift code under to other within Scheduled International Transfer screen
And user_612 verify the Iban Account num under to other within Scheduled International Transfer screen
And user_612 verify currency dropdown button  under to other within Scheduled International Transfer screen
And user_612 enter the swift code under to other within Scheduled International Transfer screen
And user_612 enter the Iban Account num under to other within Scheduled International Transfer screen
And user_612 click currency dropdown button  under to other within Scheduled International Transfer screen
And user_612 select tha currency type under to other within Scheduled International Transfer screen
And user_612 verify the save benificary toggle button under tother within Scheduled International Transfer screen
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 Click on sumbit button Save the Data
And user_612 Click on the Export below the Submission Report of Scheduled own bank transfer
And user_612 Click on the Excel below the Submission Report of Scheduled own bank transfer
And user_612 validate the downloaded report 
 And user_612 clicks on logout btn to logout from omni web portal
 
 
 
 



















