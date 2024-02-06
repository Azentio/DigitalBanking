Feature: To test the functionality of the CreditCard Settlement in my Cards Page
@AT_ST_001
Scenario: Verify the All fields and dropdown value in the Own Account Scheduled transfer
And User_626 loads the test datasetup for the test case id AT_ST_001
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Validate the Scheduled own account transfer Below the Payments
And User_626 Validate the Scheduled Own Bank Transfer Below the Payments
And User_626 Validate the Scheduled Other Bank Transfer Below the Payments
And User_626 Validate the Scheduled International Transfer Below the Payments
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Validate the From Account field is Available in Scheduled own account transfer
And User_626 Validate the To Account field is Available in Scheduled own account transfer
And User_626 Validate the Currency field is Available in Scheduled own account transfer
And User_626 Validate the Amount field is Available in Scheduled own account transfer
And User_626 Validate the Purpose field is Available in Scheduled own account transfer
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen 
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Verify Recurring Daily Value is avaiable below the periodicity dropdown
And User_626 Verify Recurring Yearly Value is avaiable below the periodicity dropdown
And User_626 Verify Single Future Date Value is avaiable below the periodicity dropdown
And User_626 Verify Recurring weekly Value is avaiable below the periodicity dropdown
And User_626 Verify Recurring Monthly Value is avaiable below the periodicity dropdown
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Value is missing when fields are not filed
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen

@AT_ST_002
Scenario: Verify the All fields in screen3 of Scheduled transfer
And User_626 loads the test datasetup for the test case id AT_ST_002
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the From Account field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the To Account field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the Amount field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the ExchangedAmount field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the ExchangedRate field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the Purpose field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the I Agree On Term field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the Periodicity field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the No of Payments field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the Start Date field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the End Date field is avaiable in summary of Scheduled own account transfer

@AT_ST_003
Scenario: Submit the Scheduled own account transfer test the functionality of submit
And User_626 loads the test datasetup for the test case id AT_ST_002
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the From Account field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the To Account field is avaiable in summary of Scheduled own account transfer
And User_626 Click on sumbit button Save the Data

@AT_ST_004
Scenario: Verify the Submit and Submission report all fields
And User_626 loads the test datasetup for the test case id AT_ST_002
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the From Account field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the To Account field is avaiable in summary of Scheduled own account transfer
And User_626 Click on sumbit button Save the Data
And User_626 Verify the Internal Ref field below the Submission Report of Scheduled own account transfer
And User_626 Verify the From Account field below the Submission Report of Scheduled own account transfer
And User_626 Verify the To Account field below the Submission Report of Scheduled own account transfer
And User_626 Verify the Amount field below the Submission Report of Scheduled own account transfer
And User_626 Verify the Purpose field below the Submission Report of Scheduled own account transfer
And User_626 Verify the Send to Self field below the Submission Report of Scheduled own account transfer
And User_626 Verify the Export field below the Submission Report of Scheduled own account transfer
And User_626 Click on the Export below the Submission Report of Scheduled own account transfer
And User_626 Verify the PDF field below the Submission Report of Scheduled own account transfer
And User_626 Verify the Excel field below the Submission Report of Scheduled own account transfer
And User_626 Verify the Cancel field below the Submission Report of Scheduled own account transfer
And User_626 Click on the PDF below the Submission Report of Scheduled own account transfer

@AT_ST_005
Scenario:

@AT_ST_006
Scenario: Verify the Value is missing and Max Allowed Value in Scheduled Transfer
And User_626 loads the test datasetup for the test case id AT_ST_005
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Value is missing when fields are not filed
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Max Allowed Value when fields are not filed

@AT_ST_007
Scenario: Check the functionality Logout after the Sumbit Data in scheduled Transfers
And User_626 loads the test datasetup for the test case id AT_ST_002
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the From Account field is avaiable in summary of Scheduled own account transfer
And User_626 Verify the To Account field is avaiable in summary of Scheduled own account transfer
And User_626 Click on sumbit button Save the Data
And user_5679 clicks on logout btn to logout from omni web portal

@AT_ST_008
Scenario: Verify the All fields and dropdown value in the Own Bank Scheduled transfer
And User_626 loads the test datasetup for the test case id AT_ST_008
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers
And User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And user_5679 click scheduled transfer under AMANA payment screen
And User_626 Click on the Scheduled Own Bank Transfer Below the Payments
And User_626 Validate the From Account field is Available in Scheduled own Bank transfer
And User_626 Validate the To Account field is Available in Scheduled own account transfer
And User_626 Validate the Currency field is Available in Scheduled own account transfer
And User_626 Validate the Amount field is Available in Scheduled own account transfer
And User_626 Validate the Purpose field is Available in Scheduled own account transfer
And User_626 Validate the To Beneficiary Segment Below the Scheduled Own Bank Transfer
And User_626 Validate the To Other Seg Below the Scheduled Own Bank Transfer
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen 
And User_626 Click on the To Other Seg Below the Scheduled Own Bank Transfer
And User_626 Enter the Invalid Numeric Value in To Other Screen
And User_626 Verify the Invalid Numeric Value Error in the To Other Screen
And User_626 Enter the Special Char Value in To Other Screen
And User_626 Verify the Special Char Value Error in the To Other Screen

