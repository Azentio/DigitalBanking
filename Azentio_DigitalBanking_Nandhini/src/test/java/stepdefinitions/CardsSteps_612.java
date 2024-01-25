package stepdefinitions;

import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import utilities.UserUtility_614;

public class CardsSteps_612 {
	
	WebDriver  driver = BaseClass.driver;
	UserUtility_614  us = new UserUtility_614(driver);
	String executionTestData;
	HashMap<String, String> testData;
	
	
	@And("User_612 loads the test datasetup for the test case id CRD_025")

    public void User_612_loads_the_test_datasetup_for_the_test_case_id_CRD_025() {

        executionTestData = DataReader.executionTestData.get("CRD_025");

        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@And("User_612 loads the test datasetup for the test case id CRD_026")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_CRD_026() {
        executionTestData = DataReader.executionTestData.get("CRD_026");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@And("User_612 loads the test datasetup for the test case id CRD_027")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_CRD_027() {
        executionTestData = DataReader.executionTestData.get("CRD_027");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
	@And("User_612 loads the test datasetup for the test case id CRD_028")
    public void User_612_loads_the_test_datasetup_for_the_test_case_id_CRD_028() {
        executionTestData = DataReader.executionTestData.get("CRD_028");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }

	
	@Given("^User_612 navigates to the OmniScreen Admin Url and login with the valid credentials$")

    public void User_612_NavigatesToTheOmniscreenAdminUrlAndLoginWithTheValidCredentials() {

        driver.get(DataReader.configFileMap.get("omni_adminScreen"));
        us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("userNameField_LogginScreen"),

                DataReader.userCredentialsMap.get("RaziaAdmin").get("userName"), false);
        us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("passwordField_LogginScreen"),

                DataReader.userCredentialsMap.get("RaziaAdmin").get("Password"), false);
        us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("logginBtn_LogginScreen"), false);
        us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("companyCode_AdminLoggin"),

                DataReader.userCredentialsMap.get("RaziaAdmin").get("CompanyCode"), false);

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
@And("^User_612 Click on the Parameters menu$")

    public void User_612_Click_on_the_Parameters_menu() {

        us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters"), true);

    }

 @And("^User_612 Click on the Profile Management submenu$")

    public void User_612_Click_on_the_Profile_Management_submenu() {

        us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement"), true);

    }

    @And("^User_612 Click on the Business Profile screen under Parameters$")

    public void User_612_Click_on_the_Business_Profile_screen_under_Parameters() throws Throwable {

        us.clickOnElement(driver,

                DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile"), true);

        Thread.sleep(5000);

    }

@And("^User_612 Enter the Profile Name in Business Profile under Parameters$")

    public void User_612_Enter_the_Profile_Name_in_Business_Profile_under_Parameters() {

        Random random = new Random();

        int randomNumber = random.nextInt(500 - 50) + 500;

        us.enterDataAndTab(driver,

                DataReader.locatorsMap.get("Omni_Admin")

                        .get("Parameters_ProfileManagement_BusinessProfile_ProfileName"),

                testData.get("ProfileName") + String.valueOf(randomNumber), true);
    }

 
//
//    @And("^User_612 Enter the Brief Description in Business Profile under Parameters$")
//
//    public void User_612_Enter_the_Brief_Description_in_Business_Profile_under_Parameters() {
//
//        us.enterDataAndTab(driver,
//
//                DataReader.locatorsMap.get("Omni_Admin")
//
//                        .get("Parameters_ProfileManagement_BusinessProfile_BriefDescription"),
//
//                testData.get("BriefDescription"), true);
//
//    }

     @And("^User_612 Select the Application in Business Profile under Parameters$")

    public void User_612_Select_the_Application_in_Business_Profile_under_Parameters() {

        Select Application = new Select(driver.findElement(By.xpath("//select[@id='applications_OADM10040']")));

        // Application.selectByVisibleText("Retail");

        Application.selectByVisibleText(testData.get("Application"));

    }

 

    @And("^User_612 Click on Root in Business Profile under Parameters$")

    public void User_612_Click_on_Root_in_Business_Profile_under_Parameters() throws Throwable {

        us.clickOnElement(driver,

                DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Root"), false);
        Thread.sleep(2000);

    }

 

    @And("^User_612 Click on Retail in Business Profile under Parameters$")

    public void User_612_Click_on_Retail_in_Business_Profile_under_Parameters() {

        us.clickOnElement(driver,

                DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Retail"),false);

    }
	
    @Given("User_612 click on Cards section in Retail under parameters")
    public void user_612_click_on_cards_section_in_retail_under_parameters( ) throws InterruptedException {
    	us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_ProfileManagement_BusinessProfile_Retail_Cardsec"),false);
    	//    	String x = "//*[text()='activate debit card']";
//    	WebElement Cards = driver.findElement(By.xpath(x));
//        Assert.assertTrue(driver.findElement(By.xpath(x)).isDisplayed());
        Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")),false);
        
    }
    @Given("User_612 click on the Authentication Matrix under parameters")
    public void user_612_click_on_the_authentication_matrix_under_parameters()  {
        	  us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("parameters_Authentication Matrix"),true);
        	  
   }
    @And("User_612 click the Authentication Matrix submenu")
    public void user_612_click_the_authentication_matrix_submenu( ) throws InterruptedException{ 
    	
    	 us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("parameters_Authentication Matrix_submenu"),true);
	  Thread.sleep(5000);
    }
  
    @Given("User_612 check the block credit card field in Authentication Matrix Screen")
    public void user_612_check_the_block_credit_card_field_in_authentication_matrix_screen( ) throws InterruptedException {
    	Thread.sleep(5000);
    	WebElement Block_credit = driver.findElement(By.xpath("//table[@id='authenticationMatrixServiceGrid_Id_OADM10140']//td[text()='Block Credit Card']"));
    	  us.scrollDownTillElement(driver, Block_credit);
        Assert.assertEquals(Block_credit.isDisplayed(),true);
        //System.out.print(Block_credit);
    }
    @Given("User_612 check the block debit card field in Authentication Matrix Screen")
    public void user_612_check_the_block_debit_card_field_in_authentication_matrix_screen( ) throws InterruptedException {
    	Thread.sleep(10000);
    	WebElement Block_debit = driver.findElement(By.xpath("//table[@id='authenticationMatrixServiceGrid_Id_OADM10140']//td[text()='BLOCK DEBIT CARD']"));
    	        us.scrollDownTillElement(driver, Block_debit);
        Assert.assertEquals(Block_debit.isDisplayed(),true);
        System.out.print(Block_debit);
    }

    
    @Given("User_612 click on the Intergration Submenu under parameters")
    public void user_612_click_on_the_intergration_submenu_under_parameters() {
        us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_IntergarationSetting"),true);
    }

    @Given("User_612 click the Alertmapping under Intergration Settings")
    public void user_click_the_alertmapping_under_intergration_settings() throws InterruptedException {
    	  us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_IntergarationSetting_AlerteventMapping"),true);
    	  Thread.sleep(5000);
    	  Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")),false);
       
    }
    @Given("User_612 click the Alertmapping underIntergration Settings")
    public void user_612_click_the_alertmapping_underintergration_settings() throws InterruptedException {
    	  us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_IntergarationSetting_AlerteventMapping"),true);
    	  Thread.sleep(5000);
    	  
       
    }
    @Given("User_612 click the ReportsMapping under Intergration Settings")
    public void user_612_click_the_reports_mapping_under_intergration_settings() throws InterruptedException {
    	  us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("parameters_intergarationsetting_ReportsMapping"),true);
    	  Thread.sleep(5000);
    	  Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")), false);
    }
    @Given("User_612 click the ReportsMapping1 under Intergration Settings")
    public void user_612_click_the_reportsmapping1_under_intergration_settings() throws InterruptedException {
    	  us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("parameters_intergarationsetting_ReportsMapping"),true);
    	  Thread.sleep(5000);
    	  
    }
    
    @Given("User_612 click the ReportsMappingC under Intergration Settings")
    public void user_612_click_the_reportsmappingC_under_intergration_settings() throws InterruptedException {
    	WebElement Block_creditcard = driver.findElement(By.xpath("//table//td[text()='Block Credit Card']"));
    	//DataReader.locatorsMap.get("Omni_Admin").get("Parameters_IntergarationSetting_AlerteventMapping_field")
        us.scrollDownTillElement(driver, Block_creditcard);
        Assert.assertEquals(Block_creditcard.isDisplayed(),false);
    }
    @Given("User_612 Search the Block debit card field in screen under AlertMapping")
    public void user_612_search_the_block_debit_card_field_in_screen_under_alert_mapping( ) {
    	WebElement Block_creditcard = driver.findElement(By.xpath("//table//td[text()='Block Debit Card']"));
    	        us.scrollDownTillElement(driver, Block_creditcard);
        Assert.assertEquals(Block_creditcard.isDisplayed(),true);
         
    }

    @Given("User_612 click the ReportsMappingD under Intergration Settings")
    public void user_612_click_the_reportsmappingD_under_intergration_settings( ) { 
    	WebElement Block_debit = driver.findElement(By.xpath("//table//td[text()='BLOCK DEBIT CARD']"));
    	       us.scrollDownTillElement(driver, Block_debit);
        Assert.assertEquals(Block_debit.isDisplayed(),true);
    	
    } 

    @Given("User_612 click on LimitManagement under parameters")
    public void user_612_click_on_limit_management_under_parameters() {
    	 us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_LimitsManagement"),true);
    	
    }

    @Given("User_612 click the Maintenance under LimitManagement screen")
    public void user_click_the_maintenance_under_limit_management_screen() {
    	 us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_LimitsManagement_Maintenance"),true);
      
    }

    @Given("User_612 click search button under Maintenance")
    public void user_612_click_search_button_under_maintenance() {
    	 us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("Parameters_LimitsManagement_Maint_Search"),true); 
       
    }

    @Given("User_612 Enter the value in code under Maintenance")
    public void user_enter_the_value_in_code_under_maintenance() {
              us.enterDataAndTab(driver, 
				DataReader.locatorsMap.get("Omni_Admin").get("Parameters_LimitsManagement_Maint_Search_code"), 
				testData.get("code"), 
				true);
       
    }

    @Given("User_612 Double tab the exiting record under Maintenance")
    public void user_612_double_tab_the_exiting_record_under_maintenance() throws Throwable {
       us.doubleClickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("Parameters_LimitsManagement_Maint_Search_code_doubletab"),true);
       Thread.sleep(3000);
       
    }

    @Given("User_612 click the add button in FiancialServiceLimit under Maintenance")
    public void user_click_the_add_button_in_fiancial_service_limit_under_maintenance() throws InterruptedException {
       us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("param_limitMa_Maint_FiancialServiceLimit_AddBtn"),true);
       Thread.sleep(2000);
       
    }

    @Given("User_612 click the service code under FiancialServiceLimit")
    public void user_612_click_the_service_code_under_fiancial_service_limit() throws Throwable {
    	us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("param_limitMa_Maint_FiancialServiceLimit_AddBtn_click"),true);
    	Thread.sleep(2000);
      }

    @Given("User_612 click the searchbutton under service code")
    public void user_click_the_searchbutton_under_service_code() {
    	us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("param_limitMa_Maint_FiancialServiceLimit_AddBtn_click_servicecode_search"),true);
         }

    @Given("User_612 enter a value in operation under service code")
    public void user_612_enter_a_value_in_operation_under_service_code() {
    	us.enterDataAndTab(driver, DataReader.locatorsMap.get("Omni_Admin").get("param_limit_FiancialServiceLimit_AddBtn_click_servicecode_search_operation"), testData.get("operation"),true);
    }

    @Given("User_612 click the add button in NonFiancialServiceLimit under Maintenance")
    public void user_click_the_add_button_in_non_fiancial_service_limit_under_maintenance() {
       us.clickOnElement(driver,DataReader.locatorsMap.get("Omni_Admin").get("param_limitMa_Maint_NonFiancialServiceLimit_AddBtn"),true);
       
    }

    @Given("User_612 click the service code under NonFiancialServiceLimit")
    public void user_612_click_the_service_code_under_non_fiancial_service_limit() {
       
       us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("param_limitMa_Maint_NonFiancialServiceLimit_AddBtn_scodeClk"),true);
    }

    @Given("User_612 click the searchbutton in service code under NonFiancialServiceLimit")
    public void user_612_click_the_searchbutton_in_service_code_under_non_fiancial_service_limit() throws InterruptedException {
    	 us.clickOnElement(driver, DataReader.locatorsMap.get("Omni_Admin").get("param_limitMa_Maint_NonFiancialServiceLimit_AddBtn_click_servicecode_search"),true);
       Thread.sleep(2000);    }

    @Given("User_612 enter a value in operation in service code under NonFiancialServiceLimit")
    public void user_612_enter_a_value_in_operation_in_service_code_under_non_fiancial_service_limit() throws InterruptedException {
       us.enterDataAndTab(driver, DataReader.locatorsMap.get("Omni_Admin").get("param_limit_NonFiancialServiceLimit_AddBtn_click_servicecode_search_operation"),testData.get("operation"),true);
       Thread.sleep(2000);
    }
    
    @Given("User_612 Search the Block credit card field in screen under AlertMapping")
    public void user_612_search_the_block_credit_card_field_in_screen_under_alert_mapping() throws InterruptedException {
    	//Thread.sleep(3000);
    	//us.scrollDownTillElement(driver,(WebElement)driver.findElement(By.xpath(DataReader.locatorsMap.get("Omni_Admin").get("Parameters_IntergarationSetting_AlerteventMapping_field"))));
    	WebElement Block_creditcard = driver.findElement(By.xpath("//table[@id='servicesSettingsServcGrid_Id_OADM10242']//td[text()='Block Credit Card']"));
    	//DataReader.locatorsMap.get("Omni_Admin").get("Parameters_IntergarationSetting_AlerteventMapping_field")
        us.scrollDownTillElement(driver, Block_creditcard);
        Assert.assertEquals(Block_creditcard.isDisplayed(),true);
         
    	
    }
    //core

@Given("user_612 navigates to the omni_web_portal")
public void user_612_navigates_to_the_omni_web_portal() {
	driver.get(DataReader.configFileMap.get("omni_web_portal"));
   
   
}

@Given("user_612 enters the Retail  username in the login page for omni_web_portal")
public void user_612_enters_the_retail_username_in_the_login_page_for_omni_web_portal() {
   //us.enterDataAndTab(driver, DataReader.locatorsMap.get("OmniScreen_L").get("usernameRetail"),testData.get("UserName1"),true);
	us.enterData(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("userNameLoginScreen1"),
			testData.get("UserName1"),
			false);
   
}


@Given("user_612 enters the Retail password in the login page for omni_web_portal")
public void user_612_enters_the_retail_password_in_the_login_page_for_omni_web_portal() {
	us.enterDataAndEnter(driver,
			DataReader.locatorsMap.get("OmniScreen_Login").get("passwordLoginScreen1"),
			testData.get("Password1"),
			false);
   
}

@Given("user_612 click on the loggin button in the login page for omni_web_portal")
public void user_612_click_on_the_loggin_button_in_the_login_page_for_omni_web_portal() throws InterruptedException {
   
	Thread.sleep(5000);
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("loginBtn1"), 
				20,
				false);
	} catch (Exception e) {
	}
}

@Given("user_612 click on the force logout btn in the login page for omni_web_portal")
public void user_612_click_on_the_force_logout_btn_in_the_login_page_for_omni_web_portal() {
   
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
				20,
				false);
	} catch (Exception e) {
		
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("ForcelogoutLogginScreen1"), 
					20,
					false);
		} catch (Exception e1) {
		}
	}
}

@Given("user_612 click on the ok button for the successful login page for omni_web_portal")
public void user_612_click_on_the_ok_button_for_the_successful_login_page_for_omni_web_portal() {
	try {
		us.clickOnElementNoWait(driver, 
				DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin1"), 
				45,
				false);
	} 
	
	catch (Exception e) {
		try {
			us.clickOnElementNoWait(driver, 
					DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin2"),
					10,
					false);
		} catch (Exception X) {
			try {
				us.clickOnElementNoWait(driver, 
						DataReader.locatorsMap.get("OmniScreen_Login").get("SomethingWentWrong_OKbtn_omni"), 
						20,
						false);
			} catch (Exception e11) {
				
				try {
					us.clickOnElementNoWait(driver, 
							DataReader.locatorsMap.get("OmniScreen_Login").get("SecurityAlert_OKbtn_Omni"), 
							20,
							false);
				} catch (Exception e111) {
					try {
						
						us.clickOnElementNoWait(driver, 
								DataReader.locatorsMap.get("OmniScreen_Login").get("SessionReloaded_Omni"), 
								20,
								false);
						
					} catch (Exception e2) {
						try {
							us.clickOnElementNoWait(driver, 
									DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin1"), 
									45,
									false);
						} 
						
						catch (Exception e1111) {
								us.clickOnElementNoWait(driver, 
										DataReader.locatorsMap.get("OmniScreen_Login").get("okBtnAfterSuccessLogin2"),
										10,
										false);
						
				}
			}
		}
	}
	
		}
	}
	
   
   
}


@And("user_612 Click the  Cards Menu under omni_web_portal")
public void user_612_click_the_cards_menu_under_omni_web_portal( ) {
	us.clickOnElementNoWait(driver, 
			DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"), 
			20,
			false);
	 Assert.assertEquals(driver.getPageSource().contains(testData.get("operation")), false);
	
	
	
}
@And("user_612 loads the test datasetup for the test case id CRD_024")
public void User_612_loads_the_test_datasetup_for_the_test_case_id_CRD_024() {
    executionTestData = DataReader.executionTestData.get("CRD_024");
    testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
}

@Given("user_612 click on the My Cards under Cards in the homepage")
public void user_612_click_on_the_my_cards_under_cards_in_the_homepage() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"), false);
    }

@Given("user_612 click on the Show More button in Debit cards page")
public void user_612_click_on_the_show_more_button_in_debit_cards_page() {
	us.clickOnElement(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCard_CreditCards_MyCards_Cards_OmniHomeScreen"), false);
    }





}



