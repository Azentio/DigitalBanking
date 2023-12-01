package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class DebitCardRequest {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;

	@Given("User_626 enters the CorporateUser in the login page for omni_web_portal")
	public void user_enters_the_CorporateUser_in_the_login_page_for_omni_web_portal() {
		// us.enterDataAndTab(driver,
		// DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);
	}

	@Given("User_626 enters the CorporatePass in the login page for omni_web_portal")
	public void user_enters_the_CorporatePass_in_the_login_page_for_omni_web_portal() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}

	@And("User_626 loads the test datasetup for the test case id AT_DCD_001")
	public void User_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_001() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@And("User_626 loads the test datasetup for the test case id AT_DCD_005")
	public void User_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_005() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_005");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@And("User_626 loads the test datasetup for the test case id AT_DCD_006")
	public void User_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_006() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@Given("user_5679 click on the Cards screen in the homepage")
	public void user_5679_click_on_the_cards_screen_in_the_homepage() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"), false);
	}

	@Given("User_626 Verify the My Cards section is avaible or not")
	public void user_verify_the_my_cards_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"));

	}

	@Given("User_626 Verify the Debit card request section is avaible or not")
	public void user_verify_the_debit_card_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request"));
	}

	@Given("User_626 Verify the credit card request section is avaible or not")
	public void user_verify_the_credit_card_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Credit_Card_Request"));
	}

	@Given("User_626 Verify the prepaid card request section is avaible or not")
	public void user_verify_the_prepaid_card_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Prepaid_card_request"));
	}

	@Given("User_626 Verify the prepaid card recharge section is avaible or not")
	public void user_verify_the_prepaid_card_recharge_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Prepaid_card_recharge"));
	}

	@Given("User_626 Verify the credit card settlement section is avaible or not")
	public void user_verify_the_credit_card_settlement_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Credit_card_settlement"));
	}

	@Given("User_626 Verify the Debit Card Segment is visible in My Cards Screen")
	public void user_verify_the_debit_card_segment_is_visible_in_my_cards_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCards_Debit_Cards1"));
	}

	@Given("User_626 Verify the Credit Card Segment is visible in My Cards Screen")
	public void user_verify_the_credit_card_segment_is_visible_in_my_cards_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCards_Credit_Cards1"));
	}

	@Given("User_626 Verify the Prepaid Card Segment is visible in My Cards Screen")
	public void user_verify_the_prepaid_card_segment_is_visible_in_my_cards_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCards_Prepaid_Cards1"));
	}

	@Given("User_626 Verify the Type of debit card is showing in Debit Card Segment")
	public void user_verify_the_type_of_debit_card_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Cards_Type"));
	}

	@Given("User_626 Verify the Currency Name is showing in Debit Card Segment")
	public void user_verify_the_currency_name_is_showing_in_debit_card_segment() {
		// us.waitHelper(driver,DataReader.locatorsMap.get("Cards").get("CurrencyName_DebitCardDetails"));
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CurrencyName_DebitCardDetails"));
	}

	@Given("User_626 Verify the Card Holder Name is showing in Debit Card Segment")
	public void user_verify_the_card_holder_name_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CardHolderName_DebitDetails"));
	}

	@Given("User_626 Verify the Status of the Card is showing in Debit Card Segment")
	public void user_verify_the_status_of_the_card_is_showing_in_debit_card_segment() {
		// String xpath= "//ion-label[contains(text(),+'
		// testData.get("FromAccount1")+"'))]/ancestor::mat-card-header//mat-card-subtitle//ion-label[contains(text(),'Active')]";
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("StatusOfCard"));
	}

	@Given("User_626 Verify the Edit Icon is showing in Debit Card Segment")
	public void user_verify_the_edit_icon_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("EditIconVisible_debitDetails"));
	}

	@Given("User_626 Verify the Show more is showing in Debit Card Segment")
	public void user_verify_the_show_more_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ShowMore"));
	}

	@Given("User_626 Click on the edit button in Debit card details")
	public void user_click_on_the_edit_button_in_debit_card_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("EditIconClick_DebitDetails"), true);
	}

	@Given("User_626 Verify the Card change name button is visible")
	public void user_verify_the_card_change_name_button_is_visible() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ChangeCardNameVisible_debitDetails"));
	}

	@Given("User_626 Verify the Save button is visible After clicking edit")
	public void user_verify_the_save_button_is_visible_after_clicking_edit() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetails"));
	}

	@Given("User_626 Click on the Show More button below the card details")
	public void user_click_on_the_show_more_button_below_the_card_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ShowMoreClick_DebitDetails"), true);
	}

	@Given("User_626 Verify the Primary Account is showing in Debit Card Segment")
	public void user_verify_the_primary_account_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PrimaryAccount_DebitDetails"));
	}

	@Given("User_626 Verify the Expiry Date is showing in Debit Card Segment")
	public void user_verify_the_expiry_date_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ExpiryDate_DebitDetails"));
	}

	@Given("User_626 Verify the Applicant Address is showing in Debit Card Segment")
	public void user_verify_the_applicant_address_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ApplicantAddress_debitDetails"));
	}

	@Given("User_626 Verify the Pin Change is showing in Debit Card ShowMore Screen")
	public void user_verify_the_pin_change_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PinChangeVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Pin Reset is showing in Debit Card ShowMore Screen")
	public void user_verify_the_pin_reset_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PinResetVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Deactivate is showing in Debit Card ShowMore Screen")
	public void user_verify_the_deactivate_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DeactivateVisi_DebitDetails"));

	}

	@Given("User_626 Verify the Limit Update is showing in Debit Card ShowMore Screen")
	public void user_verify_the_limit_update_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("LimitVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Upgrade Card is showing in Debit Card ShowMore Screen")
	public void user_verify_the_upgrade_card_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UpgradeCardVisi_Debitdetails"));

	}

	@Given("User_626 Verify the Replace Card is showing in Debit Card ShowMore Screen")
	public void user_verify_the_replace_card_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ReplaceCardVisi_DebitDetails"));

	}

	@Given("User_626 Verify the Block is showing in Debit Card ShowMore Screen")
	public void user_verify_the_block_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BlockVisi_DebitDetails"));

	}

	@Given("User_626 Verify the Add on Card is showing in Debit Card ShowMore Screen")
	public void user_verify_the_add_on_card_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("AddOnCardVisi_DebitDetails"));

	}

	@Given("User_626 Verify the prepaid request is showing in Debit Card ShowMore Screen")
	public void user_verify_the_prepaid_request_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PrepaidVisi_DebitDetails"));
	}

	@Given("User_626 Click on the Pin Change In Debit Card Details")
	public void user_click_on_the_pin_change_in_debit_card_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("PinChangeVisi_DebitDetails"), false);
	}

	@Given("User_626 Verify the old pin is showing in Debit Card PinChange Screen")
	public void user_verify_the_old_pin_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("OldPinVisi_DebitDetails"));
	}

	@Given("User_626 Verify the new pin is showing in Debit Card PinChange Screen")
	public void user_verify_the_new_pin_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("NewPinVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Confirm new pin is showing in Debit Card PinChange Screen")
	public void user_verify_the_confirm_new_pin_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ConfirmPinVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Cancel is showing in Debit Card PinChange Screen")
	public void user_verify_the_cancel_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cancel_DebitDetails"));
	}

	@Given("User_626 Verify the Submit is showing in Debit Card PinChange Screen")
	public void user_verify_the_submit_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("SubmitVisi_DebitDetails"));
	}

	@Given("User_626 Enter old pin For Update new in Debit Card PinChange Screen")
	public void user_enter_old_pin_for_update_new_in_debit_card_pin_change_screen() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("OldPin_DebitDetails"), testData.get("OldPin"),
				true);
		String jsPaths = DataReader.locatorsMap.get("Cards").get("OldPin_DebitDetails");
		System.out.println("JS Paths " + jsPaths);
	}

	@Given("User_626 Enter New pin For Update new in Debit Card PinChange Screen")
	public void user_enter_new_pin_for_update_new_in_debit_card_pin_change_screen() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("NewPinVisi_DebitDetails"), testData.get("NewPin"),
				false);
	}

	@Given("User_626 Enter Confirm New_pin For Update new in Debit Card PinChange Screen")
	public void user_enter_confirm_new_pin_for_update_new_in_debit_card_pin_change_screen() throws Exception {
		String jsPaths = DataReader.locatorsMap.get("Cards").get("ConfirmPin_DebitDetails");

		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("ConfirmPin_DebitDetails"),
				testData.get("ConfrimNewPin"), true);

		for (int i = 0; i <= 30000; i++) {
			try {
				WebElement element = us.executeJavaScriptReturnWebElement(
						"document.querySelector('input[placeholder=\"Confirm_new_pin\"]').parentNode");
				String attribute = element.getAttribute("class");
				System.out.println("Attribute class name " + attribute);
				if (attribute.contains("has-focus has-value")) {
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
				if (i == 30000) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Given("User_626 Click on the Submit button in debit Card PinChange Screen")
	public void user_click_on_the_submit_button_in_debit_card_pin_change_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement submitButton = us.executeJavaScriptReturnWebElement(
						DataReader.locatorsMap.get("Cards").get("Submit_DebitDetails"));
				submitButton.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_626 Click on the Pin Reset in Debit Card ShowMore Screen")
	public void User_626_Click_on_the_Pin_Reset_in_Debit_Card_ShowMore_Screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("PinResetVisi_DebitDetails"), false);
	}

	@Given("User_626 Verify the Request Successfully Popup in Pinchange Screen")
	public void user_verify_the_request_successfully_popup_in_pinchange_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_L").get("SuccessPopUP"));

	}

	@Given("User_626 Click on the Deactivate Below the card Details")
	public void User_626_Click_on_the_Deactivate_Below_the_card_Details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DeactivateVisi_DebitDetails"), false);
	}

}
