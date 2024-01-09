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

public class DebitCardDetails {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);	
	String executionTestData;
	HashMap<String, String> testData;
	Actions action;

	@Given("User_626 enters the CorporateUser in the login page for omni_web_portal")
	public void user_626enters_the_CorporateUser_in_the_login_page_for_omni_web_portal() {
		// us.enterDataAndTab(driver,
		// DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);
	}

	@Given("User_626 enters the CorporatePass in the login page for omni_web_portal")
	public void user_626enters_the_CorporatePass_in_the_login_page_for_omni_web_portal() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}

	@And("User_626 loads the test datasetup for the test case id AT_DCD_001")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_001() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@And("User_626 loads the test datasetup for the test case id AT_DCD_005")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_005() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_005");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@And("User_626 loads the test datasetup for the test case id AT_DCD_006")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_006() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_006");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_021")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_021() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_021");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_022")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_022() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_022");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_023")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_023() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_023");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_024")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_024() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_024");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_024_01")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_024_01() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_024");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_PCR_001")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_PCR_001() {
		executionTestData = DataReader.executionTestData.get("AT_PCR_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_PCR_002")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_PCR_002() {
		executionTestData = DataReader.executionTestData.get("AT_PCR_002");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_PCR_004")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_PCR_004() {
		executionTestData = DataReader.executionTestData.get("AT_PCR_004");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_PCR_005")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_PCR_005() {
		executionTestData = DataReader.executionTestData.get("AT_PCR_005");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_PCR_003")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_PCR_003() {
		executionTestData = DataReader.executionTestData.get("AT_PCR_003");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("user_5679 click on the Cards screen in the homepage")
	public void user_5679_click_on_the_cards_screen_in_the_homepage() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"), false);
	}

	@Given("User_626 Verify the My Cards section is avaible or not")
	public void user_626verify_the_my_cards_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"));

	}

	@Given("User_626 Verify the Debit card request section is avaible or not")
	public void user_626verify_the_debit_card_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Card_Request"));
	}

	@Given("User_626 Verify the credit card request section is avaible or not")
	public void user_626verify_the_credit_card_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Credit_Card_Request"));
	}

	@Given("User_626 Verify the prepaid card request section is avaible or not")
	public void user_626verify_the_prepaid_card_request_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Prepaid_card_request"));
	}

	@Given("User_626 Verify the prepaid card recharge section is avaible or not")
	public void user_626verify_the_prepaid_card_recharge_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Prepaid_card_recharge"));
	}

	@Given("User_626 Verify the credit card settlement section is avaible or not")
	public void user_626verify_the_credit_card_settlement_section_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Credit_card_settlement"));
	}

	@Given("User_626 Verify the Debit Card Segment is visible in My Cards Screen")
	public void user_626verify_the_debit_card_segment_is_visible_in_my_cards_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCards_Debit_Cards1"));
	}

	@Given("User_626 Verify the Credit Card Segment is visible in My Cards Screen")
	public void user_626verify_the_credit_card_segment_is_visible_in_my_cards_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCards_Credit_Cards1"));
	}

	@Given("User_626 Verify the Prepaid Card Segment is visible in My Cards Screen")
	public void user_626verify_the_prepaid_card_segment_is_visible_in_my_cards_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("MyCards_Prepaid_Cards1"));
	}

	@Given("User_626 Verify the Type of debit card is showing in Debit Card Segment")
	public void user_626verify_the_type_of_debit_card_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Debit_Cards_Type"));
	}

	@Given("User_626 Verify the Currency Name is showing in Debit Card Segment")
	public void user_626verify_the_currency_name_is_showing_in_debit_card_segment() {
		// us.waitHelper(driver,DataReader.locatorsMap.get("Cards").get("CurrencyName_DebitCardDetails"));
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CurrencyName_DebitCardDetails"));
	}
		
	@Given("User_626 Verify the Card Holder Name is showing in Debit Card Segment")
	public void user_626verify_the_card_holder_name_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_PCR_Retail"));
	}
	@Given("User_626 Verify the Status of the Card is showing in Debit Card Segment")
	public void user_626verify_the_status_of_the_card_is_showing_in_debit_card_segment() {
		// String xpath= "//ion-label[contains(text(),+'
		// testData.get("FromAccount1")+"'))]/ancestor::mat-card-header//mat-card-subtitle//ion-label[contains(text(),'Active')]";
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("StatusOfCard"));
	}

	@Given("User_626 Verify the Edit Icon is showing in Debit Card Segment")
	public void user_626verify_the_edit_icon_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("EditIconVisible_debitDetails"));
	}

	@Given("User_626 Verify the Show more is showing in Debit Card Segment")
	public void user_626verify_the_show_more_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ShowMore"));
	}

	@Given("User_626 Click on the edit button in Debit card details")
	public void user_626click_on_the_edit_button_in_debit_card_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("EditIconClick_DebitDetails"), true);
	}
	
	@Given("User_626 Verify the Card change name button is visible")
	public void user_626verify_the_card_change_name_button_is_visible() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ChangeCardNameVisible_debitDetails"));
	}

	@Given("User_626 Verify the Save button is visible After clicking edit")
	public void user_626verify_the_save_button_is_visible_after_clicking_edit() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetails"));
	}

	@Given("User_626 Click on the Show More button below the card details")
	public void user_626click_on_the_show_more_button_below_the_card_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ShowMoreClick_DebitDetails"), true);
	}

	@Given("User_626 Verify the Primary Account is showing in Debit Card Segment")
	public void user_626verify_the_primary_account_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PrimaryAccount_DebitDetails"));
	}

	@Given("User_626 Verify the Expiry Date is showing in Debit Card Segment")
	public void user_626verify_the_expiry_date_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ExpiryDate_DebitDetails"));
	}

	@Given("User_626 Verify the Applicant Address is showing in Debit Card Segment")
	public void user_626verify_the_applicant_address_is_showing_in_debit_card_segment() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ApplicantAddress_debitDetails"));
	}

	@Given("User_626 Verify the Pin Change is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_pin_change_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PinChangeVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Pin Reset is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_pin_reset_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PinResetVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Deactivate is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_deactivate_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DeactivateVisi_DebitDetails"));

	}

	@Given("User_626 Verify the Limit Update is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_limit_update_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("LimitVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Upgrade Card is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_upgrade_card_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UpgradeCardVisi_Debitdetails"));

	}

	@Given("User_626 Verify the Replace Card is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_replace_card_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ReplaceCardVisi_DebitDetails"));

	}

	@Given("User_626 Verify the Block is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_block_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("BlockVisi_DebitDetails"));

	}

	@Given("User_626 Verify the Add on Card is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_add_on_card_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("AddOnCardVisi_DebitDetails"));

	}

	@Given("User_626 Verify the prepaid request is showing in Debit Card ShowMore Screen")
	public void user_626verify_the_prepaid_request_is_showing_in_debit_card_show_more_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PrepaidVisi_DebitDetails"));
	}

	@Given("User_626 Click on the Pin Change In Debit Card Details")
	public void user_626click_on_the_pin_change_in_debit_card_details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("PinChangeVisi_DebitDetails"), false);
	}

	@Given("User_626 Verify the old pin is showing in Debit Card PinChange Screen")
	public void user_626verify_the_old_pin_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("OldPinVisi_DebitDetails"));
	}

	@Given("User_626 Verify the new pin is showing in Debit Card PinChange Screen")
	public void user_626verify_the_new_pin_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("NewPinVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Confirm new pin is showing in Debit Card PinChange Screen")
	public void user_626verify_the_confirm_new_pin_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ConfirmPinVisi_DebitDetails"));
	}

	@Given("User_626 Verify the Cancel is showing in Debit Card PinChange Screen")
	public void user_626verify_the_cancel_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cancel_DebitDetails"));
	}
	@Given("User_626 Verify the Previous is showing in Debit Card PinChange Screen")
	public void user_626verify_the_Previous_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"));
	}

	@Given("User_626 Verify the Submit is showing in Debit Card PinChange Screen")
	public void user_626verify_the_submit_is_showing_in_debit_card_pin_change_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("SubmitVisi_DebitDetails"));
	}

	@Given("User_626 Enter old pin For Update new in Debit Card PinChange Screen")
	public void user_626enter_old_pin_for_update_new_in_debit_card_pin_change_screen() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("OldPin_DebitDetails"), testData.get("OldPin"),
				true);
		String jsPaths = DataReader.locatorsMap.get("Cards").get("OldPin_DebitDetails");
		System.out.println("JS Paths " + jsPaths);
	}

	@Given("User_626 Enter New pin For Update new in Debit Card PinChange Screen")
	public void user_626enter_new_pin_for_update_new_in_debit_card_pin_change_screen() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("NewPinVisi_DebitDetails"), testData.get("NewPin"),
				false);
	}

	@Given("User_626 Enter Confirm New_pin For Update new in Debit Card PinChange Screen")
	public void user_626enter_confirm_new_pin_for_update_new_in_debit_card_pin_change_screen() throws Exception {
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
	public void user_626click_on_the_submit_button_in_debit_card_pin_change_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement submitButton = us.executeJavaScriptReturnWebElement(DataReader.locatorsMap.get("Cards").get("Submit_DebitDetails"));
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
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("PinResetVisi_DebitDetails"),false);
	}
	@Given("User_626 Verify the Request Successfully Popup in Pinchange Screen")
	public void user_626verify_the_request_successfully_popup_in_pinchange_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_L").get("SuccessPopUP"));
	}
	@Given("User_626 Verify the Draft Saved Successfully After click Submit")
	public void User_626_Verify_the_Draft_Saved_Successfully_After_click_Submit() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_L").get("DraftSuccessPopUP"));
	}
	
	@Given("User_626 Click on the Deactivate Below the card Details")
	public void User_626_Click_on_the_Deactivate_Below_the_card_Details() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DeactivateVisi_DebitDetails"),false);
	}
	//At_DCD_007
	@And("User_626 loads the test datasetup for the test case id AT_DCD_007")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_007() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_007");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 Click on the Limit Update For Field Verification")
	public void user_626click_on_the_limit_update_for_field_verification() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("LimitVisi_DebitDetails"), false);
	}
	@Given("User_626 Verify the CurrencyPOS field Available or Not in POS Limit Update")
	public void user_626verify_the_currency_pos_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("POS_Currency_DebitDetails"));
	}
	@Given("User_626 Check the Currencypos Field is in read only Mode Below POS Limit Update")
	public void user_626check_the_currencypos_field_is_in_read_only_mode_below_pos_limit_update() {
		String Currencypos = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("POS_Currency_DebitDetailsReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Currencypos.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	@Given("User_626 Verify the Current POS Limit Field Available or Not in POS Limit Update")
	public void user_626verify_the_current_pos_limit_field_available_or_not_in_pos_limit_update() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Current_pos_limit_DebitDetails"));
	}
	@Given("User_626 Check the Current POS Limit Field is in read only Mode POS Limit Update")
	public void user626_check_the_current_pos_limit_field_is_in_read_only_mode_pos_limit_update() {
	boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("Current_pos_limit_DebitDetailsReadOnly")).isEnabled();
	Assert.assertFalse(enabled);
//		for (int i = 0; i <2000; i++) {
//            try {
//                Assert.assertTrue(CurrentPOSLimit.contains("true"));
//                break;
//            } catch (Exception e) {
//                if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//            }
//        }
	}

	@Given("User_626 Verify the Periodicity Field Available or Not in POS Limit Update")
	public void user_626_verify_the_periodicity_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("POS_Periodicity"));
	}

	@Given("User_626 Check the Periodicity Field is in read only Mode POS Limit Update")
	public void user_626_check_the_periodicity_field_is_in_read_only_mode_pos_limit_update() {
		String Periodicity = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("POS_PeriodicityReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Periodicity.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Given("User_626 Verify the Utilized Currency Field Available or Not in POS Limit Update")
	public void user_626_verify_the_utilized_currency_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedCurrency_DebitDetails"));
	}

	@Given("User_626 Check the Utilized Currency Field is in read only Mode POS Limit Update")
	public void user_626_check_the_utilized_currency_field_is_in_read_only_mode_pos_limit_update() {
		String UtilizedCurrency = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("POS_PeriodicityReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(UtilizedCurrency.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Given("User_626 Verify the Utilized POS Limit Field Available or Not in POS Limit Update")
	public void user_626_verify_the_utilized_pos_limit_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedPOSLIMIT_debitdetails"));
	}

	@Given("User_626 Check the Utilized POS Limit Field is in read only Mode POS Limit Update")
	public void user_626_check_the_utilized_pos_limit_field_is_in_read_only_mode_pos_limit_update() {
		String CurrentPOSLimit = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("UtilizedPOSLIMIT_debitdetails_Disabled")).getAttribute("disabled");
//		String UtilizedPOSLimit = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("UtilizedPOSLIMIT_debitdetails_Disabled")).getAttribute("aria-disabled");
//		for (int i = 0; i <2000; i++) {
//            try {
//                Assert.assertTrue(UtilizedPOSLimit.contains("true"));
//                break;
//            } catch (Exception e) {
//                if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//            }
//        }
	}

	@Given("User_626 Verify the Remaining Currency Field Available or Not in POS Limit Update")
	public void user_626_verify_the_remaining_currency_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RemainingCurrency_DebitDetails"));
	}

	@Given("User_626 Check the Remaining Currency Field is in read only Mode POS Limit Update")
	public void user_626_check_the_remaining_currency_field_is_in_read_only_mode_pos_limit_update() {
		String RemainingCurrency = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("RemainingCurrency_DebitDetailsReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(RemainingCurrency.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Given("User_626 Verify the Requested POS Limit Field Available or Not in POS Limit Update")
	public void user_626_verify_the_requested_pos_limit_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RequestPOSLimit_DebitDetails"));
	}

	@Given("User_626 Check the Requested POS Limit Field is in Editable POS Limit Update")
	public void user_626_check_the_requested_pos_limit_field_is_in_editable_pos_limit_update() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("RequestPOSLimit_DebitDetails"),
				testData.get("RequestPOS"), false);
	}
	//AT_DCD_008
	@And("User_626 loads the test datasetup for the test case id AT_DCD_008")
	public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_008() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_008");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 Verify the Currency field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_currency_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CurrencywdCode_DebitDetails"));
	}

	@Given("User_626 Check the  Currency field is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_currency_field_is_in_read_only_withdrawal_limit_update() {
		String CurrencyWithdrawal = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("CurrencywdCode_DebitDetailsReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(CurrencyWithdrawal.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Given("User_626 Verify the Current Withdrawal Limit Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_current_withdrawal_limit_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CurrencyWDLimit_DebitDetails"));
	}

	@Given("User_626 Check the  Current Withdrawal Limit is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_current_withdrawal_limit_is_in_read_only_withdrawal_limit_update() {
		boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("CurrencyWDLimit_DebitDetailsreadonly")).isEnabled();
		Assert.assertFalse(enabled);

	}

	@Given("User_626 Verify the Periodicity Wd field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_periodicity_wd_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("WdPeriodicity_DebitDetails"));
	}

	@Given("User_626 Check the  Periodicity Wd field is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_periodicity_wd_field_is_in_read_only_withdrawal_limit_update() {
		String PeriodicityWithdrawalLimit = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("WdPeriodicity_DebitDetailsReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(PeriodicityWithdrawalLimit.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Given("User_626 Verify the Utilized Currency WD field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_utilized_currency_wd_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyWD_DebitDetails"));
	}

	@Given("User_626 Check the  Utilized Currency WD field is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_utilized_currency_wd_field_is_in_read_only_withdrawal_limit_update() {
		String UtilizedCurrencyWD = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyWD_DebitDetailsReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(UtilizedCurrencyWD.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	@Given("User_626 Verify the Utilized Withdrawal Limit field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_utilized_withdrawal_limit_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyLimit_DebitDetails"));
	}
	@Given("User_626 Check the  Utilized Withdrawal Limit field is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_utilized_withdrawal_limit_field_is_in_read_only_withdrawal_limit_update() {
		boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyLimit_DebitDetailsReadOnly")).isEnabled();
	Assert.assertFalse(enabled);
	}
	@Given("User_626 Verify the Remaining Currency WD field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_remaining_currency_wd_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RemainingCurrencyWd_DebitDetails"));
	}
	@Given("User_626 Check the  Remaining Currency WD field is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_remaining_currency_wd_field_is_in_read_only_withdrawal_limit_update() {
		String RemainingCurrencyWD = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("RemainingCurrencyWd_DebitDetailsReadOnly")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RemainingCurrencyWD.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}
	@Given("User_626 Verify the Remaining Withdrawal Limit field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_remaining_withdrawal_limit_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RemainingWdLimit_DebitDetails"));
	}
	@Given("User_626 Check the  Remaining Withdrawal Limit field is in ReadOnly Withdrawal Limit Update")
	public void user_626_check_the_remaining_withdrawal_limit_field_is_in_read_only_withdrawal_limit_update() {
		boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("RemainingWdLimit_DebitDetailsReadOnly")).isEnabled();
	Assert.assertFalse(enabled);
	}

	@Given("User_626 Verify the Requested Withdrawal field Available or Not in Withdrawal Limit Update")
	public void user_626_verify_the_requested_withdrawal_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RequestedWDLimitDebitDetails"));
	}

	@Given("User_626 Check the  Requested  Withdrawal field is in Editable Withdrawal Limit Update")
	public void user_626_check_the_requested_withdrawal_field_is_in_editable_withdrawal_limit_update() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("RequestedWDLimitDebitDetails"),
				testData.get("RequestWithdrwal"),false);
	}
//AT_DCD_009
	@Given("User_626 Enter Data On Requested POS Limit field below POS Limit Update")
	public void user_626enter_data_on_requested_pos_limit_field_below_pos_limit_update() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("RequestPOSLimit_DebitDetails"),
				testData.get("RequestPOS"), false);
	}

	@Given("User_626 Enter Data On Requested Withdrawal field below Withdrawal Limit Update")
	public void user_626enter_data_on_requested_withdrawal_field_below_withdrawal_limit_update() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("RequestedWDLimitDebitDetails"),testData.get("RequestWithdrwal"),false);
		
		
//		WebElement webElement;
//		WebElement withdrawal = (driver, DataReader.locatorsMap.get("Cards").get("RequestedWDLimitDebitDetails"));
//		withdrawal.sendKeys(Keys.TAB);
		
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
	@And("User_626 loads the test datasetup for the test case id AT_DCD_011")
	public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_011() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_011");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_012")
	public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_012() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_012");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@Given("User_626 Click on the Next button in limit Update Screen")
	public void user_626_click_on_the_next_button_in_limit_update_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);
	}
	
	@Given("User_626 Click on the Next button in limit Update Screen for pos screen")
	public void user_626_click_on_the_next_button_in_limit_update_screenfor_pos_screen() throws InterruptedException {
		Thread.sleep(10000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"),false);	
		}
	@Given("User_626 Verify the I Agree is showing in Debit Card PinChange Screen")
	public void User_626_Verify_the_I_Agree_is_showing_in_Debit_Card_PinChangeScreen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_L").get("IAgreeTnC_ScheduledTransfer"));	
	}
	
	@Given("User_626 Click on the I agree Check Box in Screen2")
	public void user_626_click_on_the_i_agree_check_box_in_screen2() {
		try {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 30, false);
			
		} catch (Exception e) {

		}
	}

	@Given("User_626 Click on the Save button in Screen2")
	public void user_626_click_on_the_save_button_in_screen2() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Save_DebitDetailsLUS"),false);
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
	
	
	// Non Duplicate Steps 
	@And("User_626 loads the test datasetup for the test case id AT_DCD_013")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_DCD_013() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_013");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_014")
	public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_014() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_014");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 Click on the Previous button in Debit Card details Screen")
	public void user_626_Click_on_the_Previous_button_in_Debit_Card_details_Screen() {
		us.clickOnElement(driver, 
				DataReader.locatorsMap.get("Cards").get("Previous_DebitDetails"),false);
		}
	@Given("User_626 Verify the Screen2 with the help of Card information Tab")
	public void User_626_Verify_the_Screen2_with_the_help_of_Card_information_Tab() {
		us.elementIsVisible(driver,DataReader.locatorsMap.get("Cards").get("CardLimitInformation_DebitDetails"));
		}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_015")
	public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_015() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_015");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_DCD_016")
	public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_016() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_016");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 loads the test datasetup for the test case id AT_DCD_017")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_at_dcd_017() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_017");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 loads the test datasetup for the test case id AT_DCD_018")
	public void user_626_loads_the_test_datasetup_for_the_test_case_id_at_dcd_018() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_018");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

@Given("User_626 loads the test datasetup for the test case id AT_DCD_019")
public void user_626_loads_the_test_datasetup_for_the_test_case_id_at_dcd_019() {
	executionTestData = DataReader.executionTestData.get("AT_DCD_019");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@Given("User_626 loads the test datasetup for the test case id AT_DCD_020")
public void user_626_loads_the_test_datasetup_for_the_test_case_id_at_dcd_020() {
	executionTestData = DataReader.executionTestData.get("AT_DCD_020");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

	@Given("User_626 Verify the Draft title is avaible or not")
	public void user_626_verify_the_draft_title_is_avaible_or_not() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DraftTitle_DebitDetails"));
	}

	@Given("User_626 Verify the Cancel button the Draft details screen")
	public void user_626verify_the_cancel_button_the_draft_details_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Cancel_DebitDetails"));
	}

	@Given("User_626 Verify the submit button the draft details screen")
	public void user_626_verify_the_submit_button_the_draft_details_screen() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("SubmitVisi_DebitDetails"));
	}
	@Given("User_626 Click on the cancel button in the draft screen")
	public void User_626_Click_on_the_cancel_button_in_the_draft_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Draft_Cancel"),false);
	}
//razia	
	
	
	@Given("^user_612 navigates to the omni_corporate_web_portal$")
	public void user626_NavigatesToTheOmni_Corporate_Web_Portal() {
		driver.get(DataReader.configFileMap.get("omni_Corporate_web_portal"));

	}
	
	@And("User_612 loads the test datasetup for the test case id AT_CCS_002")
    public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_CCS_002() {
        executionTestData = DataReader.executionTestData.get("AT_CCS_002");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@Given("user_612 enters the Corpusername in the login page for omni_corp_portal")
	public void user_626_enters_the_corpusername_in_the_login_page_for_omni_corp_portal() {
	   //us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"),
				false);
	   
	}
	@Given("user_612 enters the Corppassword in the login page for omni_corp_portal")
	public void user_626_enters_the_Corppassword_in_the_login_page_for_omni_corp_portal() {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"),
				false);
	   	}
	

@Given("user_612 click credit card settlement submenu  under CardsMenu")
public void user_626_click_credit_card_settlement_submenu_under_cards_menu() {
	try {
		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSettlement_Menu"),20, false);
		
	} catch (Exception e) {
		
	}
	
   }
@Given("user_612 click mycredit card settlement submenu  under CardsMenu")
public void user_626_click_mycredit_card_settlement_submenu_under_cards_menu() {
	try {
		us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("Validate_MycreditCardSettlement"),20, false);
		
	} catch (Exception e) {
		
	}
	
   }

@Given("user_612 click Mycredit card settlement")
public void user_626_click_mycredit_card_settlement() {
	us.clickOnElementNoWait(driver, DataReader.locatorsMap.get("Cards").get("Validate_MycreditCardSettlement"),20, false);
	}
@And("user_612 Click the  CardMenu under omni_corp_portal")
public void user_626_click_the_cardmenu_under_omni_corp_portal( ) {
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"),30,false);
		 //Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")), false);
	} catch (Exception e) {
		
	}
}

@Given("User_612 Click on the Selection of creditCard in Credit Card settlement Screen")
public void user_626_click_on_the_selection_of_credit_card_in_credit_card_settlement_screen() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("validate_creditcard_CCS"),false);
}

@Given("User_612 Select the credit Card in the Dropdown CreditCard in Credit Card settlement Screen")
public void user_626_select_the_credit_card_in_the_dropdown_credit_card_in_credit_card_settlement_screen() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CreditCardSelection_CCS"),false);
}

@Given("User_612 Click on the Settlement Account Dropdown in Credit Card settlement Screen")
public void user_626_click_on_the_settlement_account_dropdown_in_credit_card_settlement_screen() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CCS_Settlement Account"),false);
}

@Given("User_612 Select the Settlement Account in Credit Card settlement Screen")
public void user_626_select_the_settlement_account_in_credit_card_settlement_screen() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"),false);
}

@Given("User_612 click on the currency and enter currency name in search box")
public void user_626_click_on_the_currency_and_enter_currency_name_in_search_box() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("validate_Currency_CCS"),false);
	us.enterDataAndTab(driver,DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"),
			testData.get("CurrencyType"),
			false);
	
}

@Given("User_612 Select the Currency Name in the Dropdown")
public void user_626_select_the_currency_name_in_the_dropdown() {
	us.clickOnElement(driver,DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search_Select"),false);
}

@Given("User_612 Enter the Transction Amount in Credit Card settlement Screen")
public void user_626_enter_the_transction_amount_in_credit_card_settlement_screen() {
	us.enterDataAndTab(driver,DataReader.locatorsMap.get("Cards").get("TransactionAmount_CCS"),
			testData.get("EnterAmount"),
			false);
}
@Given("user_612 click dropdown btn in credit card under Mycredit card settlement")
public void user_612_click_dropdown_btn_in_credit_card_under_mycredit_card_settlement() {
	us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown"), 20, false);
    
    }

@Given("user_612 select credit card under dropdown")
public void user_612_select_credit_card_under_dropdown() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MYCreditCardSettlelment_selectcreditcard"), 20, false);
    
}


@Given("user_612 click dropdown btn in settlment Account")
public void user_612click_dropdown_btn_in_settlment_account() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("MyCreditCardSettlelment_dropdown_Account"), 20, false);
    
}

@Given("user_612 select setlement Account  under dropdown")
public void user_612select_setlement_account_under_dropdown() {
    us.clickOnElementNoWait(driver,DataReader.locatorsMap.get("Cards").get("SettlementAccount_Selection"), 20, false);
    
}
@Given("User_626 verify the screen3 into screen2 by clicking previous")
public void user_626_verify_the_screen3_into_screen2_by_clicking_previous() {
  us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Screen2_Verification"));
}

@Given("User_626 verify the screen2 into screen1 by clicking previous")
public void user_626_verify_the_screen2_into_screen1_by_clicking_previous() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("POS_Currency_DebitDetails"));
}
@Given("User_626 validate the Current POS Limit in Debit Details Screen3")
public void user_626_validate_the_current_pos_limit_in_debit_details_screen3() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_CurrentPOSLimit_s3"));
}
@Given("User_626 validate the Utilized POS Limit in Debit Details Screen3")
public void user_626_validate_the_utilized_pos_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_UtilizedPOSlimit_s3"));
  
}

@Given("User_626 validate the Remaining POS Limit in Debit Details Screen3")
public void user_626_validate_the_remaining_pos_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_RemainingPOSLimit_s3"));
    
}

@Given("User_626 validate the Requested POS Limit in Debit Details Screen3")
public void user_626_validate_the_requested_pos_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_RequestedPOSLimit_s3"));
    
}

@Given("User_626 validate the Current withdrawal Limit in Debit Details Screen3")
public void user_626_validate_the_current_withdrawal_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_CurrentwithdrawalLimit_s3"));
    
}
@Given("User_626 validate the Periodicity2 in Debit Details Screen3")
public void user_626_validate_the_periodicity2_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_Periodicity2_s3"));
    }

@Given("User_626 validate the Utilized withdrawal Limit in Debit Details Screen3")
public void user_626_validate_the_utilized_withdrawal_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_UtilizedwithdrawalLimit_s3"));
    }

@Given("User_626 validate the Remaining withdrawal Limit in Debit Details Screen3")
public void user_626_validate_the_remaining_withdrawal_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_RemainingwithdrawalLimit_s3"));
    }

@Given("User_626 validate the Requested withdrawal Limit in Debit Details Screen3")
public void user_626_validate_the_requested_withdrawal_limit_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_RequestedwithdrawalLimit_s3"));
    }

@Given("User_626 validate the I Agree Terms and condition in Debit Details Screen3")
public void user_626_validate_the_i_agree_terms_and_condition_in_debit_details_screen3() {
    us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_I_agree_S3"));
    }	
@Given("User_626 Click on the block card below the show more button")
public void user_626_click_on_the_block_card_below_the_show_more_button() {
	 us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("BlockVisi_DebitDetails"),false);
}

@Given("User_626 Validate the Card information section in block card Screen")
public void user_626_validate_the_card_information_section_in_block_card_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Card_Information_DCD"));
}

@Given("User_626 Validate the Card Block options section in block card Screen")
public void user_626_validate_the_card_block_options_section_in_block_card_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CardBlockOptions_DCD"));
}

@Given("User_626 Validate the block card reason below the Card block options")
public void user_626_validate_the_block_card_reason_below_the_card_block_options() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_CardBlockReason"));
}

@Given("User_626 Validate the Toggle button below the Card block options")
public void user_626_validate_the_toggle_button_below_the_card_block_options() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ToggleButton_click"),false);
}

@Given("User_626 click on the block card reason in the block card Screen")
public void user_626_click_on_the_block_card_reason_in_the_block_card_screen() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DCD_CardBlockReason"),false);
}

@Given("User_626 Select the option below the block card Screen")
public void user_626_select_the_option_below_the_block_card_screen() throws InterruptedException { 
	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"),testData.get("Block_card_Reason"),false);
	driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"))).click();
	for (int i = 0; i <50; i++) {
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"))).sendKeys(Keys.BACK_SPACE);	
	}
	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("CCS_Currency_Search"),testData.get("Block_card_Reason"),false);
	
	String xpath ="//ion-label[contains(text(),'"+testData.get("Block_card_Reason")+"')]";
	   us.clickOnElement(driver, xpath, false);
	//us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DCD_CardBlockReason_Option"),false);
}

@Given("User_626 Click on the toggle button re issue card in block card Screen")
public void user_626_click_on_the_toggle_button_re_issue_card_in_block_card_screen() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ToggleButton_clickJS"),true);
}
@Given("User_626 Validate the terms and conditions page")
public void User_626_Validate_the_terms_and_conditions_page() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("TermsConditionPage_DCD"));
}
@Given("User_626 validate the I Agree Terms and condition in Block Card Screen")
public void User_626_validate_the_I_Agree_Terms_and_condition_in_Block_Card_Screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("IagreeConditions"));
}
@Given("User_626 verify the screen2 into screen1 by clicking previous in block card screen")
public void user_626_verify_the_screen2_into_screen1_by_clicking_previous_in_block_card_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Card_Information_DCD"));
}
@Given("User_626 Validate the Card block reason in Block Card screen3")
public void user_626_validate_the_card_block_reason_in_block_card_screen3() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_CardBlockReason"));
	}
@Given("User_626 Validate the Re issue Card in Block Card screen3")
public void user_626_validate_the_re_issue_card_in_block_card_screen3() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_ReissueCard_S3"));
}

@Given("User_626 Validate the I agree terms in Block Card screen3")
public void user_626_validate_the_i_agree_terms_in_block_card_screen3() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("DCD_IAGree_S3"));
}
@Given("User_626 Click on the Prepaid Card Request below the card details")
public void User_626_Click_on_the_Prepaid_Card_Request_below_the_card_details() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DCD_PrepaidCardRequest"),false);
}
@Given("User_626 Verify the Reference Card is showing in Prepaid Card Request Screen")
public void user_626_verify_the_reference_card_is_showing_in_prepaid_card_request_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ClickReferenceCard_Dropdown"));
}

@Given("User_626 Click on the reference card drop down in Prepaid Card Request Screen")
public void user_626_click_on_the_reference_card_drop_down_in_prepaid_card_request_screen() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("ClickReferenceCard_Dropdown"),false);
}

@Given("User_626 Select reference card in Prepaid Card Request Screen")
public void user_626_select_reference_card_in_prepaid_card_request_screen() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_PCR"),false);
}
@Given("User_626 Click the Back Arrow button in the 1st Screen of prepaid card request")
public void User_626_Click_the_Cancel_button_in_the_1st_Screen_of_prepaid_card_request() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_PCR"));
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("PCR_1StScreen_Backbutton"),false);
}
@Given("User_626 Verify the progress screen was closed in prepaid card request")
public void  User_626_Verify_the_progress_screen_was_closed_in_prepaid_card_request() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ClickReferenceCard_Dropdown"));
}

@Given("User_626 Verify the Cancel button in draft Saving ScreenWO index")
public void user_626_verify_the_cancel_button_in_draft_saving_screenWO_index() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Draft_ForWO_Cancel"));
}
@Given("User_626 Verify the value missing for user does not allow to navigate screen")
public void User_626_Verify_the_value_missing_for_user_does_not_allow_to_navigate_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ValueMissing_forValidation"));
}
@And("User_626 loads the test datasetup for the test case id AT_PCR_006")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_PCR_006() {
	executionTestData = DataReader.executionTestData.get("AT_PCR_006");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_PCR_007")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_PCR_007() {
	executionTestData = DataReader.executionTestData.get("AT_PCR_006");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_PCR_008")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_PCR_008() {
	executionTestData = DataReader.executionTestData.get("AT_PCR_008");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_PCR_009")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_PCR_009() {
	executionTestData = DataReader.executionTestData.get("AT_PCR_009");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_DCD_053")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_053() {
	executionTestData = DataReader.executionTestData.get("AT_DCD_053");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_DCD_054")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_054() {
	executionTestData = DataReader.executionTestData.get("AT_DCD_054");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_DCD_058")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_058() {
	executionTestData = DataReader.executionTestData.get("AT_DCD_058");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@And("User_626 loads the test datasetup for the test case id AT_DCD_060")
public void User_626_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_060() {
	executionTestData = DataReader.executionTestData.get("AT_DCD_060");
	System.out.println(executionTestData);
	testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}
@Given("User_626 Select reference card in Prepaid Card Request Screen for retailUser")
public void user_626_select_reference_card_in_prepaid_card_request_screen_for_retailUser() {
	us.doubleClickOnElement(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_PCR_Retail"),false);
//	for (int i = 0; i <30; i++) {
//        try {
//        	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("SelectCard_PCR_Retail"),false);
//                   break;
//              } catch (Exception e) {
//            if (i==30) {
//                Assert.fail(e.getMessage());
//            }
//        }
//    }
}	
@Given("User_626 Verify the reference Card in the summary Screen")
public void user_626_verify_the_reference_card_in_the_summary_screen() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("PCR_Screen3_ReferenceCard"));
   
}
@Given("User_626 Click on the submit in 3st Screen of prepaid card request")
public void User_626_Click_on_the_submit_in_3st_Screen_of_prepaid_card_request() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("DraftSubmit_debitDetails"),false);
}
@Given("User_626 Verify the Currency Name is showing in Debit Card Segment of Retail User")
public void user_626_verify_the_currency_name_is_showing_in_debit_card_segmentof_Retail_User() {
	// us.waitHelper(driver,DataReader.locatorsMap.get("Cards").get("CurrencyName_DebitCardDetails"));
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Oguiya_CurrencyName"));
}
@Given("User_626 Verify the Card Holder Name is showing in Debit Card Segment of Retail User")
public void user_626_verify_the_card_holder_name_is_showing_in_debit_card_segmentof_Retail_User() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CardHolderName_DebitDetails_retail"));
}
@Given("User_626 Verify the Status of the Card is showing in Debit Card Segment of Retail User")
public void user_626_verify_the_status_of_the_card_is_showing_in_debit_card_segmentof_Retail_User() {
	// String xpath= "//ion-label[contains(text(),+'
	// testData.get("FromAccount1")+"'))]/ancestor::mat-card-header//mat-card-subtitle//ion-label[contains(text(),'Active')]";
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("StatusOfCard_retail"));
}
@Given("User_626 Verify the Edit Icon is showing in Debit Card Segment of Retail User")
public void user_626_verify_the_edit_icon_is_showing_in_debit_card_segment_of_Retail_User() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("EditIcon_debitDetails_Retail"));
}
@Given("User_626 Click on the edit button in Debit card details of Retail User")
public void user_626_click_on_the_edit_button_in_debit_card_detailsof_Retail_User() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("EditIconClick_DebitDetails_Retail"), false);
}
@Given("User_626 Verify the Card change name button is visible of Retail User")
public void user_626_verify_the_card_change_name_button_is_visible_of_Retail_User() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ChangeCardNameVisible_DCD_RT"));
}
@Given("User_626 Click on the Show More button below the card details of Retail User")
public void user_626_click_on_the_show_more_button_below_the_card_details_of_Retail_User() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Click_Show_More_retail"), false);
}
@Given("User_626 Verify the Expiry Date is showing in Debit Card Segment of Retail User")
public void user_626_verify_the_expiry_date_is_showing_in_debit_card_segmentof_Retail_User() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("ExpiryDate_retail"));
}
@Given("User_626 Verify the Applicant Address is showing in Debit Card Segment of Retail User")
public void user_626_verify_the_applicant_address_is_showing_in_debit_card_segmentof_Retail_User() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Address_Retail"));
}
@Given("User_626 Verify the Screen2 back into Screen1 in retail Limit Update")
public void User_626_Verify_the_Screen2_back_into_Screen1_in_retail_Limit_Update() {
	us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("POS_Currency_DebitDetails"));
	}
@Given("User_626 Verify the Screen3 back into Screen2 in retail Limit Update")
public void User_626_Verify_the_Screen3_back_into_Screen2_in_retail_Limit_Update() {
	try {
		us.clickOnElementNoWait(driver,
				DataReader.locatorsMap.get("OmniScreen_Login").get("IAgreeTnC_ScheduledTransfer"), 30, false);
		
	} catch (Exception e) {

	}
	}





}
