Feature: Checking the functionalities of CreditCardSettlement

  @AT_CCS_001
  Scenario: Verify that Enter Draft Title Is  Displayed after Clicking  save Button under  My credit card settlment - Screen 1
    And User_612 loads the test datasetup for the test case id AT_CCS_001
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 validate the Mycredit card settlement is Display or Not
    And user_612 validate the Bank Credit Card settlement is Display or Not
    And user_612 validate the Local Credit  card settlement is Display or Not
    And user_612 click Mycredit card settlement
    And user_612 validate credit card is display or not
    And user_612 validate Settlement Account is display or not
    And user_612 validate currency  display or not
    And user_612 validate amount display or not
    And user_612 validate save button display or not
    And user_612 validate next button display or not
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And user_612 click the cancel button
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_002
  Scenario: User save one Record for My credit card settlment and verify TODO List
    And User_612 loads the test datasetup for the test case id AT_CCS_002
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 click save button under mycredit card settlement
    And user_612 Enter value of amount  under mycredit card settlemet
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draft Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_003_01
  Scenario: Verify the  next button in screen1 and verify the screen2
    And User_612 loads the test datasetup for the test case id AT_CCS_003
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_003_02
  Scenario: Verify BackButton  in screen 1
    And User_612 loads the test datasetup for the test case id AT_CCS_003
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click previous button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_004
  Scenario: verify and functionality of save button in screen 2
    And User_612 loads the test datasetup for the test case id AT_CCS_004
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 validate save button display or not
    And user_612 validate next button display or not
    And user_612 validate previous button display or not
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draft Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_005
  Scenario: Verify that User Navigate to Summary Screen3
    And User_612 loads the test datasetup for the test case id AT_CCS_004
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 click  Next button in my credit card settlement
    And user_612 validate the credit card type  in screen3
    And user_612 validate the settlement account in screen3
    And user_612 validate the Amount in screen3
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_006
  Scenario: Verify that User Navigate to Summary Screen3 to go back home screen
    And User_612 loads the test datasetup for the test case id AT_CCS_004
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_007
  Scenario: Verify that Enter Draft Title Is  Displayed after Clicking  save Button in  My credit CardSettlement- Screen 3
    And User_612 loads the test datasetup for the test case id AT_CCS_007
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 click  Next button in my credit card settlement
    And user_612 click save button under mycredit card settlement
    #And user_612 click previous button under my credit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draft Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_008
  Scenario: Verify that Cancel Button  My credit CardSettlement
    And User_612 loads the test datasetup for the test case id AT_CCS_007
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 click  Next button in my credit card settlement
    And user_612 click the cancel button1
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_008_01
  Scenario: Verify that Cancel Button  My credit CardSettlement
    And User_612 loads the test datasetup for the test case id AT_CCS_007
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 click  Next button in my credit card settlement
    And User_612 Click on sumbit button Save the Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_008_02
  Scenario: Verify that user not allowed to navigate Screen 2 when all fields are kept  blank
    And User_612 loads the test datasetup for the test case id AT_CCS_007
    Given user_612 navigates to the omni_corporate_web_portal
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  not allowed to navigate Screen2
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And user_612 click  Next button in my credit card settlement
    And user_612 verify not allowed to navigate screen3
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_009
  Scenario: Verify that User able to Naviagate to My credit Card Settlement Screen 1
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    #And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 validate the Mycredit card settlement is Display or Not
    And user_612 validate the Bank Credit Card settlement is Display or Not
    And user_612 validate the Local Credit  card settlement is Display or Not
    And user_612 click Mycredit card settlement
    And user_612 validate credit card is display or not
    And user_612 validate Settlement Account is display or not
    And user_612 validate currency  display or not
    And user_612 validate amount display or not
    And user_612 validate save button display or not
    And user_612 validate next button display or not
    And user_612 clicks on logout btn to logout from omni web portal

  #Feature: Check the funcnality of  DebitCardDetails
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
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
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
    And user_612  click on the I agree to terms and conditions checkbox
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
    And user_612  click on the I agree to terms and conditions checkbox
    #And user_612 click next button under show more
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
    And user_612  click on the I agree to terms and conditions checkbox
     #And user_612 click next button under show more
     And user_612 validate cancel button is display or not in screen3
      And user_612 validate Submit button is display or not in screen3
       And user_612 validate previous button is display or not in screen3
        And user_612 validate save button is display or not in screen3
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
         
    
    

    
    
    
    
    
    
    
    
    
    
