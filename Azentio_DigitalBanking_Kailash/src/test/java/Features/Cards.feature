Feature:  Testing the functionalities of Cards in omni
#cards
@CRD_019
Scenario: block card -- maker - checker testing - enabled and approve
And user_5679 loads the test datasetup for the test case id CRD_019
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And user_5679 click on the Show More button in Debit cards page 
And user_5679 click on the block for block the selected Debit Card
And user_5679 click on the Block card reason in Block Card page
And user_5679 Select the Block card reason in Block Card page
And user_5679 click on the Next button in Block Card page
And user_5679 click i agree on terms and conditions
And user_5679 click on the Next button in Block Card page
And user_5679 click submit button under Block Card page
And user_5679 click ok on User privileges in Afer Sumbit
And user_5679 click log out button
#approve block card request
And user_5679 loads the test datasetup for the test case id CRD_019
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username2 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password2 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the TODO icon in homescreen on omni web portal
And user_5679 click on the 1st pending item in the list
And user_5679 click on the Approve button in item list

@CRD_020
Scenario: block card -- maker - checker testing - enabled and approve
And user_5679 loads the test datasetup for the test case id CRD_020
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And user_5679 click on the Show More button in Debit cards page 
And user_5679 click on the block for block the selected Debit Card
And user_5679 click on the Block card reason in Block Card page
And user_5679 Select the Block card reason in Block Card page
And user_5679 click on the Next button in Block Card page
And user_5679 click i agree on terms and conditions
And user_5679 click on the Next button in Block Card page
And user_5679 click submit button under Block Card page
And user_5679 click ok on User privileges in Afer Sumbit
And user_5679 click log out button
#reject block card request
And user_5679 loads the test datasetup for the test case id CRD_020
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username2 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password2 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the TODO icon in homescreen on omni web portal
And user_5679 click on the 1st pending item in the list
And user_5679 click on the Reject button in item list

@CRD_021
Scenario: block card -- maker - checker testing - disabled
And user_5679 loads the test datasetup for the test case id CRD_021
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And user_5679 click on the Show More button in Debit cards page 
And user_5679 click on the block for block the selected Debit Card
And user_5679 click on the Block card reason in Block Card page
And user_5679 Select the Block card reason in Block Card page
And user_5679 click on the Next button in Block Card page
And user_5679 click i agree on terms and conditions
And user_5679 click on the Next button in Block Card page
And user_5679 click submit button under Block Card page
And user_5679 click ok on User privileges in Afer Sumbit
And user_5679 click log out button
#request is send to csm webservice and card is blocked successfully 

@CRD_022
Scenario: activate card -- maker - checker testing - enabled and approve
And user_5679 loads the test datasetup for the test case id CRD_022
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And user_5679 click on the Show More button in Debit cards page 
# NO ACTIVATE BUTTON EXECUTION BLOCKED BECAUSE OF BUG

@CRD_023
Scenario: activate card -- maker - checker testing - enabled and reject
And user_5679 loads the test datasetup for the test case id CRD_023
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And user_5679 click on the Show More button in Debit cards page
#NO ACTIVATE BUTTON EXECUTION BLOCKED BECAUSE OF BUG

@ALR_002
Scenario: check if the system Validate Activity log for non beneficiary internal  Transfer - Retail _MB
And user_5679 loads the test datasetup for the test case id ALR_002
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the transfers under the AMANA payment screen
And user_5679 Click on the Transfer to other bank account in Trnasfer screen
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 selects the from account from the dropdown in transfers within own accounts
#And user_5679 Account in from value in Bank
And user_5679 Select the To Account in Transafer to other bank account
And user_5679 Account To value in Bank
And user_5679 Enter the Amount in Transafer
And user_5679 click on the Purpose in transfer account
And user_5679 click on the Next button in transfer account
And user_5679 click on Agree box
And user_5679 click on the Next button in transfer account
And user_5679 Click on Submit button in transfer account
And user_5679 click on the profile Info in ALR
And user_5679 Click on the Active Log in Transafer
And user_5679 click on the My Active log Report in profile
And user_5679 click on the Export button in ALR







