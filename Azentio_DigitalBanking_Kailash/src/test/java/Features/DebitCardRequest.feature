Feature: To Test the Functionality of Debit Card Request
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





      


