Feature: Checking the functionalities of Account Transfer


@AT_003
Scenario: Submit own account transfer - one time with corporate user_614 and two approvals are required

#Given user_614 navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA
#And user_614 loads the test datasetup for the test case id AT_003
#And user_614 click on the parameters features in the OmniScreen admin page
#And user_614 click on the user_614 management label in the admin screen
#And user_614 click on the cutomer approval matrix feature under the parameters
#And user_614 click on the search icon in the customer approval matrix
#And user_614 enters the approval matrix code in the code field and click on the enter button
#And user_614 selects the inputed code from the search result and double click on it
#And user_614 selects the already defined limit types and delete if anything is already defined
#And user_614 click on the add button and add the first limit type in the customer approval matrix
#And user_614 click on the limit type and select the range option in customer approval matrix
#And user_614 enter the minimum amount in customer approval matrix for first row
#And user_614 enter the maximum amount in customer approval matrix for first row
#And user_614 enter the group id in customer approval matrix for first row
#And user_614 enter the number of user_614 in the customer approval matrix for first row
#And user_614 click on the save button in the customer approval matrix
#And user_614 click on the ok button for the warning popup in the customer approval matrix
#And user_614 click on the ok button for the Success popup in the customer approval matrix
#And user_614 click on the search icon in the customer approval matrix
#And user_614 enters the approval matrix code in the code field and click on the enter button
#And user_614 selects the inputed code from the search result and double click on it
#And user_614 clicks on the approve button in the customer approval matrix
#And user_614 click on the ok button for the warning popup in the customer approval matrix
#And user_614 click on the ok button for the Success popup in the customer approval matrix

And user_614 loads the test datasetup for the test case id AT_003
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the maker user_614name1 in the login page for omni_corporate_web_portal
And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the AMANA payment screen in the homepage
And user_614 click on the transfers under the AMANA payment screen
And user_614 click on the transfers within own accounts under transfer_Amana payment screen
And user_614 click on the From accounts from the transfers within own accounts
And user_614 selects the from account from the dropdown in transfers within own accounts
And user_614 click on the To accounts from the transfers within own accounts
And user_614 selects the To account from the dropdown in transfers within own accounts
And user_614 enters the transaction amount in the transfers screen
And user_614 enters the purpose of transaction in the transfers screen
And user_614 click on next btn in the transfers screen
And user_614 click on submit btn in the transfers screen
And user_614 waits for the confirmation on the submission report
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the checker user_614name1 in the login page for omni_corporate_web_portal
And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the TODO icon in homescreen on omni web portal
And user_614 click on the 1st pending item in the list
And user_614 click on the approve btn for the pending transfer request from the maker
And user_614 waits for the confirmation on the submission report
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal





#Checker Approval2
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the checker user_614name2 in the login page for omni_corporate_web_portal
And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the TODO icon in homescreen on omni web portal
And user_614 click on the 1st pending item in the list
And user_614 click on the approve btn for the pending transfer request from the maker
And user_614 waits for the confirmation on the submission report
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal


@AT_006
Scenario: Submit Transfer to Own Bank - one time with corporate user_614 and two approvals are required

And user_614 loads the test datasetup for the test case id AT_006
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the maker user_614name1 in the login page for omni_corporate_web_portal
And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the AMANA payment screen in the homepage
And user_614 click on the transfers under the AMANA payment screen
And user_614 click on the transfers within own accounts under transfer_Amana payment screen
And user_614 click on the From accounts from the transfers within own accounts
And user_614 selects the from account from the dropdown in transfers within own accounts
And user_614 click on the To accounts from the transfers within own accounts
And user_614 selects the To account from the dropdown in transfers within own accounts
And user_614 enters the transaction amount in the transfers screen
And user_614 enters the purpose of transaction in the transfers screen
And user_614 click on next btn in the transfers screen
And user_614 click on submit btn in the transfers screen
And user_614 waits for the confirmation on the submission report
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the checker user_614name1 in the login page for omni_corporate_web_portal
And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the TODO icon in homescreen on omni web portal
And user_614 click on the 1st pending item in the list
And user_614 click on the approve btn for the pending transfer request from the maker
And user_614 waits for the confirmation on the submission report
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal


#Checker Approval2
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the checker user_614name2 in the login page for omni_corporate_web_portal
And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the TODO icon in homescreen on omni web portal
And user_614 click on the 1st pending item in the list
And user_614 click on the approve btn for the pending transfer request from the maker
And user_614 waits for the confirmation on the submission report
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal




@AT_009
Scenario: Submit Transfer to Other Bank - one time with corporate user_614 and two approvals are required

And user_614 loads the test datasetup for the test case id AT_009
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the maker user_614name1 in the login page for omni_corporate_web_portal
And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the AMANA payment screen in the homepage
And user_614 click on the transfers under the AMANA payment screen
And user_614 click on the transfers to other bank accounts under transfer_Amana payment screen
And user_614 click on the From accounts from the transfers to other bank accounts
And user_614 selects the from account from the dropdown in transfers to other bank accounts
And user_614 click on the To accounts from the transfers to other bank accounts
And user_614 selects the To account from the dropdown in transfers to other bank accounts
And user_614 enters the transaction amount in the transfers screen
And user_614 enters the purpose of transaction in the transfers screen
And user_614 click on next btn in the transfers screen
And user_614 click on submit btn in the transfers screen
And user_614 waits for the confirmation on the submission report for other bank transfer
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the checker user_614name1 in the login page for omni_corporate_web_portal
And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the TODO icon in homescreen on omni web portal
And user_614 click on the 1st pending item in the list
And user_614 click on the approve btn for the pending transfer request from the maker
And user_614 waits for the confirmation on the submission report for other bank transfer
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal


#Checker Approval2
Given user_614 navigates to the omni_corporate_web_portal
And user_614 enters the checker user_614name2 in the login page for omni_corporate_web_portal
And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
And user_614 click on the loggin button in the login page for omni_corporate_web_portal
And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
And user_614 click on the TODO icon in homescreen on omni web portal
And user_614 click on the 1st pending item in the list
And user_614 click on the approve btn for the pending transfer request from the maker
And user_614 waits for the confirmation on the submission report for other bank transfer
And user_614 gets the reference number from the submission report
And user_614 clicks on logout btn to logout from omni web portal







