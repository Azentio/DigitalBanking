Feature: Checking the functionalities of BeneficaryManagement

@AT_BM_044
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Enable beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal 

@AT_BM_044_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Enable beneficiary approval in Admin user)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_612 loads the test datasetup for the test case id AT_BM_044
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
#And user_612 check the Enable Local Beneficiary Approval flag under Local Beneficiary settings 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 click Local Beneficiary Approval screen
And user_612 Enter Requested date under Local Beneficiary Approval screen
And user_612 Double click the existingdata under Local Beneficiary Approval screen
And user_612 click the approve button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_044_02
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Enable beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 valiadte the beneificary add or not
And user_612 clicks on logout btn to logout from omni web portal

@AT_BM_045
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (uncheck beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal  

@AT_BM_045_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Ucheck beneficiary approval in Admin user)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_044
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
And user_612 Uncheck the Enable Local Beneficiary Approval flag under Local Beneficiary settings 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 click Local Beneficiary Approval screen
And user_612 Enter Requested date under Local Beneficiary Approval screen
And user_612 Double click the existingdata under Local Beneficiary Approval screen
And user_612 click the approve button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_046
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Allowed Local Beneficiary CIF Types - Check a CIF Type)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal  

@AT_BM_046_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Allowed Local Beneficiary CIF Types - Check a CIF Type)
 And User_612 loads the test datasetup for the test case id AT_BM_044
 Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click Local Beneficiary Approval screen
And user_612 Enter Requested date under Local Beneficiary Approval screen
And user_612 Double click the existingdata under Local Beneficiary Approval screen
And user_612 click the approve button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_046_02
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Allowed Local Beneficiary CIF Types - Check a CIF Type)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 validate the beneificary add or not
And user_612 clicks on logout btn to logout from omni web portal

@AT_BM_047
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Deselect a particular currency)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_044
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
And user_612 click the cif type dropdown button under Local Beneficiary settings  
And user_612 Deselect the currency under a dropdown 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_047_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Deselect a particular currency)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
And user_612 Search Currency and select the Currency in the dropdown
And user_612 validate the currency option is not display
And user_612 clicks on logout btn to logout from omni web portal  

@AT_BM_048
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Select a particular currency-omini Admin)
  Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_044
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
And user_612 click the currency type dropdown button under Local Beneficiary settings  
And user_612 select the currency  under a dropdown 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 clicks on logout btn to logout from Admin portal
 
 @AT_BM_048_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Select a particular currency-omini Admin)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal

@AT_BM_069
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account (Enable beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_069
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the international bank transfer in beneficiary management
And user_612 click Add international bank transfer in beneficiary management
And user_612 click country dropdown  under Add international bank transfer screen
And user_612 enter country name and click the country screen 
And user_612 enter swiftcode uder Add international bank transfer screen 
 And user_612 enter the bank name under Add international bank transfer screen
  And user_612 enter the branch name under Add international bank transfer screen
 	And user_612 Click on the Next button in limit Update Screen
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 click on the country for selecting below the Add ineternalBeneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary 
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on sumbit button Save the Data
And user_612 clicks on logout btn to logout from omni web portal


@AT_BM_069_01
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account (Enable beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_069
  Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click international Beneficiary Approval under submenu
#And user_612 Enter Requested date under international Beneficiary Approval screen
And user_612 Double click the existingdata under international Beneficiary Approval screen
And user_612 click the region search button 
And user_612 enter the valid region code under search button 
And user_612 double click the data under search button
And user_612 click the city search button 
And user_612 enter the valid citycode under search button 
And user_612 double click the city data under search button
And user_612 click the approve button 
And user_612 click ok button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_069_02
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account (Enable beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_069
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the international bank transfer in beneficiary management
And user_612 validate the beneificary accounts add or not
And user_612 clicks on logout btn to logout from omni web portal


@AT_BM_071
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account(Select a particular currency- Omni admin)
 Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_069
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click international Beneficiary settings 
And user_612 click the cif type dropdown button under international Beneficiary settings  
And user_612 select the currency  under a dropdown 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_071_01
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account(Select a particular currency- Omni admin)
And User_612 loads the test datasetup for the test case id AT_BM_069
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the international bank transfer in beneficiary management
And user_612 click Add international bank transfer in beneficiary management
And user_612 click country dropdown  under Add international bank transfer screen
And user_612 enter country name and click the country screen 
And user_612 enter swiftcode uder Add international bank transfer screen 
 And user_612 enter the bank name under Add international bank transfer screen
  And user_612 enter the branch name under Add international bank transfer screen
 	And user_612 Click on the Next button in limit Update Screen
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 click on the country for selecting below the Add ineternalBeneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary 
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on sumbit button Save the Data
And user_612 clicks on logout btn to logout from omni web portal

@AT_BM_071_02
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account(Select a particular currency- Omni admin)
 And User_612 loads the test datasetup for the test case id AT_BM_069
  Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click international Beneficiary Approval under submenu
#And user_612 Enter Requested date under international Beneficiary Approval screen
And user_612 Double click the existingdata under international Beneficiary Approval screen
And user_612 click the region search button 
And user_612 enter the valid region code under search button 
And user_612 double click the data under search button
And user_612 click the city search button 
And user_612 enter the valid citycode under search button 
And user_612 double click the city data under search button
And user_612 click the approve button 
And user_612 click ok button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_071_03
Scenario: Add a beneficiary for the International bank transfer for retail user with valid account(Select a particular currency- Omni admin)
 And User_612 loads the test datasetup for the test case id AT_BM_069
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail username in the login page for omni_web_portal1
And user_612 enters the Retail password in the login page for omni_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the international bank transfer in beneficiary management
And user_612 validate the beneificary accounts add or not
And user_612 clicks on logout btn to logout from omni web portal



@AT_BM_072
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Enable beneficiary approval)
 And User_612 loads the test datasetup for the test case id AT_BM_044
Given user_612 navigates to the omni_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal 

#@AT_BM_073 =>reassign testcase

@AT_BM_114
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Enable beneficiary approval)
And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal 

@AT_BM_114_01
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Enable beneficiary approval)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_612 loads the test datasetup for the test case id AT_BM_114
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
#And user_612 check the Enable Local Beneficiary Approval flag under Local Beneficiary settings 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 click Local Beneficiary Approval screen
And user_612 Enter Requested date under Local Beneficiary Approval screen
And user_612 Double click the existingdata under Local Beneficiary Approval screen
And user_612 click the approve button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_114_02
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Enable beneficiary approval)
And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 validate the beneificary add or not
And user_612 clicks on logout btn to logout from omni web portal

@AT_BM_115
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (uncheck beneficiary approval)
And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal  

@AT_BM_115_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Ucheck beneficiary approval in Admin user)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_114
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
And user_612 Uncheck the Enable Local Beneficiary Approval flag under Local Beneficiary settings 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 click Local Beneficiary Approval screen
And user_612 Enter Requested date under Local Beneficiary Approval screen
And user_612 Double click the existingdata under Local Beneficiary Approval screen
And user_612 click the approve button 
And user_612 clicks on logout btn to logout from Admin portal
 
  
@AT_BM_116
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Allowed Local Beneficiary CIF Types - Check a CIF Type)
 And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal  

@AT_BM_116_01
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Allowed Local Beneficiary CIF Types - Check a CIF Type)
 And User_612 loads the test datasetup for the test case id AT_BM_114
 Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click Local Beneficiary Approval screen
And user_612 Enter Requested date under Local Beneficiary Approval screen
And user_612 Double click the existingdata under Local Beneficiary Approval screen
And user_612 click the approve button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_116_02
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Allowed Local Beneficiary CIF Types - Check a CIF Type)
 And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 validate the beneificary add or not
And user_612 clicks on logout btn to logout from omni web portal

@AT_BM_117
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Deselect a particular currency)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_114
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
And user_612 click the cif type dropdown button under Local Beneficiary settings  
And user_612 Deselect the currency under a dropdown 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 clicks on logout btn to logout from Admin portal

@AT_BM_117_01
Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Deselect a particular currency)
 And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
And user_612 Search Currency and select the Currency in the dropdown
And user_612 validate the currency option is not display
And user_612 clicks on logout btn to logout from omni web portal  
 
 @AT_BM_118
 Scenario: Add a beneficiary for the Local bank transfer for corporate user with valid account (Select a particular currency-omini Admin)
  Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
 And User_612 loads the test datasetup for the test case id AT_BM_118
And user_612 Click on the Parameters menu
And user_612 Click on the Settings submenu
And user_612 click beneficary management  under settings submenu
And user_612 click  Local Beneficiary settings 
And user_612 click the approve All button under Local Beneficiary settings 
And user_612 click ok button 
And user_612 click success ok popup button 
And user_612 click the currency type dropdown button under Local Beneficiary settings  
And user_612 select the currency  under a dropdown 
And user_612 click save button 
And user_612 click warning ok popup 
And user_612 click success ok popup button 
And user_612 clicks on logout btn to logout from Admin portal
 
 @AT_BM_118_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Select a particular currency-omini Admin)
 And User_612 loads the test datasetup for the test case id AT_BM_114
Given user_612 navigates to the omni_corporate_web_portal
 And user_612 enters the corp username1 in the login page for omni_corporate_web_portal
And user_612 enters the corp password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
And user_612 Enter the BVN Number below the Add Local Beneficiary
#And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
#And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 clicks on logout btn to logout from omni web portal
 
 





