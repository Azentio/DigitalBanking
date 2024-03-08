 package runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {"src/test/java/Features/BeneficaryManagement_612.feature"
		//,"src/test/java/Features/AccountTransfer_612.feature",
//		"src/test/java/Features/DebitCardDetails_612.feature",
//          "src/test/9java/Features/DebitCardRequest_612.feature"
},
                glue = "stepdefinitions",
                        //monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"}
              //dryRun = false ,//to check compilation errors   AccountTransfer_612 CreditCardSettlement_612 or @AT_CCS_025 or @AT_CCS_025_01                             
      //      
      ,tags= "@AT_BM_069_01"                                     

    		   
            	
    		  
)


//P@th123$%@z 

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