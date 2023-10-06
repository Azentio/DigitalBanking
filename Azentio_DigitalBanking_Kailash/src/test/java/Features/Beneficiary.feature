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





