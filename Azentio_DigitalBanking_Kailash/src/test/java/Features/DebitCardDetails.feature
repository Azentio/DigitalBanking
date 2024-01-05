Feature: To Test the Functionality of Debit Card details (11,14)
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
@AT_PCR_001
Scenario: Test the Functionality of prepaid card request 1st Screen
And User_626 loads the test datasetup for the test case id AT_PCR_001
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
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
@AT_PCR_002
Scenario: Test the Functionality of prepaid card request 2st Screen(terms and conditions)
And User_626 loads the test datasetup for the test case id AT_PCR_002
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving ScreenWO index
And User_626 Verify the Submit button in draft Saving Screen   
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
#And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification 
@AT_PCR_002_01 
Scenario: Test the Functionality of prepaid card request 2st Screen(Back button Functionality)
And User_626 loads the test datasetup for the test case id AT_PCR_002
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
And User_626 Click the Back Arrow button in the 1st Screen of prepaid card request
And User_626 Verify the progress screen was closed in prepaid card request
@AT_PCR_003
Scenario: Test the Functionality of prepaid card request 3st Screen(End Fields)
And User_626 loads the test datasetup for the test case id AT_PCR_003
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving ScreenWO index
And User_626 Verify the Submit button in draft Saving Screen   
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification 
@AT_PCR_004
Scenario: Test the Functionality of prepaid card request 3st Screen(Back button Functionality)
And User_626 loads the test datasetup for the test case id AT_PCR_004
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
And User_626 Click the Back Arrow button in the 1st Screen of prepaid card request
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Previous button in Debit Card details Screen
And User_626 Click the Back Arrow button in the 1st Screen of prepaid card request
And User_626 Verify the progress screen was closed in prepaid card request
@AT_PCR_004_01
Scenario: Verify that user able to Submit Prepaid card request
And User_626 loads the test datasetup for the test case id AT_PCR_004
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Submit button in debit Card PinChange Screen
And User_626 Verify the Request Successfully Popup in Pinchange Screen
@AT_PCR_005
Scenario: Verify that user able to Submit Prepaid card request
And User_626 loads the test datasetup for the test case id AT_PCR_005
Given user_5679 navigates to the omni_corporate_web_portal
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the value missing for user does not allow to navigate screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the value missing for user does not allow to navigate screen
And User_626 Click on the I agree Check Box in Screen2 
And User_626 Click on the Next button in limit Update Screen

@AT_PCR_006
Scenario: Test the Functionality of prepaid card request 1st Screen in retail Link
And User_626 loads the test datasetup for the test case id AT_PCR_006
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Verify the Reference Card is showing in Prepaid Card Request Screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen for retailUser
And User_626 Verify the Save button is visible After clicking edit
And User_626 Verify the Next button in the limit Update Screen
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen   
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification  

@AT_PCR_007
Scenario: Test the Functionality of prepaid card request 2st Screen in retail Link
And User_626 loads the test datasetup for the test case id AT_PCR_007
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen for retailUser
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Save button is visible After clicking edit 
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen   
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
@AT_PCR_008  
Scenario: Test the Functionality of prepaid card request 3st Screen in retail Link
And User_626 loads the test datasetup for the test case id AT_PCR_008
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen for retailUser
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit 
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Verify the reference Card in the summary Screen
And User_626 Validate the I agree terms in Block Card screen3
And User_626 Click on the Save button in Screen2
And User_626 Verify the draft title field After clicking save button
And User_626 Verify the Cancel button in draft Saving Screen
And User_626 Verify the Submit button in draft Saving Screen   
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification
@AT_PCR_009
Scenario: Test the Functionality of prepaid card request Submit 3st Screen in retail Link
And User_626 loads the test datasetup for the test case id AT_PCR_009
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen for retailUser
And User_626 Click on the Next button in limit Update Screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the Previous is showing in Debit Card PinChange Screen
And User_626 Verify the Save button is visible After clicking edit 
And User_626 Verify the Submit is showing in Debit Card PinChange Screen
And User_626 Verify the reference Card in the summary Screen
And User_626 Validate the I agree terms in Block Card screen3
And User_626 Click on the submit in 3st Screen of prepaid card request
@AT_PCR_009_01
Scenario: Prepaid Card Screen user does not allow to navigate screen2
And User_626 loads the test datasetup for the test case id AT_PCR_009
Given user_5679 navigates to the omni_corporate_portal_retail
And User_626 enters the CorporateUser in the login page for omni_web_portal
And User_626 enters the CorporatePass in the login page for omni_web_portal
And user_5679 click on the loggin button in the login page for omni_corporate_web_portal
And user_5679 click on the force logout btn in the login page for omni_corporate_web_portal
And user_5679 click on the ok button for the successful login page for omni_corporate_web_portal
And user_5679 click on the Cards screen in the homepage
And User_626 Click on the Prepaid Card Request below the card details
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the value missing for user does not allow to navigate screen
And User_626 Click on the reference card drop down in Prepaid Card Request Screen
And User_626 Select reference card in Prepaid Card Request Screen for retailUser
And User_626 Click on the Next button in limit Update Screen
And User_626 Verify the value missing for user does not allow to navigate screen
And User_626 Click on the I agree Check Box in Screen2
And User_626 Click on the Next button in limit Update Screen

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



