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
    And User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
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
    And User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
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
    And User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
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
    And User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
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
    And User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
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
    Scenario: Check the pay options post adding of the beneficiary detials in the beneficiary management for the own bank transfer
    
     And User7180 loads the test datasetup for the test case id AT_BM_012
    Given User7180 navigates to the omni_corporate_portal_retail
    And User7180 enters the CorporateUser in the login page for omni_web_portal for beneficiary
    And User7180 enters the CorporatePass in the login page for omni_web_portal for beneficiary
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click on the Beneficiary Management in the Home screen Retail User
    And User7180 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen
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
    Scenario: Check the pay options post adding of the beneficiary detials in the beneficiary management for the own bank transfer
    
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
