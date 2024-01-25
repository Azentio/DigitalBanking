package stepdefinitions;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import dataProvider.DataReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class CreditCardSettlement {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);	
	String executionTestData;
	HashMap<String, String> testData;
	Actions action;
	
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
	@Given("User_626 enters the CorporateUser in the login page for omni_web_portal For CreditCard")
	public void user_626626enters_the_CorporateUser_in_the_login_page_for_omni_web_portal() {
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
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ClickToother_BankCcs"),false);     
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
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ToOtherSaveBeneToggle_BankCCS"),false); 
}
@Given("User_626 Enter the Amount Value in the Bank Credit Card Settlement Page")
public void user_enter_the_amount_value_in_the_bank_credit_card_settlement_page() {
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ValidateAmountCCS_BankCcs"),testData.get("EnterAmount"),false);
}

@Given("User_626 Enter the Purpose in the Bank Credit Card Settlement Page")
public void user_enter_the_purpose_in_the_bank_credit_card_settlement_page() {
	//us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),testData.get("Purpose_Account_Transafer"),false);
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),
			testData.get("Purpose_Account_Transafer"),false);
	for (int i = 0; i <50; i++) {
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"))).sendKeys(Keys.BACK_SPACE);	
	}
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"),
			testData.get("Purpose_Account_Transafer"),false);


}
@Given("User_626 Verify the Screen2 to Screen Previous Back Navigations")
public void User_626_Verify_the_Screen2_to_Screen_Previous_Back_Navigations() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("ValidatePurpose_BankCCS"));
}
@Given("User_626 Click on the back button in the Bank credit settlement Page")
public void user_click_on_the_back_button_in_the_bank_credit_settlement_page() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Backicon_BankCCs"),false);
}

@Given("User_626 Verify the Functionality of the Back button")
public void user_verify_the_functionality_of_the_back_button() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Generalaccounts_BanKCCS"));
}
@Given("User_626 Validate the From Account in Summary Screen of BankCCS")
public void user_validate_the_from_account_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_FromAcc"));
}

@Given("User_626 Validate the To card beneficiary in Summary Screen of BankCCS")
public void user_validate_the_to_card_beneficiary_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ToBene"));
}

@Given("User_626 Validate the Amount in Summary Screen of BankCCS")
public void user_validate_the_amount_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Amount"));
}

@Given("User_626 Validate the Exchanged amount in Summary Screen of BankCCS")
public void user_validate_the_exchanged_amount_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedAmount"));
}

@Given("User_626 Validate the Exchange in Summary Screen of BankCCS")
public void user_validate_the_exchange_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_ExchangedRate"));
}

@Given("User_626 Validate the Purpose in Summary Screen of BankCCS")
public void user_validate_the_purpose_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Purpose"));
}

@Given("User_626 Validate the I agree on terms and conditions in Summary Screen of BankCCS")
public void user_validate_the_i_agree_on_terms_and_conditions_in_summary_screen_of_bank_ccs() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("BankCCS_Summary_Iagree"));
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}