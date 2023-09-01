Feature: Checking the functionalities of Account Transfer


@AT_003
Scenario: Submit own account transfer - one time with corporate user and two approvals are required

And user_612 select periodicity under scheduled own bank transfer
And user_612 enter number of payments under scheduled own bank transfer
And user_612 click next button under scheduled own bank transfer
And user_612 click submit button under scheduled own bank transfer
And user_612 click ok button for request submitted successfully or request time

#Given user_614 navigates to the omni_corporate_web_portal
#And user_614 loads the test datasetup for the test case id AT_003
#And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
#And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
#And user_614 click on the loggin button in the login page for omni_corporate_web_portal
#And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
#And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
#And user_614 click on the AMANA payment screen in the homepage
#And user_614 click on the transfers under the AMANA payment screen
#And user_614 click on the transfers within own accounts under transfer_Amana payment screen
#And user_614 click on the From accounts from the transfers within own accounts
#And user_614 selects the from account from the dropdown in transfers within own accounts
#And user_614 click on the To accounts from the transfers within own accounts
#And user_614 selects the To account from the dropdown in transfers within own accounts
#And user_614 enters the transaction amount in the transfers screen
#And user_614 enters the purpose of transaction in the transfers screen
#And user_614 click on next btn in the transfers screen
#And user_614  click on the I agree to terms and conditions checkbox
#And user_614 click on submit btn in the transfers screen
#And user_614 waits for the confirmation on the submission report
#And user_614 gets the reference number from the submission report
#And user_614 clicks on logout btn to logout from omni web portal
#
#Checker Approval1
#Given user_614 navigates to the omni_corporate_web_portal
#And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
#And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
#And user_614 click on the loggin button in the login page for omni_corporate_web_portal
#And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
#And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
#And user_614 click on the TODO icon in homescreen on omni web portal
#And user_614 click on the 1st pending item in the list
#And user_614 click on the approve btn for the pending transfer request from the maker
#And user_614 waits for the confirmation on the submission report
#And user_614 gets the reference number from the submission report
#And user_614 clicks on logout btn to logout from omni web portal
#
#
#

