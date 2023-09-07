Feature: Checking the functionalities of Account Transfer


  @AT_003
  Scenario: Submit own account transfer - one time with corporate user and two approvals are required

Given user_614 navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA
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

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_003
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
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
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
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
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
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
  Scenario: Submit Transfer to Own Bank - one time with corporate user and two approvals are required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_006
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the transfers under the AMANA payment screen
    And user_614 click on the transfers within own banks under transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers within own accounts
    And user_614 selects the from account from the dropdown in transfers within own accounts
    And user_614 click on the To accounts from the transfers within own accounts
    And user_614 selects the To account from the dropdown in transfers within own accounts
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for own bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
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
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
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
  Scenario: Submit Transfer to Other Bank - one time with corporate user and two approvals are required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_009
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
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
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for other bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
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
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
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

  @AT_012
  Scenario: Submit International Transfer - one time with corporate user and two approvals are required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_012
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the transfers under the AMANA payment screen
    And user_614 click on the international bank transfer under transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers for international bank transfer
    And user_614 selects the from account from the dropdown in transfers for international bank transfer
    And user_614 click on the To accounts from the transfers for international bank transfer
    And user_614 selects the To account from the dropdown in transfers for international bank transfer
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for international bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for international bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal


#Checker Approval2
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for international bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

  @AT_015
  Scenario: Submit own account transfer - scheduled with corporate user and two approvals are required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_015
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the scheduled transfers under the AMANA payment screen
    And user_614 click on the scheduled transfers within own accounts under scheduled transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers within own accounts
    And user_614 selects the from account from the dropdown in transfers within own accounts
    And user_614 click on the To accounts from the transfers within own accounts
    And user_614 selects the To account from the dropdown in transfers within own accounts
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614 click on the periodicity dropdown in scheduled transfer
    And user_614 click on the single future date from the dropdown in scheduled transfer
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
#And user_614 click on next btn in the transfers screen
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for scheduled own account transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for scheduled own account transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal


#Checker Approval2
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for scheduled own account transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

  @AT_018
  Scenario: Submit Transfer to Own Bank - scheduled with corporate user and two approvals are required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_018
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the scheduled transfers under the AMANA payment screen
    And user_614 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers within own accounts
    And user_614 selects the from account from the dropdown in transfers within own accounts
    And user_614 click on the To accounts from the transfers within own accounts
    And user_614 selects the To account from the dropdown in transfers within own accounts
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614 click on the periodicity dropdown in scheduled transfer
    And user_614 click on the single future date from the dropdown in scheduled transfer
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
#And user_614 click on next btn in the transfers screen
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for scheduled own account transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for scheduled own account transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal


#Checker Approval2
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for scheduled own account transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal


  @AT_025
  Scenario: Submit Transfer to Other Bank Accounts - to others - one time with corporate user have maker checker access

  @AT_030
  Scenario: Submit Transfer to Bank Accounts - to others - one time with corporate user and one approval is required

  @AT_035
  Scenario: Submit own account transfer - one time with corporate user and 2 approval is required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_035
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
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
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
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
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
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


  @AT_040
  Scenario: Submit own bank transfer to predefined beneficiary  - one time with corporate user and one approval is required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_040
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the transfers under the AMANA payment screen
    And user_614 click on the transfers within own banks under transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers within own accounts
    And user_614 selects the from account from the dropdown in transfers within own accounts
    And user_614 click on the To accounts from the transfers within own accounts
    And user_614 selects the To account from the dropdown in transfers within own accounts
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for own bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
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

  @AT_048
  Scenario: Submit own bank transfer to non predefined beneficiary - scheduled with corporate user have maker checker access

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_048
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the transfers under the AMANA payment screen
    And user_614 click on the transfers within own banks under transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers within own accounts
    And user_614 selects the from account from the dropdown in transfers within own accounts
    And user_614 click on the To other beneficiary in the transfers within own accounts
    And user_614 enters the To account number in transfers within own accounts
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 click on ok button for request submitted successfully popup
    And user_614 waits for the confirmation on the submission report for own bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 validates the reference id from the confirmation report as per DB oc_data_save
    And user_614 validates the from account and To account from the confirmation report
    And user_614 validates the exchange amount and currency is showing or not
    And user_614 validates the purpose of the transaction is showing or not
    And user_614 clicks on logout btn to logout from omni web portal
    And user_614 gets the core reference number from the confirmation
    
    # Validation with CSM Core portal
    And user_614 navigates to the CSM core portal
    And user_614 login to the CSM core portal with valid credentials of Model.B
    And user_614 click on the transaction screen from the CSM core portal homescreen
    And user_614 click on the maintenance under the transaction screen on CSM
    And user_614 click on the search icon on the maintenance under the transaction screen
    And user_614 enters the transaction number taken from the Omni confirmation report
    And user_614 validates the record is retrieved from the entered transaction number
    And user_614 validates the status is approved for the transaction number
    And user_614 click on the loggout button to logout from the CSM core portal

  @AT_051
  Scenario: Submit other bank transfer to predefined beneficiary - one time with corporate user have maker checker access

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_051
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
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
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 click on ok button for request submitted successfully popup
    And user_614 waits for the confirmation on the submission report for other bank transfer
    And user_614 validates the reference id from the confirmation report as per DB oc_data_save
    And user_614 validates the from account and To account from the confirmation report
    And user_614 validates the exchange amount and currency is showing or not
    And user_614 validates the purpose of the transaction is showing or not
    And user_614 clicks on logout btn to logout from omni web portal
    And user_614 gets the core reference number from the confirmation
    
    # Validation with CSM Core portal
    And user_614 navigates to the CSM core portal
    And user_614 login to the CSM core portal with valid credentials of Model.B
    And user_614 click on the transaction screen from the CSM core portal homescreen
    And user_614 click on the maintenance under the transaction screen on CSM
    And user_614 click on the search icon on the maintenance under the transaction screen
    And user_614 enters the transaction number taken from the Omni confirmation report
    And user_614 validates the record is retrieved from the entered transaction number
    And user_614 validates the status is approved for the transaction number
    And user_614 click on the loggout button to logout from the CSM core portal


  @AT_062
  Scenario: Submit other bank transfer to non predefined beneficiary - scheduled with corporate user and 2 approval is required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_062

  @AT_063
  Scenario: Submit international transfer to predefined beneficiary - one time with corporate user have maker checker access

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_063

  @AT_064
  Scenario: Submit international transfer to predefined beneficiary  - one time with corporate user and one approval is required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_064

  @AT_065
  Scenario: Submit international transfer to predefined beneficiary  - one time with corporate user and 2 approval is required

    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 loads the test datasetup for the test case id AT_065
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the AMANA payment screen in the homepage
    And user_614 click on the transfers under the AMANA payment screen
    And user_614 click on the international bank transfer under transfer_Amana payment screen
    And user_614 click on the From accounts from the transfers for international bank transfer
    And user_614 selects the from account from the dropdown in transfers for international bank transfer
    And user_614 click on the To accounts from the transfers for international bank transfer
    And user_614 selects the To account from the dropdown in transfers for international bank transfer
    And user_614 enters the transaction amount in the transfers screen
    And user_614 enters the purpose of transaction in the transfers screen
    And user_614 click on next btn in the transfers screen
    And user_614  click on the I agree to terms and conditions checkbox
    And user_614 click on submit btn in the transfers screen
    And user_614 waits for the confirmation on the submission report for international bank transfer
    And user_614 validates the reference id from the confirmation report as per DB oc_data_save
    And user_614 validates the from account and To account from the confirmation report
    And user_614 validates the exchange amount and currency is showing or not
    And user_614 validates the purpose of the transaction is showing or not
    And user_614 clicks on logout btn to logout from omni web portal

#Checker Approval1
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for international bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal


#Checker Approval2
    Given user_614 navigates to the omni_corporate_web_portal
    And user_614 enters the checker username2 in the login page for omni_corporate_web_portal
    And user_614 enters the checker password2 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the TODO icon in homescreen on omni web portal
    And user_614 click on the 1st pending item in the list
    And user_614 click on the approve btn for the pending transfer request from the maker
    And user_614 waits for the confirmation on the submission report for international bank transfer
    And user_614 gets the reference number from the submission report
    And user_614 clicks on logout btn to logout from omni web portal


