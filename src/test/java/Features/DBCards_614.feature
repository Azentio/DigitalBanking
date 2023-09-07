Feature: Checking the functionalities of Cards

  @CRD_035
  Scenario: "allow to re-issue" field not checked for Credit Card blocking
    Given user_614 navigates to the omni_retail_web_portal
    And user_614 loads the test datasetup for the test case id CRD_035
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the cards screen from the omni homescreen
    And user_614 click on the my cards section from the cards screen
    And user_614 click on the credit cards on the header of my cards section
    And user_614 selects the first card type where the allow to reissue flag is checked and the card is active
    And user_614 click on the block icon from the dropdown list
    And user_614 validates that the reissue toggle btn is not available
    And user_614 clicks on logout btn to logout from omni web portal


  @CRD_036
  Scenario: "Debit Cards" segment on CDM Theme
    Given user_614 navigates to the omni_retail_web_portal
    And user_614 loads the test datasetup for the test case id CRD_035
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal



  @CRD_037
  Scenario: "My Cards" screen on presales theme
    Given user_614 navigates to the omni_retail_web_portal
    And user_614 loads the test datasetup for the test case id CRD_037
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal
    And user_614 click on the cards screen from the omni homescreen
    And user_614 click on the my cards section from the cards screen
    And user_614 validates on the debit card segment and credit cards segment are shown in the same page under my cards
    And user_614 clicks on logout btn to logout from omni web portal

  @CRD_038
  Scenario: "Debit Cards" segment on Presales Theme
    Given user_614 navigates to the omni_retail_web_portal
    And user_614 loads the test datasetup for the test case id CRD_035
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal


  @CRD_039
  Scenario: "Credit Cards" segment on Presales Theme
    Given user_614 navigates to the omni_retail_web_portal
    And user_614 loads the test datasetup for the test case id CRD_035
    And user_614 enters the maker username1 in the login page for omni_corporate_web_portal
    And user_614 enters the maker password1 in the login page for omni_corporate_web_portal
    And user_614 click on the loggin button in the login page for omni_corporate_web_portal
    And user_614 click on the force logout btn in the login page for omni_corporate_web_portal
    And user_614 click on the ok button for the successful login page for omni_corporate_web_portal

