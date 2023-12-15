Feature: Checking the functionalities of CreditCardSettlement

 
 @AT_CCS_001
 
 Scenario: Verify that Enter Draft Title Is  Displayed after Clicking  save Button in My credit card settlement - Screen 1
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
And user_612 verify the cancel button is displaying or not
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

@AT_CCS_003_01 
Scenario: Verify the screen2 and functionality of next button in screen1
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









@AT_CCS_003_02
Scenario: Verify the screen2 and functionality of cancelbutton in screen1
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
And user_612 click cancel button under my credit card settlement












 
 
