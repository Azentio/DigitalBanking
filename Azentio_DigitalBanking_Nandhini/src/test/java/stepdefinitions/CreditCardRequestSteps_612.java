package stepdefinitions;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataprovider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class CreditCardRequestSteps_612 {
	
	WebDriver driver = BaseClass .driver;
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;

	@And("User_612 loads the test datasetup for the test case id AT_CCR_001")
    public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCR_001() {
        executionTestData = DataReader.executionTestData.get("AT_CCR_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	
	 
		@Given("user_612 enters the username in the login page for omni_corp_portal")
		public void user_612_enters_the_username_in_the_login_page_for_omni_corp_portal() {
		  
			us.enterData(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
					testData.get("UserName1"),
					false);
		   
		}
		@Given("user_612 enters the password in the login page for omni_corp_portal")
		public void user_612_enters_the_password_in_the_login_page_for_omni_corp_portal() {
			us.enterDataAndEnter(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
					testData.get("Password1"),
					false);
		   	}

@Given("user_612 click the CreditcardRequest under Cards")
public void user_612_click_the_creditcard_request_under_cards( ) {
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_menu"),30,false);
}
@Given("user_612 validate card details display or not")
public void user_612_validate_card_details_display_or_not( ) {
	
    us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_dropdown"));
}	

@Given("user_612 enter the card holder name under card details")
public void user_612_enter_the_card_holder_name_under_card_details() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_cardholdername"))).clear();	   
   us.enterData(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_cardholdername"),testData.get("CardName"), false);
}
@Given("user_612 click the drop down button in card type under card detail")
public void user_612_click_the_drop_down_button_in_card_type_under_card_detail() {
   
   us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CardBlockReason_DebitCard"), false);
}

@Given("user_612 select the card type under drop down")
public void user_612_select_the_card_type_under_drop_down() throws Throwable {
	Thread.sleep(2000);
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"),testData.get("Block_card_Reason"),false);
//	driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_cardType_select_search"))).click();
//	for (int i = 0; i <50; i++) {
//		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_cardType_select_search"))).sendKeys(Keys.BACK_SPACE);	
//	}
//	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_cardType_select_search"),testData.get("Block_card_Reason"),false);
//	
//	String xpath ="//ion-label[contains(text(),'"+testData.get("Block_card_Reason")+"')]";
//	   us.clickOnElement(driver, xpath, false);
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_cardType_select"),20, false);
}

@Given("user_612 click dropdown in settlemnet Account under card details")
public void user_612_click_dropdown_in_settlemnet_account_under_card_details() {
   us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("ClickReferenceCard_Dropdown"),30, false);
   
}

@Given("user_612 select settlement Account")
public void user_612_select_settlement_account() {
	//for (int i = 0; i <50; i++) {
	try {
		
		 us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetais_settlementAcct"),30, false);

	
	} catch (Exception e) {
	 
	//}
	}
}
@Given("user_612 enter draft Title under Credit card request")
public void user_612_enter_draft_title_under_Credit_card_request( ) {
	us.enterData
	(driver, DataReader.locatorsMap.get("Cards").get("DCR_enterDraft"), testData.get("CardName"),false);
   
}

@Given("user_612 validate card type is display or not")
public void user_612_validate_card_type_is_display_or_not() {
   
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCRcardtype_validate"));
}

@Given("user_612 validate holder name is display or not")
public void user_612_validate_holder_name_is_display_or_not() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_holdername_validate"));
    
}

@Given("user_612 validate  withdrawal limit is display or not")
public void user_612_validate_withdrawal_limit_is_display_or_not() {
   
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_withdrawallimit_validate"));
}

@Given("user_612 validate Delivary CIF is display or not")
public void user_612_validate_delivary_cif_is_display_or_not() {
   
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR__delivaryCif_validate"));
}

@Given("user_612 validate  branch Cif is display or not")
public void user_612_validate_branch_cif_is_display_or_not() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_brenchCif_validate"));
    
}

@Given("user_612 validate toggled button on s display or not")
public void user_612_validate_toggled_button_on_s_display_or_not() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_togglebtn_validate"));
    
}
@Given("user_612 verify Screen is switched to home screen1")
public void user_612_verify_screen_is_switched_to_home_screen1( ) {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cards_CCR_CardDetails_dropdown"));
	   
}
//retail
@Given("user_612 enters the Retailusername in the login page")
public void user_612_enters_the_retailusername_in_the_login_page() {
   
	us.enterData(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
			testData.get("UserName1"),
			false);
   
}


@Given("user_612 enters the Retailpassword in the login page")
public void user_612_enters_the_retailpassword_in_the_login_page() {
	us.enterDataAndEnter(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
			testData.get("Password1"),
			false);
   
}
@Given("user_612 validate the toggle button is default swtiched on")
public void user_612_validate_the_toggle_button_is_default_swtiched_on( ) {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Card_CCR_toggledbtn_on"));
}
	
@And("User_612 loads the test datasetup for the test case id AT_CCR_006")
public void user_612_loads_the_test_datasetup_for_the_test_case_id_AT_CCR_006() {
    executionTestData = DataReader.executionTestData.get("AT_CCR_006");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

}

