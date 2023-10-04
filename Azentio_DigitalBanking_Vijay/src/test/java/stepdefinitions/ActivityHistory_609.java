package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class ActivityHistory_609 {
	int randomNumber;
	String Cif = null;
	String BusinessProfile_Code, SubProfile_Code, Customer_Code;
	WebDriver driver = BaseClass.driver;
	Actions act = new Actions(driver);
	UserUtility_614 us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;
	Random random = new Random();

	@Given("^User_609 navigates to the OmniScreen Admin Url and login with the valid credentials$")
	public void User_609_NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials() {
		driver.get(DataReader.configFileMap.get("omni_adminScreen"));

		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("userNameField_LogginScreen"),
				DataReader.userCredentialsMap.get("VimalAdmin").get("userName"), false);

		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("passwordField_LogginScreen"),
				DataReader.userCredentialsMap.get("VimalAdmin").get("Password"), false);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("logginBtn_LogginScreen"), false);

		us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("companyCode_AdminLoggin"),
				DataReader.userCredentialsMap.get("VimalAdmin").get("CompanyCode"), false);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnCompanyCode_AdminLoggin"),
				false);
		try {
			us.clickOnElementNoWait(driver,
					DataReader.locatorsMap.get("Omni_Admin").get("yesBtnForceLogout_AdminLoggin"), 5, false);
		} catch (Exception e) {
		}
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("continueBtnLastLoggin_AdminLoggin"),
				false);
	}

	@And("User_609 loads the test datasetup for the test case id AH_001")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_001() {
		executionTestData = DataReader.executionTestData.get("AH_001");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("User_609 loads the test datasetup for the test case id AH_002")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_002() {
		executionTestData = DataReader.executionTestData.get("AH_002");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("User_609 loads the test datasetup for the test case id AH_003")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_003() {
		executionTestData = DataReader.executionTestData.get("AH_003");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("User_609 loads the test datasetup for the test case id AH_004")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_004() {
		executionTestData = DataReader.executionTestData.get("AH_004");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("User_609 loads the test datasetup for the test case id AH_005")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_005() {
		executionTestData = DataReader.executionTestData.get("AH_005");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("User_609 loads the test datasetup for the test case id AH_006")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_006() {
		executionTestData = DataReader.executionTestData.get("AH_006");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("User_609 loads the test datasetup for the test case id AH_007")
	public void User_609_loads_the_test_datasetup_for_the_test_case_id_AH_007() {
		executionTestData = DataReader.executionTestData.get("AH_007");
		testData = DataReader.testDataMap.get("ActivityHistoryOmni").get(executionTestData);
	}

	@And("^User_609 Click on the Parameters menu$")
	public void User_609_Click_on_the_Parameters_menu() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters"), true);
	}
//*************************************** Profile Management *******************************************//

	@And("^User_609 Click on the Profile Management submenu$")
	public void User_609_Click_on_the_Profile_Management_submenu() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement"), true);
	}

	@And("^User_609 Click on the Business Profile screen under Parameters$")
	public void User_609_Click_on_the_Business_Profile_screen_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile"), true);
		Thread.sleep(5000);
	}

	@And("^User_609 Enter the Profile Name in Business Profile under Parameters$")
	public void User_609_Enter_the_Profile_Name_in_Business_Profile_under_Parameters() {
		// Random random = new Random();
		randomNumber = random.nextInt(500 - 50) + 500;
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin")
						.get("Parameters_ProfileManagement_BusinessProfile_ProfileName"),
				testData.get("ProfileName") + String.valueOf(randomNumber), true);

	}

	@And("^User_609 Enter the Brief Description in Business Profile under Parameters$")
	public void User_609_Enter_the_Brief_Description_in_Business_Profile_under_Parameters() {
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin")
						.get("Parameters_ProfileManagement_BusinessProfile_BriefDescription"),
				testData.get("BriefDescription") + String.valueOf(randomNumber), true);
	}

	@And("^User_609 Select the Application in Business Profile under Parameters$")
	public void User_609_Select_the_Application_in_Business_Profile_under_Parameters() {
		Select Application = new Select(driver.findElement(By.xpath("//select[@id='applications_OADM10040']")));
		// Application.selectByVisibleText("Retail");
		Application.selectByVisibleText(testData.get("Application"));
	}

	@And("^User_609 Click on Root in Business Profile under Parameters$")
	public void User_609_Click_on_Root_in_Business_Profile_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Root"),
				false);
		Thread.sleep(2000);
	}

	@And("^User_609 Click on Retail in Business Profile under Parameters$")
	public void User_609_Click_on_Retail_in_Business_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Retail"),
				false);
	}

	@And("^User_609 Click on Corporate in Business Profile under Parameters$")
	public void User_609_Click_on_Corporate_in_Business_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Corporate"),
				false);
	}

	@And("^User_609 Click on Agency in Business Profile under Parameters$")
	public void User_609_Click_on_Agency_in_Business_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Agency"),
				false);
	}

	@And("^User_609 Check the Session Activity History is Displaying in Business Profile under Parameters$")
	public void User_609_Check_the_Session_Activity_History_is_Displaying_in_Business_Profile_under_Parameters()
			throws Throwable {
//		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
//				.get("Parameters_ProfileManagement_BusinessProfile_SessionActivityHistory"), false);
		WebElement SessionActivityHistory = driver.findElement(By.xpath(DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_ProfileManagement_BusinessProfile_SessionActivityHistory")));
		us.scrollDownTillElement(driver, SessionActivityHistory);
		Thread.sleep(2000);
		Assert.assertEquals(true, SessionActivityHistory.isDisplayed());
		System.out.println("Session Activity History is Displaying");
	}

	@And("^User_609 Enable the Session Activity History flag in Business Profile under Parameters$")
	public void User_609_Enable_the_Session_Activity_History_flag_in_Business_Profile_under_Parameters()
			throws Throwable {

		us.scrollDownTillElement(driver, driver.findElement(By.xpath(DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_ProfileManagement_BusinessProfile_SessionActivityHistory"))));
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_ProfileManagement_BusinessProfile_SessionActivityHistory"), false);
		Thread.sleep(2000);
	}

	@And("^User_609 Click the Save Button in Business Profile under Parameters$")
	public void User_609_Click_the_Save_Button_in_Business_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Save"),
				true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);

	}

	@And("^User_609 Click the Search Button in Business Profile under Parameters$")
	public void User_609_Click_the_Search_Button_in_Business_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Search"),
				true);
	}

	@And("^User_609 Enter the Business Profile input in Business Profile under Parameters$")
	public void User_609_Enter_the_Business_Profile_input_in_Business_Profile_under_Parameters() throws Throwable {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin")
						.get("Parameters_ProfileManagement_BusinessProfile_BusinessProfileInput"),
				testData.get("ProfileName") + String.valueOf(randomNumber), true);
		Thread.sleep(3000);
		// table[@id='businessProfilesListGridTbl_Id_OADM10040']//td[text()='RetailTest']
		String xpath = "//table[@id='businessProfilesListGridTbl_Id_OADM10040']//td[text()='"
				+ testData.get("ProfileName") + String.valueOf(randomNumber) + "']";

		us.doubleClickOnElement(driver, xpath, false);
		Thread.sleep(2000);
		WebElement CodeElement = driver.findElement(By.xpath("//input[@id='profileCode_OADM10040']"));
		BusinessProfile_Code = CodeElement.getAttribute("initialvalue");
		System.out.println("BusinessProfile_Code is : " + BusinessProfile_Code);
		Thread.sleep(2000);

	}

	@And("^User_609 Click the Approve Button in Business Profile under Parameters$")
	public void User_609_Click_the_Approve_Button_in_Business_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Approve"),
				true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
	}

	// ************************************* Sub Profile
	// ***************************************//

	@And("^User_609 Click on the Sub Profile screen under Parameters$")
	public void User_609_Click_on_the_Sub_Profile_screen_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_SubProfile"), true);
	}

	@And("^User_609 Enter the SubProfile Name in Sub Profile under Parameters$")
	public void User_609_Enter_the_SubProfile_Name_in_Sub_Profile_under_Parameters() {
//		//Random random = new Random();
//		randomNumber = random.nextInt(500 - 50) + 500;
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_SubProfile_SubProfileName"),
				testData.get("ProfileName") + "_SubProfile" + String.valueOf(randomNumber), true);

	}

	@And("^User_609 Enter the Brief Description in Sub Profile under Parameters$")
	public void User_609_Enter_the_Profile_Name_in_Sub_Profile_under_Parameters() throws Throwable {
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin")
						.get("Parameters_ProfileManagement_SubProfile_BriefDescription"),
				testData.get("ProfileName") + "_SubProfile" + String.valueOf(randomNumber), true);
		Thread.sleep(2000);

	}

	@And("^User_609 Select the Business Profile in Sub Profile under Parameters$")
	public void User_609_Select_the_Business_Profile_in_Sub_Profile_under_Parameters() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_ProfileManagement_SubProfile_BusinessProfileSearch"), true);
		us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_ProfileManagement_SubProfile_BusinessProfileCode"), BusinessProfile_Code, true);
		Thread.sleep(2000);
		// table[@id='gridtab_businessProfileCode_OADM10041']//td[text()='487']

		String xpath = "//table[@id='gridtab_businessProfileCode_OADM10041']//td[text()='" + BusinessProfile_Code
				+ "']";
		us.doubleClickOnElement(driver, xpath, false);
		Thread.sleep(1000);

	}

	@And("^User_609 Click the Save Button in Sub Profile under Parameters$")
	public void User_609_Click_the_Save_Button_in_Sub_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_SubProfile_SaveBtn"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);

	}

	@And("^User_609 Click the Search Button in Sub Profile under Parameters$")
	public void User_609_Click_the_Search_Button_in_Sub_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_SubProfile_SearchBtn"),
				true);
	}

	@And("^User_609 Enter the Sub Profile input in Sub Profile under Parameters$")
	public void User_609_Enter_the_Sub_Profile_input_in_Sub_Profile_under_Parameters() throws Throwable {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_SubProfile_SubProfileInput"),
				testData.get("ProfileName") + "_SubProfile" + String.valueOf(randomNumber), true);
		Thread.sleep(3000);

		// table[@id='subProfilesListGrid_Id_OADM10041']//td[text()='CorporateTest_SubProfile647']

		String xpath = "//table[@id='subProfilesListGrid_Id_OADM10041']//td[text()='" + testData.get("ProfileName")
				+ "_SubProfile" + String.valueOf(randomNumber) + "']";
		// act.doubleClick(driver.findElement(By.xpath(xpath)));
		us.doubleClickOnElement(driver, xpath, false);
		Thread.sleep(2000);
		WebElement CodeElement = driver.findElement(By.xpath("//input[@id='profileCode_OADM10041']"));
		SubProfile_Code = CodeElement.getAttribute("initialvalue");
		System.out.println("SubProfile_Code is : " + SubProfile_Code);

	}

	@And("^User_609 Click the Approve Button in Sub Profile under Parameters$")
	public void User_609_Click_the_Approve_Button_in_Sub_Profile_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_SubProfile_ApproveBtn"),
				true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
	}

	// ********************* User Management *********************************//
	@And("^User_609 Click on the User Management submenu$")
	public void User_609_Click_on_the_User_Management_submenu() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement"), true);
	}

	@And("^User_609 Click on the End User screen under Parameters$")
	public void User_609_Click_on_the_End_User_screen_under_Parameters() throws Throwable {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser"),
				true);
	}

	@And("^User_609 Click the Search Button in End User under Parameters$")
	public void User_609_Click_the_Search_Button_in_End_User_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_SearchBtn"), true);
		Thread.sleep(2000);
	}

	@And("^User_609 Select the Code in End User under Parameters$")
	public void User_609_Select_the_Code_in_End_User_under_Parameters() throws Throwable {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_Status"),
				testData.get("Suspend Status"), true);

		Thread.sleep(3000);
		// table[@id='omniUserListGridTbl_Id_OADM10071']//td[text()='Deactivated']
		String xpath = "//table[@id='omniUserListGridTbl_Id_OADM10071']//td[text()='" + testData.get("Suspend Status")
				+ "']";
		// act.doubleClick(driver.findElement(By.xpath(xpath)));
		us.doubleClickOnElement(driver, xpath, false);
	}

	@And("^User_609 Click the Reactivate Button in End User under Parameters$")
	public void User_609_Click_the_Reactivate_Button_in_End_User_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_ReactivateBtn"), true);
		Thread.sleep(2000);
	}

	@And("^User_609 Enter the Reactivate Reason in End User under Parameters$")
	public void User_609_Enter_the_Reactivate_Reason_in_End_User_under_Parameters() {
		us.enterData(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_ReactivateReason"),
				testData.get("Reactivate Reason"), false);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_Save"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
	}

	@And("^User_609 Select the Code in End User under Parameters for Approve$")
	public void User_609_Select_the_Code_in_End_User_under_Parameters_for_Approve() throws Throwable {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_Status"),
				testData.get("Reactivate Status"), true);

		Thread.sleep(3000);
		// table[@id='omniUserListGridTbl_Id_OADM10071']//td[text()='To be reactivated']
		String xpath = "//table[@id='omniUserListGridTbl_Id_OADM10071']//td[text()='"
				+ testData.get("Reactivate Status") + "']";
		// act.doubleClick(driver.findElement(By.xpath(xpath)));
		us.doubleClickOnElement(driver, xpath, false);
	}

	@And("^User_609 Click the Approve Button in End User under Parameters$")
	public void User_609_Click_the_Approve_Button_in_End_User_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_ApproveBtn"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
	}

	@And("^User_609 Select the Application in End User under Parameters$")
	public void User_609_Select_the_Application_in_End_User_under_Parameters() {
		Select Customer_Application = new Select(
				driver.findElement(By.xpath("//select[@id='applications_omniuser_OADM10071']")));
		// Application.selectByVisibleText("Retail");
		Customer_Application.selectByVisibleText(testData.get("Customer_Application"));
	}

	@And("^User_609 Select the Channels in End User under Parameters$")
	public void User_609_Select_the_Channels_in_End_User_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_Channels"), true);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_UserManagement_EndUser_Channels_InternetBanking"), true);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_UserManagement_EndUser_Channels_MobileBanking"), true);
	}

	@And("^User_609 Enter the Mobile Number in End User under Parameters$")
	public void User_609_Enter_the_Mobile_Number_in_End_User_under_Parameters() throws Throwable {
		int Mobile_Number = random.nextInt(1000) + 1254800;
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_MobileNumber"),
				String.valueOf(Mobile_Number), true);
		Thread.sleep(2000);

	}

	@And("^User_609 Select the Customer in End User under Parameters$")
	public void User_609_Select_the_Customer_in_End_User_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_CustomerSearch"), true);
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_Customer_Code"),
				Customer_Code, true);

		// table[@id='gridtab_customerCode_OADM10071']//td[text()='414']
		String xpath = "//table[@id='gridtab_customerCode_OADM10071']//td[text()='" + Customer_Code + "']";
		us.doubleClickOnElement(driver, xpath, false);

	}

	@And("^User_609 Enter the UserName in End User under Parameters$")
	public void User_609_Enter_the_UserName_in_End_User_under_Parameters() throws Throwable {
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_Username"),
				testData.get("ProfileName") + "User_" + String.valueOf(randomNumber), true);
		Thread.sleep(1000);

	}

	@And("^User_609 Select the SubProfile in End User under Parameters$")
	public void User_609_Select_the_SubProfile_in_End_User_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_SubProfileSearch"),
				true);
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_SubProfileCode"),
				SubProfile_Code, true);
		Thread.sleep(3000);

		// table[@id='gridtab_subProfileCode_OADM10071']//td[text()='500']

		String xpath = "//table[@id='gridtab_subProfileCode_OADM10071']//td[text()='" + SubProfile_Code + "']";
		us.doubleClickOnElement(driver, xpath, false);
		Thread.sleep(2000);
	}
	
	@And("^User_609 Click the Save Button in End User under Parameters$")
	public void User_609_Click_the_Save_Button_in_End_User_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_SaveBtn"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);

	}
	
	@And("^User_609 Enter the Cif input in End User under Parameters$")
	public void User_609_Enter_the_Cif_input_in_End_User_under_Parameters() throws Throwable {
		driver.findElement(By.xpath("//input[@id='omniUserListGridTbl_Id_OADM10071_gs_omniUserVO.CIF_NO']")).clear();
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_CifInput"), Cif,
				true);
		Thread.sleep(3000);

		// (//table[@id='omniUserListGridTbl_Id_OADM10071']//td[text()='2000310'])[1]
		String xpath = "(//table[@id='omniUserListGridTbl_Id_OADM10071']//td[text()='" + Cif + "'])[1]";
		us.doubleClickOnElement(driver, xpath, false);
		Thread.sleep(2000);
	}
	
	@And("^User_609 Click the Deliver Button in End User under Parameters$")
	public void User_609_Click_the_Deliver_Button_in_End_User_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_DeliverBtn"), true);
	}
	
	@And("^User_609 Select the Deliver Option in End User under Parameters$")
	public void User_609_Select_the_Deliver_Option_in_End_User_under_Parameters() throws Throwable {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_DeliverBtn_DeliveryOption"), true);
		Thread.sleep(1000);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_DeliverBtn_DeliveryOption_SMS"), true);
		Thread.sleep(1000);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_DeliverBtn_DeliveryOption_Send"), true);
		
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);

	}
	
	@And("^User_609 Click the Activate Button in End User under Parameters$")
	public void User_609_Click_the_Activate_Button_in_End_User_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_EndUser_ActivateBtn"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
	}

	// ** Customer **//

	@And("^User_609 Click on the Customer screen under Parameters$")
	public void User_609_Click_on_the_Customer_screen_under_Parameters() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer"),
				true);
	}

	@And("^User_609 Select the Application as Corporate in Customer under Parameters$")
	public void User_609_Select_the_Application_as_corporate_in_Customer_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_Application"), true);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_Corporate"), true);
	}

	@And("^User_609 Enter the Customer Name in Customer under Parameters$")
	public void User_609_Enter_the_Customer_Name_in_Customer_under_Parameters() throws Throwable {
		us.enterDataAndTab(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_CustomerName"),
				testData.get("ProfileName") + "Customer_" + String.valueOf(randomNumber), true);
		Thread.sleep(1000);
	}

	@And("^User_609 Select the Cif in Customer under Parameters$")
	public void User_609_Select_the_Cif_in_Customer_under_Parameters() throws Throwable {
		int Page = 200, j = 1;
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_CifSearch"), true);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_Cif"), true);
		for (int i = 1; i < 50; i++) {
			// System.out.println("value of i is :" + i);
			try {
				if (i % 6 > 0) {
					driver.findElement(By.xpath(
							"//*[@id=\"pagerid_cif_no_OADM10070_center\"]/table/tbody/tr/td[4]/table/tbody/tr/td[2]/input"))
							.clear();
					us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Omni_Admin")
							.get("Parameters_UserManagement_Customer_CifPageSelect"), String.valueOf(Page), true);
					Thread.sleep(1000);
					j += 1;
					us.doubleClickOnElement(driver, "//table[@id='gridtab_cif_no_OADM10070']/tbody/tr[" + j + "]/td[1]",
							false);
					Thread.sleep(1000);

					WebElement CifValidate = driver.findElement(By.xpath("//input[@id='cif_name_OADM10070']"));
					String x = null;
					for (int j2 = 0; j2 < 200; j2++) {
						x = CifValidate.getAttribute("prevvalue");
						if (!x.isBlank() || !x.isEmpty()) {
							WebElement CifFind = driver
									.findElement(By.xpath("//input[@id='lookuptxt_cif_no_OADM10070']"));
							Cif = CifFind.getAttribute("prevvalue");
							System.out.println("Cif Name is : " + Cif);
							System.out.println("Cif Name is : " + x);
							break;
						}
					}

//					String Cif=null;
//					for (int j3 = 0; j3 <200; j3++) {
//						Cif = CifFind.getAttribute("prevvalue");
//						 if (!Cif.isBlank()||!Cif.isEmpty()) {
//							 System.out.println("Cif Name is : "+Cif);
//							 break;		
//						}
//					}
//					if (!(x.isBlank())) {
//						break;
//					}
//					else {
					if ((boolean) driver.findElement(By.xpath("//input[@id='_popup_path_sol_ok']")).isDisplayed()) {
						us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
						us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
								.get("Parameters_UserManagement_Customer_CifSearch"), true);
						us.clickOnElement(driver,
								DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_Cif"),
								true);
					}
				}

//				}
				else if (i % 6 == 0) {
					Page += 1;
					j = 1;
					j += 1;
					driver.findElement(By.xpath(
							"//*[@id=\"pagerid_cif_no_OADM10070_center\"]/table/tbody/tr/td[4]/table/tbody/tr/td[2]/input"))
							.clear();
					us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Omni_Admin")
							.get("Parameters_UserManagement_Customer_CifPageSelect"), String.valueOf(Page), true);
					Thread.sleep(1000);
//					us.clickOnElement(driver,
//							DataReader.locatorsMap.get("Omni_Admin").get("Parameters_UserManagement_Customer_CifNext"),
//							true);
					us.doubleClickOnElement(driver, "//table[@id='gridtab_cif_no_OADM10070']/tbody/tr[" + j + "]/td[1]",
							false);
					Thread.sleep(1000);

					WebElement CifValidate = driver.findElement(By.xpath("//input[@id='cif_name_OADM10070']"));
					String x = null;
					for (int j2 = 0; j2 < 200; j2++) {
						x = CifValidate.getAttribute("prevvalue");
						if (!x.isBlank() || !x.isEmpty()) {
							WebElement CifFind = driver
									.findElement(By.xpath("//input[@id='lookuptxt_cif_no_OADM10070']"));
							Cif = CifFind.getAttribute("prevvalue");
							System.out.println("Cif No. is : " + Cif);
							System.out.println("Cif Name is : " + x);
							break;
						}
					}
				}
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Business Profile in Customer under Parameters$")
	public void User_609_Select_the_BusinessProfile_in_Customer_under_Parameters() {
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin")
				.get("Parameters_ProfileManagement_Customer_BusinessProfileSearch"), true);

		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_Customer_BusinessProfile"),
				testData.get("ProfileName") + String.valueOf(randomNumber), true);

		// table[@id='gridtab_businessProfileCode_customer_OADM10070']//td[text()='CorporateTest792']
		us.doubleClickOnElement(driver,
				driver.findElement(By.xpath("//table[@id='gridtab_businessProfileCode_customer_OADM10070']//td[text()='"
						+ testData.get("ProfileName") + String.valueOf(randomNumber) + "']")));

	}

	@And("^User_609 Click the Save Button in Customer under Parameters$")
	public void User_609_Click_the_Save_Button_in_Customer_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_Customer_SaveBtn"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);

	}

	@And("^User_609 Click the Search Button in Customer under Parameters$")
	public void User_609_Click_the_Search_Button_in_Customer_under_Parameters() {
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_Customer_SearchBtn"), true);
	}

	@And("^User_609 Enter the Cif input in Customer under Parameters$")
	public void User_609_Enter_the_Cif_input_in_Customer_under_Parameters() throws Throwable {
		us.enterDataAndEnter(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_Customer_CifInput"), Cif,
				true);
		Thread.sleep(3000);

		// table[@id='omniCustomerListGridTbl_Id_OADM10070']//td[text()='735']

		String xpath = "//table[@id='subProfilesListGrid_Id_OADM10041']//td[text()='" + Cif + "']";

		us.doubleClickOnElement(driver, xpath, false);
		Thread.sleep(2000);
	}

	@And("^User_609 Click the Approve Button in Customer under Parameters$")
	public void User_609_Click_the_Approve_Button_in_Customer__under_Parameters() throws Throwable {
		WebElement CodeElement = driver.findElement(By.xpath("(//input[@id='customerCode_OADM10070'])[2]"));
		Customer_Code = CodeElement.getAttribute("initialvalue");
		System.out.println("Customer_Code is : " + Customer_Code);
		Thread.sleep(2000);
		us.clickOnElement(driver,
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_Customer_ApproveBtn"), true);
		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Confirmok"), true);

		us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Ok"), true);
	}

}