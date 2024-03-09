Feature: Verify the functionalities on Beneficiary Management on Retail screen

  @AT_BM_006
  Scenario: Check if the user is able to cancel while save the beneficiary details on the summary screen for the
    own bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_006
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    #And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    #And User7180 Enter Draft Name for save the Debit Detail request
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_BM_008
  Scenario: Check if the user is able to go back to the beneficiary details page from summary page in beneficiary management
    for the own bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_008
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 click the previous button display or not
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_BM_009
  Scenario: Check if the summary is correctly reflecting the beneficiary details which is entered
    in the beneficiary management for the own bank transfer
    
    And User7180 loads the test datasetup for the test case id AT_BM_009
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Validate the Home screen on Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_BM_010
  Scenario: Verify the field and beneficiary details post adding of the beneficiary details
    in the beneficiary management for the own bank transfer
    
    And User7180 loads the test datasetup for the test case id AT_BM_010
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Show More option in Home screen
    And User7180 Validate the Beneficiary account no key in Home screen
    And User7180 Validate the Beneficiary Name in Home screen
    And User7180 Validate the Mobile No in Home screen
    And User7180 Validate the Purpose in Home screen
    And User7180 Validate the Delete in Home screen
    And User7180 Validate the Details in Home screen
    And User7180 Validate the Edit in Home screen
    And User7180 Validate the Pay in Home screen
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_BM_011
  Scenario: Add a nickname to the beneficiary post adding of the beneficiary details in
    the beneficiary management for the own bank transfer
    
    And User7180 loads the test datasetup for the test case id AT_BM_011
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Click the Edit button in Home screen
    And User7180 Enter the Name in Add NickName field in Home Screen
    And User7180 click save button under mycredit card settlement
    And User7180 Validate the NickName whether it is change or not
    And User7180 click the Show More option in Home screen
    And User7180 Click the Details in Home screen
    And User7180 click on next btn in the transfers screen
    And User7180 click the previous button display or not
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_012
    Scenario: Check the pay options post adding of the beneficiary detials in the 
    beneficiary management for the own bank transfer
    
    And User7180 loads the test datasetup for the test case id AT_BM_012
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 clicks on logout btn to logout from omni web portal
    

     @AT_BM_013
    Scenario: Check the pay options post adding of the beneficiary detials 
    in the beneficiary management for the own bank transfer
    
     And User7180 loads the test datasetup for the test case id AT_BM_013
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the From Account under summary in Local credit card settlement
    And User7180 Validate the To Account under summary in International Transfer
    And User7180 Validate the Amount under summary in Local credit card settlement
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the Exchanged Amount under summary in Local credit card settlement
    And User7180 Validate the Exchange Rate under summary in Local credit card settlement
    And User7180 Validate the Terms and conditions under summary in Local credit card settlement
    And User7180 validate previous button display or not
    And User7180 validate save button display or not
    And User7180 verify the submit button is displaying or not
    And User7180 Validate the Cancel Button in Local credit card settlement
    And User7180 click the previous button display or not
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal

   @AT_BM_039
   Scenario: Save the beneficiary details while using the edit option in the beneficiary management 
   for the Local bank transfer for retail user with valid account details
   
    And User7180 loads the test datasetup for the test case id AT_BM_039
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    #And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Edit in Home screen
    #And User7180 Enter the Purpose on Beneficiary Management screen
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Validate the Bank in Beneficiary Management screen
    And User7180 Validate the Beneficiary Bank verification number in Beneficiary Management screen
    And User7180 click the previous button display or not
    And User7180 Validate the Edit page in Beneficiary Management screen
    And User7180 click save button under mycredit card settlement
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_040
    Scenario: Check if the user is able to cancel while save the beneficiary details while using the edit option 
    in the beneficiary management for the Local bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_040
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Edit in Home screen
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click save button under mycredit card settlement
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_040_01
    Scenario: Save the transfer details in the summary page while using the edit option in the beneficiary management 
    for the Local bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_040
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Edit in Home screen
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click save button under mycredit card settlement
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
    
     @AT_BM_041
    Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the edit option 
    in the beneficiary management for the Local bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_041
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Edit in Home screen
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click save button under mycredit card settlement
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_042 
    Scenario: Check if the user is able to delete the beneficiary details using the delete option 
    in the beneficiary management for the Local bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_042
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Delete in Home screen
    And User7180 Click the ok button on popup message
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_043
    Scenario: Check if the user is able to delete the beneficiary details using the delete option 
    
    in the beneficiary management for the Local bank transfer for retail user with valid account details
    And User7180 loads the test datasetup for the test case id AT_BM_043
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Delete in Home screen
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_049
    Scenario: Add a beneficiary for the International bank transfer for retail user with valid account
    
    And User7180 loads the test datasetup for the test case id AT_BM_049
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 Click the Swift in Home screen under Beneficiary Management
    And User7180 Click the Add International Benef button under Swift screen
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bic Swift Code in International Benef screen
    And User7180 Enter the Bank Name in International Benef screen
    And User7180 Enter the Branch Name in International Benef screen
    And User7180 click on next btn in the transfers screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in International Benef screen
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    #And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Country in Beneficiary Management screen
    And User7180 Validate the Bic Swift code in Beneficiary Management screen
    And User7180 Validate the Branch in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Validate the Bank Name in Beneficiary Management screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Enter the Password in the Verification screen
    And User7180 Click the Verify button in the Verification screen
    And User7180 Click the I am Not a Robot checkBox in the Verification screen
    And User7180 clicks on logout btn to logout from omni web portal
    
 @AT_BM_050
    Scenario: Add a beneficiary for the International bank transfer for retail user with Invalid account details (Invalid mobile number)
    
    And User7180 loads the test datasetup for the test case id AT_BM_050
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 Click the Swift in Home screen under Beneficiary Management
    And User7180 Click the Add International Benef button under Swift screen
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bic Swift Code in International Benef screen
    And User7180 Enter the Bank Name in International Benef screen
    And User7180 Enter the Branch Name in International Benef screen
    And User7180 click on next btn in the transfers screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in International Benef screen
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Validate the invalid phone number error Message in International Benef screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    
    @AT_BM_051
    Scenario: Save the beneficiary details for the International bank transfer for retail user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_050
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Bank in the Home screen under Beneficiary Management
    And User7180 Validate the Show More option in Home screen
    And User7180 Click the Swift in Home screen under Beneficiary Management
    And User7180 Click the Add International Benef button under Swift screen
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bic Swift Code in International Benef screen
    And User7180 Enter the Bank Name in International Benef screen
    And User7180 Enter the Branch Name in International Benef screen
    And User7180 click on next btn in the transfers screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in International Benef screen
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Country in Beneficiary Management screen
    And User7180 Validate the Bic Swift code in Beneficiary Management screen
    And User7180 Validate the Branch in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Validate the Bank Name in Beneficiary Management screen
    And User7180 click save button under mycredit card settlement
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_077
    Scenario: Check if the user is able to cancel while save the beneficiary details on the summary screen 
      for the own bank transfer for corporate user with valid account details
      
    And User7180 loads the test datasetup for the test case id AT_BM_077
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_078
    Scenario: Check if the user is able to use the saved draft to add the beneficiary details for the 
     own bank transfer for corporate user with valid account details
     
    And User7180 loads the test datasetup for the test case id AT_BM_078
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 click on the ok button for the Validation error popup
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 Click the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 Click on sumbit button Save the Data
    And User7180 Verify the Record visible in Bank screen or not
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_079
    Scenario: Check if the user is able to go back to the beneficiary details page from summary page in beneficiary management 
     for the own bank transfer for corporate user with valid account details 
     
    And User7180 loads the test datasetup for the test case id AT_BM_078
     Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 click the previous button display or not
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_079_01
    Scenario: Check if the summary is correctly reflecting the beneficiary details which is entered 
      in the beneficiary management for the own bank transfer
      
    And User7180 loads the test datasetup for the test case id AT_BM_079
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Verify the Record visible in Bank screen or not
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_080
    Scenario: Add a nickname to the beneficiary post adding of the beneficiary details 
      in the beneficiary management for the own bank transfer
      
    And User7180 loads the test datasetup for the test case id AT_BM_080
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Verify the Record visible in Bank screen or not
    And User7180 click the Show More option in Home screen
    And User7180 Validate the Beneficiary account no key in Home screen
    And User7180 Validate the Beneficiary Name in Home screen
    And User7180 Validate the Mobile No in Home screen
    And User7180 Validate the Purpose in Home screen
    And User7180 Validate the Delete in Home screen
    And User7180 Validate the Details in Home screen
    And User7180 Validate the Edit in Home screen
    And User7180 Validate the Pay in Home screen
    And User7180 Click the Edit button in Home screen
    And User7180 Enter the Name in Add NickName field in Home Screen
    And User7180 click save button under mycredit card settlement
    And User7180 Validate the NickName whether it is change or not
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_081
    Scenario: Check the details options post adding of the beneficiary details
       in the beneficiary management for the own bank transfer
       
    And User7180 loads the test datasetup for the test case id AT_BM_081
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen 
    And User7180 Click on sumbit button Save the Data
    And User7180 Verify the Record visible in Bank screen or not
    And User7180 click the Show More option in Home screen
    And User7180 Click the Details in Home screen
    And User7180 click on next btn in the transfers screen
    And User7180 click the previous button display or not
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_082
    Scenario: Check the pay options post adding of the beneficiary detials 
       in the beneficiary management for the own bank transfer
     
    And User7180 loads the test datasetup for the test case id AT_BM_082
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add internal Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 clicks on logout btn to logout from omni web portal  
    
    @AT_BM_082_01
    Scenario: Check the pay options post adding of the beneficiary detials in the 
     beneficiary management for the own bank transfer(Field validation)

    And User7180 loads the test datasetup for the test case id AT_BM_082
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the From Account under summary in Local credit card settlement
    And User7180 Validate the To Account under summary in International Transfer
    And User7180 Validate the Amount under summary in Local credit card settlement
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the Exchanged Amount under summary in Local credit card settlement
    And User7180 Validate the Exchange Rate under summary in Local credit card settlement
    And User7180 Validate the Terms and conditions under summary in Local credit card settlement
    And User7180 validate previous button display or not
    And User7180 validate save button display or not
    And User7180 verify the submit button is displaying or not
    And User7180 Validate the Cancel Button in Local credit card settlement
    And User7180 clicks on logout btn to logout from omni web portal  
    
    @AT_BM_083
    Scenario: Save the transfer details while using the pay option in the beneficiary management 
      for the own bank transfer for corporate user with valid account details
      
    And User7180 loads the test datasetup for the test case id AT_BM_083
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management  
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_104
    Scenario: Check the details options post adding of the beneficiary details in the beneficiary management for the Local bank transfer
    
    And User7180 loads the test datasetup for the test case id AT_BM_104
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 Click Add Local Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Click the Bank in Local Beneficiary screen
    And User7180 Search the Bankcode below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bank Verifcation number in Local Beneficiary Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in Beneficiary Management screen
    And User7180 Enter the Currency code below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 Click the Edit button in Home screen
    And User7180 Enter the Name in Add NickName field in Home Screen
    And User7180 click save button under mycredit card settlement
    And User7180 Validate the NickName whether it is change or not
    And User7180 click the Show More option in Home screen
    And User7180 Click the Details in Home screen
    And User7180 click on next btn in the transfers screen
    And User7180 click the previous button display or not
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_105
    Scenario: Check the pay options post adding of the beneficiary detials in the beneficiary management for the Local bank transfer
    And User7180 loads the test datasetup for the test case id AT_BM_105
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 Click Add Local Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Click the Bank in Local Beneficiary screen
    And User7180 Search the Bankcode below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bank Verifcation number in Local Beneficiary Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in Beneficiary Management screen
    And User7180 Enter the Currency code below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 clicks on logout btn to logout from omni web portal
    
      @AT_BM_105_01
    Scenario: Check the pay options post adding of the beneficiary detials in the beneficiary management for the Local bank transfer(Field validation)
    And User7180 loads the test datasetup for the test case id AT_BM_105
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 Click Add Local Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Click the Bank in Local Beneficiary screen
    And User7180 Search the Bankcode below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bank Verifcation number in Local Beneficiary Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in Beneficiary Management screen
    And User7180 Enter the Currency code below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Validate the Bank in Beneficiary Management screen
    And User7180 Validate the Beneficiary Bank verification number in Beneficiary Management screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    
     @AT_BM_106
    Scenario: Save the transfer details while using the pay option in the beneficiary management 
    for the Local bank transfer for corporate user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_106
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_106_01
    Scenario: Check if the user is able to cancel while save the transfer details while using the pay option in the 
     beneficiary management for the Local bank transfer for corporate user with valid account details
     
     And User7180 loads the test datasetup for the test case id AT_BM_106
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_107
    Scenario: Save the transfer details in the summary page while using the pay option in the beneficiary management 
     for the Local bank transfer for corporate user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_107
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_107_01
   Scenario: Check if the user is able to cancel while saving the transfer details in the summary page while using the 
     pay option in the beneficiary management for the Local bank transfer for corporate user with valid account details
     
     And User7180 loads the test datasetup for the test case id AT_BM_107
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_108
    Scenario: Save the transfer details in the TnC page while using the pay option in the beneficiary management 
     for the Local bank transfer for corporate user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_108
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal
    
     @AT_BM_108_01
    Scenario: Check if the user is able to cancel while saving the transfer details in the TnC page while using the pay option 
    in the beneficiary management for the Local bank transfer for corporate user with valid account details
     
     And User7180 loads the test datasetup for the test case id AT_BM_108
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click the cancel button in Draft screen
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_109
    Scenario: Verify the field and previous buttons are working while using the pay option in the beneficiary management 
    for the Local bank transfer for corporate user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_109
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Pay in Home screen
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Beneficiary Management
    And User7180 Enter the Purpose of the Beneficiary Management
    And User7180 click on next btn in the transfers screen
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click on next btn in the transfers screen
    And User7180 click the previous button display or not
    And User7180 click the previous button display or not
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_BM_109_01
    Scenario: Check the edit options post adding of the beneficiary detials 
    in the beneficiary management for the Local bank transfer
    
    And User7180 loads the test datasetup for the test case id AT_BM_109
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 Click Add Local Beneficiary Below the Beneficiary Management Bank Screen
    And User7180 Click the Bank in Local Beneficiary screen
    And User7180 Search the Bankcode below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Bank Verifcation number in Local Beneficiary Screen
    And User7180 Enter the Valid Account number below the Add ineternal Beneficiary
    And User7180 Click the currency in Beneficiary Management screen
    And User7180 Enter the Currency code below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
    And User7180 click on the country for selecting below the Add ineternal Beneficiary
    And User7180 Search the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
    And User7180 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
    And User7180 Enter the Mobile number below the Add ineternal Beneficiary
    And User7180 Enter the Purpose of the Add Internal Beneficiary Bank
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 click the Show More option in Home screen
    And User7180 Click the Edit in Home screen
    #And User7180 Enter the Purpose on Beneficiary Management screen
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Validate the Bank in Beneficiary Management screen
    And User7180 Validate the Beneficiary Bank verification number in Beneficiary Management screen
    And User7180 click on next btn in the transfers screen
    And User7180 Click on sumbit button Save the Data
    And User7180 clicks on logout btn to logout from omni web portal
    
      @AT_BM_110
    Scenario: Save the beneficiary details while using the edit option in the beneficiary management for the 
    Local bank transfer for corporate user with valid account details
    
    And User7180 loads the test datasetup for the test case id AT_BM_110
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the maker username in the login page for omni_corporate_web_portal
    And User7180 enters the maker password in the login page for omni_corporate_web_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Validate the Show More option in Home screen
    And User7180 click the Local in the Home screen under Beneficiary Management
    And User7180 click the Show More option in Home screen
    And User7180 Click the Edit in Home screen
    #And User7180 Enter the Purpose on Beneficiary Management screen
    And User7180 click on next btn in the transfers screen
    And User7180 Validate the Account Number in Beneficiary Management screen
    And User7180 Validate the Name of Beneficiary in Beneficiary Management screen
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 Validate the currency in Beneficiary Management screen
    And User7180 Validate the Mobile Number in Beneficiary Management screen
    And User7180 Validate the Bank in Beneficiary Management screen
    And User7180 Validate the Beneficiary Bank verification number in Beneficiary Management screen
		And User7180 click the previous button display or not
		And User7180 Validate the Next Button in Local credit card settlement
    And User7180 click save button under mycredit card settlement
    And User7180 Enter Draft Name for save in Beneficiary Management
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data in Beneficiary Management
    And User7180 clicks on logout btn to logout from omni web portal