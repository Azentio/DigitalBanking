Feature:  Testing the functionalities of Cards (11,14)
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
And User_626 click on the block card reason in the block card Screen
And User_626 Select the option below the block card Screen
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

