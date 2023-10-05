 Feature:  Testing the functionalities of Activity Log Report in omni
@ALR_002
Scenario: check if the system Validate Activity log for non beneficiary internal  Transfer - Retail _MB
And user_5679 loads the test datasetup for the test case id ALR_002
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the transfers under the AMANA payment screen
And user_5679 Click on the Transfer to other bank account in Tran sfer screen
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 selects the from account from the dropdown in transfers within own accounts
#And user_5679 Account in from value in Bank
And user_5679 Select the To Account in Transafer to other bank account
And user_5679 Account To value in Bank
And user_5679 Enter the Amount in Transafer
And user_5679 click on the Purpose in transfer account
And user_5679 click on the Next button in transfer account
And user_5679 click on Agree box
And user_5679 click on the Next button in transfer account
And user_5679 Click on Submit button in transfer account
And user_5679 click on the profile Info in ALR
And user_5679 Click on the Active Log in Transfer
And user_5679 click on the My Active log Report in profile
And user_5679 click on the Export button in ALR
And user_5679 click log out button
@ALR_001
Scenario: check if the system Validate Activity log for non beneficiary internal  Transfer - Retail _IB
And user_5679 loads the test datasetup for the test case id ALR_001
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the transfers under the AMANA payment screen
And user_5679 Click on the Transfer to other bank account in Transfer screen
And user_5679 click on the From accounts from the transfers within own accounts
And user_5679 selects the from account from the dropdown in transfers within own accounts
And user_5679 Select the To Account in Transafer to other bank account
And user_5679 Account To value in Bank
And user_5679 Enter the Amount in Transafer
And user_5679 click on the Purpose in transfer account
And user_5679 click on the Next button in transfer account
And user_5679 click on Agree box
And user_5679 click on the Next button in transfer account
And user_5679 Click on Submit button in transfer account
And user_5679 click on the profile Info in ALR
And user_5679 Click on the Active Log in Transfer
And user_5679 click on the My Active log Report in profile
And user_5679 Get the Time value of the Activity Log Report and verify the value
And user_5679 click log out button
@ALR_006
Scenario: check if the system Validate Activity log for non beneficiary internal Transfer Corporate_IB _checker user-Reject request
And user_5679 loads the test datasetup for the test case id ALR_006
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
And user_5679 click on the profile Info in ALR
And user_5679 Click on the Active Log in Transfer
And user_5679 click on the My Active log Report in profile
And user_5679 Get the Time value of the Activity Log Report and verify the value
And user_5679 click log out button
@ALR_007
Scenario: check if the system Validate Activity log for Scdueled non beneficiary internal  Transfer Corporate_IB _checker user Reject request
And user_5679 loads the test datasetup for the test case id ALR_006
Given user_5679 navigates to the omni_corporate_web_portal
And user_5679 enters the maker username1 in the login page for omni_corporate_web_portal
And user_5679 enters the maker password1 in the login page for omni_corporate_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the AMANA payment screen in the homepage
And user_5679 click on the transfers under the AMANA payment screen
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
And user_5679 click on the profile Info in ALR
And user_5679 Click on the Active Log in Transfer
And user_5679 click on the My Active log Report in profile
And user_5679 Get the Time value of the Activity Log Report and verify the value
And user_5679 click log out button









