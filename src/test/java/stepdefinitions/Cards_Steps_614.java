package stepdefinitions;

import dataProvider.DataBase;
import dataProvider.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    DataBase db = new DataBase();

    String executionTestData;
    HashMap<String, String> testData = DataReader.testData;

//    ---------------------- Test case from CRD_035 to CRD_036 ---------------------------------------------
    @And("^user_614 loads the test datasetup for the test case id CRD_035$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_035() {
        executionTestData = DataReader.executionTestData.get("CRD_035");
        DataReader.testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
        System.out.println(DataReader.testData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_036$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_036() {
        executionTestData = DataReader.executionTestData.get("CRD_036");
        DataReader.testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_037$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_037() {
        executionTestData = DataReader.executionTestData.get("CRD_037");
        DataReader.testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_038$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_038() {
        executionTestData = DataReader.executionTestData.get("CRD_038");
        DataReader.testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_039$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_039() {
        executionTestData = DataReader.executionTestData.get("CRD_039");
        DataReader.testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }
    @And("^user_614 loads the test datasetup for the test case id CRD_040$")
    public void User_614LoadsTheTestDatasetupForTheTestCaseIdCrd_040() {
        executionTestData = DataReader.executionTestData.get("CRD_040");
        DataReader.testData = DataReader.testDataMap.get("CardsOmni").get(executionTestData);
    }






































































}