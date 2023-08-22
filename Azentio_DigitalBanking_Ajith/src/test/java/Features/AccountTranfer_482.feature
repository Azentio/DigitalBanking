Feature: Testing the functionalities of Account Transfer
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
And user_482 click next button under scheduled other bank transfer
And user_482 click submit button under scheduled other bank transfer
And user_482 click ok button for request submitted successfully or request time

@AT_21_02
Scenario: Submit the transfer record in checker
And user_482 loads the test datasetup for the test case id AT_020
Given user_482 navigates to the omni_corporate_web_portal
And user enters the checker username1 in the login page for omni_corporate_web_portal
And user enters the checker password1 in the login page for omni_corporate_web_portal
#And user
