Feature: Checking the functionalities of Credit card request (9 testcase only)

  @AT_CCR_001
  Scenario: Verify the Functionality of save Button in Credit card request - Screen 1
    And User_612 loads the test datasetup for the test case id AT_CCR_001
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the username in the login page for omni_corp_portal
    And user_612 enters the password in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 validate card details display or not
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 validate the RequestBranch dropdown
    And user_612 validate the Collect_or_reveiver_details
        And user_612 validate the next button
    And user_612 validate the save button
    And user_612 click save Button
    And user_612 enter draft Title under Credit card request
    And user_612 validate the draft title
    And user_612 validate the cancel button
    And user_612 validate the submt button
    And user_612 click submit button
    And user_612 click TO DO button under tha for omni_corporate_web_portal
    And user_612 verify the record save in TO DO List for draft
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCR_002
  Scenario: Verify the Functionality of Cancel button - Screen 1
    And User_612 loads the test datasetup for the test case id AT_CCR_001
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the username in the login page for omni_corp_portal
    And user_612 enters the password in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCR_003
  Scenario: Verify the summary Details and that user able to Submit Credit card request -screen2
    And User_612 loads the test datasetup for the test case id AT_CCR_001
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the username in the login page for omni_corp_portal
    And user_612 enters the password in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 click  Next button in my credit card settlement
    And user_612 validate card type is display or not
    And user_612 validate holder name is display or not
    And user_612 validate  withdrawal limit is display or not
    And user_612 validate Delivary CIF is display or not
    And user_612 validate  branch Cif is display or not
    And user_612 validate toggled button on s display or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And User_612 Click on sumbit button Save the Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCR_004
  Scenario: Verify the Functionality of Cancel button - Screen 2
    And User_612 loads the test datasetup for the test case id AT_CCR_001
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the username in the login page for omni_corp_portal
    And user_612 enters the password in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 verify Screen is switched to home screen1
    And user_612 clicks on logout btn to logout from omni web portal

@AT_CCR_005
Scenario: Verify that user not allowed to navigate Screen 2 when all fields are kept blank
And User_612 loads the test datasetup for the test case id AT_CCR_001
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the username in the login page for omni_corp_portal
    And user_612 enters the password in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click  Next button in my credit card settlement
    And user_612 clicks on logout btn to logout from omni web portal
       
         
     @AT_CCR_006
  Scenario: Verify the Functionality of save Button in Credit card request - Screen 1 [retail user]
    And User_612 loads the test datasetup for the test case id AT_CCR_006
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page 
    And user_612 enters the Retailpassword in the login page 
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 validate card details display or not
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 validate the RequestBranch dropdown
    And user_612 validate the Collect_or_reveiver_details
    And user_612 validate the next button
    And user_612 validate the save button
    And user_612 click save Button
    And user_612 enter draft Title under Credit card request
    And user_612 validate the draft title
    And user_612 validate the cancel button
    And user_612 validate the submt button
    And user_612 click submit button
    And user_612 click TO DO button under tha for omni_corporate_web_portal
    And user_612 verify the record save in TO DO List for draft
    And user_612 clicks on logout btn to logout from omni web portal
     
   @AT_CCR_007
  Scenario: Verify the summary Details and that user able to Submit Credit card request -screen2 [retail user]
    And User_612 loads the test datasetup for the test case id AT_CCR_006
   Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page 
    And user_612 enters the Retailpassword in the login page 
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 click  Next button in my credit card settlement
    And user_612 validate card type is display or not
    And user_612 validate holder name is display or not
    And user_612 validate  withdrawal limit is display or not
    And user_612 validate Delivary CIF is display or not
    And user_612 validate  branch Cif is display or not
    And user_612 validate toggled button on s display or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And User_612 Click on sumbit button Save the Data
    And user_612 clicks on logout btn to logout from omni web portal   
    
    
   @AT_CCR_008 
         Scenario:Verify the Functionality of Cancel button - Screen 1[retail user]
    And User_612 loads the test datasetup for the test case id AT_CCR_006
   Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page 
    And user_612 enters the Retailpassword in the login page 
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal
     
    
     @AT_CCR_009
  Scenario: Verify the Functionality of Cancel button - Screen 2-[retail user]
    And User_612 loads the test datasetup for the test case id AT_CCR_006
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page 
    And user_612 enters the Retailpassword in the login page 
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click the drop down button in card type under card detail
    And user_612 select the card type under drop down
    And user_612 click dropdown in settlemnet Account under card details
    And user_612 select settlement Account
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 verify Screen is switched to home screen1
    And user_612 clicks on logout btn to logout from omni web portal

@AT_CCR_009_01
Scenario: Verify that user not allowed to navigate Screen 2 when all fields are kept blank -[retail user]
And User_612 loads the test datasetup for the test case id AT_CCR_006
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page 
    And user_612 enters the Retailpassword in the login page 
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click the CreditcardRequest under Cards
    And user_612 enter the card holder name under card details
    And user_612 click  Next button in my credit card settlement
     And user_612 clicks on logout btn to logout from omni web portal 
     
     
     
     
     
     
     
     
     
     
     
     
     