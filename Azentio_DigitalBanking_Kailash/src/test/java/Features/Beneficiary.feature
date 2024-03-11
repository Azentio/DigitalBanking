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
And User_626 Enter Draft Name for save the Beneficiary request
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
And User_626 Enter Draft Name for save the Beneficiary request
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
And User_626 Enter Draft Name for save the Beneficiary request
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
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on the cancel button in the draft screen

@AT_BM_007
Scenario: Check if the user is able to use the saved draft to add the beneficiary details for the 
own bank transfer for retail user with valid account details
Given user_5679 navigates to the omni_corporate_portal_retail
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
#And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
And User_626 Click on the Submit button in Beneficiary   
And User_626 Validate the Saved data in beneficiary Management

@AT_BM_032
Scenario: Verify the all fields and data in the saved record of beneficiary
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Verify the currency field in record of beneficiary
And User_626 Verify the Status field in record of beneficiary
And User_626 Verify the Name of the beneficiary field in record of beneficiary
And User_626 Verify the Bank Name field in record of beneficiary
And User_626 Verify the Bank Verification number field in record of beneficiary
And User_626 Verify the branch field in record of beneficiary
And User_626 Verify the Edit Field in record of beneficiary
And User_626 Verify the pay Field in record of beneficiary
And User_626 Verify the delete Field in record of beneficiary
And User_626 Verify the details Field in record of beneficiary 
And User_626 Click on the edit button in Beneficiary
And User_626 Enter the Nick Name Below the beneficiary
And User_626 Save the nick Name Below the beneficiary

@AT_BM_033
Scenario: Verify the Navigation buttons and data in the saved record of beneficiary
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 click the details menu in saved beneficiary record
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the summary screen of beneficiary management
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Verify the Previous functionality of beneficiary 

@AT_BM_033_01
Scenario: Verify the Pay Functionality in saved record of beneficiary
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in debit Card PinChange Screen 

@AT_BM_034
Scenario: Check the pay options post adding of the beneficiary detials in the beneficiary management for the Local bank transfer(Field validation)
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen 
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
#And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_BM_035
Scenario: Check if the user is able to cancel while save the transfer details while using the pay option in the
beneficiary management for the Local bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click the Cancel button in draft Saving Screen

@AT_BM_036
Scenario: Save the transfer details in the summary page while using the pay option in the beneficiary
management for the Local bank transfer for retail user with valid account details 
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
#And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_BM_036_01
Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the 
pay option in the beneficiary management for the Local bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click the Cancel button in draft Saving Screen

@AT_BM_037
Scenario: Save the transfer details in the TnC page while using the pay option in the beneficiary management for the Local bank transfer
for retail user with valid account details and Check if the user is able to cancel while saving the transfer details 
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click the Cancel button in draft Saving Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_BM_038
Scenario: Verify the field and previous buttons are working while using the pay option in the beneficiary management for
the Local bank transfer for retail user with valid account details 
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary 
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Verify the functionality of the previous in Terms transfer Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Verify the functionality of the previous in From Acc transfer Screen

@AT_BM_038_01
Scenario: Check the edit options post adding of the beneficiary details in the beneficiary management for the Local bank transfer
And User_626 loads the test datasetup for the test case id AT_BM_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Show More button below the Edit Beneficiary details
And User_626 Click on the edit button Below the showmore
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Bank_Edit_Summary field in Edit Beneficiary Screen 
And User_626 Verify the BVN_Edit_Summary field in Edit Beneficiary Screen
And User_626 Verify the ACC_NO_Edit_Summary field in Edit Beneficiary Screen
And User_626 Verify the NameOfBeneficiary_Edit_Summary field in Edit Beneficiary Screen
And User_626 Verify the field MobNO_Edit_summary in Edit Beneficiary Screen
And User_626 Verify the Purpose_edit_summary field in Edit Beneficiary Screen

@AT_BM_065
Scenario: Save the beneficiary details while using the edit option in the beneficiary management
for the International bank transfer for retail user with valid account details and Cancellation draft 
And User_626 loads the test datasetup for the test case id AT_BM_065
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the edit button below the international beneficiary
And User_626 Enter the branch below the international transfer beneficiary
And User_626 Click on the Next button in limit Update Screen
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Click on the Cancel button in draft Saving Screen
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_BM_066
Scenario: Save the transfer details in the summary page while using the edit option in the beneficiary 
management for the International bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_065
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the edit button below the international beneficiary
And User_626 Enter the branch below the international transfer beneficiary
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Verify the Screen with help of purpose the international transfer beneficiary  
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Screen with help of  the international transfer beneficiary  
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary

@AT_BM_067
Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the 
edit option in the beneficiary management for the International bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_065
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the edit button below the international beneficiary
And User_626 Enter the branch below the international transfer beneficiary
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Verify the Screen with help of purpose the international transfer beneficiary  
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Screen with help of  the international transfer beneficiary  
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on the Cancel button in draft Saving Screen  
  
@AT_BM_068
Scenario: Check if the user is able to delete the beneficiary details using the delete option in the beneficiary
management for the International bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_065
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Verify the Edit Field in record of beneficiary
And User_626 Verify the pay Field in record of beneficiary
And User_626 Verify the details Field in record of beneficiary
And User_626 Click on the delete button below the Edit Beneficiary details
And User_626 Click on the cancel for stop delete progress below the Edit Beneficiary details
And User_626 Click on the delete button below the Edit Beneficiary details
And User_626 Click on the OK button below the Edit Beneficiary details

@AT_BM_074
Scenario: Save the beneficiary details for the own bank transfer for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_074
Given user_5679 navigates to the omni_corporate_web_portal
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
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on sumbit button Save the Data
#And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary

@AT_BM_075
Scenario: Check if the user is able to cancel while saving the beneficiary details for the own bank transfer for
corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_074
Given user_5679 navigates to the omni_corporate_web_portal
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
And User_626 Verify the Draft title is avaible or not
And User_626 Verify the Cancel button the Draft details screen
And User_626 Verify the submit button the draft details screen 
And User_626 Enter Draft Name for save the Debit Detail request For Swift Beneficiary
And User_626 Click on the Cancel button in draft Saving Screen 

@AT_BM_076
Scenario: Save the beneficiary details on the summary screen for the own bank transfer for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_074
Given user_5679 navigates to the omni_corporate_web_portal
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
And User_626 Verify the Draft title is avaible or not
And User_626 Verify the Cancel button the Draft details screen
And User_626 Verify the submit button the draft details screen 
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary

@AT_BM_098
Scenario: Check if the user is able to cancel while saving the beneficiary details for the Local bank transfer
for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on the cancel button in the draft screen 
And User_626 Verify the Cancellation below the Local Beneficiary 

@AT_BM_099
Scenario: Save the beneficiary details on the summary screen for the Local bank transfer for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary

@AT_BM_100
Scenario: Check if the user is able to cancel while save the beneficiary details on the summary screen for the Local bank transfer
 for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on the cancel button in the draft screen 
And User_626 Verify the Cancellation below the Local Beneficiary

@AT_BM_101
Scenario: Check if the user is able to use the saved draft to add the beneficiary details for the Local bank transfer
for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the saved data showmore button

@AT_BM_102
Scenario: Check if the user is able to go back to the beneficiary details page from summary page in beneficiary management
for the Local bank transfer for corporate user with valid account details 
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 click on the Cancel button in local beneficiary
And User_626 Verify the Functionality of the cancel button in Local beneficiary

@AT_BM_103
Scenario: Verify the field and beneficiary details post adding of the beneficiary details in the beneficiary management for the Local bank transfer
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Verify the currency field in record of beneficiary
And User_626 Verify the Status field in record of beneficiary
And User_626 Verify the Name of the beneficiary field in record of beneficiary
And User_626 Verify the Bank Name field in record of beneficiary
And User_626 Verify the Bank Verification number field in record of beneficiary
And User_626 Verify the branch field in record of beneficiary
And User_626 Verify the Edit Field in record of beneficiary
And User_626 Verify the pay Field in record of beneficiary
And User_626 Verify the delete Field in record of beneficiary
And User_626 Verify the details Field in record of beneficiary 

@AT_BM_104
Scenario: Check the details options post adding of the beneficiary details in the beneficiary management
for the Local bank transfer and nickname process in the local beneficiary 
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the edit button in Beneficiary
And User_626 Enter the Nick Name Below the beneficiary
And User_626 Save the nick Name Below the beneficiary
And User_626 click the details menu in saved beneficiary record
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 click on the Cancel button in local beneficiary
And User_626 Verify the Function of the cancel button in Local beneficiary

@AT_BM_105
Scenario: Check the pay options post adding of the beneficiary detials in the beneficiary management for the Local bank transfer
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the local bank transfer in beneficiary management
And User_626 Click on the Add local beneficiary in beneficiary management
And User_626 Click on the Bank dropdown below the local beneficiary
And User_626 Search bank name and select the bank in the dropdown
And User_626 Enter the BVN Number below the Add Local Beneficiary
And User_626 Enter the Valid Account number below the Add ineternal Beneficiary
And User_626 Click on the currency dropdown for select Currency
And User_626 Search Currency and select the Currency in the dropdown 
And User_626 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And User_626 click on the country for selecting below the Add ineternal Beneficiary
And User_626 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And User_626 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And User_626 Enter the Mobile number below the Add ineternal Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in Beneficiary
And User_626 Verify the saved Local Transfer Beneficiary data
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in debit Card PinChange Screen

@AT_BM_132
Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the 
edit option in the beneficiary management for the International bank transfer for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the edit button below the international beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Local Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Beneficiary request
And User_626 Click on the cancel button in the draft screen 
And User_626 Verify the Cancellation below the Local Beneficiary 

@AT_BM_133
Scenario: Check if the user is able to delete the beneficiary details using the delete option in the beneficiary
management for the International bank transfer for retail user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Verify the Edit Field in record of beneficiary
And User_626 Verify the pay Field in record of beneficiary
And User_626 Verify the details Field in record of beneficiary
And User_626 Click on the delete button below the Edit Beneficiary details
And User_626 Click on the cancel for stop delete progress below the Edit Beneficiary details
And User_626 Click on the delete button below the Edit Beneficiary details
And User_626 Click on the OK button below the Edit Beneficiary details

@AT_BM_127
Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the pay option in 
the beneficiary management for the International bank transfer for corporate user with valid account details and save with to do 
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
#And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Local Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on the Cancel button in draft Saving Screen  
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary

@AT_BM_128
Scenario: Save the transfer details in the TnC page while using the pay option in the beneficiary management
for the International bank transfer for corporate user with valid account details and Cancellation 
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on the Cancel button in draft Saving Screen  
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary

@AT_BM_129
Scenario: Verify the field and previous buttons are working while using the pay option in the beneficiary management
for the International bank transfer for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the saved data showmore button
And User_626 Click on the Pay in Beneficiary Details
And User_626 Click on the from Acc Below Transfer Details of Beneficiary
And User_626 Select the from Acc Below Transfer Details of Beneficiary
And User_626 Enter Amount Below Transfer Details of Beneficiary
And User_626 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the functionality of the previous button using i Agree CheckBox

@AT_BM_130
Scenario:
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the international bank transfer in beneficiary management
And user_612 click Add international bank transfer in beneficiary management
And user_612 click country dropdown  under Add international bank transfer screen
And user_612 enter country name and click the country screen 
And user_612 enter swiftcode uder Add international bank transfer screen 
And user_612 enter the bank name under Add international bank transfer screen
And User_626 Click on the Next button in limit Update Screen
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 click on the country for selecting below the Add ineternalBeneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary 
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And User_626 Click on the Next button in limit Update Screen

@AT_BM_131
Scenario: Check if the user is able to cancel while save the beneficiary details while using the edit option in the
beneficiary management for the International bank transfer for corporate user with valid account details
And User_626 loads the test datasetup for the test case id AT_BM_098
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal for beneficiary
And User_626 enters the CorporatePass in the login page for omni_web_portal for beneficiary
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the Beneficiary Management in the Home screen Retail User
And User_626 Click on the international bank transfer in beneficiary management
And User_626 Click on the international Show More button below the Edit Beneficiary details
And User_626 Click on the saved data showmore button
And User_626 Click on the edit button Below the showmore
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on the Cancel button in draft Saving Screen  
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification for own bank beneficiary
