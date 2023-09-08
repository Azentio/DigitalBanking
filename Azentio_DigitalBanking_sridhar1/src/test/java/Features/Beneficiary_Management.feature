Feature: Beneficiary Management details created
@AT_076
Scenario: check if the beneficiary BVN  Field available under beneficiary management screen
And user_072 loads the test datasetup for the test case id AT_076
Given user_072 navigates to the omni_corporate_web_portal
And user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal
And user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal
And user_072 click on the loggin button in the login page for omni_corporate_web_portal
And user_072 click on the force logout btn in the login page for omni_corporate_web_portal
And user_072 click on the ok button for the successful login page for omni_corporate_web_portal
And user_072 click on the Beneficiary Management details for web_portal
And user_072 click on the Local filed in Beneficiary for web_portal
And user_072 click on the Add_Local_Beneficiary for web_portal


@AT_077
Scenario: check if system validate min length BVN beneficiary Field
And user_072 loads the test datasetup for the test case id AT_077
Given user_072 navigates to the omni_corporate_web_portal
And user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal
And user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal
And user_072 click on the loggin button in the login page for omni_corporate_web_portal
And user_072 click on the force logout btn in the login page for omni_corporate_web_portal
And user_072 click on the ok button for the successful login page for omni_corporate_web_portal
And user_072 click on the Beneficiary Management details for web_portal
And user_072 click on the Local filed in Beneficiary for web_portal
And user_072 click on the Add_Local_Beneficiary for web_portal
#And user_072 click on the Bank Name in Benficiary for web_portal
And user_072 Select the Bank Name in Benficiary for web_portal
And user_072 select the ISVAN in Bank Namefor Benficiary for web_portal
And user_072 enter the Beneficiary Bank BVN filed in Benficiary for web_portal
And user_072 enter the Account Number in Benficiary for web_portal
And user_072 enter the Currency value in Benficiary for web_portal
And user_072 select the MVI in Bank Namefor Benficiary for web_portal
And user_072 enter the Name Of Beneficiary in Benficiary for web_portal
And user_072 enter the Country in Benficiary for web_portal
And user_072 select the Country in Bank Namefor Benficiary for web_portal
And user_072 enter the Moblie Number in Benficiary for web_portal
And user_072 enter the Purpose in Benficiary for web_portal
And user_072 click the Next in Benficiary for web_portal
And user_072 click save button in Benficiary for web_portal
And user_072 click the submit button in Benficiary for web_portal

@AT_078
Scenario: check if system validate min length BVN beneficiary Field
And user_072 loads the test datasetup for the test case id AT_078
Given user_072 navigates to the omni_corporate_web_portal
And user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal
And user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal
And user_072 click on the loggin button in the login page for omni_corporate_web_portal
And user_072 click on the force logout btn in the login page for omni_corporate_web_portal
And user_072 click on the ok button for the successful login page for omni_corporate_web_portal
And user_072 click on the Beneficiary Management details for web_portal
And user_072 click on the Local filed in Beneficiary for web_portal
And user_072 click on the Add_Local_Beneficiary for web_portal
#And user_072 click on the Bank Name in Benficiary for web_portal
And user_072 Select the Bank Name in Benficiary for web_portal
And user_072 select the ISVAN in Bank Namefor Benficiary for web_portal
And user_072 enter the Beneficiary Bank BVN filed in Benficiary for web_portal
And user_072 enter the Account Number in Benficiary for web_portal
And user_072 enter the Currency value in Benficiary for web_portal
And user_072 select the MVI in Bank Namefor Benficiary for web_portal
And user_072 enter the Name Of Beneficiary in Benficiary for web_portal
And user_072 enter the Country in Benficiary for web_portal
And user_072 select the Country in Bank Namefor Benficiary for web_portal
And user_072 enter the Moblie Number in Benficiary for web_portal
And user_072 enter the Purpose in Benficiary for web_portal
And user_072 click the Next in Benficiary for web_portal
And user_072 click save button in Benficiary for web_portal
And user_072 click the submit button in Benficiary for web_portal


#Cards

@CRD_013
Scenario: authentication matrix testing - Debit card
And user_072 loads the test datasetup for the test case id CRD_013
Given user_072 navigates to the omni_corporate_web_portal_13
And user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal_13
And user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal_13
And user_072 click on the loggin button in the login page for omni_corporate_web_portal_13
And user_072 click on the force logout btn in the login page for omni_corporate_web_portal_13
And user_072 click on the ok button for the successful login page for omni_corporate_web_portal_13
And user_072 Click on the Cards in authentication Matrix
And user_072 click on the My Cards in authentication Matrix
#And user_072 click on the Active in authentication Matrix
And user_072 CLick on the Show Less option in authentication Matrix
And user_072 click on the Block the debit card in authentication Matrix
And user_072 click on the card block reason in authentication Matrix
And user_072 select the please card block in reason
And user_072 click on the Next button in Block Card page
And user_072 click the I agree button in authentication Matrix
And user_072 click on the Next button in Block Card page
And user_072 click the submit button in authentication Matrix
And user_072 enter the OTP in Block card to verify
And user_072 click the verify button in block card

@CRD_014
Scenario: authentication matrix testing - Credit card
And user_072 loads the test datasetup for the test case id CRD_013
Given user_072 navigates to the omni_corporate_web_portal_13
And user_072 enters the maker checker username1 in the login page for omni_corporate_web_portal_13
And user_072 enters the maker checker password1 in the login page for omni_corporate_web_portal_13
And user_072 click on the loggin button in the login page for omni_corporate_web_portal_13
And user_072 click on the force logout btn in the login page for omni_corporate_web_portal_13
And user_072 click on the ok button for the successful login page for omni_corporate_web_portal_13
And user_072 Click on the Cards in authentication Matrix
And user_072 click on the My Cards in authentication Matrix
And user_072 click on the credit card request in matrix
And user_072 CLick on the Show Less option in authentication Matrix
And user_072 click on the Block the debit card in authentication Matrix
And user_072 click on the card block reason in authentication Matrix
And user_072 select the please card block in reason
And user_072 click on the Next button in Block Card page
And user_072 click the I agree button in authentication Matrix
And user_072 click on the Next button in Block Card page
And user_072 click the submit button in authentication Matrix
And user_072 enter the OTP in Block card to verify
And user_072 click the verify button in block card

#Active log Report

@ALR_003
Scenario: check if the system Validate Activity log for non beneficiary internal  Transfer "Corporate_IB _maker checker "
And user_0072 loads the test datasetup for the test case id ALR_003
Given user_0072 navigates to the omni_corporate_web_portal
And user_0072 enters the maker username1 in the login page for omni_corporate_web_portal
And user_0072 enters the maker password1 in the login page for omni_corporate_web_portal
And user_0072 click on the loggin button in the login page for omni_corporate_web_portal
And user_0072 click on the force logout btn in the login page for omni_corporate_web_portal
And user_0072 click on the ok button for the successful login page for omni_corporate_web_portal
And user_0072 click on the AMANA payment screen in the homepage in ALR
And user_0072 click on the Transafer in AMANA payment screen
And user_0072 Click on the Transfer to other bank account in Trnasfer screen
And user_0072 Select the From account in Transafer to other bank account
And user_0072 Account in from value in Bank
And user_0072 Select the To Account in Transafer to other bank account
And user_0072 Account To value in Bank
And user_0072 Enter the Amount in Transafer
And user_0072 click on the Purpose in transfer account
And user_0072 click on the Next button in trnasfer account
And user_0072 click on Agree box
And user_0072 click on the Next button in trnasfer account
And user_0072 Click on Submit button in transfer account
And user_0072 click on the profile Info in ALR
And user_0072 Click on the Active Log in Transafer
And user_0072 click on the My Active log Report in profile
And user_0072 click on the Export button in ALR


@ALR_004
Scenario: Check if the system Validate Activity log for non beneficiary internal  Transfer "Corporate_IB _maker user  "
And user_0072 loads the test datasetup for the test case id ALR_004
Given user_0072 navigates to the omni_corporate_web_portal
And user_0072 enters the maker username1 in the login page for omni_corporate_web_portal
And user_0072 enters the maker password1 in the login page for omni_corporate_web_portal
And user_0072 click on the loggin button in the login page for omni_corporate_web_portal
And user_0072 click on the force logout btn in the login page for omni_corporate_web_portal
And user_0072 click on the ok button for the successful login page for omni_corporate_web_portal
And user_0072 click on the AMANA payment screen in the homepage in ALR
And user_0072 click on the Transafer in AMANA payment screen
And user_0072 Click on the Transfer to other bank account in Trnasfer screen
And user_0072 Select the From account in Transafer to other bank account
And user_0072 Account in from value in Bank
And user_0072 Select the To Account in Transafer to other bank account
And user_0072 Account To value in Bank
And user_0072 Enter the Amount in Transafer
And user_0072 click on the Purpose in transfer account
And user_0072 click on the Next button in trnasfer account
And user_0072 click on Agree box
And user_0072 click on the Next button in trnasfer account
And user_0072 Click on Submit button in transfer account
And user_0072 click on the profile Info in ALR
And user_0072 Click on the Active Log in Transafer
And user_0072 click on the My Active log Report in profile
And user_0072 click on the Export button in ALR

@ALR_005
Scenario: check if the system Validate Activity log for non beneficiary internal  Transfer "Corporate_IB _checker user  "approve request
And user_0072 loads the test datasetup for the test case id ALR_005
Given user_0072 navigates to the omni_corporate_web_portal
And user_0072 enters the maker username1 in the login page for omni_corporate_web_portal
And user_0072 enters the maker password1 in the login page for omni_corporate_web_portal
And user_0072 click on the loggin button in the login page for omni_corporate_web_portal
And user_0072 click on the force logout btn in the login page for omni_corporate_web_portal
And user_0072 click on the ok button for the successful login page for omni_corporate_web_portal
And user_0072 click on the AMANA payment screen in the homepage in ALR
And user_0072 click on the Transafer in AMANA payment screen
And user_0072 Click on the Transfer to other bank account in Trnasfer screen
And user_0072 Select the From account in Transafer to other bank account
And user_0072 Account in from value in Bank
And user_0072 Select the To Account in Transafer to other bank account
And user_0072 Account To value in Bank
And user_0072 Enter the Amount in Transafer
And user_0072 click on the Purpose in transfer account
And user_0072 click on the Next button in trnasfer account
And user_0072 click on Agree box
And user_0072 click on the Next button in trnasfer account
And user_0072 Click on Submit button in transfer account
And user_0072 click on the profile Info in ALR
And user_0072 Click on the Active Log in Transafer
And user_0072 click on the My Active log Report in profile
And user_0072 click on the Export button in ALR
