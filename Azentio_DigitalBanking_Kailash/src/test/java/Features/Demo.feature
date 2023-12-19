Feature: Navigation screens,Previous field verification and All field verification limit update in debit card details
@AT_DCD_018
Scenario: verify the all screen previous button in Limit Update screen debit details(Navigation)
And User_626 loads the test datasetup for the test case id AT_DCD_018
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen for pos screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the Draft title is avaible or not
And User_626 Verify the Cancel button the Draft details screen
And User_626 Verify the submit button the draft details screen 
And User_626 Click on the cancel button in the draft screen 
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen3 into screen2 by clicking previous
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen2 into screen1 by clicking previous

@AT_DCD_019
Scenario: Verify That user can Navigate to Limit Update and field validation - Screen3 -Summary
And User_626 loads the test datasetup for the test case id AT_DCD_019
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen for pos screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 validate the Current POS Limit in Debit Details Screen3
And User_626 validate the Utilized POS Limit in Debit Details Screen3
And User_626 validate the Remaining POS Limit in Debit Details Screen3
And User_626 validate the Requested POS Limit in Debit Details Screen3
And User_626 validate the Current withdrawal Limit in Debit Details Screen3
And User_626 validate the Periodicity2 in Debit Details Screen3
And User_626 validate the Utilized withdrawal Limit in Debit Details Screen3
And User_626 validate the Remaining withdrawal Limit in Debit Details Screen3
And User_626 validate the Requested withdrawal Limit in Debit Details Screen3
And User_626 validate the I Agree Terms and condition in Debit Details Screen3

@AT_DCD_016
Scenario: Verify the All fields in limit update screen in debit card details(Cards Feature)
And User_626 loads the test datasetup for the test case id AT_DCD_016
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Verify the My Cards section is avaible or not
And User_626 Verify the Debit card request section is avaible or not
And User_626 Verify the credit card request section is avaible or not
And User_626 Verify the prepaid card request section is avaible or not
And User_626 Verify the prepaid card recharge section is avaible or not
And User_626 Verify the credit card settlement section is avaible or not
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Verify the Type of debit card is showing in Debit Card Segment
And User_626 Verify the Primary Account is showing in Debit Card Segment
And User_626 Verify the Expiry Date is showing in Debit Card Segment
And User_626 Verify the Applicant Address is showing in Debit Card Segment
And User_626 Verify the Pin Change is showing in Debit Card ShowMore Screen
And User_626 Verify the Pin Reset is showing in Debit Card ShowMore Screen
And User_626 Verify the Deactivate is showing in Debit Card ShowMore Screen
And User_626 Verify the Limit Update is showing in Debit Card ShowMore Screen
And User_626 Verify the Upgrade Card is showing in Debit Card ShowMore Screen
And User_626 Verify the Replace Card is showing in Debit Card ShowMore Screen
And User_626 Verify the Block is showing in Debit Card ShowMore Screen
And User_626 Verify the Add on Card is showing in Debit Card ShowMore Screen
And User_626 Verify the prepaid request is showing in Debit Card ShowMore Screen
And User_626 Click on the Limit Update For Field Verification
And User_626 Verify the CurrencyPOS field Available or Not in POS Limit Update
And User_626 Check the Currencypos Field is in read only Mode Below POS Limit Update
And User_626 Verify the Current POS Limit Field Available or Not in POS Limit Update
And User_626 Check the Current POS Limit Field is in read only Mode POS Limit Update
And User_626 Verify the Periodicity Field Available or Not in POS Limit Update
And User_626 Check the Periodicity Field is in read only Mode POS Limit Update
And User_626 Verify the Utilized Currency Field Available or Not in POS Limit Update
And User_626 Check the Utilized Currency Field is in read only Mode POS Limit Update
And User_626 Verify the Utilized POS Limit Field Available or Not in POS Limit Update
And User_626 Check the Utilized POS Limit Field is in read only Mode POS Limit Update
And User_626 Verify the Remaining Currency Field Available or Not in POS Limit Update
And User_626 Check the Remaining Currency Field is in read only Mode POS Limit Update
And User_626 Verify the Requested POS Limit Field Available or Not in POS Limit Update
And User_626 Check the Requested POS Limit Field is in Editable POS Limit Update
And User_626 Verify the Currency field Available or Not in Withdrawal Limit Update
And User_626 Check the  Currency field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Current Withdrawal Limit Available or Not in Withdrawal Limit Update
And User_626 Check the  Current Withdrawal Limit is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Periodicity Wd field Available or Not in Withdrawal Limit Update
And User_626 Check the  Periodicity Wd field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Utilized Currency WD field Available or Not in Withdrawal Limit Update
And User_626 Check the  Utilized Currency WD field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Utilized Withdrawal Limit field Available or Not in Withdrawal Limit Update
And User_626 Check the  Utilized Withdrawal Limit field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Remaining Currency WD field Available or Not in Withdrawal Limit Update
And User_626 Check the  Remaining Currency WD field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Remaining Withdrawal Limit field Available or Not in Withdrawal Limit Update
And User_626 Check the  Remaining Withdrawal Limit field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Requested Withdrawal field Available or Not in Withdrawal Limit Update
And User_626 Check the  Requested  Withdrawal field is in Editable Withdrawal Limit Update
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen for pos screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
