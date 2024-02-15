Feature: Testing the functionalities of Beneficiary in omni
@BEN_002
Scenario: currency, logo and code - To Account card component
And user_5679 loads the test datasetup for the test case id BEN_002
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the transfers under the AMANA payment screen
And user_5679 click on the own bank transfer under the Transfer
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 Get The Value of USD in text and verify
And user_5679 click on the To accounts from the transfers within own accounts
And user_5679 Get The TO Account Value of USD in text and verify 
And user_5679 Click on the Transfer to other bank account Under Transfer
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 Get The Value of USD in text and verify
And user_5679 click on the To accounts from the transfers Other bank accounts
And user_5679 Get The TO Account Value of Other Bank USD in text and verify
And user_5679 click the International Transfer under AMANA Payment
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 Get The Value of money mru in text and verify
And user_5679 click on the to account in international transfer
And user_5679 Get The TO Account Value of International USD in text and verify
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click Scheduled own bank transfer Under scheduled transfer
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 Get The Value of USD in text and verify
And user_5679 click on the To accounts from the transfers Other bank accounts
And user_5679 Get The Value of Scheduled own Money MRU in text and verify
And user_5679 click Scheduled other bank transfer Under scheduled transfer
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 Get The Value of USD in text and verify
And user_5679 click on the To accounts from the transfers Other bank accounts
And user_5679 Get The TO Account Value of USD in text and verify
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click international scheduled transfer under scheduled transfer
And user_5679 click from account international transfers
And user_5679 Get The Value of USD in text and verify
And user_5679 click log out button

@AT_BM_001
Scenario: Add a beneficiary for the own bank transfer for retail user with valid account
And User_626 loads the test datasetup for the test case id AT_BM_001
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
#And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary
And User_626 Validate the Saved data in beneficiary Management

@AT_BM_002
Scenario: Add a beneficiary for the own bank transfer for retail user with Invalid account details
And User_626 loads the test datasetup for the test case id AT_BM_002
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the InValid Account number below the Add ineternal Beneficiary
And User_626 Validate the Invalid Account Number below the Add ineternal Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile Invalid number below the Add ineternal Beneficiary
And User_626 Validate the Invalid Number Validation below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank 
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Cancel button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on sumbit button Save the Data

@AT_BM_003
Scenario: Save the beneficiary details for the own bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_003
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_BM_004
Scenario: Check if the user is able to cancel while saving the beneficiary details for the 
own bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_004
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on the cancel button in the draft screen 

@AT_BM_005
Scenario: Save the beneficiary details on the summary screen for the own bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_005
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
 
@AT_BM_006
Scenario: Check if the user is able to cancel while save the beneficiary details on the summary screen for the 
own bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_006
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on the cancel button in the draft screen

@AT_BM_007
Scenario: Check if the user is able to use the saved draft to add the beneficiary details for the 
own bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_005
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
And User_626 Click on the Submit button in Beneficiary   
And User_626 Validate the Saved data in beneficiary Management

#@AT_BM_00