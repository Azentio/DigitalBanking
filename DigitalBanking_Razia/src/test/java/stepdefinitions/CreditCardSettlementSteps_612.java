package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataprovider.DataReader;
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
	@And("User_612 loads the test datasetup for the test case id AT_CCS_016")
	public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_016() {
	    executionTestData = DataReader.executionTestData.get("AT_CCS_016");
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
try {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), 20, false);
} catch (Exception e) {
	}
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
public void user_612_verify_the_request_successfully_popup() throws Throwable {
	Thread.sleep(20000);
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
//bankCSS

@Given("user_612 validate the FromAccount  is display or not under BankCCS")
public void user_612_validate_the_from_account_is_display_or_not_under_bank_ccs() {
for (int i = 0; i <100; i++) {
		try {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"));
	break;
		} catch (Exception e) {
		if (i==100) {
			Assert.fail(e.getMessage());
		}
	}}
	
}

@Given("user_612 validate To beneficiary segment is display or not under bankCCS")
public void user_612_validate_to_beneficiary_segment_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_ToBeneficiarySeg"));   
}

@Given("user_612 validate To Other is display or not under bankCCS")
public void user_612_validate_to_other_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_ToOther"));
}

@Given("user_612 validate the amount is display or not under bankCCS")
public void user_612_validate_the_amount_is_display_or_not_under_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Validate_Amount_CSS"));
}

@Given("user_612 validate purpose is display or not under bankCSS")
public void user_612_612_validate_purpose_is_display_or_not_under_bank_css() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_purpose"));
}
@Given("user_612 click dropdown button under From Account")
public void user_612_click_dropdown_button_under_from_account() {
  us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown"), 30, false);
    
}

@Given("user_612 select the Account under from Account")
public void user_612_select_the_account_under_from_account() {
		for (int i = 0; i <100; i++) {
					try {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_fromAccount"), false);
		break;
	} catch (Exception e) {
if (i==100) {
	Assert.fail(e.getMessage());
}
	}
		}
 
}

@Given("user_612 click dropdown button under to card Beneficary")
public void user_612_click_dropdown_button_under_to_card_beneficary() throws Throwable { 
// // Thread.sleep(200);
//	for (int i = 0; i < 100; i++) {
//	try {
		 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_CCS_toBene"), false);
//break;
//	} catch (Exception e) {
//		if (i==100) {SelectCard_CCS_toBene
//			Assert.fail(e.getMessage());
//		}
//	}	
//	}
	
}

@Given("user_612 select beneficary under to card beneficary")
public void user_612_select_beneficary_under_to_card_beneficary() {
  
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("card_BCSS_Tobenef_select"), 30, false);

	}
@Given("user_612 verify the previous button is working and go to homepage in BankCCS")
public void user_612_verify_the_previous_button_is_working_and_go_to_homepage_in_bank_ccs( ) {
 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Card_CCS_BankCCS_submenu"));
}

@Given("user_612 enter the Amount under BankCCS")
public void user_612_enter_the_amount_under_bank_ccs() {
	for (int i = 0; i <100; i++) {
					try {
			  us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ValidateAmountCCS_BankCCS"), testData.get("EnterAmount"), false);
			 
			  break;
		} 
			catch (Exception e) {
			if(i==100)
			{
				Assert.fail(e.getMessage());
			}
	
		}	
	}
	
}

@Given("user_612 enter the purpose name under BankCCS")
public void user_612_enter_the_purpose_name_under_bank_ccs() {
  us.enterDataAndTab(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_purpose"),testData.get("CardName") , false);
 
}
@Given("user_612 verify the previous button is working screen3 and go back screen2 in BankCCS")
public void user_verify_the_previous_button_is_working_screen3_and_go_back_screen2_in_bank_ccs( ) {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_iagreecheckbox")) ;
}

@Given("user_612 click to other button under bank CCS")
public void user_612_click_to_other_button_under_bank_ccs( ) {
  us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("ClickToother_BankCCS"),30,false);
}

@Given("user_612 validate beneficiary name is display or not under to other screen")
public void user_612_validate_beneficiary_name_is_display_or_not_under_to_other_screen( ) {
	
	  us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ToOtherBeneName_BankCCS")); 
}

@Given("user_612 validate Add card Number is display or not under to other screen")
public void user_612_validate_add_card_number_is_display_or_not_under_to_other_screen( ) {
	  us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ToOtherCardNumber_BankCCS"));
}
@Given("user_612 validate save beneficiary radio button is display or not under to other screen")
public void user_612_validate_save_beneficiary_radio_button_is_display_or_not_under_to_other_screen( ) {
	  us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ValidateSaveBeneToggle_BankCCS"));
}

@Given("user_612 validate FromAccount  display or not in summary screen")
public void user_612_validate_from_account_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_FromAcc"));
 
}

@Given("user_612 validate Tocard benefiacary display or not in summary screen")
public void user_612_validate_tocard_benefiacary_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ToBene"));
 
}

@Given("user_612 validate Amount display or not in summary screen")
public void user_612_validate_amount_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Amount"));
 
}

@Given("user_612 validate Exchanged Amount display or not in summary screen")
public void user_612_validate_exchanged_amount_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedAmount"));    
}

@Given("user_612 validate Exchange Rate is display or not  in summary screen")
public void user_612_validate_exchange_rate_is_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedRate"));
  
}

@Given("user_612 verify the i agree condition is display or not in summary screen")
public void user_612_verify_the_i_agree_condition_is_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Iagree"));
  
}

@Given("user_612 verify the purpose is display or not in summary screen")
public void user_612_verify_the_purpose_is_display_or_not_in_summary_screen() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Purpose"));
  
}
@Given("user_612 enter benefiary name in to other screen under BankCCS")
public void user_612_enter_benefiary_name_in_to_other_screen_under_bank_ccs( ) {
 us.enterData(driver, DataReader.locatorsMap.get("Cards").get("ToOtherBeneName_BankCCS"),testData.get("CardName") , false);
}

@Given("user_612 enter the Add card number in to other screen underBankCSS")
public void user_612_enter_the_add_card_number_in_to_other_screen_under_bank_css( ) {
	 us.enterData(driver, DataReader.locatorsMap.get("Cards").get("ToOtherCardNumber_BankCCS"),testData.get("EnterAmount") , false);
}

@Given("user_612 click the save beneficary toggle button under to other screen  under BanCCS")
public void user_612_click_the_save_beneficary_toggle_button_under_to_other_screen_under_ban_ccs( ) {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_toother_ToggleBTN"),false);
  
}
@Given("user_612 verify the user not allowed to navigate Screen2")
public void user_612_verify_the_user_not_allowed_to_navigate_screen2( ) {
 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_notAllow"));
}

@Given("user_612 verify the user not allowed to navigate Screen3")
public void user_612_verify_the_user_not_allowed_to_navigate_screen3( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_notAllow"));
}

@Given("user_612 verify the user not allowed to navigate Screen2 to screen3 beacuse toggle button switch off")
public void user_612_verify_the_user_not_allowed_to_navigate_screen_to_screen3_beacuse_toggle_button_switch_off( ) {

	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_notAllow"));
}
@Given("user_612 verify the next button is working and go to screen2 page")
public void user_612_verify_the_next_button_is_working_and_go_to_screen2_page( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_iagreecheckbox"));
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
public void user_612_click_the_bank_credit_card_settlement_under_cardsmenu( ) throws Throwable {
		try {
		
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Card_CCS_BankCCS_submenu"),false);
	} catch (Exception e) {
		
	}
	Thread.sleep(2000);
	}
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

@And("User_612 loads the test datasetup for the test case id AT_CCS_036")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_036() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_036");
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
			 us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CCS_Selectcreditcard_primary"), false);
//		break;	    
//		} catch (Exception e) {
//			if(1==200){
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

@Given("user_612 select the from account in Bank Credit Card Settlement Page")
	public void user_612_select_the_from_account_in_bank_credit_card_settlement_page() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Selectfrom_BankCCS"),false);
	}
@Given("user_612 select the to beneficiary account in BankCCS")
	public void user_612_select_the_to_beneficiary_account_in_bank_ccs() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Selecttobene_BankCCS"),false);
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

//local

@Given("user_612 click the local credit card settlement sub menu")
public void user_612_click_the_local_credit_card_settlement_sub_menu( ) {
	us.clickOnElementNoWait(driver, 
			DataReader.locatorsMap.get("Cards").get("LocalCreditCardSettlement_CCS"), 
			30,
			false);
}

@Given("User_612 click on the from account for Bankccs")
public void user_612_click_on_the_from_account_for_bankccs() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"),false);
}
 
@Given("User_612 select the from account in local Credit Card Settlement Page")
public void user_612_select_the_from_account_in_local_credit_card_settlement_page() {
	
	for (int i = 0; i <100; i++) {
		try {
			us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("CSS_SettlementAcct_Retail"),false);
			break;
		} catch (Exception e) {
			if (i==100) {
				Assert.fail(e.getMessage());
			}
			
		}
		
	}
	
}


@Given("User_612 Click the dropdown under bank in To other screen in Local credit card settlement")
public void user_612_click_the_dropdown_under_bank_in_to_other_screen_in_local_credit_card_settlement() {
	 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_SelectBank_dropdown"), false);
}
 
@Given("User_612 click the bank in to other screen in Local credit card settlement")
public void user_612_click_the_bank_in_to_other_screen_in_local_credit_card_settlement() {
	 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_Bank"), false);
}
 
@Given("User_612 Enter the Branch name in To other screen in Local credit card settlement")
public void user_612_enter_the_branch_name_in_to_other_screen_in_local_credit_card_settlement() {
	us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_BranchName"),testData.get("CardName"),false);
}
 
@Given("User_612 Enter the Beneficiary name in To other screen in Local credit card settlement")
public void user_612_enter_the_beneficiary_name_in_to_other_screen_in_local_credit_card_settlement() {
	us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_Name"),testData.get("CardName"),false);
}
 
@Given("User_612 Enter the Card Number in To other screen in Local credit card settlement")
public void user_612_enter_the_card_number_in_to_other_screen_in_local_credit_card_settlement() {
	us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_CardName"),testData.get("CardNumber"),false);
}
 
@Given("User_612 Click the save beneficiary button in To other screen in Local credit card settlement")
public void user_612_click_the_save_beneficiary_button_in_to_other_screen_in_local_credit_card_settlement() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_toother_ToggleBTN"));
}
@Given("User_612 Validate the From Account under summary in Local credit card settlement")
public void user_612_validate_the_from_account_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_FromAcc"));
}
 
@Given("User_612 Validate the Branch under summary in Local credit card settlement")
public void user_612_validate_the_branch_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Branch"));
}
 
@Given("User_612 Validate the CardNumber under summary in Local credit card settlement")
public void user_612_validate_the_card_number_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_CardNumber"));
}
 
@Given("User_612 Validate the Amount under summary in Local credit card settlement")
public void user_612_validate_the_amount_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Amount"));
}
 
@Given("User_612 Validate the Exchange Rate under summary in Local credit card settlement")
public void user_612_validate_the_exchange_rate_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedRate"));
}
 
@Given("User_612 Validate the Terms and conditions under summary in Local credit card settlement")
public void user_612_validate_the_terms_and_conditions_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Iagree"));
}
 
@Given("User_612 Validate the Bank under summary in Local credit card settlement")
public void user_612_validate_the_bank_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Bank"));
}
 
@Given("User_612 Validate the Name under summary in Local credit card settlement")
public void user_612_validate_the_name_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Name"));
}
 
@Given("User_612 Validate the Save Beneficiary under summary in Local credit card settlement")
public void user_612_validate_the_save_beneficiary_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_SaveBeneficiary"));
}
 
@Given("User_612 Validate the Exchanged Amount under summary in Local credit card settlement")
public void user_612_validate_the_exchanged_amount_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedAmount"));
}
 
@Given("User_612 Validate the Purpose under summary in Local credit card settlement")
public void user_612_validate_the_purpose_under_summary_in_local_credit_card_settlement() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Purpose"));
}

@Given("^User7180 navigates to the omni_corporate_web_portal$")
public void user7180_NavigatesToTheOmni_Corporate_Web_Portal() {
	driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

}

@And("User7180 loads the test datasetup for the test case id AT_CCS_050")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_050() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_051")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_051() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_052")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_052() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_054")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_054() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_055")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_055() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_062")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_062() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_063")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_063() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_064")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_064() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_065")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_065() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User7180 loads the test datasetup for the test case id AT_CCS_066")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_066() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

@And("User7180 loads the test datasetup for the test case id AT_CCS_067")
public void user7180_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_067() {
    executionTestData = DataReader.executionTestData.get("AT_CCS_050");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

@Given("User7180 enters the Corpusername in the login page for omni_corp_portal")
public void user7180_enters_the_corpusername_in_the_login_page_for_omni_corp_portal() {
   //us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
	us.enterData(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
			testData.get("UserName1"),
			false);
}
@Given("User7180 enters the Corppassword in the login page for omni_corp_portal")
public void user7180_enters_the_Corppassword_in_the_login_page_for_omni_corp_portal() {
	us.enterDataAndEnter(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
			testData.get("Password1"),
			false);
   	}
@And("^User7180 click on the loggin button in the login page for omni_corporate_web_portal$")
public void user7180_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
	Thread.sleep(5000);
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn1"), 
				20,
				false);
	} catch (Exception e) {
	}
}

//@And("^user_612 click on the force logout btn in the login page for omni_corporate_web_portal$")
//public void user_612ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
//	try {
//		us.clickOnElementNoWait(driver, 
//				DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
//				20,
//				false);
//	} catch (Exception e) {
//		
//		try {
//			us.clickOnElementNoWait(driver, 
//					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
//					20,
//					false);
//		} catch (Exception e1) {
//		}
//	}
//}
@And("^User7180 click on the force logout btn in the login page for omni_corporate_web_portal$")
public void user7180_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
				20,
				false);
	} catch (Exception e) {
		
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
					20,
					false);
		} catch (Exception e1) {
		}
	}
}

@Given("User7180 click credit card settlement submenu  under CardsMenu")
public void user7180_click_credit_card_settlement_submenu_under_cards_menu() throws Throwable {
//Thread.sleep(2000);
//try {
//	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSettlement_Menu"),20, false);
//	
//} catch (Exception e) {
//	
//}
us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSettlement_Menu"), false);
}


@Given("User7180 validate amount display or not")
public void user7180_validate_amount_display_or_not() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_Amount_CSS"));
}

@Given("User7180 validate save button display or not")
public void user7180_validate_save_button_display_or_not() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_save"));

}

@Given("User7180 validate next button display or not")
public void user7180_validate_next_button_display_or_not() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"));

}
@Given("User7180 click save button under mycredit card settlement")
public void user7180_click_save_button_under_mycredit_card_settlement() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SaveButton"),false);

}

@Given("User7180 verify the draft title is display or Not")
public void user7180_verify_the_draft_title_is_display_or_not() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_DraftTitle"));

}

@Given("User7180 verify the submit button is displaying or not")
public void user7180_verify_the_submit_button_is_displaying_or_not() {

us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Draft_Submit_PCR"));
} 

@Given("User7180 verify the cancel button is displaying or not")
public void user7180_verify_the_cancel_button_is_displaying_or_not() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"));

}

@Given("User7180 click the cancel button")
public void user7180_click_the_cancel_button() {
us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"),false);

}


@Given("User7180 click  Next button in my credit card settlement")
public void user7180_click_next_button_in_my_credit_card_settlement() {

us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"), 20, false);
}

@Given("User7180 verify  Open with Terms and Condtions page and i agree terms and condtions radio btn in screen2")
public void user7180_verify_open_with_terms_and_condtions_page_and_i_agree_terms_and_condtions_radio_btn_in_screen2() {

us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_iagreecheckbox"));
}

@Given("User7180 click previous button under my credit card settlement")
public void user7180_click_previous_button_under_my_credit_card_settlement() {
us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_previousbtn"), 20, false);

}

@Given("User7180 Enter Draft Name for save the Debit Detail request")

public void user7180_enter_draft_name_for_save_the_debit_detail_request() {

us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),testData.get("DraftName"),false);
//for (int i = 0; i <50; i++) {
//	driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"))).sendKeys(Keys.BACK_SPACE);	
//}
//us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),testData.get("DraftName"),false);

}

@Given("User7180 Click on sumbit button Save the Data")

public void user7180_click_on_sumbit_button_save_the_data() throws Throwable {
Thread.sleep(2000);
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"),false);//DraftSubmit_debitDetails

}


@Given("User7180 Click on the To Do Screen For check the Saved Draft")
public void user7180_click_on_the_to_do_screen_for_check_the_saved_draft() {

us.clickOnElement(driver, 
DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen1"), false);
}
@Given("User7180 verify the record save in TO DO List for draft Data")
public void user7180_verify_the_record_save_in_to_do_list_for_draft_data() {

us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CCS_TodoDraft_verify"));
}

@Given("User7180 validate previous button display or not")
public void user7180_validate_previous_button_display_or_not() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"));

}

@Given("User7180 Click Local credit card settlement Under credit card settlement")
public void user7180_click_local_credit_card_settlement_under_credit_card_settlement() throws InterruptedException {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("LocalCreditCardSettlement_CCS"),false);
Thread.sleep(50000);
}

//@Given("user_612 validate purpose is display or not under bankCSS")
//public void user_612_validate_purpose_is_display_or_not_under_bank_css() {
//us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_purpose"));
//}
//
@Given("User7180 Validate the select From Account in Local Credit card settlement")
public void user7180_validate_the_select_from_account_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"));
}

@Given("User7180 Validate the To beneficiary segement in Local credit card settlement")
public void user7180_validate_the_to_beneficiary_segement_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToBenefSeg"));
}

@Given("User7180 Validate the To other in Local credit card settlement")
public void user7180_validate_the_to_account_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther"));
}

@Given("User7180 Validate the Enter amount in Local credit card settlement")
public void user7180_validate_the_enter_amount_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_Amount"));
}

@Given("User7180 validate the purpose in Local credit card settlement")
public void user7180_validate_the_purpose_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"));
}
@Given("User7180 click the dropdown under From Account in Local credit card settlement")
public void user7180_click_the_dropdown_under_from_account_in_local_credit_card_settlement() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown"),false);
}
@Given("User7180 click the Account under From Account in Local credit card settlement")
public void user7180_click_the_account_under_from_account_in_local_credit_card_settlement() {
//us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"),20,false);
//us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), false);
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("AccouctFromSlect"), false);
}

@Given("User7180 click the dropdown under To Beneficiary in Local credit card settlement")
public void user7180_click_the_dropdown_under_to_beneficiary_in_local_credit_card_settlement() {
//us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_Beneficiary_dropdown"),20,false);
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown_Account"), false);
}

@Given("User7180 click the Account under To Beneficiary in Local credit card settlement")
public void user7180_click_the_account_under_to_beneficiary_in_local_credit_card_settlement() {
//us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_Beneficiary_Account"),20,false);
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_Beneficiary_Account"), false);
}
@Given("User7180 Validate the Enter Beneficiary name in Local credit card settlement")
public void user7180_validate_the_enter_beneficiary_name_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ToOtherBeneName_BankCCS"));
}

@Given("User7180 Validate the Add card number in Local credit card settlement")
public void user7180_validate_the_add_card_number_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ToOtherCardNumber_BankCCS"));
}

@Given("User7180 Validate the Save Beneficiary button in Local credit card settlement")
public void user7180_validate_the_save_beneficiary_button_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_toother_ToggleBTN"));
}
@Given("User7180 Validate the Next Button in Local credit card settlement")
public void user7180_validate_the_next_button_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_LCSS_NextButton"));
}

@Given("User7180 Validate the Save Button in Local credit card settlement")
public void user7180_validate_the_save_button_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_LCSS_SaveButton"));
}

@Given("User7180 Validate the Cancel Button in Local credit card settlement")
public void user7180_validate_the_cancel_button_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_PinChange_CancelButton"));
}

@Given("User7180 Enter the Amount under currency tab in Local credit card settlement")
public void user7180_enter_the_amount_under_currency_tab_in_local_credit_card_settlement() {
us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_EnterAmount"),testData.get("EnterAmount"),false);
}

@Given("User7180 Enter the purpose in Local credit card settlement")
public void user7180_enter_the_purpose_in_local_credit_card_settlement() {
us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),
			testData.get("Purpose_Account_Transafer"),false);
//	for (int i = 0; i <50; i++) {
//		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"))).sendKeys(Keys.BACK_SPACE);	
//	}
//	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),
//			testData.get("Purpose_Account_Transafer"),false);
 
}

@Given("User7180 Click on the back button for navigate into home Screen")
public void user7180_click_on_the_back_button_for_navigate_into_home_screen() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("BackButtonForCancel"),false);
}

@Given("User7180 Verify the functionality of Back button")
public void user7180_verify_the_functionality_of_back_button() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Generalaccounts_BanKCCS"));
}
@Given("User7180 Verify the Summary screen in Local credit card settlement")
public void User7180_Verify_the_Summary_screen_in_Local_credit_card_settlement() {

us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("LoaclCCS_Summary"));
}
@And("User7180 clicks on logout btn to logout from omni web portal$")
public void user7180_ClicksOnLogoutBtnToLogoutFromOmniWebPortal() throws InterruptedException {
us.clickOnElement(driver, 
		DataReader.locatorsMap.get("OmniScreen_Login").get("LogoutBtnOmniWeb1"), false);
Thread.sleep(30000);
}
@Given("User7180 click the To Other in Local credit card settlement")
public void user7180_click_the_to_other_in_local_credit_card_settlement() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther"), true);
}

@Given("User7180 Click the dropdown under bank in To other screen in Local credit card settlement")
public void user7180_click_the_dropdown_under_bank_in_to_other_screen_in_local_credit_card_settlement() {
 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_SelectBank_dropdown"), false);
}

@Given("User7180 click the bank in to other screen in Local credit card settlement")
public void user7180_click_the_bank_in_to_other_screen_in_local_credit_card_settlement() {
 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_Bank"), false);
}

@Given("User7180 Enter the Branch name in To other screen in Local credit card settlement")
public void user7180_enter_the_branch_name_in_to_other_screen_in_local_credit_card_settlement() {
us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_BranchName"),testData.get("CardName"),false);
}

@Given("User7180 Enter the Beneficiary name in To other screen in Local credit card settlement")
public void user7180_enter_the_beneficiary_name_in_to_other_screen_in_local_credit_card_settlement() {
us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_Name"),testData.get("CardName"),false);
}

@Given("User7180 Enter the Card Number in To other screen in Local credit card settlement")
public void user7180_enter_the_card_number_in_to_other_screen_in_local_credit_card_settlement() {
us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOther_CardName"),testData.get("CardNumber"),false);
}

@Given("User7180 Click the save beneficiary button in To other screen in Local credit card settlement")
public void user7180_click_the_save_beneficiary_button_in_to_other_screen_in_local_credit_card_settlement() {
us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_toother_ToggleBTN"));
}
@Given("User7180 Click on Cancel button Save the Data")
public void user7180_click_on_cancel_button_save_the_data() {
 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"), false);
}
@Given("User7180 Click on Next button Save the Data")
public void user7180_click_on_next_button_save_the_data() {
 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_NextButton"), false);
}
@Given("User7180 Click the back button in Local credit card settlement")
public void user7180_click_the_back_button_in_local_credit_card_settlement() {
for(int i=1;i<200;i++) {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("PCR_1StScreen_Backbutton"),false);
}
}

@Given("User7180 verify the Home screen is visible or not")
public void user7180_verify_the_home_screen_is_visible_or_not() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PCR_1StScreen_Verification"));
}
@Given("User7180 click the previous button display or not")
public void user7180_click_the_previous_button_display_or_not() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"),false);
}
@Given("User7180 Validate the From Account under summary in Local credit card settlement")
public void user7180_validate_the_from_account_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_FromAcc"));
}

@Given("User7180 Validate the Branch under summary in Local credit card settlement")
public void user7180_validate_the_branch_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Branch"));
}

@Given("User7180 Validate the CardNumber under summary in Local credit card settlement")
public void user7180_validate_the_card_number_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_CardNumber"));
}

@Given("User7180 Validate the Amount under summary in Local credit card settlement")
public void user7180_validate_the_amount_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Amount"));
}

@Given("User7180 Validate the Exchange Rate under summary in Local credit card settlement")
public void user7180_validate_the_exchange_rate_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedRate"));
}

@Given("User7180 Validate the Terms and conditions under summary in Local credit card settlement")
public void user7180_validate_the_terms_and_conditions_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Iagree"));
}

@Given("User7180 Validate the Bank under summary in Local credit card settlement")
public void user7180_validate_the_bank_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Bank"));
}

@Given("User7180 Validate the Name under summary in Local credit card settlement")
public void user7180_validate_the_name_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Name"));
}

@Given("User7180 Validate the Save Beneficiary under summary in Local credit card settlement")
public void user7180_validate_the_save_beneficiary_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_SaveBeneficiary"));
}

@Given("User7180 Validate the Exchanged Amount under summary in Local credit card settlement")
public void user7180_validate_the_exchanged_amount_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedAmount"));
}

@Given("User7180 Validate the Purpose under summary in Local credit card settlement")
public void user7180_validate_the_purpose_under_summary_in_local_credit_card_settlement() {
us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Purpose"));
}

@Given("User7180 click on the from account for Bankccs")
public void user7180_click_on_the_from_account_for_bankccs() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"),false);
}

@Given("User7180 select the from account in Bank Credit Card Settlement Page")
public void user7180_select_the_from_account_in_bank_credit_card_settlement_page() {
us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("AccouctFromSlect"),false);
}

@And("^User7180 click on the I agree to terms and conditions checkbox DCD$")
public void user7180_ClickOnTheIAgreeToTermsAndConditionsCheckboxdcd() {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 30,false);

}
@And("^User7180 click on the ok button for the successful login page for omni_corporate_web_portal$")
public void user7180_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
	us.clickOnElement(driver, 
			DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);
	
}
@And("User7180 Click the  CardMenu under omni_corp_portal")
public void user7180_click_the_cardmenu_under_omni_corp_portal( ) {
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"),30,false);
		 //Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")), false);
	} catch (Exception e) {
		
	}
}

@Given("^user_5679 navigates to the omni_corporate_portal_retail$")
public void User_5679_NavigatesToTheOmni_corporate_portal_retail() {
	driver.get(DataReader.configFileMap.get("omni_web_portal"));
}
	@And("User_626 loads the test datasetup for the test case id AT_CCS_031")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_031() {
		executionTestData = DataReader.executionTestData.get("AT_CCS_031");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_CCS_032")
	public void user_626loads_the_test_datasetup_for_the_test_case_id_AT_CCS_032() {
		executionTestData = DataReader.executionTestData.get("AT_CCS_031");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_CCS_043")
	public void user_626loads_the_test_datasetup_for_the_test_case_id_AT_CCS_043() {
		executionTestData = DataReader.executionTestData.get("AT_CCS_043");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard")
	public void user_626_enters_the_CorporateUser_in_the_login_page_for_omni_web_portal() {
		// us.enterDataAndTab(driver,
		// DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);
		
	}
	@Given("User_626 enters the CorporatePass in the login page for omni_web_portal For CreditCard")
	public void user_626626enters_the_CorporatePass_in_the_login_page_for_omni_web_portal() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}
	@Given("user_626 click credit card settlement submenu under CardsMenu")
	public void user_626626_click_credit_card_settlement_submenu_under_cards_menu() throws Throwable {
		Thread.sleep(2000);
		try {
			us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSettlement_Menu"),20, false);
			
		} catch (Exception e) {
			
		}
		
	   }
	@Given("user_626 click the Bank credit card settlement under cardsmenu")
	public void user_626626_click_the_bank_credit_card_settlement_under_cardsmenu( ) {
		try {
			us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Card_CCS_BankCCS_submenu"),20,false);
		} catch (Exception e) {
		}
		}

	@Given("User_626 validate the FromAccount  is display or not under BankCCS")
	public void user_626626_validate_the_from_account_is_display_or_not_under_bank_ccs() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"));
	}

	@Given("User_626 validate To beneficiary segment is display or not under bankCCS")
	public void user_626626_validate_to_beneficiary_segment_is_display_or_not_under_bank_ccs() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_ToBeneficiarySeg"));   
	}

	@Given("User_626 validate To Other is display or not under bankCCS")
	public void user_626626_validate_to_other_is_display_or_not_under_bank_ccs() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_ToOther"));
	}

	@Given("User_626 validate the amount is display or not under bankCCS")
	public void user_626626_validate_the_amount_is_display_or_not_under_bank_ccs() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateAmountCCS_BankCcs"));
	}

	@Given("User_626 validate purpose is display or not under bankCSS")
	public void user_626626_validate_purpose_is_display_or_not_under_bank_css() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"));
	}
	@Given("User_626 click on the from account for Bankccs")
	public void user_626click_on_the_from_account_for_bankccs() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"),false); 
	}

	@Given("User_626 select the from account in Bank Credit Card Settlement Page")
	public void user_626select_the_from_account_in_bank_credit_card_settlement_page() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Selectfrom_BankCCS"),false); 
	}

	@Given("User_626 Click on the to beneficiary for select to account in BankCCS")
	public void user_626click_on_the_to_beneficiary_for_select_to_account_in_bank_ccs() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_CCS_toBene"),false); 
	}

	@Given("User_626 select the to beneficiary account in BankCCS")
	public void user_626select_the_to_beneficiary_account_in_bank_ccs() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Selecttobene_BankCCS"),false); 
	}

@Given("User_626 click on the to other for verifying all fields")
public void user_626click_on_the_to_other_for_verifying_all_fields() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CSS_ToOthers"),true);     
}

@Given("User_626 Verify the Name field Below the to other beneficiary")
public void user_626verify_the_name_field_below_the_to_other_beneficiary() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ToOtherBeneName_BankCCS"));
}

@Given("User_626 Verify the CardNumber field Below the to other beneficiary")
public void user_626verify_the_card_number_field_below_the_to_other_beneficiary() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ToOtherCardNumber_BankCCS"));
}

@Given("User_626 Verify the Save Beneficiary field Below the to other beneficiary")
public void user_626verify_the_save_beneficiary_field_below_the_to_other_beneficiary() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateSaveBeneToggle_BankCCS"));
}

@Given("User_626 Enter the given Name in to other beneficiary name field")
public void user_626enter_the_given_name_in_to_other_beneficiary_name_field() {
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ToOtherBeneName_BankCCS"),testData.get("CardName"),false);
}

@Given("User_626 Enter the given CardNumber in to other beneficiary CardNumber field")
public void user_626enter_the_given_card_number_in_to_other_beneficiary_card_number_field() {
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ToOtherCardNumber_BankCCS"),testData.get("CardNumber"),false);
}

@Given("User_626 ON the toggle in to other beneficiary BankCCS Screen")
public void user_626on_the_toggle_in_to_other_beneficiary_bank_ccs_screen() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCS_BankCCS_toother_ToggleBTN"),false); 
}
@Given("User_626 Enter the Amount Value in the Bank Credit Card Settlement Page")
public void user_626_enter_the_amount_value_in_the_bank_credit_card_settlement_page() {
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("TransactionAmount_CCS"),testData.get("EnterAmount"),false);
}

@Given("User_626 Enter the Purpose in the Bank Credit Card Settlement Page")
public void user_626_enter_the_purpose_in_the_bank_credit_card_settlement_page() {
	//us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),testData.get("Purpose_Account_Transafer"),false);
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),
			testData.get("Purpose_Account_Transafer"),false);
//	for (int i = 0; i <50; i++) {
//		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"))).sendKeys(Keys.BACK_SPACE);	
//	}
//	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),
//			testData.get("Purpose_Account_Transafer"),false);
}
@Given("User_626 Verify the Screen2 to Screen Previous Back Navigations")
public void User_626_Verify_the_Screen2_to_Screen_Previous_Back_Navigations() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"));
}
@Given("User_626 Click on the back button in the Bank credit settlement Page")
public void user_626_click_on_the_back_button_in_the_bank_credit_settlement_page() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Backicon_BankCCs"),false);
}

@Given("User_626 Verify the Functionality of the Back button")
public void user_626_verify_the_functionality_of_the_back_button() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Generalaccounts_BanKCCS"));
}
@Given("User_626 Validate the From Account in Summary Screen of BankCCS")
public void user_626_validate_the_from_account_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_FromAcc"));
}

@Given("User_626 Validate the To card beneficiary in Summary Screen of BankCCS")
public void user_626_validate_the_to_card_beneficiary_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ToBene"));
}

@Given("User_626 Validate the Amount in Summary Screen of BankCCS")
public void user_626_validate_the_amount_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Amount"));
}

@Given("User_626 Validate the Exchanged amount in Summary Screen of BankCCS")
public void user_626_validate_the_exchanged_amount_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedAmount"));
}

@Given("User_626 Validate the Exchange in Summary Screen of BankCCS")
public void user_626_validate_the_exchange_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedRate"));
}

@Given("User_626 Validate the Purpose in Summary Screen of BankCCS")
public void user_626validate_the_purpose_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Purpose"));
}

@Given("User_626 Validate the I agree on terms and conditions in Summary Screen of BankCCS")
public void user_626_validate_the_i_agree_on_terms_and_conditions_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Iagree"));
}
@Given("User_626 Verify the Navigation By the I agree Page")
public void User_626_Verify_the_Navigation_By_the_I_agree_Page() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("AgreeScreenValidation"));
}	
@Given("User_626 without click the checkbox system not allow screen3")
public void User_626_without_click_the_checkbox_system_not_allow_screen3() throws InterruptedException {
	Thread.sleep(5000);
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_ValueMissing_validate"));
}
@Given("User_626 verify the screen1 into Home screen by clicking previous in Bankccs")
public void User_626_Verify_the_screen1_into_Home_screen_by_clicking_previous_in_Bankccs() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PCR_1StScreen_Verification"));
}	
@Given("User_626 verify the screen2 into screen1 by clicking previous in Bankccs")
public void User_626_verify_the_screen2_into_screen1_by_clicking_previous_in_Bankccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidateCCS_FromAccount"));
}		
	
//CreditCard Details
@And("User_626 loads the test datasetup for the test case id AT_CCD_074")
public void user_626_loads_the_test_datasetup_for_the_test_case_id_AT_CCD_074() {
	executionTestData = DataReader.executionTestData.get("AT_CCD_074");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("^user_5679 click on the loggin button in the login page for omni_corporate_web_portal$")
public void User_5679_ClickOnTheLogginButtonInTheLoginPageForOmni_Corporate_Web_Portal() throws InterruptedException {
	//Thread.sleep(5000);
	us.clickOnElement(driver, 
			DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
			true);
	for (int i = 0; i <200; i++) {
		try {
			if (driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("loginValidation"))).isDisplayed()) {
				break;
			}
		} catch (Exception e) {
			if (i==199) {
				us.clickOnElement(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn"), 
						true);
			}
		}
	}
	
	
				
	
}

@And("^user_5679 click on the force logout btn in the login page for omni_corporate_web_portal$")
public void User_5679_ClickOnTheForceLogoutBtnInTheLoginPageForOmni_Corporate_Web_Portal() {
	try {
		us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen"), 
				20,
				true);
	} catch (Exception e) {
		
	}
}

@And("^user_5679 click on the ok button for the successful login page for omni_corporate_web_portal$")
public void User_5679_ClickOnTheOkButtonForTheSuccessfulLoginPageForOmni_Corporate_Web_Portal() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin"), true);

}
@Given("user_5679 click on the Cards screen in the homepage")
public void user_5679_click_on_the_cards_screen_in_the_homepage() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"), false);
}

@Given("User_626 Verify the My Cards section is avaible or not")
public void user_626verify_the_my_cards_request_section_is_avaible_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"));

}
	
@Given("User_626 Verify the Next button in the limit Update Screen")
public void user_626_verify_the_next_button_in_the_limit_update_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"));
}

@Given("User_626 Verify the Cancel button in the limit Update Screen")
public void user_626_verify_the_cancel_button_in_the_limit_update_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cancel_DebitDetailsLUS"));
}

@Given("User_626 Verify the Save button in the limit Update Screen")
public void user_626_verify_the_save_button_in_the_limit_update_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetailsLUS"));
}
@Given("User_626 Click On the Save button For Save the Draft in limit Update Screen")
public void user_626_click_on_the_save_button_for_save_the_draft_in_limit_update_screen() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetailsLUS"),false);
}

@Given("User_626 Verify the draft title field After clicking save button")
public void user_626_verify_the_draft_title_field_after_clicking_save_button() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"));
}

@Given("User_626 Verify the Cancel button in draft Saving Screen")
public void user_626_verify_the_cancel_button_in_draft_saving_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Draft_Cancel_PCR"));
}

@Given("User_626 Verify the Submit button in draft Saving Screen")
public void user_626_verify_the_submit_button_in_draft_saving_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Draft_Submit_PCR"));
}
@Given("User_626 Enter Draft Name for save the Debit Detail request")
public void user_626_enter_draft_name_for_save_the_debit_detail_request() {
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),
			testData.get("DraftName"),false);
	for (int i = 0; i <50; i++) {
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"))).sendKeys(Keys.BACK_SPACE);	
	}
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"),
			testData.get("DraftName"),false);
}
@Given("User_626 Click on sumbit button Save the Data")
public void user_626_click_on_sumbit_button_save_the_data() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DraftSubmit_debitDetails"),false);
}

@Given("User_626 Click on the To Do Screen For check the Saved Draft")
public void user_626_click_on_the_to_do_screen_for_check_the_saved_draft() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("TODO_HomeScreen1"),false);
}

@Given("User_626 Click on the saved Draft data for verification")
public void user_626_click_on_the_saved_draft_data_for_verification() {
	String xpath ="//div[contains(text(),'"+testData.get("DraftName")+"')]";
	   us.clickOnElement(driver, xpath, false);
	}

@Given("User_626 Click on the I agree Check Box in Screen2")
public void user_626_click_on_the_i_agree_check_box_in_screen2() {
	try {
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 30, false);
		
	} catch (Exception e) {

	}
}
@Given("User_626 Click on the Next button in limit Update Screen")
public void user_626_click_on_the_next_button_in_limit_update_screen() throws InterruptedException {
	Thread.sleep(20000);
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);
}
@Given("User_626 Click on the Next button in limit Update Screen with Wait")
public void user_626_click_on_the_next_button_in_limit_update_screen_with_Wait() throws InterruptedException {
	Thread.sleep(20000);
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);
}
@Given("User_626 validate the I Agree Terms and condition in Block Card Screen")
public void User_626_validate_the_I_Agree_Terms_and_condition_in_Block_Card_Screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("IagreeConditions"));
}
@Given("User_626 Verify the Previous is showing in Debit Card PinChange Screen")
public void user_626verify_the_Previous_is_showing_in_debit_card_pin_change_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"));
}
@Given("User_626 Click on the Previous button in Debit Card details Screen")
public void user_626_Click_on_the_Previous_button_in_Debit_Card_details_Screen() {
	us.clickOnElement(driver, 
			DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"),false);
	}

@Given("User_626 Click on the Save button in Screen2")
public void user_626_click_on_the_save_button_in_screen2() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetailsLUS"),false);
}
@Given("User_626 Verify the Submit is showing in Debit Card PinChange Screen")
public void user_626verify_the_submit_is_showing_in_debit_card_pin_change_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("SubmitVisi_DebitDetails"));
}
@Given("User_626 Verify the Cancel is showing in Debit Card PinChange Screen")
public void user_626verify_the_cancel_is_showing_in_debit_card_pin_change_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cancel_DebitDetails"));
}
@Given("User_626 Verify the Save button is visible After clicking edit")
public void user_626verify_the_save_button_is_visible_after_clicking_edit() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetails"));
}

}







