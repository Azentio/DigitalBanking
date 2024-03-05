Feature: To test the functionality of the CreditCard Settlement in my Cards Page
@AT_CCS_031
Scenario: Test the Bank Credit Card Settlement
And User_626 loads the test datasetup for the test case id AT_CCS_031
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu 
And User_626 validate the FromAccount  is display or not under BankCCS
And User_626 validate To beneficiary segment is display or not under bankCCS
And User_626 validate To Other is display or not under bankCCS
And User_626 validate the amount is display or not under bankCCS
And User_626 validate purpose is display or not under bankCSS
#And User_626 click on the from account for Bankccs
#And User_626 select the from account in Bank Credit Card Settlement Page
#And User_626 Click on the to beneficiary for select to account in BankCCS
#And User_626 select the to beneficiary account in BankCCS
And User_626 click on the to other for verifying all fields
And User_626 Verify the Name field Below the to other beneficiary
And User_626 Verify the CardNumber field Below the to other beneficiary
And User_626 Verify the Save Beneficiary field Below the to other beneficiary
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
#And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen

@AT_CCS_032
Scenario: Verify that Enter Draft Title Is  Displayed after Clicking  save button in  Bank credit Card Settlement - Screen 1
And User_626 loads the test datasetup for the test case id AT_CCS_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request With CardName
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_CCS_033
 Scenario: Verify that Enter Draft Title Is  Displayed after Clicking  save button in  Bank credit Card Settlement - Screen2
And User_626 loads the test datasetup for the test case id AT_CCS_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
#And User_626 validate the I Agree Terms and condition in Block Card Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen 
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_CCS_033_01
 Scenario: Verify the Navigations Screen2 to Screen1 in Bank credit Card Settlement 
And User_626 loads the test datasetup for the test case id AT_CCS_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Verify the Screen2 to Screen Previous Back Navigations
 
@AT_CCS_034
Scenario: Verify the Functionality of Cancel button in Screen1(With To Benefeciary segment)
And User_626 loads the test datasetup for the test case id AT_CCS_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the back button in the Bank credit settlement Page
And User_626 Verify the Functionality of the Back button 

@AT_CCS_035
Scenario: Verify that User Navigate to Summary Screen (With To Benefeciary segment)
And User_626 loads the test datasetup for the test case id AT_CCS_032
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 validate the I Agree Terms and condition in Block Card Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the From Account in Summary Screen of BankCCS
And User_626 Validate the To card beneficiary in Summary Screen of BankCCS
And User_626 Validate the Amount in Summary Screen of BankCCS
And User_626 Validate the Exchanged amount in Summary Screen of BankCCS
And User_626 Validate the Exchange in Summary Screen of BankCCS
And User_626 Validate the Purpose in Summary Screen of BankCCS
And User_626 Validate the I agree on terms and conditions in Summary Screen of BankCCS

@AT_CCS_043
Scenario: Verify that User Navigate to SummaryScreen to agree Screen(Functionality of back button)
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the From Account in Summary Screen of BankCCS
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Verify the Navigation By the I agree Page

@AT_CCS_044
Scenario: Verify that User does not Navigate to Summary before click i agree(Functionality of Next Before fill the field button)
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 Click on the to beneficiary for select to account in BankCCS
And User_626 select the to beneficiary account in BankCCS 
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
#And User_626 Click on the Next button in limit Update Screen with Wait
And User_626 without click the checkbox system not allow screen3

@AT_CCS_045
Scenario: Verify that user can save draft in Screen1 with to other beneficiary
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 click on the to other for verifying all fields
And User_626 Verify the Name field Below the to other beneficiary
And User_626 Verify the CardNumber field Below the to other beneficiary
And User_626 Verify the Save Beneficiary field Below the to other beneficiary
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen 
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_CCS_045_01
Scenario: Verify that user can save draft in Screen2 with to other beneficiary
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 click on the to other for verifying all fields
And User_626 Verify the Name field Below the to other beneficiary
And User_626 Verify the CardNumber field Below the to other beneficiary
And User_626 Verify the Save Beneficiary field Below the to other beneficiary
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Next button in the limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen 
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_CCS_046
Scenario: Verify that user can Navigate Screen2 to Screen1 and Cancel to Home Screen 
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 click on the to other for verifying all fields
And User_626 Verify the Name field Below the to other beneficiary
And User_626 Verify the CardNumber field Below the to other beneficiary
And User_626 Verify the Save Beneficiary field Below the to other beneficiary
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen2 into screen1 by clicking previous in Bankccs
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen1 into Home screen by clicking previous in Bankccs

@AT_CCS_047
Scenario: Verify bank Credit card settlement screen3 fields and Navigations 
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 click on the to other for verifying all fields
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the From Account in Summary Screen of BankCCS
And User_626 Validate the To card beneficiary in Summary Screen of BankCCS
And User_626 Validate the Amount in Summary Screen of BankCCS
And User_626 Validate the Exchanged amount in Summary Screen of BankCCS
And User_626 Validate the Exchange in Summary Screen of BankCCS
And User_626 Validate the Purpose in Summary Screen of BankCCS
And User_626 Validate the I agree on terms and conditions in Summary Screen of BankCCS
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen2 into screen1 by clicking previous in Bankccs

@AT_CCS_048
Scenario: Verify bank Credit card settlement screen3 to Home screen[Functionality of back and previous]
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 click on the to other for verifying all fields
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the From Account in Summary Screen of BankCCS
And User_626 Validate the To card beneficiary in Summary Screen of BankCCS
And User_626 Validate the Amount in Summary Screen of BankCCS
And User_626 Validate the Exchanged amount in Summary Screen of BankCCS
And User_626 Validate the Exchange in Summary Screen of BankCCS
And User_626 Validate the Purpose in Summary Screen of BankCCS
And User_626 Validate the I agree on terms and conditions in Summary Screen of BankCCS
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen2 into screen1 by clicking previous in Bankccs
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen1 into Home screen by clicking previous in Bankccs

@AT_CCS_049
Scenario: verify that Bank credit card settlement screen3 draft save and to do notifications
And User_626 loads the test datasetup for the test case id AT_CCS_043
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard
And User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_626 click credit card settlement submenu under CardsMenu  
And user_626 click the Bank credit card settlement under cardsmenu
And User_626 click on the from account for Bankccs
And User_626 select the from account in Bank Credit Card Settlement Page
And User_626 click on the to other for verifying all fields
And User_626 Enter the given Name in to other beneficiary name field
And User_626 Enter the given CardNumber in to other beneficiary CardNumber field
And User_626 ON the toggle in to other beneficiary BankCCS Screen
And User_626 Enter the Amount Value in the Bank Credit Card Settlement Page
And User_626 Enter the Purpose in the Bank Credit Card Settlement Page
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Cancel button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen 
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen 
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

