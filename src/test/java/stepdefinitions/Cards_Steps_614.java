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

    @Given("^user_614 navigates to the omni_retail_web_portal$")
    public void User_614NavigatesToTheOmni_Retail_Web_Portal() {
        driver.get(DataReader.configFileMap.get("omni_web_portal"));
    }

    @And("^user_614 click on the cards screen from the omni homescreen$")
    public void User_614ClickOnTheCardsScreenFromTheOmniHomescreen() {
            us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("Cards_OmniHomeScreen"),  false);
    }
    @And("^user_614 click on the my cards section from the cards screen$")
    public void User_614ClickOnTheMyCardsSectionFromTheCardsScreen() {
        us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("MyCards_Cards_OmniHomeScreen"),  false);
    }
    @And("^user_614 click on the credit cards on the header of my cards section$")
    public void User_614ClickOnTheCreditCardsOnTheHeaderOfMyCardsSection() throws InterruptedException {
        us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("CreditCards_MyCards_Cards_OmniHomeScreen"), false);
    }
    @And("^user_614 selects the first card type where the allow to reissue flag is checked and the card is active$")
    public void User_614SelectsTheFirstCardTypeWhereTheAllowToReissueFlagIsCheckedAndTheCardIsActive() {
        String xpath = us.textReplacer(
                DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCardByCardType_CreditCards_MyCards_Cards_OmniHomeScreen"),
                "TESTDATAVARIABLE",
                DataReader.testData.get("CardTypeName"));

        try {
            us.clickOnElementNoWaitJs(driver, xpath, 30, false);

        }
        catch (Exception e) {
            us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("CreditCards_MyCards_Cards_OmniHomeScreen"),  false);
            System.out.println("Credit cards Clicked");
            us.clickOnElementNoWaitJs(driver, xpath, 40, false);
        }
    }
    @And("^user_614 click on the block icon from the dropdown list$")
    public void User_614ClickOnTheBlockIconFromTheDropdownList() {
        try {
            us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("BlockIcon_ActiveCreditCard"),  false);
        } catch (Exception e) {
            try {
                us.clickOnElementNoWaitJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("OKBtnLogginScreen"),  10, false);
            }
            catch (Exception e1){

            }
            us.clickOnElementNoWaitJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("BlockIcon_ActiveCreditCard"),  10, false);
        }
    }
    @And("^user_614 validates that the reissue toggle btn is not available$")
    public void User_614ValidatesThatTheReissueToggleBtnIsNotAvailable() {

        try {
            us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("BlockCard_CardInfoText"),false);
            us.clickOnElementNoWaitJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("ToggleBtn_ReisseuCard_MyCards"),5, false);
            Assert.fail();
        } catch (Exception e) {

        }
    }


    @And("^user_614 validates on the debit card segment and credit cards segment are shown in the same page under my cards$")
    public void User_614ValidatesOnTheDebitCardSegmentAndCreditCardsSegmentAreShownInTheSamePageUnderMyCards() {
        try {
            us.elementIsVisibleNoWait(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("DebitCards_MyCards_Cards_OmniHomeScreen"),30);
            us.elementIsVisibleNoWait(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("CreditCards_MyCards_Cards_OmniHomeScreen"),5);
            
        } catch (Exception e) {
        	Assert.fail();
        }
    }

    @And("^user_614 click on the debit cards on the header of my cards section$")
    public void User_614ClickOnTheDebitCardsOnTheHeaderOfMyCardsSection() {
    	us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("DebitCards_MyCards_Cards_OmniHomeScreen"),false);
    }
    
    @And("^user_614 validates if the debit cards are listed or not$")
    public void User_614ValidatesIfTheDebitCardsAreListedOrNot() {
    	String xpath = us.textReplacer(
                DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCardByCardType_CreditCards_MyCards_Cards_OmniHomeScreen"),
                "TESTDATAVARIABLE",
                DataReader.testData.get("CardTypeName"));

            us.elementIsVisible(driver, xpath);
    }
    
    @And("^user_614 selects the first card type where the card is active$")
    public void User_614SelectsTheFirstCardTypeWhereTheCardIsActive() {
    	String xpath = us.textReplacer(
                DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCardByCardType_CreditCards_MyCards_Cards_OmniHomeScreen"),
                "TESTDATAVARIABLE",
                DataReader.testData.get("CardTypeName"));

    	try {
            us.clickOnElementNoWaitJs(driver, xpath, 30, false);

        }
        catch (Exception e) {
            us.clickOnElementJs(driver, DataReader.locatorsMap.get("OmniScreen_Login").get("CreditCards_MyCards_Cards_OmniHomeScreen"),  false);
            System.out.println("Credit cards Clicked");
            us.clickOnElementNoWaitJs(driver, xpath, 40, false);
        }
    }
    
    @And("^user_614 validates that the expiry date is mentioned or not$")
    public void User_614ValidatesThatTheExpiryDateIsMentionedOrNot() {
    	
    	String text = us.getText(driver,
    			DataReader.locatorsMap.get("OmniScreen_Login").get("expiryDate_MyCards_Omni"), 
    			false);
    	
    	boolean digit = false;
    	for (int i = 0; i < text.length(); i++) {
			char charAt = text.charAt(i);
			digit = Character.isDigit(charAt);
		}
    	
    	if (digit) {
		}
    	else {
			Assert.fail("Contains no digit or no date is mentioned");
		}
    	
    }

    @And("^user_614 validates if the credit cards are listed or not$")
    public void User_614ValidatesIfTheCreditCardsAreListedOrNot() {
    	String xpath = us.textReplacer(
                DataReader.locatorsMap.get("OmniScreen_Login").get("FirstActiveCreditCardByCardType_CreditCards_MyCards_Cards_OmniHomeScreen"),
                "TESTDATAVARIABLE",
                DataReader.testData.get("CardTypeName"));

            us.elementIsVisible(driver, xpath);
    }
































































}