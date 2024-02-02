package stepdefinitions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import dataProvider.DataReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class Transfers {
	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);	
	String executionTestData;
	HashMap<String, String> testData;
	Actions action;
	
	@Given("User_626 enters the CorporateUser in the login page for omni_web_portal for Scheduled Transfers")
	public void user_626enters_the_CorporateUser_in_the_login_page_for_omni_web_portal_for_Scheduled_Transfers() {
		// us.enterDataAndTab(driver,
		// DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);
		
	}

	@Given("User_626 enters the CorporatePass in the login page for omni_web_portal for Scheduled Transfers")
	public void user_626enters_the_CorporatePass_in_the_login_page_for_omni_web_portal_for_Scheduled_Transfers() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}
	
	@And("User_626 loads the test datasetup for the test case id AT_ST_001")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_ST_001() {
		executionTestData = DataReader.executionTestData.get("AT_ST_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@And("User_626 loads the test datasetup for the test case id AT_ST_002")
	public void User_626loads_the_test_datasetup_for_the_test_case_id_AT_ST_002() {
		executionTestData = DataReader.executionTestData.get("AT_ST_001");
		System.out.println(executionTestData);
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}
	@Given("User_626 Click on the Payments for transfer in home Screen of corporate portal")
	public void user_click_on_the_payments_for_transfer_in_home_screen_of_corporate_portal() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PayMentsForScheduledOwnAccTransfer"), false);
	}

	@Given("User_626 Validate the Scheduled own account transfer Below the Payments")
	public void user_validate_the_scheduled_own_account_transfer_below_the_payments() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("OwnAccountTransfer_ScheduledTransfers_Transfers_AMANA"));
		
	}

	@Given("User_626 Validate the Scheduled Own Bank Transfer Below the Payments")
	public void user_validate_the_scheduled_scheduled_own_bank_transfer_below_the_payments() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOwnBankTransfer_ScheduledTransfer"));
	}

	@Given("User_626 Validate the Scheduled Other Bank Transfer Below the Payments")
	public void user_validate_the_scheduled_other_bank_transfer_below_the_payments() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ScheduledOtherBankTransfer"));
	}

	@Given("User_626 Validate the Scheduled International Transfer Below the Payments")
	public void user_validate_the_scheduled_international_transfer_below_the_payments() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Scheduledinternationaltransfer"));
	}

	@Given("User_626 Click on the Scheduled own account transfer Below the Payments")
	public void user_click_on_the_scheduled_own_account_transfer_below_the_payments() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("OwnAccountTransfer_ScheduledTransfers_Transfers_AMANA"), false);
	}

	@Given("User_626 Validate the From Account field is Available in Scheduled own account transfer")
	public void user_validate_the_from_account_field_is_available_in_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAccForScheduledOwnAccTransfer"));
	}

	@Given("User_626 Validate the To Account field is Available in Scheduled own account transfer")
	public void user_validate_the_to_account_field_is_available_in_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToAccForScheduledOwnAccTransfer"));
	}

	@Given("User_626 Validate the Currency field is Available in Scheduled own account transfer")
	public void user_validate_the_currency_field_is_available_in_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Currency"));
	}

	@Given("User_626 Validate the Amount field is Available in Scheduled own account transfer")
	public void user_validate_the_amount_field_is_available_in_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"));
	}

	@Given("User_626 Validate the Purpose field is Available in Scheduled own account transfer")
	public void user_validate_the_purpose_field_is_available_in_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"));
	}
	@Given("User_626 Click on the from account field for select from account for transfer")
	public void user_click_on_the_from_account_field_for_select_from_account_for_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAccForScheduledOwnAccTransfer"), false);
	}

	@Given("User_626 select the from account for Scheduled own Account Transfer")
	public void user_select_the_from_account_for_scheduled_own_account_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FromAccSelectForScheduledOwnAccTransfer"), false); 
	}

	@Given("User_626 Click on the to account field for select from account for transfer")
	public void user_click_on_the_to_account_field_for_select_from_account_for_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToAccForScheduledOwnAccTransfer"), false);
	}

	@Given("User_626 select the to account for Scheduled own Account Transfer")
	public void user_select_the_to_account_for_scheduled_own_account_transfer() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToAccSelectForScheduledOwnAccTransfer"), false);
	}

	@Given("User_626 Enter Amount for Scheduled own Account Transfer")
	public void user_enter_amount_for_scheduled_own_account_transfer() {
		 us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("EnterAmountInOwnAccountTransfer"),testData.get("TransferAmount"), false);
	}

	@Given("User_626 Enter Purpose for Scheduled own Account Transfer")
	public void user_enter_purpose_for_scheduled_own_account_transfer() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"),

				testData.get("PurposeOfTrnx"),false);
		for (int i = 0; i <50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"))).sendKeys(Keys.BACK_SPACE);	
		}
		
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("EnterPurposeInOwnAccountTransfer"),

				testData.get("PurposeOfTrnx"),false);
	}

	@Given("User_626 Click on the periodicity for verify the dropdown Values")
	public void user_click_on_the_periodicity_for_verify_the_dropdown_values()   {
		us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("PeriodicityClick"), false);
		
	}

	@Given("User_626 Verify Recurring Daily Value is avaiable below the periodicity dropdown")
	public void user_verify_recurring_daily_value_is_avaiable_below_the_periodicity_dropdown() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Recurringdaily"));
	}

	@Given("User_626 Verify Recurring Yearly Value is avaiable below the periodicity dropdown")
	public void user_verify_recurring_yearly_value_is_avaiable_below_the_periodicity_dropdown() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("RecurrringYearly"));
	}

	@Given("User_626 Verify Single Future Date Value is avaiable below the periodicity dropdown")
	public void user_verify_single_future_date_value_is_avaiable_below_the_periodicity_dropdown() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SinglefutureDate"));
	}

	@Given("User_626 Verify Recurring weekly Value is avaiable below the periodicity dropdown")
	public void user_verify_recurring_weekly_value_is_avaiable_below_the_periodicity_dropdown() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Recurringweekly"));
	}

	@Given("User_626 Verify Recurring Monthly Value is avaiable below the periodicity dropdown")
	public void user_verify_recurring_monthly_value_is_avaiable_below_the_periodicity_dropdown() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("RecurringMonthly"));
	}

	@Given("User_626 Select the periodicity as Recurring Daily in the dropdown")
	public void user_select_the_periodicity_as_recurring_daily_in_the_dropdown() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Cards").get("PeriodicitySearch"),testData.get("SelectPeriodicity"),false);
		driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("PeriodicitySearch"))).click();
		for (int i = 0; i <50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Cards").get("PeriodicitySearch"))).sendKeys(Keys.BACK_SPACE);	
		}
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Cards").get("PeriodicitySearch"),testData.get("SelectPeriodicity"),false);
		String xpath ="//ion-label[contains(text(),'"+testData.get("SelectPeriodicity")+"')]";
		   us.clickOnElement(driver, xpath, false);
	}

	@Given("User_626 Verify the Value is missing when fields are not filed")
	public void user_verify_the_value_is_missing_when_fields_are_not_filed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("User_626 Verify the From Account field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_from_account_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Summaryfromacc"));
	}

	@Given("User_626 Verify the To Account field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_to_account_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Summarytoacc"));
	}

	@Given("User_626 Verify the Amount field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_amount_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryAmount"));
	}
	@Given("User_626 Verify the ExchangedAmount field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_ExchangedAmount_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryExchangedAmount"));
	}
	@Given("User_626 Verify the ExchangedRate field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_ExchangedRate_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryExchangedRate"));
	}

	@Given("User_626 Verify the Purpose field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_purpose_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryPurpose"));
	}

	@Given("User_626 Verify the I Agree On Term field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_i_agree_on_term_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryIagree"));
	}

	@Given("User_626 Verify the Periodicity field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_periodicity_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryPeriodicity"));
	}

	@Given("User_626 Verify the No of Payments field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_no_of_payments_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryNOofPayments"));
	}

	@Given("User_626 Verify the Start Date field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_start_date_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryStart"));
	}

	@Given("User_626 Verify the End Date field is avaiable in summary of Scheduled own account transfer")
	public void user_verify_the_end_date_field_is_avaiable_in_summary_of_scheduled_own_account_transfer() {
		us.elementIsVisible(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("SummaryEnd"));
	}
	
	
	
	
	
	
	
	
	
	

}
