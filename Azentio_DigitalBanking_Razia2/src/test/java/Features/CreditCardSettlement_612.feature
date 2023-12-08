Feature: Checking the functionalities of CreditCardSettlement

 
 @AT_CCS_001
 
 Scenario: User Verify the Credit Card Settlement Sub Menu and MyCredit Card Settlement Screen1 validation
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
And user_612 click 











 
 
