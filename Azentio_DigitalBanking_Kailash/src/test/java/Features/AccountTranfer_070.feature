Feature: Testing the functionalities of Account Transfer
@AT_20_01
Scenario: Submit Transfer to Other Bank - scheduled with corporate user and one approval is required
And user loads the test datasetup for the test case id AT_020
Given user navigates to the omni_corporate_web_portal
And user enters the maker username1 in the login page for omni_corporate_web_portal
And user enters the maker password1 in the login page for omni_corporate_web_portal
And user click on the loggin button in the login page for omni_corporate_web_portal
And user click on the force logout btn in the login page for omni_corporate_web_portal
And user click on the ok button for the successful login page for omni_corporate_web_portal
And user click on the AMANA payment screen in the homepage
And user_072 click scheduled transfer under AMANA payment screen
And user_072 click scheduled other bank transfer under the AMANA payment screen
And user_072 select from account under scheduled other bank transfer
And user_072 select beneficiary under scheduled other bank transfer
And user_072 enter transfer amount under scheduled other bank transfer
And user_072 enter purpose of transfer under scheduled other bank transfer
And user_072 click next button under scheduled other bank transfer
And user_072 select periodicity under scheduled other bank transfer
And user_072 enter number of payments under scheduled other bank transfer
And user_072 click next button under scheduled other bank transfer
And user_072 click submit button under scheduled other bank transfer
And user_072 click ok button for request submitted successfully or request time

@AT_20_02
Scenario: Submit the transfer record in checker
And user loads the test datasetup for the test case id AT_020
Given user navigates to the omni_corporate_web_portal
And user enters the checker username1 in the login page for omni_corporate_web_portal
And user enters the checker password1 in the login page for omni_corporate_web_portal
#And user
