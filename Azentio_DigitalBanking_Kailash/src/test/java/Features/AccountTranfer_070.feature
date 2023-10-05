Feature: Testing the functionalities of Account Transfer
@AT_020_01
Scenario: Submit Transfer to Other Bank - scheduled with corporate user and one approval is required
And user_5679 loads the test datasetup for the test case id AT_020
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click scheduled other bank transfer under the AMANA payment screen
And user_5679 select from account under scheduled other bank transfer
And user_5679 select beneficiary under scheduled other bank transfer
And user_5679 enter transfer amount under scheduled other bank transfer
And user_5679 enter purpose of transfer under scheduled other bank transfer
And user_5679 click next button under scheduled other bank transfer
And user_5679 select periodicity under scheduled other bank transfer
And user_5679 enter number of payments under scheduled other bank transfer
And user_5679 click next button under scheduled other bank transfer
And user_5679 click submit button under scheduled other bank transfer
And user_5679 click ok button for request submitted successfully or request time

@AT_020_02
Scenario: Submit the transfer record in checker
And user_5679 loads the test datasetup for the test case id AT_020
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username2 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password2 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the TODO icon in homescreen on omni web portal
And user_5679 click on the 1st pending item in the list
And user_5679 click on the approve btn for the pending transfer request from the maker
And user_5679 waits for the confirmation on the submission report
And user_5679 gets the reference number from the submission report
And user_5679 clicks on logout btn to logout from omni web portal


@AT_022
Scenario: Submit International Transfer - scheduled with corporate user have maker checker access
And user_5679 loads the test datasetup for the test case id AT_022
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click international scheduled transfer under scheduled transfer
And user_5679 select from account under international transfers
And user_5679 select beneficiary under international transfer
And user_5679 enter transfer amount under international transfer
And user_5679 enter purpose of transfer under international transfer
And user_5679 click next button under international transfer
And user_5679 click submit button under international transfer

@AT_042
Scenario: Submit own bank transfer to predefined beneficiary-scheduled with corporate user have maker checker access
And user_5679 loads the test datasetup for the test case id AT_042
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click Scheduled own bank transfer Under scheduled transfer
And user_5679 select from account under Scheduled own bank transfer
And user_5679 select beneficiary under Scheduled own bank transfer
And user_5679 enter transfer amount under Scheduled own bank transfer
And user_5679 enter purpose of transfer under Scheduled own bank transfer
And user_5679 click next button under Scheduled own bank transfer
And user_5679 click submit button under Scheduled own bank transfer

@AT_045
Scenario: Submit own bank transfer to non predefined beneficiary - one time with corporate user have maker checker access
And user_5679 loads the test datasetup for the test case id AT_045
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
And user_5679 Click the To other button to non predefined beneficiary under own bank transfer
And user_5679 Select the bank to non predefined beneficiary under own bank transfer
And user_5679 Click and enter the iban_Account number of non predefined beneficiary under own bank transfer
And user_5679 click the save beneficiary button of non predefined beneficiary under own bank transfer
And user_5679 Enter the test of non predefined beneficiary under own bank transfer
And user_5679 enters the transaction amount in the transfers screen
And user_5679 enters the purpose of transaction in the transfers screen
And user_5679 click on next btn in the transfers screen
And user_5679 click and check the I Aggree on terms and condition checkbox of non predefined beneficiary under own bank transfer
And user_5679 click on nextButton of non predefined beneficiary under own bank transfer
And user_5679 click the submit button of non predefined beneficiary under own bank transfer
And user_5679 waits for the confirmation on the submission report
And user_5679 click log out button
#oneapproval
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username2 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password2 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the TODO icon in homescreen on omni web portal
And user_5679 click on the 1st pending item in the list
And user_5679 click on the approve btn for the pending transfer request from the maker
And user_5679 waits for the confirmation on the submission report
And user_5679 gets the reference number from the submission report
And user_5679 clicks on logout btn to logout from omni web portal

@AT_075
Scenario: submit transfer to internal beneficiary
And user_5679 loads the test datasetup for the test case id AT_075
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the transfers under the AMANA payment screen
And user_5679 click on the transfers within own accounts under transfer_Amana payment screen
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 selects the from account from the dropdown in transfers within own accounts
And user_5679 click on the To accounts from the transfers within own accounts
And user_5679 selects the To account from the dropdown in transfers within own accounts
And user_5679 enters the transaction amount in the transfers screen
And user_5679 enters the purpose of transaction in the transfers screen
And user_5679 click on next btn in the transfers screen
And user_5679  click on the I agree to terms and conditions checkbox
And user_5679 click on submit btn in the transfers screen
And user_5679 waits for the confirmation on the submission report
And user_5679 gets the reference number from the submission report
And user_5679 clicks on logout btn to logout from omni web portal
@AT_037
Scenario: Submit own account transfer - scheduled with corporate user and one approval is required
And user_5679 loads the test datasetup for the test case id AT_037
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click scheduled own Account transfer under the AMANA payment screen
And user_5679 select from account under scheduled own account transfer
And user_5679 select To account under scheduled own account transfer
And user_5679 enter transfer amount under scheduled own account transfer
And user_5679 enter purpose of transfer under scheduled own account transfer
And user_5679 click next button under scheduled own account transfer
And user_5679 select periodicity under scheduled own account transfer
And user_5679 enter number of payments under scheduled own account transfer
And user_5679 click next button1 under scheduled own account transfer
And user_5679 click i agree on terms and conditions
And user_5679 click next button1 under scheduled own account transfer
And user_5679 click submit button under scheduled other bank transfer
And user_5679 click ok button for request submitted successfully or request time
And user_5679 click log out button
And user_5679 waits for the confirmation on the submission report
And user_5679 gets the reference number from the submission report
And user_5679 clicks on logout btn to logout from omni web portal
#oneapproval
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username2 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password2 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the TODO icon in homescreen on omni web portal
And user_5679 click on the 1st pending item in the list
And user_5679 click on the approve btn for the pending transfer request from the maker
And user_5679 waits for the confirmation on the submission report
And user_5679 gets the reference number from the submission report
And user_5679 clicks on logout btn to logout from omni web portal


@AT_072
Scenario: Submit international transfer to non predefined beneficiary - scheduled with corporate user have maker checker access
And user_5679 loads the test datasetup for the test case id AT_072
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click international scheduled transfer under scheduled transfer
And user_5679 select from account under scheduled international bank transfer
And user_5679 click on to other button for select non pre defined beneficiary
And user_5679 enter BIC swift code under international bank transfer
And user_5679 enter iban Account no under international bank transfer
And user_5679 select beneficiary currency under international bank transfer
And user_5679 enter amount under International transfer 
And user_5679 enter purpose under internatioanl transfer 
And user_5679 click next button under internatioanl transfer 
And user_5679 click submit button under internatioanl transfer
And user_5679 click log out button


@AT_073
Scenario: Submit international transfer to non predefined beneficiary - scheduled with corporate user and one approval is required
And user_5679 loads the test datasetup for the test case id AT_073
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click international scheduled transfer under scheduled transfer
And user_5679 select from account under scheduled international bank transfer
And user_5679 click on to other button for select non pre defined beneficiary
And user_5679 enter BIC swift code under international bank transfer
And user_5679 enter iban Account no under international bank transfer
And user_5679 select beneficiary currency under international bank transfer
And user_5679 enter amount under International transfer 
And user_5679 enter purpose under internatioanl transfer 
And user_5679 click next button under internatioanl transfer 
And user_5679 click submit button under internatioanl transfer
And user_5679 click log out button
#oneapproval
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username2 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password2 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the TODO icon in homescreen on omni web portal
And user_5679 click on the 1st pending item in the list
And user_5679 click on the approve btn for the pending transfer request from the maker
And user_5679 waits for the confirmation on the submission report
And user_5679 gets the reference number from the submission report
And user_5679 clicks on logout btn to logout from omni web portal

@AT_074
Scenario: Submit international transfer to non predefined beneficiary - scheduled with corporate user and 2 approval is required
And user_5679 loads the test datasetup for the test case id AT_074
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click scheduled transfer under AMANA payment screen
And user_5679 click international scheduled transfer under scheduled transfer
And user_5679 select from account under scheduled international bank transfer
And user_5679 click on to other button for select non pre defined beneficiary
And user_5679 enter BIC swift code under international bank transfer
And user_5679 enter iban Account no under international bank transfer
And user_5679 select beneficiary currency under international bank transfer
And user_5679 enter amount under International transfer 
And user_5679 enter purpose under internatioanl transfer 
And user_5679 click next button under internatioanl transfer 
And user_5679 click submit button under internatioanl transfer
And user_5679 click log out button
#oneapproval
#twoapproval

@AT_071
Scenario: Submit international transfer to non predefined beneficiary - one time with corporate user have maker checker access
And user_5679 loads the test datasetup for the test case id AT_071
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the tranfers under the AMANA payment screen
And user_5679 click the International Transfer under AMANA Payment
And user_5679 select from account under international bank transfer
And user_5679 click To other Benefeciary details under international bank transfer
And user_5679 enter BIC swift code under international bank transfer
And user_5679 enter iban Account no under international bank transfer
And user_5679 select beneficiary currency under international bank transfer
And user_5679 enter amount under International transfer 
And user_5679 enter purpose under internatioanl transfer 
And user_5679 click next button under internatioanl transfer 
And user_5679 click submit button under internatioanl transfer
And user_5679 click log out button
#pending on DB validation

@TDO_017
Scenario: Submit a Saved draft
And user_5679 loads the test datasetup for the test case id TDO_017
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the tranfers under the AMANA payment screen
And user_5679 click the International Transfer under AMANA Payment
And user_5679 click on the From accounts from the transfers for international bank transfer
And user_5679 selects the from account from the dropdown in transfers for international bank transfer
And user_5679 click on the To accounts from the transfers for international bank transfer
And user_5679 selects the To account from the dropdown in transfers for international bank transfer
And user_5679 enters the transaction amount in the transfers screen
And user_5679 enters the purpose of transaction in the transfers screen
And user_5679 click on next btn in the transfers screen
And user_5679  click on the I agree to terms and conditions checkbox


