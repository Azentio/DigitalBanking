package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class DebitCardRequestSteps_612 {
	
	WebDriver driver = BaseClass .driver;
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;
	
	
	@And("User_612 loads the test datasetup for the test case id AT_DCR_001")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCR_001() {
        executionTestData = DataReader.executionTestData.get("AT_DCR_001");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@And("User_612 loads the test datasetup for the test case id AT_DCR_002")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCR_002() {
        executionTestData = DataReader.executionTestData.get("AT_DCR_002");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }

	@And("User_612 loads the test datasetup for the test case id AT_DCR_004")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCR_004() {
        executionTestData = DataReader.executionTestData.get("AT_DCR_004");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@And("User_612 loads the test datasetup for the test case id AT_DCR_006")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_AT_DCR_006() {
        executionTestData = DataReader.executionTestData.get("AT_DCR_006");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	
    
	@Given("user_612 enters the Retailusername in the login page for omni_corp_portal")
	public void user_612_enters_the_retailusername_in_the_login_page_for_omni_corp_portal() {
	   //us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"),
				false);
	   
	}
	@Given("user_612 enters the Retailpassword in the login page for omni_corp_portal")
	public void user_612_enters_the_retailpassword_in_the_login_page_for_omni_corp_portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	   	}
	@And("user_612 Click the  CardMenu under omni_corp_portal")
	public void user_612_click_the_cardmenu_under_omni_corp_portal( ) {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"),30,false);
			 //Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")), false);
		} catch (Exception e) {
			
		}
		
				
	}

@Given("user_612 click on Debit Card Request cards Menu")
public void user_612_click_on_debit_card_request_cards_menu() throws Throwable {
	us.clickOnElementNoWait(driver, 
			DataReader.locatorsMap.get("Cards").get("Debit_Card_Request"), 
			20,false);
		//us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request"));
   Thread.sleep(2000);
}

@Given("user_612 validate the Debit Card Request dropdown")
public void user_612_validate_the_debit_card_request_dropdown( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request_validate"));
}

@Given("user_612 validate the RequestBranch dropdown")
public void user_612_validate_the_request_branch_dropdown( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Request_Branch"));
}

@Given("user_612 validate the Collect_or_reveiver_details")
public void user_612_validate_the_collect_or_reveiver_details( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Collect_or_reveiver_details"));
}


@Given("user_612 validate the next button")
public void user_612_validate_the_next_button() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request_next"));
 
}

@Given("user_612 validate the save button")
public void user_612_validate_the_save_button() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request_save"));
 
}

@Given("user_612 click the Primary Account dropdown button")
public void user_612_click_the_primary_account_dropdown_button() {

 // (driver, DataReader.locatorsMap.get("Cards").get("DropdownArrow"));
	WebElement PrimaryAcc = driver.findElement(By.xpath((DataReader.locatorsMap.get("Cards").get("DropdownArrow"))));
	us.scrollUp(driver, PrimaryAcc);
   us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DropdownArrow"), 20,false);
} 
@Given("user_612 click the PrimaryAccount dropdown button")
public void user_612_click_the_primaryaccount_dropdown_button() {
	for (int i = 0; i <100;i++) {
		try {
			us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DropdownArrow"), 20,false);
			
		} catch (Exception e) {
			
		}
		
		
		
	}
	 //us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DropdownArrow"), 20,false);
}

@Given("user_612 slect the Account under the primary Account")
public void user_612_slect_the_account_under_the_primary_account() {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("SelectPrimary_DebitCard_Request"), 20,false);
}


@Given("User_612 enter the cardHolder under DCR screen")
public void user_612_enter_the_card_holder_under_dcr_screen() {
	us.enterData
	(driver, DataReader.locatorsMap.get("Cards").get("CardHolder_DebitCardRequest"), testData.get("CardName"),false);
 
}
@Given("user_612 Click the cardType dropdown DCR screen")
public void user_612_click_the_card_type_dropdown_dcr_screen( ) {
 us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DebitCardsRequest_CardType_dropdown"), 20, false);
}

@Given("user_612 select the cardtype")
public void user_612_select_the_cardtype( ) {
	 us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DebitCardsRequest_CardType"), 20, false);
}

@Given("user_612 click save Button")
public void user_612_click_save_button( ) {
	 us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request_save"), 20, false);
	}

@Given("user_612 enter draft Title under popup")
public void user_612_enter_draft_title_under_popup( ) {
	us.enterData
	(driver, DataReader.locatorsMap.get("Cards").get("DCR_enterDraft"), testData.get("CardName"),false);
   
}


@Given("user_612 validate the draft title")
public void user_612_validate_the_draft_title() {
    us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_DraftTitle"));
}

@Given("user_612 validate the cancel button")
public void user_612_validate_the_cancel_button() {
	 us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Cancel"));
	}


@Given("user_612 validate the submt button")
public void user_612_validate_the_submt_button() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"));

}
@Given("user_612 click submit button")
public void user_612_click_submit_button() {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"),20,false);
    
}

@Given("user_612 click TO DO button under tha for omni_corporate_web_portal")
public void user_612_click_to_do_button_under_tha_for_omni_corporate_web_portal() {
   us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_TO Do"), 20, false);
}

@Given("user_612 verify the record save in TO DO List for draft")
public void user_612_verify_the_record_save_in_to_do_list_for_draft() {
	
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_TO Do_LIst_VerifyData"));
}
@Given("user_612 click the next button under Debit card request")
public void user_612_click_the_next_button_under_debit_card_request( ) {
	
	//try {
		us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request_next"), 20, false);
	//} catch (Exception e) {
		
	//}
	
  
}

@Given("user_612 validate the maps screen")
public void user_612_validate_the_maps_screen( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_Maps"));
}

@Given("user_612 validate the previous button in maps screen")
public void user_612_validate_the_previous_button_in_maps_screen( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_previousbtn"));
}

@Given("user_612 validate the next button in maps screen")
public void user_612_validate_the_next_button_in_maps_screen( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"));
}

@Given("user_612 validate the save button in maps screen")
public void user_612_validate_the_save_button_in_maps_screen( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_save"));
}
@Given("user_612 click the maps location")
public void user_612_click_the_maps_location( ) throws Throwable {
	Thread.sleep(2000);
	for (int i = 0; i < 200; i++) {
		try {
			us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_MapsLoaction"),20, false);
			break;
			
		} catch (Exception e) {
			
		
		}
	}
	
	
    
}

@Given("user_612 click the next button in maps screen")
public void user_612_click_the_next_button_in_maps_screen( ) {
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"), 20, false);

}
@Given("user_612 click cancel btn in maps location")
public void user_612_click_cancel_btn_in_maps_location( ) throws Throwable {
	Thread.sleep(2000);
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("CreditCardDetails_PinChange_CancelButton"), 20, false);
}

@Given("user_612 enter draft Title under popup under screen2")
public void user_612_enter_draft_title_under_popup_under_screen2( ) {
//		us.enterData
//	(driver, DataReader.locatorsMap.get("Cards").get("DCR_enterDraft"), testData.get("CardName"),false);
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("DCR_enterDraft"),

			testData.get("CardName"),false);
	for (int i = 0; i <50; i++) {
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("DCR_enterDraft"))).sendKeys(Keys.BACK_SPACE);	
	}
	
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("DCR_enterDraft"),

			testData.get("CardName"),false);
}


@Given("user_612 validate the draft title in screen2")
public void user_612_validate_the_draft_title_in_screen2( ) {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_DraftTitle"));
}

@Given("user_612 validate the cancel button in screen2")
public void user_612_validate_the_cancel_button_in_screen2( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Cancel"));
    
}

@Given("user_612 validate the submt button in screen2")
public void user_612_validate_the_submt_button_in_screen2( ) {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"));
}

@Given("user_612 click submit button in screen2")
public void user_612_click_submit_button_in_screen2() {
    us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Sumbit"), 20, false);
}
@And("^User_612  click on the I agree to terms and conditions check box$")
public void User_612ClickOnTheIAgreeToTermsAndConditionsCheckbox() {
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 
				30,
				false);
		
		Thread.sleep(5000);
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ClickNextBtnInOwnAccountTransfer1"), 
				false);
		
	} catch (Exception e) {
		
	}
}
@Given("user_612 validate screen2 is displaying or not")
public void user_612_validate_screen2_is_displaying_or_not() {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_Maps"));
}

@Given("user_612 Click pevious button in screen2")
public void user_612_click_pevious_button_in_screen2( ) {
us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_previousbtn"), 20, false);
}

@Given("user_612 verify the previous button is working and go to homepage")
public void user_612_verify_the_previous_button_is_working_and_go_to_homepage() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request_validate"));
    
}
@Given("user_612 validate the previous button in maps screen3")
public void user_612_validate_the_previous_button_in_maps_screen3( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_previousbtn"));
}

@Given("user_612 validate the next button in maps screen3")
public void user_612_validate_the_next_button_in_maps_screen3( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_next"));
}

@Given("user_612 validate the save button in maps screen3")
public void user_612_validate_the_save_button_in_maps_screen3( ) {
	us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("DCR_Screen2_save"));
}
@Given("user_612 click save Button under screen4")
public void user_612_click_save_button_under_screen4( ) {
   us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_save"), 20, false);
}
@Given("user_612 user click previous button under screen3")
public void user_612_user_click_previous_button_under_screen3( ) {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_Screen2_previousbtn"), 20, false);
 
}
//
@Given("user_612 enters the Retailusername in the login page for omni_web_portal")
public void user_612_enters_the_retailusername_in_the_login_page_for_omni_web_portal() {
   
	us.enterData(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
			testData.get("UserName1"),
			false);
   
}


@Given("user_612 enters the Retailpassword in the login page for omni_web_portal")
public void user_612_enters_the_retailpassword_in_the_login_page_for_omni_web_portal() {
	us.enterDataAndEnter(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
			testData.get("Password1"),
			false);
   
}


@Given("user_612 click ok Button in retail omni web page")
public void user_612_click_ok_button_in_retail_omni_web_page( ) {
    
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("OK_btn_retail"), 20, false);
}

@And("user_612 Click the  CardsMenu under omni_web_portal")
public void user_612_click_the_cards_menu_under_omni_web_portal( ) {
	us.clickOnElementNoWait(driver, 
			DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"), 
			20,
			false);
	
}

@Given("user_612 select the Account under the primary Account in Retail")
public void user_612_select_the_account_under_the_primary_account_in_retail() throws Throwable {
	Thread.sleep(2000);
	try {
		us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("DCR_primaryAcct_Retail"),30,false);
		
	} catch (Exception e) {
		// TODO: handle exception
	}

}

}






