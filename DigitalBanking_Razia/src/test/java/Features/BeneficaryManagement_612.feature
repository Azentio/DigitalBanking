Feature: Checking the functionalities of BeneficaryManagement

@AT_BM_044
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Enable beneficiary approval)
And User_612 loads the test datasetup for the test case id AT_BM_044
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the corpuser in the login page for omni_corporate_web_portal
And user_612 enters the corppassword in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 Click on the Beneficiary Management in the Home screen Retail User
And user_612 Click on the local bank transfer in beneficiary management
And user_612 Click on the Add local beneficiary in beneficiary management
#And user_612 Click on the Bank dropdown below the local beneficiary
And user_612 Search bank name and select the bank in the dropdown
#And user_612 Enter the Valid Account number below the Add ineternal Beneficiary
#And user_612 Enter the BVN Number below the Add Local Beneficiary
And user_612 Click on the currency dropdown for select Currency
And user_612 Search Currency and select the Currency in the dropdown 
And user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary
And user_612 click on the country for selecting below the Add ineternal Beneficiary
And user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown
And user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary
And user_612 Enter the Mobile number below the Add ineternal Beneficiary
And user_612 Enter the Purpose of the Add Internal Beneficiary Bank
And user_612 Click on the Next button in limit Update Screen
And user_612 Click on the Submit button in Beneficiary 
And user_612 Verify the saved Local Transfer Beneficiary data
And user_612 Click on the saved data showmore button


@AT_BM_044_01
Scenario: Add a beneficiary for the Local bank transfer for retail user with valid account (Enable beneficiary approval in Admin user)
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And user_612 Click on the Parameters menu
And user_612 Click on the Profile Management submenu



 