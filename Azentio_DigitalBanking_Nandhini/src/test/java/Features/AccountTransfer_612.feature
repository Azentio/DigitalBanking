Feature: Checking the functionalities of Account Transfer 

@AT_002
Scenario: Submit own account transfer - one time with corporate user and one approval is required
And user_612 loads the test datasetup for the test case id AT_002
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
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
And user_612  click on the I agree to terms and conditions checkbox
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


@AT_005_01
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
And user_612 click on the transfers within own banks under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612  click on the I agree to terms and conditions checkbox
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for own bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal


#Checker Approval1
@AT_005_02
Scenario: Submit Transfer to Own Bank - one time with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_005
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




@AT_008_01
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
And user_612  click on the I agree to terms and conditions checkbox
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for other bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
@AT_008_02
Scenario: Submit Transfer to Other Bank - one time with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_008
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
And user_612 clicks on logout btn to logout from omni web portal


@AT_011_01
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
And user_612  click on the I agree to terms and conditions checkbox
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for international bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
@AT_011_02
Scenario: Submit International Transfer one time with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_011
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


@AT_014_01
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
#And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for scheduled own account transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
@AT_014_02
Scenario: Submit own account transfer - scheduled with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_014
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

@AT_017_01
Scenario: Submit Transfer to Own Bank - scheduled with corporate user and one approval is required
 Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_017
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
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
#And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for scheduled own account transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal


@AT_017_02
Scenario: Submit Transfer to Own Bank - scheduled with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_017
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


@AT_024
Scenario: Submit International Transfer - scheduled with corporate user and two approvals are required
And user_612 loads the test datasetup for the test case id AT_024
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the international transfers under the Transfers
And user_612 select from account under international transfers
And user_612 select beneficiary under international transfer
And user_612 enter transfer amount under international transfer
And user_612 enter purpose of transfer under international transfer
And user_612 click next button under international transfer
And user_612 click submit button under international transfer


@AT_024_01
Scenario: Submit International Transfer - scheduled with corporate user and two approvals are required
And user_612 loads the test datasetup for the test case id AT_024
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

@AT_024_02
Scenario: Submit International Transfer - scheduled with corporate user and two approvals are required
And user_612 loads the test datasetup for the test case id AT_024
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username2 in the login page for omni_corporate_web_portal
And user_612 enters the checker password2 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

 
@AT_034
Scenario: Submit own account transfer - one time with corporate user and one approval is required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_034
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
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
And user_612  click on the I agree to terms and conditions checkbox
And user_612 click on next btn in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

#Checker Approval1
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_034
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


@AT_039
Scenario: Submit own bank transfer to predefined beneficiary - one time with corporate user have maker checker access
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_039
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the transfers within own banks under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accounts
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accounts
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612  click on the I agree to terms and conditions checkbox
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 waits for the confirmation on the submission report for own bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

@AT_044
Scenario: Submit own bank transfer to predefined beneficiary  - scheduled with corporate user and 2 approval is required
And user_612 loads the test datasetup for the test case id AT_044
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click scheduled transfer under AMANA payment screen
And user_612 click Scheduled own bank transfer Under scheduled transfer
And user_612 click on the From accounts from the transfers within own accounts
And user_612 select from account under Scheduled own bank transfer
And user_612 click on beneficiary under Scheduled own bank transfer
And user_612 select beneficiary under Scheduled own bank transfer
And user_612 enter transfer amount under Scheduled own bank transfer
And user_612 enter purpose of transfer under Scheduled own bank transfer
And user_612 click next button under Scheduled own bank transfer
And user_612 select periodicity under scheduled own bank transfer
And user_612 enter number of payments under scheduled own bank transfer
And user_612 click next button under Scheduled own bank transfer
And user_612 click submit button under scheduled own bank transfer
And user_612 click ok button for request submitted successfully or request time
And user_612 waits for the confirmation on the submission report for own bank transfer
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

@AT_044_01
Scenario: Scenario: Submit own bank transfer to predefined beneficiary - scheduled with corporate user and 2 approval is required
And user_612 loads the test datasetup for the test case id AT_044
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

@AT_044_02
Scenario: Submit International Transfer - scheduled with corporate user and two approvals are required
And user_612 loads the test datasetup for the test case id AT_044
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username2 in the login page for omni_corporate_web_portal
And user_612 enters the checker password2 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal


@AT_047
Scenario: Submit own bank transfer to non predefined beneficiary - one time with corporate user and two approvals are required
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_047
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the transfers within own banks under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
 And user_612 selects the from account from the dropdown in transfers to other bank accounts
#And user_612 click on the From accounts from the transfers within own accounts
And user_612 Click the To other button to non predefined beneficiary under own bank transfer
And user_612 Select the bank to non predefined beneficiary under own bank transfer
And user_612 Click and enter the iban_Account number of non predefined beneficiary under own bank transfer
And user_612 click the save beneficiary button of non predefined beneficiary under own bank transfer
And user_612 Enter the ghanda test of non predefined beneficiary under own bank transfer
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click and check the I Aggree on terms and condition checkbox of non predefined beneficiary under own bank transfer
And user_612 click on nextButton of non predefined beneficiary under own bank transfer
And user_612 click the submit button of non predefined beneficiary under own bank transfer
And user_612 waits for the confirmation on the submission report
And user_612 clicks on logout btn to logout from omni web portal

@AT_024_01
Scenario: Submit own bank transfer to non predefined beneficiary - one time with corporate user and two approvals are required
And user_612 loads the test datasetup for the test case id AT_047
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

@AT_024_02
Scenario: Submit own bank transfer to non predefined beneficiary - one time with corporate user and two approvals are required
And user_612 loads the test datasetup for the test case id AT_047
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the checker username2 in the login page for omni_corporate_web_portal
And user_612 enters the checker password2 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the TODO icon in homescreen on omni web portal
And user_612 click on the 1st pending item in the list
And user_612 click on the approve btn for the pending transfer request from the maker
And user_612 waits for the confirmation on the submission report
And user_612 gets the reference number from the submission report
And user_612 clicks on logout btn to logout from omni web portal

 
@AT_058 
Scenario: Submit other bank transfer to non predefined beneficiary - one time with corporate user  and one approvals required  
Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id AT_058
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the transfers under the AMANA payment screen
And user_612 click on the transfers to other bank accounts under transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
 And user_612 selects the from account from the dropdown in transfers to other bank accounts
And user_612 click on the From accounts from the transfers within own accounts
And user_612 Click the To other button to non predefined beneficiary under own bank transfer
And user_612 Select the bank to non predefined beneficiary under own bank transfer
And user_612 Click and enter the iban_Account number of non predefined beneficiary under own bank transfer
And user_612 click the save beneficiary button of non predefined beneficiary under own bank transfer
And user_612 Enter the ghanda test of non predefined beneficiary under own bank transfer
And user_612 enters the transaction amount in the transfers screen
And user_612 enters the purpose of transaction in the transfers screen
And user_612 click on next btn in the transfers screen
And user_612 click and check the I Aggree on terms and condition checkbox of non predefined beneficiary under own bank transfer
And user_612 click on nextButton of non predefined beneficiary under own bank transfer
And user_612 click the submit button of non predefined beneficiary under own bank transfer
And user_612 waits for the confirmation on the submission report
And user_612 clicks on logout btn to logout from omni web portal


#@AT_059
#Scenario: Submit other bank transfer to non predefined beneficiary - one time with corporate user and two approvals required
#And user_612 loads the test datasetup for the test case id AT_059
#
#
#@AT_060
#
#Scenario: Submit other bank transfer to non predefined beneficiary - scheduled with corporate user have maker checker access
#And user_612 loads the test datasetup for the test case id AT_060
 #
#@AT_061 
 #Scenario: Submit other bank transfer to non predefined beneficiary - scheduled with corporate user and one approval is required
 #And user_612 loads the test datasetup for the test case id AT_061
 #














