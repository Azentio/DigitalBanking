Feature:Testing the functionalities of Debit Card Details (11,14)
@AT_DCD_001
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu
And User_626 loads the test datasetup for the test case id AT_DCD_001
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
And User_626 Verify the Debit Card Segment is visible in My Cards Screen
And User_626 Verify the Credit Card Segment is visible in My Cards Screen
And User_626 Verify the Prepaid Card Segment is visible in My Cards Screen
And User_626 Verify the Type of debit card is showing in Debit Card Segment
And User_626 Verify the Currency Name is showing in Debit Card Segment
And User_626 Verify the Card Holder Name is showing in Debit Card Segment
And User_626 Verify the Status of the Card is showing in Debit Card Segment
And User_626 Verify the Edit Icon is showing in Debit Card Segment
And User_626 Verify the Show more is showing in Debit Card Segment
And User_626 Click on the edit button in Debit card details
And User_626 Verify the Card change name button is visible
And User_626 Verify the Save button is visible After clicking edit
#AT_DCD_002
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
#AT_DCD_003
And User_626 Click on the Pin Change In Debit Card Details
And User_626 Verify the old pin is showing in Debit Card PinChange Screen
And User_626 Verify the new pin is showing in Debit Card PinChange Screen
And User_626 Verify the Confirm new pin is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
@AT_DCD_004
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu
And User_626 loads the test datasetup for the test case id AT_DCD_001
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the Pin Change In Debit Card Details
And User_626 Enter old pin For Update new in Debit Card PinChange Screen
And User_626 Enter New pin For Update new in Debit Card PinChange Screen
And User_626 Enter Confirm New_pin For Update new in Debit Card PinChange Screen
And User_626 Click on the Submit button in debit Card PinChange Screen
And User_626 Verify the Request Successfully Popup in Pinchange Screen 
@AT_DCD_005
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(pin Reset)
And User_626 loads the test datasetup for the test case id AT_DCD_005
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details 
And User_626 Click on the Pin Reset in Debit Card ShowMore Screen
@AT_DCD_006
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Deactivate)
And User_626 loads the test datasetup for the test case id AT_DCD_006
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the Deactivate Below the card Details
And User_626 Verify the Request Successfully Popup in Pinchange Screen 
@AT_DCD_007
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Limit Update POS Screen)
And User_626 loads the test datasetup for the test case id AT_DCD_007
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
@AT_DCD_008
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Withdrawal Limit Screen)
And User_626 loads the test datasetup for the test case id AT_DCD_008
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
And User_626 Verify the Currency field Available or Not in Withdrawal Limit Update
And User_626 Check theCurrency field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Current Withdrawal Limit Available or Not in Withdrawal Limit Update
And User_626 Check theCurrent Withdrawal Limit is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Periodicity Wd field Available or Not in Withdrawal Limit Update
And User_626 Check thePeriodicity Wd field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Utilized Currency WD field Available or Not in Withdrawal Limit Update
And User_626 Check theUtilized Currency WD field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Utilized Withdrawal Limit field Available or Not in Withdrawal Limit Update
And User_626 Check theUtilized Withdrawal Limit field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Remaining Currency WD field Available or Not in Withdrawal Limit Update
And User_626 Check theRemaining Currency WD field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Remaining Withdrawal Limit field Available or Not in Withdrawal Limit Update
And User_626 Check theRemaining Withdrawal Limit field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Requested Withdrawal field Available or Not in Withdrawal Limit Update
And User_626 Check theRequestedWithdrawal field is in Editable Withdrawal Limit Update
@AT_DCD_009
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Withdrawal Limit Screen)
And User_626 loads the test datasetup for the test case id AT_DCD_008
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
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Cancel button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen 
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
@AT_DCD_011
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Record Saving)
And User_626 loads the test datasetup for the test case id AT_DCD_011
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
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
@AT_DCD_012
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Record Saving)
And User_626 loads the test datasetup for the test case id AT_DCD_012
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
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button is visible After clicking edit
@AT_DCD_013
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(Screen2)
And User_626 loads the test datasetup for the test case id AT_DCD_013
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
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
@AT_DCD_014
Scenario: Verify That "Cards Menu" is Displayed In Omnichannel Corporate Under Full Menu(RecordSaving3)
And User_626 loads the test datasetup for the test case id AT_DCD_014
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
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
@AT_DCD_015
Scenario: Verify the previous button in screen2 in debit card details
And User_626 loads the test datasetup for the test case id AT_DCD_015
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
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Click on the Previous button in Debit Card details Screen
#And User_626 Verify the Screen2 with the help of Card information Tab
And User_626 Verify the Current POS Limit Field Available or Not in POS Limit Update
@AT_DCD_016
Scenario: Verify the navigatable in screen2 in debit card details
And User_626 loads the test datasetup for the test case id AT_DCD_016
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
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
@AT_DCD_017
Scenario: Verify the Draft Details in Screen2 and 
And User_626 loads the test datasetup for the test case id AT_DCD_017
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
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the Draft title is avaible or not
And User_626 Verify the Cancel button the Draft details screen
And User_626 Verify the submit button the draft details screen 
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
@AT_DCD_018
Scenario: verify the all screen previous button in Limit Update screen debit details
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
Scenario: Verify That user can Navigate to Limit Update - Screen3 -Summary
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
@AT_DCD_020
Scenario: Verify That user can able to do Limit Update
And User_626 loads the test datasetup for the test case id AT_DCD_020
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
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
@AT_DCD_021
Scenario: Verify That user can Navigate to Block Card
And User_626 loads the test datasetup for the test case id AT_DCD_021
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the block card below the show more button
And User_626 Validate the Card information section in block card Screen
And User_626 Validate the Card Block options section in block card Screen
And User_626 Validate the block card reason below the Card block options
And User_626 Validate the Toggle button below the Card block options
And User_626 click on the block card reason in the block card Screen
And User_626 Select the option below the block card Screen
And User_626 Click on the toggle button re issue card in block card Screen
And User_626 Click on the Next button in limit Update Screen
@AT_DCD_022
Scenario: Verify that Save,Cancel,next button is dsiplayed under block card screen 1
And User_626 loads the test datasetup for the test case id AT_DCD_022
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the block card below the show more button
And User_626 Validate the Card information section in block card Screen
And User_626 Validate the Card Block options section in block card Screen
And User_626 Validate the block card reason below the Card block options
And User_626 Validate the Toggle button below the Card block options
And User_626 click on the block card reason in the block card Screen
And User_626 Select the option below the block card Screen
And User_626 Click on the toggle button re issue card in block card Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
@AT_DCD_023
Scenario: Verify That user can Navigate to Block Card-Card Block Options-Screen2
And User_626 loads the test datasetup for the test case id AT_DCD_023
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the block card below the show more button
And User_626 Validate the Card information section in block card Screen
And User_626 Validate the Card Block options section in block card Screen
And User_626 Validate the block card reason below the Card block options
And User_626 Validate the Toggle button below the Card block options
And User_626 click on the block card reason in the block card Screen
And User_626 Select the option below the block card Screen
And User_626 Click on the toggle button re issue card in block card Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the terms and conditions page
And User_626 validate the I Agree Terms and condition in Block Card Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Cancel button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen 
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
@AT_DCD_024
Scenario: Verify That user can Navigate to Block Card-Card Block Options-Screen3
And User_626 loads the test datasetup for the test case id AT_DCD_024
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the block card below the show more button
And User_626 click on the block card reason in the block card Screen
And User_626 Select the option below the block card Screen
And User_626 Click on the toggle button re issue card in block card Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the terms and conditions page
And User_626 validate the I Agree Terms and condition in Block Card Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Validate the Card block reason in Block Card screen3
And User_626 Validate the Re issue Card in Block Card screen3
And User_626 Validate the I agree terms in Block Card screen3
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
@AT_DCD_024_01
Scenario: Navigations of the Block Card in debit card details
And User_626 loads the test datasetup for the test case id AT_DCD_024_01
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details
And User_626 Click on the block card below the show more button
And User_626 click on the block card reason in the block card Screen
And User_626 Select the option below the block card Screen
And User_626 Click on the toggle button re issue card in block card Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Click on the cancel button in the draft screen
And User_626 Click on the Next button in limit Update Screen 
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen3 into screen2 by clicking previous
#And User_626 Click on the Previous button in Debit Card details Screen
And User_626 verify the screen2 into screen1 by clicking previous in block card screen

@AT_DCD_027
Scenario: Verify That user can Navigate to Add on Card screen1
And User_612 loads the test datasetup for the test case id AT_DCD_027
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 Click Add on Card button under show more
And user_612 verify the card information is display or Not
And user_612 verify the Supplementary card is display or Not
And user_612 verify the Request Branch is display or Not
And user_612 Verify the Save button is display or not
And user_612 verify the cancel button is display or not
And user_612 verify the Next button is display or not
And user_612 verify the card holder name under Supplementry card
And user_612 verify the Delivery Cif branch under Supplementry card
And user_612 click the save button
And user_612 Verify the draft title field After clicking save button
And user_612 Verify the Cancel button in draft Saving Screen
And user_612 Verify the Submit button in draft Saving Screen
And User_612 Enter Draft Name for save the Debit Detail request
And User_612 Click on sumbit button Save the Data
#error popup
And User_612 Verify the Request Successfully Popup
And User_612 Click on the To Do Screen For check the Saved Draft
And user_612 Click on the saved Draft data for verification
And user_612 clicks on logout btn to logout from omni web portal



@AT_DCD_028
Scenario: Verify That user can Navigate to Add on Card screen2
And User_612 loads the test datasetup for the test case id AT_DCD_027
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 Click Add on Card button under show more
And user_612 enter the Card holder Name in supplementry card
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 verify Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
And user_612 Verify the Save button is display or not
And user_612 verify the cancel button is display or not
And user_612 verify the Next button is display or not
And user_612 validate previous button display or not
And user_612 click on the I agree to terms and conditions checkbox DCD
And user_612 click the save button
And user_612 Verify the draft title field After clicking save button
And user_612 Verify the Cancel button in draft Saving Screen
And user_612 Verify the Submit button in draft Saving Screen
And User_612 Enter Draft Name for save the Debit Detail request
And User_612 Click on sumbit button Save the Data
And User_612 Verify the Request Successfully Popup
And User_612 Click on the To Do Screen For check the Saved Draft
And user_612 Click on the saved Draft data for verification
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_029
Scenario: Verify That user screen2 and click previous button its come back screen1
And User_612 loads the test datasetup for the test case id AT_DCD_027
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 Click Add on Card button under show more
And user_612 enter the Card holder Name in supplementry card
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 click previous button under my credit card settlement
And user_612 verify Screen is closed and switched to home screen1
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_029_01
Scenario: Verify That user can Navigate to Add onCard-Screen 3
And User_612 loads the test datasetup for the test case id AT_DCD_027
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 Click Add on Card button under show more
And user_612 enter the Card holder Name in supplementry card
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 click on the I agree to terms and conditions checkbox DCD
 And user_612 click next button under show more
And user_612 validate the card holdername is display or not in screen3
And user_612 validate the cif branch is display or not in screen3
And user_612 validate the delivary cif branch is display or not in screen3
And user_612 validate the i agree condition is display or ot not in screen3
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_030
Scenario: Verify the Functionality of save Button in Replace Card - Screen 3
And User_612 loads the test datasetup for the test case id AT_DCD_030
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 Click Add on Card button under show more
And user_612 enter the Card holder Name in supplementry card
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 click on the I agree to terms and conditions checkbox DCD
And user_612 click next button under show more
And user_612 Verify the Save button is display or not
And user_612 verify the cancel button is display or not
And user_612 validate previous button display or not
And user_612 verify the submit button is displaying or not
And user_612 click the save button
And user_612 Verify the draft title field After clicking save button
And user_612 Verify the Cancel button in draft Saving Screen
And user_612 Verify the Submit button in draft Saving Screen
And User_612 Enter Draft Name for save the Debit Detail request
And User_612 Click on sumbit button Save the Data
And User_612 Verify the Request Successfully Popup
And User_612 Click on the To Do Screen For check the Saved Draft
And user_612 Click on the saved Draft data for verification
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_031
Scenario: Verify That user can Navigate to Add onCard - Debit Cards - Prepaid Card Request
And User_612 loads the test datasetup for the test case id AT_DCD_030
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 click prepaid card request under show more
And user_612 validate the Reference card in prepaid card request
And user_612 Verify the Save button is display or not
And user_612 verify the cancel button is display or not
And user_612 verify the Next button is display or not

@AT_DCD_032
Scenario: Verify the Functionality of save Button in Prepaid Card Request - Screen 1
And User_612 loads the test datasetup for the test case id AT_DCD_030
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 click prepaid card request under show more
And user_612 click dropdown button under prepaid card request
And user_612 select account under the drop down
And user_612 click the save button
And user_612 Verify the draft title field After clicking save button
And user_612 Verify the Cancel button in draft Saving Screen
And user_612 Verify the Submit button in draft Saving Screen
And User_612 Enter Draft Name for save the Debit Detail request
And User_612 Click on sumbit button Save the Data
And User_612 Verify the Request Successfully Popup
And User_612 Click on the To Do Screen For check the Saved Draft
And user_612 Click on the saved Draft data for verification
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_033
Scenario: Verify the Functionality of save Button in Prepaid Card Request - Screen 2
And User_612 loads the test datasetup for the test case id AT_DCD_033
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 click prepaid card request under show more
And user_612 click dropdown button under prepaid card request
And user_612 select account under the drop down
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 verify Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
And user_612 Verify the Save button is display or not
And user_612 verify the cancel button is display or not
And user_612 verify the Next button is display or not
And user_612 validate previous button display or not
And user_612 click on the I agree to terms and conditions checkbox DCD
And user_612 click the save button
And user_612 Verify the draft title field After clicking save button
And user_612 Verify the Cancel button in draft Saving Screen
And user_612 Verify the Submit button in draft Saving Screen
And User_612 Enter Draft Name for save the Debit Detail request
And User_612 Click on sumbit button Save the Data
And User_612 Verify the Request Successfully Popup
And User_612 Click on the To Do Screen For check the Saved Draft
And user_612 Click on the saved Draft data for verification
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_034
Scenario: Verify the functionality of previous button in Screen2 in Add on card screento Screen 1
And User_612 loads the test datasetup for the test case id AT_DCD_033
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 click prepaid card request under show more
And user_612 click dropdown button under prepaid card request
And user_612 select account under the drop down
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 click on the I agree to terms and conditions checkbox DCD
And user_612 click previous button under my credit card settlement
And user_612 verify Screen is closed and switched to screen1
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_035
Scenario: Verify the functionality of screen3 and Verify That user can able to do prepaid card Request
And User_612 loads the test datasetup for the test case id AT_DCD_035
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the Corpusername in the login page for omni_corp_portal
And user_612 enters the Corppassword in the login page for omni_corp_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_612 Click on the Show More button below the card details
And user_612 click prepaid card request under show more
And user_612 click dropdown button under prepaid card request
And user_612 select account under the drop down
And user_612 click next button under show more
And user_612 click next button under show more
And user_612 click on the I agree to terms and conditions checkbox DCD
And user_612 click next button under show more
And user_612 validate the Reference card is display or not in screen3
And user_612 verify the cancel button is display or not
#And user_612 verify the Next button is display or not
And user_612 Verify the Save button is display or not
And user_612 validate previous button display or not
And user_612 verify the submit button is displaying or not
And user_612 click save button under mycredit card settlement
And user_612 verify the draft title is display or Not
And user_612 verify the submit button is displaying or not
And user_612 verify the cancel button is displaying or not
And User_612 Enter Draft Name for save the Debit Detail request
And User_612 Click on sumbit button Save the Data
And User_612 Verify the Request Successfully Popup
And User_612 Click on the To Do Screen For check the Saved Draft
And user_612 verify the record save in TO DO List for draft Data
And user_612 clicks on logout btn to logout from omni web portal

@AT_DCD_053
Scenario: Validate the Debit Card Details Screen1 All Fields
And User_626 loads the test datasetup for the test case id AT_DCD_053
Given user_5679 navigates to the omni_corporate_portal_retail
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
And User_626 Verify the Debit Card Segment is visible in My Cards Screen
And User_626 Verify the Credit Card Segment is visible in My Cards Screen
And User_626 Verify the Prepaid Card Segment is visible in My Cards Screen
And User_626 Verify the Type of debit card is showing in Debit Card Segment
And User_626 Verify the Currency Name is showing in Debit Card Segment of Retail User
And User_626 Verify the Card Holder Name is showing in Debit Card Segment of Retail User
And User_626 Verify the Status of the Card is showing in Debit Card Segment of Retail User
And User_626 Verify the Edit Icon is showing in Debit Card Segment of Retail User
And User_626 Verify the Show more is showing in Debit Card Segment
And User_626 Click on the edit button in Debit card details of Retail User
And User_626 Verify the Card change name button is visible of Retail User
And User_626 Verify the Save button is visible After clicking edit
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Verify the Type of debit card is showing in Debit Card Segment
And User_626 Verify the Primary Account is showing in Debit Card Segment
And User_626 Verify the Expiry Date is showing in Debit Card Segment of Retail User
And User_626 Verify the Applicant Address is showing in Debit Card Segment of Retail User

@AT_DCD_054
Scenario: Verify that Show more icon Is Displayed and open with buttons in Debit cards Details Retails
And User_626 loads the test datasetup for the test case id AT_DCD_054
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Verify the Pin Change is showing in Debit Card ShowMore Screen
And User_626 Verify the Pin Reset is showing in Debit Card ShowMore Screen
And User_626 Verify the Deactivate is showing in Debit Card ShowMore Screen
And User_626 Verify the Limit Update is showing in Debit Card ShowMore Screen
And User_626 Verify the Upgrade Card is showing in Debit Card ShowMore Screen
And User_626 Verify the Replace Card is showing in Debit Card ShowMore Screen
And User_626 Verify the Block is showing in Debit Card ShowMore Screen
And User_626 Verify the Add on Card is showing in Debit Card ShowMore Screen
And User_626 Verify the prepaid request is showing in Debit Card ShowMore Screen
And User_626 Click on the Pin Change In Debit Card Details
And User_626 Verify the old pin is showing in Debit Card PinChange Screen
And User_626 Verify the new pin is showing in Debit Card PinChange Screen
And User_626 Verify the Confirm new pin is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Enter old pin For Update new in Debit Card PinChange Screen
And User_626 Enter New pin For Update new in Debit Card PinChange Screen
And User_626 Enter Confirm New_pin For Update new in Debit Card PinChange Screen
And User_626 Click on the Submit button in debit Card PinChange Screen
And User_626 Verify the Request Successfully Popup in Pinchange Screen

@AT_DCD_055
Scenario: Verify that User can able to PIN Reset in Retail 
And User_626 loads the test datasetup for the test case id AT_DCD_054
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Pin Reset in Debit Card ShowMore Screen

@AT_DCD_056
Scenario: Verify that User can able to Deactivate Debit Card
And User_626 loads the test datasetup for the test case id AT_DCD_054
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Deactivate Below the card Details

@AT_DCD_057
Scenario: Verify All Fields in POS Limit Screen & Drafts in retail 
And User_626 loads the test datasetup for the test case id AT_DCD_054
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
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
And User_626 Check theCurrency field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Current Withdrawal Limit Available or Not in Withdrawal Limit Update
And User_626 Check theCurrent Withdrawal Limit is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Periodicity Wd field Available or Not in Withdrawal Limit Update
And User_626 Check thePeriodicity Wd field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Utilized Currency WD field Available or Not in Withdrawal Limit Update
And User_626 Check theUtilized Currency WD field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Utilized Withdrawal Limit field Available or Not in Withdrawal Limit Update
And User_626 Check theUtilized Withdrawal Limit field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Remaining Currency WD field Available or Not in Withdrawal Limit Update
And User_626 Check theRemaining Currency WD field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Remaining Withdrawal Limit field Available or Not in Withdrawal Limit Update
And User_626 Check theRemaining Withdrawal Limit field is in ReadOnly Withdrawal Limit Update
And User_626 Verify the Requested Withdrawal field Available or Not in Withdrawal Limit Update
And User_626 Check theRequestedWithdrawal field is in Editable Withdrawal Limit Update
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Cancel button in the limit Update Screen
And User_626 Verify the Save button in the limit Update Screen
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_DCD_058
Scenario: Verify that Enter Draft Title Is Displayed after Clicking save button in LimitUpdate - Screen 2
And User_626 loads the test datasetup for the test case id AT_DCD_058
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification 

@AT_DCD_059
Scenario: Verify That user can Navigate to Limit Update Screen2 to Screen1/Verify the Functionality of Previous button in Screen2(Limit Update) 
And User_626 loads the test datasetup for the test case id AT_DCD_058
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Verify the Screen2 back into Screen1 in retail Limit Update

@AT_DCD_060
Scenario: Verify that Enter Draft Title Is Displayed after Clicking save Button in Limit Update-Screen3
And User_626 loads the test datasetup for the test case id AT_DCD_060
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Click On the Save button For Save the Draft in limit Update Screen
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
#And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification 

@AT_DCD_061_01
Scenario: Verify That user can Navigate to Limit Update Screen3 to Screen1/Verify the Functionality of Previous button in Screen3(Limit Update)
And User_626 loads the test datasetup for the test case id AT_DCD_060
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Verify the Screen3 back into Screen2 in retail Limit Update

@AT_DCD_061
Scenario: Verify that Enter Draft Title Is Displayed after Clicking save button in LimitUpdate - Screen3
And User_626 loads the test datasetup for the test case id AT_DCD_060
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the Limit Update For Field Verification
And User_626 Enter Data On Requested POS Limit field below POS Limit Update
And User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update
And User_626 Click on the Next button in limit Update Screen
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
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Cancel is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Submit button in debit Card PinChange Screen

@AT_DCD_062 
Scenario: Verify that Card Details Screen with all fields given below
And User_626 loads the test datasetup for the test case id AT_DCD_062
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And user_5679 click on the My Cards under Cards in the homepage
And User_626 Verify the Type of debit card is showing in Debit Card Segment
And User_626 Verify the Currency Name is showing in Debit Card Segment of Retail User
And User_626 Verify the Card Holder Name is showing in Debit Card Segment of Retail User
And User_626 Verify the Status of the Card is showing in Debit Card Segment of Retail User
And User_626 Verify the Edit Icon is showing in Debit Card Segment of Retail User
And User_626 Verify the Show more is showing in Debit Card Segment
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Click on the edit button in Debit card details of Retail User
And User_626 Verify the Card change name button is visible of Retail User
And User_626 Verify the Save button is visible After clicking edit
And User_626 Click on the Show More button below the card details of Retail User
And User_626 Verify the Type of debit card is showing in Debit Card Segment
And User_626 Verify the Primary Account is showing in Debit Card Segment
And User_626 Verify the Expiry Date is showing in Debit Card Segment of Retail User
And User_626 Verify the Applicant Address is showing in Debit Card Segment of Retail User
#This Week
And User_626 Verify the Pin Change is showing in Debit Card ShowMore Screen
And User_626 Verify the Pin Reset is showing in Debit Card ShowMore Screen
And User_626 Verify the Deactivate is showing in Debit Card ShowMore Screen
And User_626 Verify the Limit Update is showing in Debit Card ShowMore Screen
And User_626 Verify the Upgrade Card is showing in Debit Card ShowMore Screen
And User_626 Verify the Replace Card is showing in Debit Card ShowMore Screen
And User_626 Verify the Block is showing in Debit Card ShowMore Screen
And User_626 Verify the Add on Card is showing in Debit Card ShowMore Screen
And User_626 Verify the prepaid request is showing in Debit Card ShowMore Screen





 




