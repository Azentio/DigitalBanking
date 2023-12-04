package stepdefinitions;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import dataProvider.DataReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class DebitCardRequest {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);	
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
	//At_DCD_007
	@And("User_626 loads the test datasetup for the test case id AT_DCD_007")
	public void User_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_007() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_007");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 Click on the Limit Update For Field Verification")
	public void user_click_on_the_limit_update_for_field_verification() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("LimitVisi_DebitDetails"), false);
	}

	@Given("User_626 Verify the CurrencyPOS field Available or Not in POS Limit Update")
	public void user_verify_the_currency_pos_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("POS_Currency_DebitDetails"));
	}

	@Given("User_626 Check the Currencypos Field is in read only Mode Below POS Limit Update")
	public void user_check_the_currencypos_field_is_in_read_only_mode_below_pos_limit_update() {
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
	public void user_verify_the_current_pos_limit_field_available_or_not_in_pos_limit_update() {
	 us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("Current_pos_limit_DebitDetails"));
	}

	@Given("User_626 Check the Current POS Limit Field is in read only Mode POS Limit Update")
	public void user_check_the_current_pos_limit_field_is_in_read_only_mode_pos_limit_update() {
	
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
	public void user_verify_the_periodicity_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("POS_Periodicity"));
	}

	@Given("User_626 Check the Periodicity Field is in read only Mode POS Limit Update")
	public void user_check_the_periodicity_field_is_in_read_only_mode_pos_limit_update() {
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
	public void user_verify_the_utilized_currency_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedCurrency_DebitDetails"));
	}

	@Given("User_626 Check the Utilized Currency Field is in read only Mode POS Limit Update")
	public void user_check_the_utilized_currency_field_is_in_read_only_mode_pos_limit_update() {
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
	public void user_verify_the_utilized_pos_limit_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedPOSLIMIT_debitdetails"));
	}

	@Given("User_626 Check the Utilized POS Limit Field is in read only Mode POS Limit Update")
	public void user_check_the_utilized_pos_limit_field_is_in_read_only_mode_pos_limit_update() {
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
	public void user_verify_the_remaining_currency_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RemainingCurrency_DebitDetails"));
	}

	@Given("User_626 Check the Remaining Currency Field is in read only Mode POS Limit Update")
	public void user_check_the_remaining_currency_field_is_in_read_only_mode_pos_limit_update() {
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
	public void user_verify_the_requested_pos_limit_field_available_or_not_in_pos_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RequestPOSLimit_DebitDetails"));
	}

	@Given("User_626 Check the Requested POS Limit Field is in Editable POS Limit Update")
	public void user_check_the_requested_pos_limit_field_is_in_editable_pos_limit_update() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("RequestPOSLimit_DebitDetails"),
				testData.get("RequestPOS"), false);
	}
	//AT_DCD_008
	@And("User_626 loads the test datasetup for the test case id AT_DCD_008")
	public void User_loads_the_test_datasetup_for_the_test_case_id_AT_DCD_008() {
		executionTestData = DataReader.executionTestData.get("AT_DCD_008");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 Verify the Currency field Available or Not in Withdrawal Limit Update")
	public void user_verify_the_currency_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CurrencywdCode_DebitDetails"));
	}

	@Given("User_626 Check the  Currency field is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_currency_field_is_in_read_only_withdrawal_limit_update() {
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
	public void user_verify_the_current_withdrawal_limit_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("CurrencyWDLimit_DebitDetails"));
	}

	@Given("User_626 Check the  Current Withdrawal Limit is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_current_withdrawal_limit_is_in_read_only_withdrawal_limit_update() {
		boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("CurrencyWDLimit_DebitDetailsreadonly")).isEnabled();
		Assert.assertFalse(enabled);

	}

	@Given("User_626 Verify the Periodicity Wd field Available or Not in Withdrawal Limit Update")
	public void user_verify_the_periodicity_wd_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("WdPeriodicity_DebitDetails"));
	}

	@Given("User_626 Check the  Periodicity Wd field is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_periodicity_wd_field_is_in_read_only_withdrawal_limit_update() {
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
	public void user_verify_the_utilized_currency_wd_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyWD_DebitDetails"));
	}

	@Given("User_626 Check the  Utilized Currency WD field is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_utilized_currency_wd_field_is_in_read_only_withdrawal_limit_update() {
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
	public void user_verify_the_utilized_withdrawal_limit_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyLimit_DebitDetails"));
	}

	@Given("User_626 Check the  Utilized Withdrawal Limit field is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_utilized_withdrawal_limit_field_is_in_read_only_withdrawal_limit_update() {
		boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("UtilizedCurrencyLimit_DebitDetailsReadOnly")).isEnabled();
	Assert.assertFalse(enabled);
	}

	@Given("User_626 Verify the Remaining Currency WD field Available or Not in Withdrawal Limit Update")
	public void user_verify_the_remaining_currency_wd_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RemainingCurrencyWd_DebitDetails"));
	}

	@Given("User_626 Check the  Remaining Currency WD field is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_remaining_currency_wd_field_is_in_read_only_withdrawal_limit_update() {
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
	public void user_verify_the_remaining_withdrawal_limit_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RemainingWdLimit_DebitDetails"));
	}

	@Given("User_626 Check the  Remaining Withdrawal Limit field is in ReadOnly Withdrawal Limit Update")
	public void user_check_the_remaining_withdrawal_limit_field_is_in_read_only_withdrawal_limit_update() {
		boolean enabled = JavascriptHelper.executeScriptWithWebElement(DataReader.locatorsMap.get("Cards").get("RemainingWdLimit_DebitDetailsReadOnly")).isEnabled();
	Assert.assertFalse(enabled);
	}

	@Given("User_626 Verify the Requested Withdrawal field Available or Not in Withdrawal Limit Update")
	public void user_verify_the_requested_withdrawal_field_available_or_not_in_withdrawal_limit_update() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("Cards").get("RequestedWDLimitDebitDetails"));
	}

	@Given("User_626 Check the  Requested  Withdrawal field is in Editable Withdrawal Limit Update")
	public void user_check_the_requested_withdrawal_field_is_in_editable_withdrawal_limit_update() {
		us.enterData(driver, DataReader.locatorsMap.get("Cards").get("RequestedWDLimitDebitDetails"),
				testData.get("RequestWithdrwal"),false);
	}
//AT_DCD_009
	
	
	
	
}
