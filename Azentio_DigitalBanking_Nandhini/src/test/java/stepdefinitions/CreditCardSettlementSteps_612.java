package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class CreditCardSettlementSteps_612 {
	WebDriver driver = BaseClass .driver;
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;
	
	
	@And("User_612 loads the test datasetup for the test case id AT_CCS_001")
    public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_001() {
        executionTestData = DataReader.executionTestData.get("AT_CCS_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@And("User_612 loads the test datasetup for the test case id AT_CCS_002")
    public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_002() {
        executionTestData = DataReader.executionTestData.get("AT_CCS_002");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@Given("user_612 enters the Corpusername in the login page for omni_corp_portal")
	public void user_612_enters_the_corpusername_in_the_login_page_for_omni_corp_portal() {
	   //us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"),
				false);
	   
	}
	@Given("user_612 enters the Corppassword in the login page for omni_corp_portal")
	public void user_612_enters_the_Corppassword_in_the_login_page_for_omni_corp_portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	   	}
	

@Given("user_612 click credit card settlement submenu  under CardsMenu")
public void user_612_click_credit_card_settlement_submenu_under_cards_menu() throws Throwable {
	Thread.sleep(2000);
	try {
		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSettlement_Menu"),20, false);
		
	} catch (Exception e) {
		
	}
	
   }

@Given("user_612 validate the Mycredit card settlement is Display or Not")
public void user_612_validate_the_mycredit_card_settlement_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_MycreditCardSettlement"));
}

@Given("user_612 validate the Bank Credit Card settlement is Display or Not")
public void user_612_validate_the_bank_credit_card_settlement_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_BankcreditCardSettlement"));
	
 }

@Given("user_612 validate the Local Credit  card settlement is Display or Not")
public void user_612_validate_the_local_credit_card_settlement_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_LocalcreditCardSettlement"));
   
}

@Given("user_612 click Mycredit card settlement")
public void user_612_click_mycredit_card_settlement() {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Validate_MycreditCardSettlement"),20, false);
	}


@Given("user_612 validate credit card is display or not")
public void user_612_validate_credit_card_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_creditcard_CCS"));  
  
}

@Given("user_612 validate Settlement Account is display or not")
public void user_612_validate_settlement_account_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_Settlement Account"));
  
}

@Given("user_612 validate currency  display or not")
public void user_612_validate_currency_display_or_not() {
	
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_Currency_CCS"));
  
}

@Given("user_612 validate amount display or not")
public void user_612_validate_amount_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_Amount_CSS"));
}

@Given("user_612 validate save button display or not")
public void user_612_validate_save_button_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_save"));
  
}

@Given("user_612 validate next button display or not")
public void user_612_validate_next_button_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"));
  
}

@Given("user_612 click dropdown btn in credit card under Mycredit card settlement")
public void user_612_click_dropdown_btn_in_credit_card_under_mycredit_card_settlement() throws Throwable {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown"), 20, false);
    Thread.sleep(2000);
    }

@Given("user_612 select credit card under dropdown")
public void user_612_select_credit_card_under_dropdown() throws Throwable {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MYCreditCardSettlelment_selectcreditcard"), 20, false);
   
    
}

@Given("user_612 click dropdown btn in settlment Account")
public void user_612_click_dropdown_btn_in_settlment_account() throws Throwable {
	
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown_Account"), 20, false);
   // Thread.sleep(2000);
}

@Given("user_612 select setlement Account  under dropdown")
public void user_612_select_setlement_account_under_dropdown() {

		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), 20, false);
		}

@Given("user_612 click currency under Mycredit card settlement")
public void user_612_click_dropdown_button_in_currency_under_mycredit_card_settlement() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("validate_Currency_CCS"), 20, false);
    
}
@Given("user_612 search currency type under serach input")
public void user_612_search_currency_type_under_serach_input( ) {
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"),testData.get("CurrencyType") , false);
}
@Given("user_612 select the currency type under search")
public void user_612_select_the_currency_type_under_search( ) {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search_Select"), 20, false);
}

@Given("user_612 Enter value of amount  under mycredit card settlemet")
public void user_612_enter_value_of_amount_under_mycredit_card_settlemet() {
    us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("TransactionAmount_CCS"),testData.get("EnterAmount"), false);
}

@Given("user_612 click save button under mycredit card settlement")
public void user_612_click_save_button_under_mycredit_card_settlement() {
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SaveButton"), 20, false);
    
}

@Given("user_612 verify the draft title is display or Not")
public void user_612_verify_the_draft_title_is_display_or_not() {
    us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_DraftTitle"));
    
}

@Given("user_612 verify the submit button is displaying or not")
public void user_612_verify_the_submit_button_is_displaying_or_not() {
    
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"));
} //CreditCardDetails_DraftDetails_SubmitButton

@Given("user_612 verify the cancel button is displaying or not")
public void user_612_verify_the_cancel_button_is_displaying_or_not() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"));
    
}

@Given("user_612 click the cancel button")
public void user_612_click_the_cancel_button() {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"),20,false);
  
}

@And("User_612 loads the test datasetup for the test case id AT_CCS_003")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_003() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_003");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@Given("user_612 click  Next button in my credit card settlement")
public void user_612_click_next_button_in_my_credit_card_settlement() {
    
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"), 20, false);
    }

@Given("user_612 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2")
public void user_612_verify_open_with_terms_and_condtions_page_and_i_agree_terms_and_condtions_radio_btn_in_screen2() {
    
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_iagreecheckbox"));
}

@Given("user_612 click previous button under my credit card settlement")
public void user_612_click_previous_button_under_my_credit_card_settlement() {
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_previousbtn"), 20, false);
    
}

@Given("user_612 verify Screen is closed and switched to home screen")
public void user_612_verify_screen_is_closed_and_switched_to_home_screen() {
    
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_homepage"));
}

@Given("User_612 Enter Draft Name for save the Debit Detail request")

public void user_612_enter_draft_name_for_save_the_debit_detail_request() {
	
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),

			testData.get("DraftName"),false);
	for (int i = 0; i <50; i++) {
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"))).sendKeys(Keys.BACK_SPACE);	
	}
	
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),

			testData.get("DraftName"),false);

}

@Given("User_612 Click on sumbit button Save the Data")

public void user_612_click_on_sumbit_button_save_the_data() throws Throwable {
 Thread.sleep(2000);
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"),30,false);//DraftSubmit_debitDetails
 
}

@Given("User_612 Click on the Save button in Screen2")

public void user_612_click_on_the_save_button_in_screen2() {

	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetailsLUS"),false);

}
@Given("User_612 Click on the To Do Screen For check the Saved Draft")
public void user_612_click_on_the_to_do_screen_for_check_the_saved_draft() {

	us.clickOnElement(driver, 

			DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen1"), false);
}
@Given("user_612 verify the record save in TO DO List for draft Data")
public void user_612_verify_the_record_save_in_to_do_list_for_draft_data() {
	
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CCS_TodoDraft_verify"));
}
@And("User_612 loads the test datasetup for the test case id AT_CCS_004")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_004() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_004");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

@Given("user_612 validate previous button display or not")
public void user_612_validate_previous_button_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"));
  
}
@Given("User_612 Verify the Request Successfully Popup")
public void user_612_verify_the_request_successfully_popup() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_L").get("SuccessPopUP"));
}
@Given("user_612 validate the credit card type  in screen3")
public void user_612_validate_the_credit_card_type_in_screen3( ) {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_validate_creditcard_S3"));
}

@Given("user_612 validate the settlement account in screen3")
public void user_612_validate_the_settlement_account_in_screen3( ) {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_validate_settlementacc_S3"));
}

@Given("user_612 validate the Amount in screen3")
public void user_612_validate_the_amount_in_screen3( ) {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_validate_amount_S3"));
}
@And("User_612 loads the test datasetup for the test case id AT_CCS_007")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_007() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_007");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

@Given("user_612 verify  not allowed to navigate Screen2")
public void user_612_verify_not_allowed_to_navigate_screen2( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_ValueMissing_validate"));
}

@Given("user_612 verify not allowed to navigate screen3")
public void user_612_verify_not_allowed_to_navigate_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_ValueMissing_validate"));   
}

//@Given("user_612 click the cancel button1")
//public void user_612_click_the_cancel_button1() throws Throwable {
//	Thread.sleep(2000);
//	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get(""),20,false);
//  
//}




//Retail user
@And("User_612 loads the test datasetup for the test case id AT_CCS_009")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_009() {
    executionTestData = DataReader.executionTestData.get("AT_DCD_053");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_612 loads the test datasetup for the test case id AT_CCS_011")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_011() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_011");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}


@Given("user_612 enters the Retailusername in the login page for omni_web_portal1")
public void user_612_enters_the_retailusername_in_the_login_page_for_omni_web_portal1() {
   
	us.enterData(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
			testData.get("UserName1"),
			false);
   
}


@Given("user_612 enters the Retailpassword in the login page for omni_web_portal1")
public void user_612_enters_the_retailpassword_in_the_login_page_for_omni_web_portal1() {
	us.enterDataAndEnter(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
			testData.get("Password1"),
			false);
   
}
@Given("user_612 select credit card under dropdown in Retail")
public void user_612_select_credit_card_under_dropdown_retail() {
//	for (int i = 0; i <200; i++) {
//		try {
			 us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CCS_Selectcreditcard_primary"), 20, false);
//			    
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
   
}
@Given("user_612 select setlement Account  under dropdown in Retail")
public void user_612_select_setlement_account_under_dropdown_in_retail() {

		us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CSS_SettlementAcct_Retail"),false);
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ValueMissing_forValidation"));
		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CSS_SettlementAcct_Retail"), 20, false);
		
		}


@Given("user_612 verify the record save in TO DO List for draftData")
public void user_612_verify_the_record_save_in_to_do_list_for_draftdata() {
	
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CCS_TODO_verify_retail"));
}








//debit card details
@And("User_612 loads the test datasetup for the test case id AT_DCD_027")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_027() {
    executionTestData = DataReader.executionTestData.get("AT_DCD_027");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_612 loads the test datasetup for the test case id AT_DCD_028")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_028() {
    executionTestData = DataReader.executionTestData.get("AT_DCD_028");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_612 loads the test datasetup for the test case id AT_DCD_030")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_030() {
    executionTestData = DataReader.executionTestData.get("AT_DCD_030");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_612 loads the test datasetup for the test case id AT_DCD_033")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_033() {
    executionTestData = DataReader.executionTestData.get("AT_DCD_033");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_612 loads the test datasetup for the test case id AT_DCD_035")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_035() {
    executionTestData = DataReader.executionTestData.get("AT_DCD_035");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

@Given("User_612 Click on the Show More button below the card details")
public void user_612_click_on_the_show_more_button_below_the_card_details() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ShowMoreClick_DebitDetails"), true);
}
@Given("user_612 Click on the saved Draft data for verification")
public void user_612_click_on_the_saved_draft_data_for_verification() {
	us.clickOnElement(driver, 
			DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen1"), 
			false);	
	}

@Given("user_612 Click Add on Card button under show more")

public void user_612_click_add_on_card_button_under_show_more() {
    us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("AddOnCardVisi_DebitDetails"),false);;
   
}

@Given("user_612 verify the card information is display or Not")
public void user_612_verify_the_card_information_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Main_val"));   
   
}

@Given("user_612 verify the Supplementary card is display or Not")
public void user_612_verify_the_supplementary_card_is_display_or_not() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Supplmantary_val"));   
}

@Given("user_612 verify the  Request Branch is display or Not")
public void user_612_verify_the_request_branch_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_RBranch_val"));   
   
}

@Given("user_612 Verify the Save button is display or not")
public void user_612_verify_the_save_button_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SaveButton"));   
   
}

@Given("user_612 verify the cancel button is display or not")
public void user_612_verify_the_cancel_button_is_display_or_not() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_CancelButton"));   
}

@Given("user_612 verify the Next button is display or not")
public void user_612_verify_the_next_button_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"));   
   
}

@Given("user_612 verify the card holder name under Supplementry card")
public void user_612_verify_the_card_holder_name_under_supplementry_card() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Supplmantary_Name"));   
}

@Given("user_612 verify the Delivery Cif branch under Supplementry card")
public void user_612_verify_the_delivery_cif_branch_under_supplementry_card() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Supplmantary_Cif"));   
}

@Given("user_612 click  tha save button")
public void user_612_click_tha_save_button() {
    
   us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SaveButton"), false);
}

@Given("user_612 Verify the draft title field After clicking save button")
public void user_612_verify_the_draft_title_field_after_clicking_save_button() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_DraftTitle"));   
}

@Given("user_612 Verify the Cancel button in draft Saving Screen")
public void user_612_verify_the_cancel_button_in_draft_saving_screen() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"));   
}

@Given("user_612 Verify the Submit button in draft Saving Screen")
public void user_612_verify_the_submit_button_in_draft_saving_screen() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_SubmitButton"));   
}

@Given("user_612 enter the Card holder Name in supplementry card")
public void user_612_enter_the_card_holder_name_in_supplementry_card( ) {
	//us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Supplmantary_Name"),testData.get("DraftName"), false);
	 us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Supplmantary_Name_input"),testData.get("DraftName"), false);
	}

@Given("user_612 click next button under show more")
public void user_612_click_next_button_under_show_more( ) throws Throwable {
	Thread.sleep(2000);
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_NextButton"),false);
    
}

@Given("user_612 verify Screen is closed and switched to home screen1")
public void user_612_verify_Screen_is_closed_and_switched_to_home_screen1() {
    
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddOnCard_Main_val"));   
}


@Given("user_612 validate the card holdername is display or not in screen3")
public void user_612_validate_the_card_holdername_is_display_or_not_in_screen3( ) {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddonCard_cradholdername_screen3"));
}

@Given("user_612 validate the cif branch is display or not in screen3")
public void user_612_validate_the_cif_branch_is_display_or_not_in_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddonCard_CIFbranch_screen3"));
}
@Given("user_612 validate the delivary cif branch is display or not in screen3")
public void user_612_validate_the_delivary_cif_branch_is_display_or_not_in_screen3() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_AddonCard_DelivaryCIFbranch_screen3"));
}

@Given("user_612 validate the i agree condition is display or ot not in screen3")
public void user_validate_the_i_agree_condition_is_display_or_ot_not_in_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_IAGree_S3"));
}
@Given("user_612 validate cancel button is display or not in screen3")
public void user_612_validate_cancel_button_is_display_or_not_in_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_CancelButton"));
	
	
}

@Given("user_612 validate Submit button is display or not in screen3")
public void user_612_validate_submit_button_is_display_or_not_in_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SubmitButton"));
}

@Given("user_612 validate previous button is display or not in screen3")
public void user_612_validate_previous_button_is_display_or_not_in_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_PreviousButton"));
}

@Given("user_612 validate save button is display or not in screen3")
public void user_612_validate_save_button_is_display_or_not_in_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SaveButton"));
}
@Given("user_612 click prepaid card request under show more")
public void user_612_click_prepaid_card_request_under_show_more( ) {
 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DCD_showmore_prepaidCard_lookup"),false);
}

@Given("user_612 validate the Reference card in prepaid card request")
public void user_612_validate_the_reference_card_in_prepaid_card_request( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_showmore_prepaidCard_lookup_refernce card"));
	
}
@Given("user_612 click dropdown button under prepaid card request")
public void user_612_click_dropdown_button_under_prepaid_card_request( ) {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DropdownArrow"), 20, false);
   }

@Given("user_612 select account under the drop down")
public void user_612_select_account_under_the_drop_down( ) {
    us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DCD_showmore_prepaidCard_lookup_refernce card_selectAct"),false);
}
@Given("user_612 verify Screen is closed and switched to screen1")
public void user_verify_screen_is_closed_and_switched_to_screen1( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCD_prepaidcardmaindetails_validate"));
    
}
@And("^user_612 click on the I agree to terms and conditions checkbox DCD$")
public void user_612ClickOnTheIAgreeToTermsAndConditionsCheckboxdcd() {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 
				30,
				false);

}
@Given("user_612 validate the Reference card is display or not in screen3")
public void user_612_validate_the_reference_card_is_display_or_not_in_screen3( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCD_Referencecard_screen3"));
}
@Given("user_612 click back button under my credit card settlement")
public void user_612_click_back_button_under_my_credit_card_settlement() {
  us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_backbtn"),20,false);
}

@Given("user_612 click the  Bank credit card settlement under cardsmenu")
public void user_612_click_the_bank_credit_card_settlement_under_cardsmenu( ) {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Card_CCS_BankCCS_submenu"),20,false);
	}

@Given("user_612 validate the FromAccount  is display or not under BankCCS")
public void user_612_validate_the_from_account_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_fromAcc_validate"));
}

@Given("user_612 validate To beneficiary segment is display or not under bankCCS")
public void user_612_validate_to_beneficiary_segment_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_tobeneficary_validate"));   
}

@Given("user_612 validate To Other is display or not under bankCCS")
public void user_612_validate_to_other_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_ToOther"));
}

@Given("user_612 validate the amount is display or not under bankCCS")
public void user_612_validate_the_amount_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Validate_Amount_CSS"));
}

@Given("user_612 validate purpose is display or not under bankCSS")
public void user_612_validate_purpose_is_display_or_not_under_bank_css() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_purpose"));
}

}







