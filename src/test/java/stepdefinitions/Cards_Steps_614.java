package stepdefinitions;

import dataProvider.DataBase;
import dataProvider.DataReader;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import resources.BaseClass;
import utilities.UserUtility_614;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class Cards_Steps_614 {

    WebDriver driver = BaseClass.driver;

    UserUtility_614 us = new UserUtility_614(driver);

    String executionTestData;

    HashMap<String, String> testData;

//    ---------------------- Test case from CRD_035 to CRD_036 ---------------------------------------------
    @And("^user_614 loads the test datasetup for the test case id CRD_035$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_035() {
        executionTestData = DataReader.executionTestData.get("CRD_035");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);


    }
    @And("^user_614 loads the test datasetup for the test case id CRD_036$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_036() {
        executionTestData = DataReader.executionTestData.get("CRD_036");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_037$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_037() {
        executionTestData = DataReader.executionTestData.get("CRD_037");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_038$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_038() {
        executionTestData = DataReader.executionTestData.get("CRD_038");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_039$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_039() {
        executionTestData = DataReader.executionTestData.get("CRD_039");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_040$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_040() {
        executionTestData = DataReader.executionTestData.get("CRD_040");
        testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }






































































}