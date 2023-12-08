Feature: To Test the Functionality of Debit Card details
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
#AT_DCD_010
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











      


