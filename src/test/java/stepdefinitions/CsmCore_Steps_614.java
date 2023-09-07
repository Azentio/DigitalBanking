package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.DataReader;
import io.cucumber.java.en.And;
import resources.BaseClass;
import utilities.UserUtility_614;

public class CsmCore_Steps_614 {
	
    WebDriver driver = BaseClass.driver;

    UserUtility_614 us = new UserUtility_614(driver);
    
    String useCase1 = "";
    
    @And("^user_614 gets the core reference number from the confirmation$")
    public void User_614GetsTheCoreReferenceNumberFromTheConfirmation() {
    	String coreRefNumber = us.getText(driver,
    			DataReader.locatorsMap.get("OmniScreen_Login").get("coreRefNo_FromConfirationReport_Omni"),
    			false);
    	
    	useCase1 = coreRefNumber;

    }
    
    
    @And("^user_614 navigates to the CSM core portal$")
    public void User_614NavigatesToTheCsmCorePortal() {
    	driver.get(DataReader.configFileMap.get("CSM_Core_DBS"));
    }
    @And("^user_614 login to the CSM core portal with valid credentials of Model.B$")
    public void User_614LoginToTheCsmCorePortalWithValidCredentialsOfModel() {
    	
//    	Entering of the userName and Password for the application
    	
        us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("UserName_CsmCore"),
                DataReader.userCredentialsMap.get("ModelB").get("userName"), false);

        us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("Password_CsmCore"),
                DataReader.userCredentialsMap.get("ModelB").get("Password"), false);
        
//        Click on the loggin btn
        
        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("LogginBtn_LogginScreenCsmCore"), false);
        
//        Setting up the company and branch code
        
        us.enterDataAndTab(driver, DataReader.locatorsMap.get("Omni_Admin").get("CompanyCode_LogginScreenCsmCore"),
                DataReader.userCredentialsMap.get("ModelB").get("CompanyCode"), false);
        
        us.enterDataAndTab(driver, DataReader.locatorsMap.get("Omni_Admin").get("BranchCode_LogginScreenCsmCore"),
                DataReader.userCredentialsMap.get("ModelB").get("BranchCode"), false);

        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("ContinueBtn_LogginScreenCsmCore"),
                false);
        
//        Force Logout
        
        try {

            us.clickOnElementNoWait(driver,
                    DataReader.locatorsMap.get("Omni_Admin").get("ForceLogoutBtn_LogginScreenCsmCore"), 10, false);
        } catch (Exception e) {

        }
        
//        Welcome message popup
        
        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("ContinueBtnWelcome_LogginScreenCsmCore"),
                false);
        
//        Setting up the current date
        
        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("CurrentRunDate_HomeScreenCSMCore"),
                false);
        
        us.enterData(driver, DataReader.locatorsMap.get("Omni_Admin").get("EnterRunningDate_HomeScreenCSMCore"),
                us.currentDate(), false);
        
        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("useBtn_EnterRunningDate_HomeScreenCSMCore"),
                false);
        
        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("OkBtnSuccessInformationPopUpCSMCore"),
                false);
        
        us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("CloseBtn_EnterRunningDate_HomeScreenCSMCore"),
                false);
        
        
    
    }
    
    @And("^user_614 click on the transaction screen from the CSM core portal homescreen$")
    public void User_614ClickOnTheTransactionScreenFromTheCsmCorePortalHomescreen() {
    	us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("transactionsScreen_CSMCore"),
                false);
    }
    
    @And("^user_614 click on the maintenance under the transaction screen on CSM$")
    public void User_614ClickOnTheMaintenanceUnderTheTransactionScreenOnCsm() {
    	us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("MaintenanceScreen_Transactions_CSMCore"),
                false);
    }
    
    @And("^user_614 click on the search icon on the maintenance under the transaction screen$")
    public void User_614ClickOnTheSearchIconOnTheMaintenanceUnderTheTransactionScreen() {
    	us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("SearchIcon_MaintenanceScreen_Transactions_CSMCore"),
                false);
    }
    
    @And("^user_614 enters the transaction number taken from the Omni confirmation report$")
    public void User_614EntersTheTransactionNumberTakenFromTheOmniConfirmationReport() {
    	us.enterDataAndEnter(driver, DataReader.locatorsMap.get("Omni_Admin").get("EnterTRSNo_Search_MaintenanceScreen_Transactions_CSMCore"),
    			useCase1, false);
    }
    
    @And("^user_614 validates the record is retrieved from the entered transaction number$")
    public void User_614ValidatesTheRecordIsRetrievedFromTheEnteredTransactionNumber() {
    	
    	String xpath = us.textReplacer(DataReader.locatorsMap.get("Omni_Admin").get("selectEnteredTransactionNo_MaintenanceScreen_Transactions_CSMCore"),
    			"TESTDATAVARIABLE", 
    			useCase1);
    	
    	us.elementIsVisible(driver, xpath);

    }
    
    @And("^user_614 validates the status is approved for the transaction number$")
    public void User_614ValidatesTheStatusIsApprovedForTheTransactionNumber() {
    	String xpath = us.textReplacer(DataReader.locatorsMap.get("Omni_Admin").get("ApprovedStatusForGivenTransNo__MaintenanceScreen_Transactions_CSMCore"),
    			"TESTDATAVARIABLE", 
    			useCase1);
    	
    	us.elementIsVisible(driver, xpath);
    }
    
    @And("^user_614 click on the loggout button to logout from the CSM core portal$")
    public void User_614ClickOnTheLoggoutButtonToLogoutFromTheCsmCorePortal() {
    	us.clickOnElementNormal(driver, DataReader.locatorsMap.get("Omni_Admin").get("LogoutBtn_CSMCore"),
                false);
    }
    

}
