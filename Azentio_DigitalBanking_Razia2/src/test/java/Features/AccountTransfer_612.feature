Feature: Checking the functionalities of Account Transfer

@AT_002
Scenario: Submit own account transfer - one time with corporate user and one approval is required
And user_612 loads the test datasetup for the test case id AT_002
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the maker user_612name1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the transfers within own accounts under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal
#Checker Approval1
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker user_612name1 in the login page for omni_corporate_web_portal
And user_612 enters the checker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal


@AT_005
Scenario: Submit Transfer to Own Bank - one time with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_005
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the transfers within own accounts under transfer_Amana payment screen
# own bank  transfer... pending
#And user_612 click on the From accounts from the transfers within own accounts
#And user_612 selects the from account from the dropdown in transfers within own accounts
#And user_612 click on the To accounts from the transfers within own accounts
#And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username1 in the login page for omni_corporate_web_portal
And user_612 enters the checker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal




@AT_008
Scenario: Submit Transfer to Other Bank - one time with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_008
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the transfers to other bank accounts under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers to other bank accounts
And user_612 selects the from account from the dropdown in transfers to other bank accounts
And user_612 click on the To accounts from the transfers to other bank accounts
And user_612 selects the To account from the dropdown in transfers to other bank accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for other bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username1 in the login page for omni_corporate_web_portal
And user_612 enters the checker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report for other bank transfer
And user_612 gets the reference number from the submission report


@At_0011

Scenario: Submit International Transfer one time with corporate user and one approval is required

Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_011
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the international bank transfer under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers for international bank transfer
And user_612 selects the from account from the dropdown in transfers for international bank transfer
And user_612 click on the To accounts from the transfers for international bank transfer
And user_612 selects the To account from the dropdown in transfers for international bank transfer
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for international bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username1 in the login page for omni_corporate_web_portal
And user_612 enters the checker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report for international bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

@AT_014
Scenario: Submit own account transfer - scheduled with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_014
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own accounts under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612  click on the I agree to terms and conditions checkbox
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for scheduled own account transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username1 in the login page for omni_corporate_web_portal
And user_612 enters the checker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report for scheduled own account transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

@AT_017
Scenario: Submit Transfer to Own Bank - scheduled with corporate user and one approval is required
 
change








