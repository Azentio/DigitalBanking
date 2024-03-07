
package runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {"src/test/java/Features/BeneficiaryManagement_80.feature"
		//,"src/test/java/Features/CreditCardSettlement_612.feature"
		
},
                glue = "stepdefinitions",
                //monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"}
              //dryRun = false ,//to check compilation errors CreditCardRequest  AccountTransfer_612 CreditCardSettlement_612                              
               // ,tags="@AT_CCS_050"//or @AT_DCR_008 or @AT_DCR_009 or @AT_DCR_0010 or @AT_DCR_011" //or @AT_CCR_004 or @AT_CCR_008 or @AT_CCR_009 " 
//,tags="@AT_BM_039"
            	
)
//


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