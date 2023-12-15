package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.google.api.client.util.Data;

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
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_001() {
        executionTestData = DataReader.executionTestData.get("AT_CCS_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@Given("user_612 enters the Corpusername in the login page for omni_corp_portal")
	public void user_enters_the_corpusername_in_the_login_page_for_omni_corp_portal() {
	   //us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"),
				false);
	   
	}
	@Given("user_612 enters the Corppassword in the login page for omni_corp_portal")
	public void user_enters_the_Corppassword_in_the_login_page_for_omni_corp_portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	   	}
	

@Given("user_612 click credit card settlement submenu  under CardsMenu")
public void user_click_credit_card_settlement_submenu_under_cards_menu() {
	try {
		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSettlement_Menu"),20, false);
		
	} catch (Exception e) {
		
	}
	
   }

@Given("user_612 validate the Mycredit card settlement is Display or Not")
public void user_validate_the_mycredit_card_settlement_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_MycreditCardSettlement"));
}

@Given("user_612 validate the Bank Credit Card settlement is Display or Not")
public void user_validate_the_bank_credit_card_settlement_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_BankcreditCardSettlement"));
	
 }

@Given("user_612 validate the Local Credit  card settlement is Display or Not")
public void user_validate_the_local_credit_card_settlement_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_LocalcreditCardSettlement"));
   
}

@Given("user_612 click Mycredit card settlement")
public void user_click_mycredit_card_settlement() {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Validate_MycreditCardSettlement"),20, false);
	}


@Given("user_612 validate credit card is display or not")
public void user_validate_credit_card_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_creditcard_CCS"));  
  
}

@Given("user_612 validate Settlement Account is display or not")
public void user_validate_settlement_account_is_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CCS_Settlement Account"));
  
}

@Given("user_612 validate currency  display or not")
public void user_validate_currency_display_or_not() {
	
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("validate_Currency_CCS"));
  
}

@Given("user_612 validate amount display or not")
public void user_validate_amount_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Validate_Amount_CSS"));
}

@Given("user_612 validate save button display or not")
public void user_validate_save_button_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_save"));
  
}

@Given("user_612 validate next button display or not")
public void user_validate_next_button_display_or_not() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"));
  
}

@Given("user_612 click dropdown btn in credit card under Mycredit card settlement")
public void user_click_dropdown_btn_in_credit_card_under_mycredit_card_settlement() {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown"), 20, false);
    
    }

@Given("user_612 select credit card under dropdown")
public void user_select_credit_card_under_dropdown() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MYCreditCardSettlelment_selectcreditcard"), 20, false);
    
}

@Given("user_612 click dropdown btn in settlment Account")
public void user_click_dropdown_btn_in_settlment_account() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown_Account"), 20, false);
    
}

@Given("user_612 select setlement Account  under dropdown")
public void user_select_setlement_account_under_dropdown() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), 20, false);
    
}

@Given("user_612 click currency under Mycredit card settlement")
public void user_click_dropdown_button_in_currency_under_mycredit_card_settlement() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("validate_Currency_CCS"), 0, false);
    
}
@Given("user_612 search currency type under serach input")
public void user_search_currency_type_under_serach_input( ) {
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"),testData.get("CardName") , false);
}
@Given("user_612 select the currency type under search")
public void user_select_the_currency_type_under_search( ) {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search_Select"), 20, false);
}

@Given("user_612 Enter value of amount  under mycredit card settlemet")
public void user_enter_value_of_amount_under_mycredit_card_settlemet() {
    us.enterData(driver, DataReader.locatorsMap.get("Cards").get("TransactionAmount_CCS"),testData.get("EnterAmount"), false);
}

@Given("user_612 click save button under mycredit card settlement")
public void user_click_save_button_under_mycredit_card_settlement() {
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_SaveButton"), 20, false);
    
}

@Given("user_612 verify the draft title is display or Not")
public void user_verify_the_draft_title_is_display_or_not() {
    us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_DraftTitle"));
    
}

@Given("user_612 verify the submit button is displaying or not")
public void user_verify_the_submit_button_is_displaying_or_not() {
    
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_SubmitButton"));
}

@Given("user_612 verify the cancel button is displaying or not")
public void user_verify_the_cancel_button_is_displaying_or_not() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"));
    
}

@Given("user_612 click the cancel button")
public void user_click_the_cancel_button() {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardDetails_DraftDetails_CancelButton"),20,false);
    
}
	

}
