package stepdefinitions;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataprovider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class Beneficarymanagement_Steps {

	WebDriver driver = BaseClass.driver;
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;

	@And("User_612 loads the test datasetup for the test case id AT_BM_044")
	public void User_612_loads_the_test_datasetup_for_the_test_case_id_AT_BM_044() {
		executionTestData = DataReader.executionTestData.get("AT_BM_044");
		testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
	}

	@And("^user_612 enters the corpuser in the login page for omni_corporate_web_portal$")
	public void user_612EntersTheCorpuserInTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterData(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
				testData.get("UserName1"), false);

	}

	@And("^user_612 enters the corppassword in the login page for omni_corporate_web_portal$")
	public void user_612EntersThecorppasswordInTheLoginPageForOmni_Corporate_Web_Portal() {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
				testData.get("Password1"), false);
	}

	@Given("user_612 Click on the Beneficiary Management in the Home screen Retail User")
	public void user_612_click_on_the_beneficiary_management_in_the_home_screen_retail_user() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Beneficiay_Management"), false);
	}

	@Given("user_612 Click Add ineternal Beneficiary Below the Beneficiary Management Bank Screen")
	public void user_612_click_add_ineternal_beneficiary_below_the_beneficiary_management_bank_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddInternalBeneficiary"), false);
	}

	@Given("user_612 Enter the Valid Account number below the Add ineternal Beneficiary")
	public void user_612_enter_the_valid_account_number_below_the_add_ineternal_beneficiary() throws Exception {
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("AccNumber"),
				testData.get("AccountNumber"), false);
//		us.elementIsVisible(driver, DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process"));
//		Thread.sleep(30000);
		System.out.println(DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process"));
		for (int i = 0; i <= 3000; i++) {
			try {
				driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("Validation_in_process")));
			} catch (NoSuchElementException e) {
				if (i > 400) {
					break;
				}

			}

		}
		Thread.sleep(6000);
	}

	@Given("user_612 Enter the Valid Name of Beneficiary below the Add ineternal Beneficiary")
	public void user_612_enter_the_valid_name_of_beneficiary_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"),
				testData.get("NameOfBeneficiary"), false);
	}

	@Given("user_612 click on the country for selecting below the Add ineternal Beneficiary")
	public void user_612_click_on_the_country_for_selecting_below_the_add_ineternal_beneficiary()
			throws InterruptedException {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Country"), false);
		Thread.sleep(500000);
	}

	@Given("user_612 Enter the Country Code for mobile number below the Add ineternal Beneficiary Dropdown")
	public void user_612_enter_the_country_code_for_mobile_number_below_the_add_ineternal_beneficiary_dropdown() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),
				testData.get("Mobilecode"), false);
	}

	@Given("user_612 Select the Mobile Number code for enter the Mobile No below the Add ineternal Beneficiary")
	public void user_612_select_the_mobile_number_code_for_enter_the_mobile_no_below_the_add_ineternal_beneficiary() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"), false);

	}

	@Given("user_612 Click on the local bank transfer in beneficiary management")
	public void user_612_Click_on_the_local_bank_transfer_in_beneficiary_management() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Local_Transfer_beneficiary"), true);
	}

	@Given("user_612 Click on the Bank dropdown below the local beneficiary")
	public void user_612_click_on_the_bank_dropdown_below_the_local_beneficiary() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				if (DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown") != null)
					us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
	}

	@Given("user_612 Search bank name and select the bank in the dropdown")
	public void user_612_search_bank_name_and_select_the_bank_in_the_dropdown() throws Throwable {
		
		String xpath = "//ion-label[text()=' " + testData.get("BankName") + " ']";
		Thread.sleep(10000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
		//Thread.sleep(10000);
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),
				testData.get("BankName"), false);
		//Thread.sleep(10000);
		WebElement Bank = driver.findElement(By.xpath(xpath));
		
		try {
			if (Bank.isDisplayed()) {
				System.out.println("if runs");
				us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"), false);
			} else {
				System.out.println("else runs");
				us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Given("user_612 Click on the currency dropdown for select Currency")
	public void user_612_click_on_the_currency_dropdown_for_select_currency() throws Throwable {
		Thread.sleep(10000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
	}

	@Given("user_612 Search Currency and select the Currency in the dropdown")
	public void user_612_search_currency_and_select_the_currency_in_the_dropdown() throws Throwable {		
		
		String xpath = "//ion-label[text()=' " + testData.get("Currency") + " ']";
		Thread.sleep(10000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),
				testData.get("Currency"), false);
		WebElement Currency = driver.findElement(By.xpath(xpath));
		
		try {
			if (Currency.isDisplayed()) {
				System.out.println("if runs");
				us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"), false);
			} else {
				System.out.println("else runs");
				us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"), false);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
	
//		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Currency"),false);
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
		
		
//		// us.clickOnElement(driver,
//		// DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"),false);
//		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),
//				testData.get("Currency"), false);
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"), false);
//
//		for (int i = 0; i < 100; i++) {
//			try {
//				if (driver.getPageSource().contains(" No Data Found ")) {
//					us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"), false);
//				}
////				else if (driver.getPageSource().contains(" No Data Found ")) {
////					break;
////				}
//			} catch (Exception e) {
//				if (i == 99) {
//					Assert.fail(e.getMessage());
//			}}}
//		
//
//		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),
//				testData.get("Currency"), false);
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"), false);
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("Bank_Dropdown"),false);
//		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("SearchCountry"),testData.get("Currency"),false);
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SelectCountry"),false);
	}

	@Given("user_612 Click on the Add local beneficiary in beneficiary management")
	public void user_612_click_on_the_add_local_beneficiary_in_beneficiary_management() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("AddLocalBene"), false);
	}

	@Given("user_612 Enter the BVN Number below the Add Local Beneficiary")
	public void User_612_Enter_the_BVN_Number_below_the_Add_Local_Beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("BeneName"), testData.get("BVN"),
				false);
	}

	@Given("user_612 Enter the Mobile number below the Add ineternal Beneficiary")
	public void user_612_enter_the_mobile_number_below_the_add_ineternal_beneficiary() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),
				testData.get("MobileNumber"), false);
		for (int i = 0; i < 50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("MobileNum")))
					.sendKeys(Keys.BACK_SPACE);
		}
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("MobileNum"),
				testData.get("MobileNumber"), false);

	}

	@Given("user_612 Enter the Purpose of the Add Internal Beneficiary Bank")
	public void user_612_enter_the_purpose_of_the_add_internal_beneficiary_bank() {
		us.enterDataAndTab(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),
				testData.get("Purpose"), false);
		for (int i = 0; i < 50; i++) {
			driver.findElement(By.xpath(DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene")))
					.sendKeys(Keys.BACK_SPACE);
		}
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Beneficiary").get("Purpose_Bene"),
				testData.get("Purpose"), false);
	}

	@Given("user_612 Click on the Next button in limit Update Screen")
	public void user_612_click_on_the_next_button_in_limit_update_screen() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"), false);
	}

	@Given("user_612 Click on the Next button in limit Update Screen with Wait")
	public void user_612_click_on_the_next_button_in_limit_update_screen_with_Wait() throws InterruptedException {
		Thread.sleep(20000);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Cards").get("Next_DebitDetails"), false);
	}

	@Given("user_612 Click on the Submit button in Beneficiary")
	public void user_612click_on_the_submit_button_in_Beneficiary() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Beneficiary").get("SubmitForBeneficiary"), false);
//		for (int i = 0; i <= 500; i++) {
//			try {
//				WebElement submitButton = us.executeJavaScriptReturnWebElement(DataReader.locatorsMap.get("Beneficiary").get("SubmitForBeneficiary"));
//				submitButton.click();
//				break;
//			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
	}

	@Given("user_612 Verify the saved Local Transfer Beneficiary data")
	public void user_612_verify_the_saved_local_transfer_beneficiary_data() {
		String xpath = "//ion-label[contains(text(),'" + testData.get("AccountNumber") + "')]";
		us.elementIsVisible(driver, xpath);
	}

	@Given("user_612 Click on the saved data showmore button")
	public void user_612_click_on_the_saved_data_showmore_button() {
		String xpath = "//ion-label[contains(text(),'" + testData.get("AccountNumber")
				+ "')]//ancestor::mat-card-content//ion-label[text()=' show more ']";
		us.clickOnElement(driver, xpath, false);
	}

//	@Given("^user_612 navigates to the OmniScreen Admin Url and login with the valid credentials$")
//	public void user_612_NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials() {
//		driver.get(DataReader.configFileMap.get("omni_adminScreen"));
//
//		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("userNameField_LogginScreen"),
//				DataReader.userCredentialsMap.get("RaziaAdmin").get("userName"), false);
//
//		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("passwordField_LogginScreen"),
//				DataReader.userCredentialsMap.get("RaziaAdmin").get("Password"), false);
//
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("logginBtn_LogginScreen"), false);
//
//		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("companyCode_AdminLoggin"),
//				DataReader.userCredentialsMap.get("RaziaAdmin").get("CompanyCode"), false);
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnCompanyCode_AdminLoggin"),
//				false);
//		try {
//			us.clickOnElementNoWait(driver,
//					DataReader.locatorsMap.get("Omni_Admin").get("yesBtnForceLogout_AdminLoggin"), 5, false);
//		} catch (Exception e) {
//		}
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnLastLoggin_AdminLoggin"),
//				false);
//	}
}
