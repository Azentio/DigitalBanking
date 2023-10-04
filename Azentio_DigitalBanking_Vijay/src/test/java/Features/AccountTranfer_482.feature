Feature: Testing the functionalities of Account Transfer

@AT_019_01
Scenario: Submit Transfer to Other Bank - scheduled with corporate user have maker checker access
And user_482 loads the test datasetup for the test case id AT_019_01
Given user_482 navigates to the omni_corporate_web_portal
And user_482 enters the maker username1 in the login page for omni_corporate_web_portal
And user_482 enters the maker password1 in the login page for omni_corporate_web_portal
And user_482 click on the loggin button in the login page for omni_corporate_web_portal
And user_482 click on the force logout btn in the login page for omni_corporate_web_portal
And user_482 click on the ok button for the successful login page for omni_corporate_web_portal
And user_482 click on the AMANA payment screen in the homepage
And user_482 click scheduled transfer under AMANA payment screen
And user_482 click scheduled other bank transfer under the AMANA payment screen
And user_482 select from account under scheduled other bank transfer
And user_482 select beneficiary under scheduled other bank transfer
And user_482 enter transfer amount under scheduled other bank transfer
And user_482 enter purpose of transfer under scheduled other bank transfer
And user_482 click next button under scheduled other bank transfer
And user_482 select periodicity under scheduled other bank transfer
And user_482 enter number of payments under scheduled other bank transfer
And user_482 click next button1 under scheduled other bank transfer
And user_482 click submit button under scheduled other bank transfer
And user_482 click ok button for request submitted successfully or request time
@AT_21_01
Scenario: Submit Transfer to Other Bank - scheduled with corporate user and one approval is required
And user_482 loads the test datasetup for the test case id AT_020
Given user_482 navigates to the omni_corporate_web_portal
And user_482 enters the maker username1 in the login page for omni_corporate_web_portal
And user_482 enters the maker password1 in the login page for omni_corporate_web_portal
And user_482 click on the loggin button in the login page for omni_corporate_web_portal
And user_482 click on the force logout btn in the login page for omni_corporate_web_portal
And user_482 click on the ok button for the successful login page for omni_corporate_web_portal
And user_482 click on the AMANA payment screen in the homepage
And user_482 click scheduled transfer under AMANA payment screen
And user_482 click scheduled other bank transfer under the AMANA payment screen
And user_482 select from account under scheduled other bank transfer
And user_482 select beneficiary under scheduled other bank transfer
And user_482 enter transfer amount under scheduled other bank transfer
And user_482 enter purpose of transfer under scheduled other bank transfer
And user_482 click next button under scheduled other bank transfer
And user_482 select periodicity under scheduled other bank transfer
And user_482 enter number of payments under scheduled other bank transfer
And user_482 click next button1 under scheduled other bank transfer
And user_482 click submit button under scheduled other bank transfer
And user_482 click ok button for request submitted successfully or request time

@AT_21_02
Scenario: Submit the transfer record in checker
And user_482 loads the test datasetup for the test case id AT_020_02
Given user_482 navigates to the omni_corporate_web_portal
And user enters the checker username1 in the login page for omni_corporate_web_portal
And user enters the checker password1 in the login page for omni_corporate_web_portal
And user click to do icon in approval leve 1 
#And user
@AT_036
Scenario: Submit own account transfer - scheduled with corporate user have maker checker access
And user_482 loads the test datasetup for the test case id AT_036
Given user_482 navigates to the omni_corporate_web_portal
And user_482 enters the maker checker username1 in the login page for omni_corporate_web_portal
And user_482 enters the maker checker password1 in the login page for omni_corporate_web_portal
And user_482 click on the loggin button in the login page for omni_corporate_web_portal
And user_482 click on the force logout btn in the login page for omni_corporate_web_portal
And user_482 click on the ok button for the successful login page for omni_corporate_web_portal
And user_482 click on the AMANA payment screen in the homepage
And user_482 click scheduled transfer under AMANA payment screen
And user_482 click scheduled own Account transfer under the AMANA payment screen
And user_482 select from account under scheduled own bank transfer
And user_482 select To account under scheduled own bank transfer
And user_482 enter transfer amount under scheduled other bank transfer
And user_482 enter purpose of transfer under scheduled other bank transfer
And user_482 click next button under scheduled other bank transfer
And user_482 select periodicity under scheduled other bank transfer
And user_482 enter number of payments under scheduled other bank transfer
And user_482 click next button1 under scheduled other bank transfer
And user_482 click i agree on terms and conditions
And user_482 click next button1 under scheduled other bank transfer
And user_482 click submit button under scheduled other bank transfer
#And user_482 click ok button for request submitted successfully or request time
And user_482 click log out button


