Feature: Testing the functionalities of Beneficiary in omni
@AT_BM_132
Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the 
edit option in the beneficiary management for the International bank transfer for corporate user with valid account details
And User_074 loads the test datasetup for the test case id AT_BM_098
Given user_074 navigates to the omni_corporate_web_portal
And User_074 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_074 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_074 click on the loggin button in the login page for omni_corporate_web_portal
And user_074 click on the force logout btn in the login page for omni_corporate_web_portal
And user_074 click on the ok button for the successful login page for omni_corporate_web_portal
And User_074 Click on the Beneficiary Management in the Home screen Retail User
And User_074 Click on the international bank transfer in beneficiary management
And User_074 Click on the international Show More button below the Edit Beneficiary details
And User_074 Click on the edit button below the international beneficiary
And User_074 Enter the branch below the international transfer beneficiary
And User_074 Click on the Next button in limit Update Screen
And User_074 Click on the Save button in Screen2
And User_074 Enter Draft Name for save the Beneficiary request
And User_074 Click on the cancel button in the draft screen 
And User_074 Verify the Cancellation below the Local Beneficiary 

@AT_BM_133
Scenario: Check if the user is able to delete the beneficiary details using the delete option in the beneficiary
management for the International bank transfer for retail user with valid account details
And User_074 loads the test datasetup for the test case id AT_BM_098
Given user_074 navigates to the omni_corporate_web_portal
And User_074 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_074 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_074 click on the loggin button in the login page for omni_corporate_web_portal
And user_074 click on the force logout btn in the login page for omni_corporate_web_portal
And user_074 click on the ok button for the successful login page for omni_corporate_web_portal
And User_074 Click on the Beneficiary Management in the Home screen Retail User
And User_074 Click on the international bank transfer in beneficiary management
And User_074 Click on the international Show More button below the Edit Beneficiary details
And User_074 Verify the Edit Field in record of beneficiary
And User_074 Verify the pay Field in record of beneficiary
And User_074 Verify the details Field in record of beneficiary
And User_074 Click on the delete button below the Edit Beneficiary details
And User_074 Click on the cancel for stop delete progress below the Edit Beneficiary details
And User_074 Click on the delete button below the Edit Beneficiary details
And User_074 Click on the OK button below the Edit Beneficiary details