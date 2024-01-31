Feature: To test the functionality of the CreditCard Settlement in my Cards Page
@AT_ST_001
Scenario: Verify the All fields and dropdown value in the Scheduled transfer
And User_626 loads the test datasetup for the test case id AT_ST_001
Given user_5679 navigates to the omni_corporate_portal_retail
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
And User_626 Click on the No of payments in Scheduled own account transfer
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
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the No of payments in Scheduled own account transfer
And User_626 Click on the Next button in limit Update Screen



 
     







 


