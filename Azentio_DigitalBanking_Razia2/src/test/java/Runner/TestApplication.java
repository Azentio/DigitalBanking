
package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {"src/test/java/Features/DebitCardDetails_612.feature"},
                glue = "stepdefinitions",
                //monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"}
              //dryRun = false ,//to check compilation errors Activitylogreport_612  AccountTransfer_612 CreditCardSettlement_612                              
         ,tags=" @AT_DCD_027 or @AT_DCD_035"  //or @AT_CCS_012 or @AT_CCS_012_01 or @AT_CCS_013 or @AT_CCS_014 or @AT_CCS_015"// @AT_024  @ALR_015

            		
)

// P@th123$%@z @AT_024 @AT_034 @AT_039

public class TestApplication extends AbstractTestNGCucumberTests {
	/*
	 * @Override
	 * 
	 *
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); 
	 * 
	 * }
	 */
		
	@Before
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");

	}
	

	@After
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

}