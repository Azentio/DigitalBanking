  Feature: Check the funcnality of  DebitCardDetails  sprint 13,14
  
  @AT_DCD_027
  Scenario: Verify That user can Navigate to Add on Card screen1
    And User_612 loads the test datasetup for the test case id AT_DCD_027
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
    And User_612 Click on the Show More button below the card details
    And user_612 Click Add on Card button under show more
    And user_612 verify the card information is display or Not
    And user_612 verify the Supplementary card is display or Not
    And user_612 verify the  Request Branch is display or Not
    And user_612 Verify the Save button is display or not
    And user_612 verify the cancel button is display or not
    And user_612 verify the Next button is display or not
    And user_612 verify the card holder name under Supplementry card
    And user_612 verify the Delivery Cif branch under Supplementry card
    And user_612 click  tha save button
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
    And User_612 Click on the Show More button below the card details
    And user_612 Click Add on Card button under show more
    And user_612 enter the Card holder Name in supplementry card
    And user_612 click next button under show more
    And user_612 click next button under show more
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 Verify the Save button is display or not
    And user_612 verify the cancel button is display or not
    And user_612 verify the Next button is display or not
    And user_612 validate previous button display or not
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  tha save button
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
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
       And user_612 click  tha save button
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
    And User_612 Click on the Show More button below the card details
    And user_612 click prepaid card request under show more
    And user_612 validate the Reference card in prepaid card request
    And user_612 Verify the Save button is display or not
    And user_612 verify the cancel button is display or not
    And user_612 verify the Next button is display or not
     And user_612 clicks on logout btn to logout from omni web portal

  @AT_DCD_032
  Scenario: Verify the Functionality of save Button in Prepaid Card Request - Screen 1
    And User_612 loads the test datasetup for the test case id AT_DCD_030
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
    And User_612 Click on the Show More button below the card details
    And user_612 click prepaid card request under show more
    And user_612 click dropdown button under prepaid card request
    And user_612 select account under the drop down
    And user_612 click  tha save button
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
    And User_612 Click on the Show More button below the card details
    And user_612 click prepaid card request under show more
    And user_612 click dropdown button under prepaid card request
    And user_612 select account under the drop down
    And user_612 click next button under show more
    And user_612 click next button under show more
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 Verify the Save button is display or not
    And user_612 verify the cancel button is display or not
    And user_612 verify the Next button is display or not
    And user_612 validate previous button display or not
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  tha save button
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
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
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click on the My Cards under Cards in the homepage
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
