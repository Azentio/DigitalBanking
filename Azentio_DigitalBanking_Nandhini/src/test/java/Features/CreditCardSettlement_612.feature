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
    
    
   #Retails user not perfactly Run

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
  Scenario:Verify the Functionality of save Button in My credit card settlement- Screen1 -Retail User
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
    Scenario:  Verify that User Navigate to Summary Screen3 -Retail user
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
    And user_612 click previous button under my credit card settlement
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
    
  @AT_CCS_016
  Scenario: Verify that User able to Naviagate to Bank credit Card Settlement Screen 1
    And User_612 loads the test datasetup for the test case id AT_CCS_001
    Given user_612 navigates to the omni_corporate_web_portal
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
   
    
    
    


