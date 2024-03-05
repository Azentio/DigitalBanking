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
    And user_612 click back button under my credit card settlement
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
    And user_612 click on the I agree to terms and conditions checkbox DCD
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
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    #And user_612 click previous button under my credit card settlement
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
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
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
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
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_008_01
  Scenario: Verify that user able to Submit  My credit Card Settlement
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
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And User_612 Click on sumbit button Save the Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_008_02
  Scenario: Verify that user not allowed to navigate Screen 2 when all fields are keptblank
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
    And user_612 click  Next button in my credit card settlement
    And user_612 verify not allowed to navigate screen3
    And user_612 clicks on logout btn to logout from omni web portal

  #Retails
  @AT_CCS_009
  Scenario: Verify that User able to Naviagate to My credit Card Settlement Screen 1-Retail User
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
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

  @AT_CCS_010
  Scenario: Verify the Functionality of save Button in My credit card settlement- Screen1 -Retail User
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_011
  Scenario: verify and functionality of save button in screen 2 - RetailUser
    And User_612 loads the test datasetup for the test case id AT_CCS_011
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
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
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_012
  Scenario: Verify that User Navigate to Summary Screen3 -Retail user
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 validate the credit card type  in screen3
    And user_612 validate the settlement account in screen3
    And user_612 validate the Amount in screen3
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_012_01
  Scenario: Verify that User Navigate to Summary Screen3 to go back home screen
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    #/And user_612 click previous button under my credit card settlement
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_013
  Scenario: verify and functionality of save button in screen 3 - RetailUser
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the submit button is displaying or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_014
  Scenario: Verify that user able to Submit  My credit CardSettlement- RetailUser
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_015
  Scenario: Verify that user not allowed to navigate Screen 2 when all fields are kept  blank
    And User_612 loads the test datasetup for the test case id AT_CCS_009
    Given user_612 navigates to the omni_web_portal
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click Mycredit card settlement
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  not allowed to navigate Screen2
    And user_612 click dropdown btn in credit card under Mycredit card settlement
    And user_612 select credit card under dropdown in Retail
    And user_612 click dropdown btn in settlment Account
    And user_612 select setlement Account  under dropdown in Retail
    And user_612 click currency under Mycredit card settlement
    And user_612 search currency type under serach input
    And user_612 select the currency type under search
    And user_612 Enter value of amount  under mycredit card settlemet
    And user_612 click  Next button in my credit card settlement
    And user_612 click  Next button in my credit card settlement
    And user_612 verify not allowed to navigate screen3
    And user_612 clicks on logout btn to logout from omni web portal

  # corp#
  @AT_CCS_016
  Scenario: Verify that User able to Naviagate to Bank credit Card Settlement Screen 1
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 validate the FromAccount  is display or not under BankCCS
    And user_612 validate To beneficiary segment is display or not under bankCCS
    And user_612 validate To Other is display or not under bankCCS
    And user_612 validate the amount is display or not under bankCCS
    And user_612 validate purpose is display or not under bankCSS
    And user_612 validate save button display or not
    And user_612 validate next button display or not
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 validate beneficiary name is display or not under to other screen
    And user_612 validate Add card Number is display or not under to other screen
    And user_612 validate save beneficiary radio button is display or not under to other screen
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

  @AT_CCS_017
  Scenario: Verify the Functionality of save Button in Bank credit Card Settlement - Screen 2(With To Benefeciary segment )
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click  Next button in my credit card settlement
    And user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
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

  @AT_CCS_018
  Scenario: Verify  the Functionality of Previous button in  Screen 2  (With To Benefeciary segment )
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 verify the previous button is working and go to homepage in BankCCS
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_019
  Scenario: Verify that User Navigate to Summary Screen (With To Benefeciary segment )
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 validate FromAccount  display or not in summary screen
    And user_612 validate Tocard benefiacary display or not in summary screen
    And user_612 validate Amount display or not in summary screen
    And user_612 validate Exchanged Amount display or not in summary screen
    And user_612 validate Exchange Rate is display or not  in summary screen
    And user_612 verify the i agree condition is display or not in summary screen
    And user_612 verify the purpose is display or not in summary screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_019_01
  Scenario: Verify  the Functionality of Previous button in Screen 3(With To Benefeciary segment )
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 verify the previous button is working screen3 and go back screen2 in BankCCS
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_020
  Scenario: Verify that user able to Submit  Bank credit Card Settlement With To beneficiary Segment
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the submit button is displaying or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_020_01
  Scenario: Verify that user able to Submit  Bank credit Card Settlement With To beneficiary Segment
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And User_612 Click on sumbit button Save the Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_021
  Scenario: Verify that user able to Submit  Bank credit Card Settlement With To Other
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And User_612 Click on sumbit button Save the Data
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_022
  Scenario: Verify that user not allowed to navigate Screen 2 when all fields are kept  blank
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click  Next button in my credit card settlement
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_023
  Scenario: Verify that user not allowed to navigate from screen 2 to Screen 3 when Terms and conditions toggleSwitched of
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the user not allowed to navigate Screen3
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_024
  Scenario: Verify that user not allowed to navigate from screen 2 to Screen 3 when Terms and conditions toggle Switched off(With To other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the user not allowed to navigate Screen2 to screen3 beacuse toggle button switch off
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_025
  Scenario: Verify the Functionality of save Button in Bank credit Card Settlement  - Screen 1(With To Other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_025_01
  Scenario: Verify the functionality of Next buttonScreen 1(With To Other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the next button is working and go to screen2 page
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_026
  Scenario: Verify that Save , next ,previous  button  is dsiplayed under Bank credit Card SettlementScreen 2(With To Other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 validate save button display or not
    And user_612 validate next button display or not
    And user_612 validate previous button display or not
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_027
  Scenario: Verify the Functionality of save Button in Bank credit Card Settlement - Screen 2
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_027_01
  Scenario: Verify  the Functionality of Previous button in Screen 2(With To Other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click previous button under my credit card settlement
    And user_612 verify the previous button is working and go to homepage in BankCCS
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_028
  Scenario: Verify that User Navigate to Summary Screen (With To other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 validate FromAccount  display or not in summary screen
    #And user_612 validate Tocard benefiacary display or not in summary screen
    And user_612 validate Amount display or not in summary screen
    And user_612 validate Exchanged Amount display or not in summary screen
    And user_612 validate Exchange Rate is display or not  in summary screen
    And user_612 verify the i agree condition is display or not in summary screen
    And user_612 verify the purpose is display or not in summary screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_028_01
  Scenario: Verify  the Functionality of Previous button inScreen 3(With To Other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 verify the previous button is working screen3 and go back screen2 in BankCCS
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_029
  Scenario: Verify that Save ,previous,Submit button  is displayed under  Bank credit Card SettlementScreen-3(With To Other)
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the submit button is displaying or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_030
  Scenario: Verify the Functionality of save Button in Bank credit Card Settlement - Screen 3
    Given user_612 navigates to the omni_corporate_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_016
    And user_612 enters the Corpusername in the login page for omni_corp_portal
    And user_612 enters the Corppassword in the login page for omni_corp_portal
    And user_612 click on the loggin button in the login page for omni_corporate_web_portal
    And user_612 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_612 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_612 Click the  CardMenu under omni_corp_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the Account under from Account
    And user_612 click dropdown button under to card Beneficary
    And user_612 select beneficary under to card beneficary
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  #RETAIL
  @AT_CCS_036
  Scenario: Verify  the Functionality of Previous button in Screen 3 (With To Benefeciary segment )
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the from account in Bank Credit Card Settlement Page
    And user_612 click dropdown button under to card Beneficary
    And user_612 select the to beneficiary account in BankCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 click previous button under my credit card settlement
    And user_612 verify the previous button is working screen3 and go back screen2 in BankCCS
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_037
  Scenario: Verify  the Functionality of Cancel button in Screen 3-(With To Benefeciary segment )
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the from account in Bank Credit Card Settlement Page
    And user_612 click dropdown button under to card Beneficary
    And user_612 select the to beneficiary account in BankCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_038
  Scenario: Verify the Functionality of save Button in Bank credit Card Settlement - Screen 3 (With To Benefeciary segment )
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the from account in Bank Credit Card Settlement Page
    And user_612 click dropdown button under to card Beneficary
    And user_612 select the to beneficiary account in BankCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the submit button is displaying or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_039
  Scenario: User Verify the  functionality ofCancel button in Screen 3
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the from account in Bank Credit Card Settlement Page
    And user_612 click dropdown button under to card Beneficary
    And user_612 select the to beneficiary account in BankCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And user_612 click back button under my credit card settlement
    And user_612 verify Screen is closed and switched to home screen
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_040
  Scenario: Verify that user able to Submit  Bank credit Card Settlement With To beneficiary Segment
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the from account in Bank Credit Card Settlement Page
    And user_612 click dropdown button under to card Beneficary
    And user_612 select the to beneficiary account in BankCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    #And User_612 Click on the To Do Screen For check the Saved Draft
    #And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_041
  Scenario: Verify that user able to Submit  Bank credit Card Settlement With To Other
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click dropdown button under From Account
    And user_612 select the from account in Bank Credit Card Settlement Page
    And user_612 click dropdown button under to card Beneficary
    And user_612 select the to beneficiary account in BankCCS
    And user_612 click to other button under bank CCS
    And user_612 enter benefiary name in to other screen under BankCCS
    And user_612 enter the Add card number in to other screen underBankCSS
    And user_612 click the save beneficary toggle button under to other screen  under BanCCS
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click  Next button in my credit card settlement
    #And user_612 click save button under mycredit card settlement
    #And user_612 verify the draft title is display or Not
    #And user_612 verify the submit button is displaying or not
    #And user_612 verify the cancel button is displaying or not
    #And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    #And User_612 Click on the To Do Screen For check the Saved Draft
    #And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_042
  Scenario: Verify that user not allowed to navigate Screen 2 when all fields are kept blank
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the  Bank credit card settlement under cardsmenu
    And user_612 click  Next button in my credit card settlement
    And user_612 verify the user not allowed to navigate Screen2
    And user_612 clicks on logout btn to logout from omni web portal

  @AT_CCS_077
  Scenario: Verify  the Functionality of Previous button in Screen 2 (With To Other)-localCCS
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the local credit card settlement sub menu
    And User_612 click on the from account for Bankccs
    And User_612 select the from account in local Credit Card Settlement Page
       And user_612 click to other button under bank CCS
    And User_612 Click the dropdown under bank in To other screen in Local credit card settlement
    And User_612 click the bank in to other screen in Local credit card settlement
    And User_612 Enter the Branch name in To other screen in Local credit card settlement
    And User_612 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User_612 Enter the Card Number in To other screen in Local credit card settlement
     #And user_612 click the save beneficary toggle button under to other screen  under BanCCS
   And User_612 Click the save beneficiary button in To other screen in Local credit card settlement      
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
    And user_612 click previous button under my credit card settlement
      And user_612 verify the previous button is working and go to homepage in BankCCS
        And user_612 clicks on logout btn to logout from omni web portal
        
      @AT_CCS_078
  Scenario: Verify the Functionality of save Button in Local credit Card Settlement - Screen 3 (With To Other)
    Given user_612 navigates to the omni_web_portal
    And User_612 loads the test datasetup for the test case id AT_CCS_036
    And user_612 enters the Retailusername in the login page for omni_web_portal1
    And user_612 enters the Retailpassword in the login page for omni_web_portal1
    And user_612 click on the loggin button in the login page for omni_web_portal
    And user_612 click on the force logout btn in the login page for omni_web_portal
    And user_612 click ok Button in retail omni web page
    And user_612 Click the  CardsMenu under omni_web_portal
    And user_612 click credit card settlement submenu  under CardsMenu
    And user_612 click the local credit card settlement sub menu   
    And User_612 click on the from account for Bankccs
    And User_612 select the from account in local Credit Card Settlement Page
       And user_612 click to other button under bank CCS
        And User_612 Click the dropdown under bank in To other screen in Local credit card settlement
    And User_612 click the bank in to other screen in Local credit card settlement
    And User_612 Enter the Branch name in To other screen in Local credit card settlement
    And User_612 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User_612 Enter the Card Number in To other screen in Local credit card settlement
     #And user_612 click the save beneficary toggle button under to other screen  under BanCCS
   And User_612 Click the save beneficiary button in To other screen in Local credit card settlement      
    And user_612 enter the Amount under BankCCS
    And user_612 enter the purpose name under BankCCS
    And user_612 click  Next button in my credit card settlement
    And user_612 click on the I agree to terms and conditions checkbox DCD
   And user_612 click  Next button in my credit card settlement
   And User_612 Validate the From Account under summary in Local credit card settlement
    And User_612 Validate the Branch under summary in Local credit card settlement
    And User_612 Validate the CardNumber under summary in Local credit card settlement
    And User_612 Validate the Amount under summary in Local credit card settlement
    And User_612 Validate the Exchange Rate under summary in Local credit card settlement
    And User_612 Validate the Terms and conditions under summary in Local credit card settlement
    And User_612 Validate the Bank under summary in Local credit card settlement
    And User_612 Validate the Name under summary in Local credit card settlement
    And User_612 Validate the Save Beneficiary under summary in Local credit card settlement
    And User_612 Validate the Exchanged Amount under summary in Local credit card settlement
    And User_612 Validate the Purpose under summary in Local credit card settlement
    And user_612 click previous button under my credit card settlement
      And user_612 click  Next button in my credit card settlement
    And user_612 verify the submit button is displaying or not
    And user_612 validate save button display or not
    And user_612 validate previous button display or not
    And user_612 click save button under mycredit card settlement
    And user_612 verify the draft title is display or Not
    And user_612 verify the submit button is displaying or not
    And user_612 verify the cancel button is displaying or not
    And User_612 Enter Draft Name for save the Debit Detail request
    And User_612 Click on sumbit button Save the Data
    #And User_612 Verify the Request Successfully Popup
    And User_612 Click on the To Do Screen For check the Saved Draft
    And user_612 verify the record save in TO DO List for draftData
    And user_612 clicks on logout btn to logout from omni web portal
     
  
   #nandhini
     @AT_CCS_050
  Scenario: Verify the Functionality of save Button in Local credit Card Settlement  - Screen1 (With To Benefeciary segment )
    And User7180 loads the test datasetup for the test case id AT_CCS_050
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 Validate the select From Account in Local Credit card settlement
    And User7180 Validate the To beneficiary segement in Local credit card settlement
    And User7180 Validate the To other in Local credit card settlement
    And User7180 Validate the Enter amount in Local credit card settlement
    And User7180 validate the purpose in Local credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the dropdown under To Beneficiary in Local credit card settlement
    And User7180 click the Account under To Beneficiary in Local credit card settlement
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_050_01
  Scenario: Verify that User able to add other
    And User7180 loads the test datasetup for the test case id AT_CCS_050
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click on the from account for Bankccs
    And User7180 select the from account in Bank Credit Card Settlement Page
    #And User7180 click the dropdown under From Account in Local credit card settlement
    #And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Validate the Enter Beneficiary name in Local credit card settlement
    And User7180 Validate the Add card number in Local credit card settlement
    And User7180 Validate the Save Beneficiary button in Local credit card settlement
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Validate the Save Button in Local credit card settlement
    #And User7180 Validate the Cancel Button in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click save button under mycredit card settlement
    And User7180 verify the draft title is display or Not
    And User7180 verify the submit button is displaying or not
    And User7180 verify the cancel button is displaying or not
    And User7180 Enter Draft Name for save the Debit Detail request
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_051
  Scenario: Verify that User able to Naviagate to Local credit Card Settlement Screen2 / Verify the functionality of Next button Screen1(With To Benefeciary segment )
    And User7180 loads the test datasetup for the test case id AT_CCS_051
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the dropdown under To Beneficiary in Local credit card settlement
    And User7180 click the Account under To Beneficiary in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_052
  Scenario: Verify that user can cancel the Local credit Card Settlement Screen1
    And User7180 loads the test datasetup for the test case id AT_CCS_052
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the dropdown under To Beneficiary in Local credit card settlement
    And User7180 click the Account under To Beneficiary in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 Click on the back button for navigate into home Screen
    And User7180 Verify the functionality of Back button
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_054
  Scenario: Verify the user can cancel the Local credit Card Settlement Screen2 to Home Screen
    And User7180 loads the test datasetup for the test case id AT_CCS_054
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the dropdown under To Beneficiary in Local credit card settlement
    And User7180 click the Account under To Beneficiary in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click previous button under my credit card settlement
    And User7180 Click on the back button for navigate into home Screen
    And User7180 Verify the functionality of Back button
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_055
  Scenario: Verify  the Functionality of Previous button in Screen3 (With To Benefeciary segment)
    And User7180 loads the test datasetup for the test case id AT_CCS_055
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the dropdown under To Beneficiary in Local credit card settlement
    And User7180 click the Account under To Beneficiary in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click  Next button in my credit card settlement
    And User7180 Verify the Summary screen in Local credit card settlement
    And User7180 click previous button under my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click previous button under my credit card settlement
    And User7180 Click on the back button for navigate into home Screen
    And User7180 Verify the functionality of Back button
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_062
  Scenario: Verify the Functionality of save Button in Local credit Card Settlement - Screen2 (With To Other)
    And User7180 loads the test datasetup for the test case id AT_CCS_062
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click save button under mycredit card settlement
    And User7180 verify the draft title is display or Not
    And User7180 verify the submit button is displaying or not
    And User7180 verify the cancel button is displaying or not
    And User7180 Enter Draft Name for save the Debit Detail request
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_062_01
  Scenario: Verify the Functionality of Next Button in Local credit Card Settlement - Screen2 (With To Other)
    And User7180 loads the test datasetup for the test case id AT_CCS_062
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2
    And User7180 validate save button display or not
    And User7180 validate next button display or not
    And User7180 validate previous button display or not
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click save button under mycredit card settlement
    And User7180 verify the draft title is display or Not
    And User7180 verify the submit button is displaying or not
    And User7180 verify the cancel button is displaying or not
    And User7180 Enter Draft Name for save the Debit Detail request
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_063
  Scenario: Verify  the Functionality of cancel button in Screen1 (With To Other)
    And User7180 loads the test datasetup for the test case id AT_CCS_063
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 Click the back button in Local credit card settlement
    And User7180 verify the Home screen is visible or not
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_064
  Scenario: Verify  the Functionality of Previous button in Screen2 (With To Other)
    And User7180 loads the test datasetup for the test case id AT_CCS_064
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click the previous button display or not
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 clicks on logout btn to logout from omni web portal

  @AT_CCS_065
  Scenario: Verify  the Functionality of cancel button in Screen2 (With To Other)
    And User7180 loads the test datasetup for the test case id AT_CCS_065
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click  Next button in my credit card settlement
    And User7180 Validate the From Account under summary in Local credit card settlement
    And User7180 Validate the Branch under summary in Local credit card settlement
    And User7180 Validate the CardNumber under summary in Local credit card settlement
    And User7180 Validate the Amount under summary in Local credit card settlement
    And User7180 Validate the Exchange Rate under summary in Local credit card settlement
    And User7180 Validate the Terms and conditions under summary in Local credit card settlement
    And User7180 Validate the Bank under summary in Local credit card settlement
    And User7180 Validate the Name under summary in Local credit card settlement
    And User7180 Validate the Save Beneficiary under summary in Local credit card settlement
    And User7180 Validate the Exchanged Amount under summary in Local credit card settlement
    And User7180 Validate the Purpose under summary in Local credit card settlement
    And User7180 click the previous button display or not
    And User7180 Validate the Next Button in Local credit card settlement
    And User7180 Click the back button in Local credit card settlement
    And User7180 verify the Home screen is visible or not
    And User7180 clicks on logout btn to logout from omni web portal
    
    @AT_CCS_066
    Scenario: Verify the Functionality of save Button in Local credit Card Settlement - Screen3 (With To Other)  
And User7180 loads the test datasetup for the test case id AT_CCS_066
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click  Next button in my credit card settlement
    And User7180 validate previous button display or not
    And User7180 validate save button display or not
    And User7180 verify the submit button is displaying or not
    And User7180 click save button under mycredit card settlement
    And User7180 verify the draft title is display or Not
    And User7180 verify the submit button is displaying or not
    And User7180 verify the cancel button is displaying or not
    And User7180 Enter Draft Name for save the Debit Detail request
    And User7180 Click on sumbit button Save the Data
    And User7180 Click on the To Do Screen For check the Saved Draft
    And User7180 verify the record save in TO DO List for draft Data
    And User7180 clicks on logout btn to logout from omni web portal
    @AT_CCS_067
    Scenario: Verify the Functionality of cancel buttonLocal credit Card Settlement - Screen3 (With To Other)
       And User7180 loads the test datasetup for the test case id AT_CCS_067
    Given User7180 navigates to the omni_corporate_web_portal
    And User7180 enters the Corpusername in the login page for omni_corp_portal
    And User7180 enters the Corppassword in the login page for omni_corp_portal
    And User7180 click on the loggin button in the login page for omni_corporate_web_portal
    And User7180 click on the force logout btn in the login page for omni_corporate_web_portal
    And User7180 click on the ok button for the successful login page for omni_corporate_web_portal
    And User7180 Click the  CardMenu under omni_corp_portal
    And User7180 click credit card settlement submenu  under CardsMenu
    And User7180 Click Local credit card settlement Under credit card settlement
    And User7180 click the dropdown under From Account in Local credit card settlement
    And User7180 click the Account under From Account in Local credit card settlement
    And User7180 click the To Other in Local credit card settlement
    And User7180 Click the dropdown under bank in To other screen in Local credit card settlement
    And User7180 click the bank in to other screen in Local credit card settlement
    And User7180 Enter the Branch name in To other screen in Local credit card settlement
    And User7180 Enter the Beneficiary name in To other screen in Local credit card settlement
    And User7180 Enter the Card Number in To other screen in Local credit card settlement
    And User7180 Click the save beneficiary button in To other screen in Local credit card settlement
    And User7180 Enter the Amount under currency tab in Local credit card settlement
    And User7180 Enter the purpose in Local credit card settlement
    And User7180 click  Next button in my credit card settlement
    And User7180 click on the I agree to terms and conditions checkbox DCD
    And User7180 click  Next button in my credit card settlement
    And User7180 Click the back button in Local credit card settlement
    And User7180 verify the Home screen is visible or not
    And User7180 clicks on logout btn to logout from omni web portal     
        
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
And User_626 Enter Draft Name for save the Debit Detail request
And User_626 Click on sumbit button Save the Data
And User_626 Click on the To Do Screen For check the Saved Draft
And User_626 Click on the saved Draft data for verification

@AT_CCS_033
 Scenario: Verify that Enter Draft Title Is  Displayed after Clicking  save button in  Bank credit Card Settlement - Screen 2
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
And User_626 Verify the Next button in the limit Update Screen
And User_626 Verify the Cancel button in the limit Update Screen
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

        
        
        
        
        
        
        
        
        
        
      
      
      
    
    
    
    
   