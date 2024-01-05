Feature:  Checking the functionalities of Activitylogreport


# single future not there 
@ALR_015
Scenario: check if the system Validate Activity log for delete  beneficiary internal  Transfer "Retail _iB"

 Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id ALR_015
And user_612 enters the maker username1 in the login page for omni_corporate_web_portalA
And user_612 enters the maker password1 in the login page for omni_corporate_web_portalA
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accountsA
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accountsA
And user_612 enters the transaction amount in the transfers screenA
And user_612 enters the purpose of transaction in the transfers screenA
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 click on the profile Info in ALR
And user_612 Click on the Active Log in Transfer
And user_612 click on the My Active log Report in profile
And user_612 click on the Export button in ALR
And user_612 Get the Time value of the Activity Log Report and verify the value
And user_612 click log out button
 



@ALR_016
 Scenario: check if the system Validate Activity log for edit   beneficiary internal  Transfer "Retail _IB"
 Given user_612 navigates to the omni_corporate_web_portal
And user_612 loads the test datasetup for the test case id ALR_015
And user_612 enters the maker username1 in the login page for omni_corporate_web_portalA
And user_612 enters the maker password1 in the login page for omni_corporate_web_portalA
And user_612 click on the loggin button in the login page for omni_corporate_web_portal
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
And user_612 click on the AMANA payment screen in the homepage
And user_612 click on the scheduled transfers under the AMANA payment screen
And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
And user_612 click on the From accounts from the transfers within own accounts
And user_612 selects the from account from the dropdown in transfers within own accountsA
And user_612 click on the To accounts from the transfers within own accounts
And user_612 selects the To account from the dropdown in transfers within own accountsA
And user_612 enters the transaction amount in the transfers screenA
And user_612 enters the purpose of transaction in the transfers screenA
And user_612 click on next btn in the transfers screen
And user_612 click on the periodicity dropdown in scheduled transfer
And user_612 click on the single future date from the dropdown in scheduled transfer
And user_612 click on next btn in the transfers screen
And user_612 click on submit btn in the transfers screen
And user_612 click on the profile Info in ALR
And user_612 Click on the Active Log in Transfer
And user_612 click on the My Active log Report in profile
And user_612 click on the Export button in ALR
And user_612 Get the Time value of the Activity Log Report and verify the value
And user_612 click log out button
 





#And user_612 click on the scheduled transfers under the AMANA payment screen
#And user_612 click on the scheduled transfers within own bank transfer under scheduled transfer_Amana payment screen
#And user_612 click on the From accounts from the transfers within own accounts
#And user_612 selects the from account from the dropdown in transfers within own accountsA
#And user_612 click on the To accounts from the transfers within own accounts
#And user_612 selects the To account from the dropdown in transfers within own accountsA
#And user_612 enters the transaction amount in the transfers screen
#And user_612 enters the purpose of transaction in the transfers screen
#And user_612 click on next btn in the transfers screen
#And user_612 click on the periodicity dropdown in scheduled transfer
#And user_612 click on the single future date from the dropdown in scheduled transfer
#And user_612 click on next btn in the transfers screen
#And user_612  click on the I agree to terms and conditions checkbox
#And user_612 click on next btn in the transfers screen
#And user_612 click on submit btn in the transfers screen
#And user_612 click on the profile Info in ALR
#And user_612 Click on the Active Log in Transfer
#And user_612 click on the My Active log Report in profile
#And user_612 click on the Export button in ALR
#And user_612 Get the Time value of the Activity Log Report and verify the value
#And user_612 click log out button
#And user_612  click on the I agree to terms and conditions checkbox
#And user_612 click on next btn in the transfers screen 