Feature: Checking the functionalities of Cards


@CRD_025
Scenario: Activate Debit Card - identification  
And User_612 loads the test datasetup for the test case id CRD_025
Given User_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_612 Click on the Parameters menu
And User_612 Click on the Profile Management submenu
And User_612 Click on the Business Profile screen under Parameters
And User_612 Enter the Profile Name in Business Profile under Parameters
And User_612 Select the Application in Business Profile under Parameters
And User_612 Click on Root in Business Profile under Parameters
And User_612 Click on Retail in Business Profile under Parameters
And User_612 click on Cards section in Retail under parameters
And User_612 click on the Intergration Submenu under parameters
#should be availble
And User_612 click the Alertmapping under Intergration Settings
And User_612 click the ReportsMapping under Intergration Settings
And User_612 click on LimitManagement under parameters
And User_612 click the Maintenance under LimitManagement screen
And User_612 click search button under Maintenance
And User_612 Enter the value in code under Maintenance 
And User_612 Double tab the exiting record under Maintenance
And User_612 click the add button in FiancialServiceLimit under Maintenance
And User_612 click the service code under FiancialServiceLimit
And User_612 click the searchbutton under service code
And User_612 enter a value in operation under service code 
And User_612 click the add button in NonFiancialServiceLimit under Maintenance
And User_612 click the service code under NonFiancialServiceLimit
And User_612 click the searchbutton in service code under NonFiancialServiceLimit
And User_612 enter a value in operation in service code under NonFiancialServiceLimit
#should be availble
And User_612 click on the Authentication Matrix under parameters


@CRD_025_01
Scenario:  Activate Debit Card - identification  
And User_612 loads the test datasetup for the test case id CRD_025
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail  username in the login page for omni_web_portal
And user_612 enters the Retail password in the login page for omni_web_portal
And user_612 click on the loggin button in the login page for omni_web_portal
And user_612 click on the force logout btn in the login page for omni_web_portal
And user_612 click on the ok button for the successful login page for omni_web_portal
And user_612 Click the Menu flag under omni_web_portal


@CRD_026
Scenario: Activate Credit Card - identification
And User_612 loads the test datasetup for the test case id CRD_026
Given User_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_612 Click on the Parameters menu
And User_612 Click on the Profile Management submenu
And User_612 Click on the Business Profile screen under Parameters
And User_612 Enter the Profile Name in Business Profile under Parameters
And User_612 Select the Application in Business Profile under Parameters
And User_612 Click on Root in Business Profile under Parameters
And User_612 Click on Retail in Business Profile under Parameters
And User_612 click on Cards section in Retail under parameters
#should be availble field missing
And User_612 click on the Intergration Submenu under parameters
And User_612 click the Alertmapping under Intergration Settings
And User_612 click the ReportsMapping under Intergration Settings
And User_612 click on LimitManagement under parameters
And User_612 click the Maintenance under LimitManagement screen
And User_612 click search button under Maintenance
And User_612 Enter the value in code under Maintenance 
And User_612 Double tab the exiting record under Maintenance
And User_612 click the add button in FiancialServiceLimit under Maintenance
And User_612 click the service code under FiancialServiceLimit
And User_612 click the searchbutton under service code
And User_612 enter a value in operation under service code 
And User_612 click the add button in NonFiancialServiceLimit under Maintenance
And User_612 click the service code under NonFiancialServiceLimit
And User_612 click the searchbutton in service code under NonFiancialServiceLimit
And User_612 enter a value in operation in service code under NonFiancialServiceLimit
#should be availblefield missing
And User_612 click on the Authentication Matrix under parameters


@CRD_026
Scenario: Activate Credit Card - identification
And User_612 loads the test datasetup for the test case id CRD_026
Given user_612 navigates to the omni_web_portal
And user_612 enters the Retail  username in the login page for omni_web_portal
And user_612 enters the Retail password in the login page for omni_web_portal
And user_612 click on the loggin button in the login page for omni_web_portal
And user_612 click on the force logout btn in the login page for omni_web_portal
And user_612 click on the ok button for the successful login page for omni_web_portal
And user_612 Click the Menu flag under omni_web_portal


@CRD_027
Scenario: "Block Debit Card" identification
And User_612 loads the test datasetup for the test case id CRD_027
Given User_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_612 Click on the Parameters menu
And User_612 Click on the Profile Management submenu
And User_612 Click on the Business Profile screen under Parameters
And User_612 Enter the Profile Name in Business Profile under Parameters
And User_612 Select the Application in Business Profile under Parameters
And User_612 Click on Root in Business Profile under Parameters
And User_612 Click on Retail in Business Profile under Parameters
And User_612 click on Cards section in Retail under parameters
And User_612 click on the Intergration Submenu under parameters
And User_612 click the Alertmapping underIntergration Settings
And User_612 Search the Block debit card field in screen under AlertMapping
And User_612 click the ReportsMapping2 under Intergration Settings
And User_612 click on LimitManagement under parameters
And User_612 click the Maintenance under LimitManagement screen
And User_612 click search button under Maintenance
And User_612 Enter the value in code under Maintenance 
And User_612 Double tab the exiting record under Maintenance
And User_612 click the add button in FiancialServiceLimit under Maintenance
And User_612 click the service code under FiancialServiceLimit
And User_612 click the searchbutton under service code
And User_612 enter a value in operation under service code 
And User_612 click the add button in NonFiancialServiceLimit under Maintenance
And User_612 click the service code under NonFiancialServiceLimit
And User_612 click the searchbutton in service code under NonFiancialServiceLimit
And User_612 enter a value in operation in service code under NonFiancialServiceLimit
And User_612 click on the Authentication Matrix1 under parameters
And User_612 check the block debit card field in Authentication Matrix Screen


@CRD_028
Scenario: "Block Credit Card" identification
And User_612 loads the test datasetup for the test case id CRD_028
Given User_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_612 Click on the Parameters menu
And User_612 Click on the Profile Management submenu
And User_612 Click on the Business Profile screen under Parameters
And User_612 Enter the Profile Name in Business Profile under Parameters
And User_612 Select the Application in Business Profile under Parameters
And User_612 Click on Root in Business Profile under Parameters
And User_612 Click on Retail in Business Profile under Parameters
And User_612 click on Cards section in Retail under parameters
And User_612 click on the Intergration Submenu under parameters
And User_612 click the Alertmapping underIntergration Settings
#pending
And User_612 Search the Block credit card field in screen under AlertMapping
And User_612 click the ReportsMapping1 under Intergration Settings
And User_612 click on LimitManagement under parameters
And User_612 click the Maintenance under LimitManagement screen
And User_612 click search button under Maintenance
And User_612 Enter the value in code under Maintenance 
And User_612 Double tab the exiting record under Maintenance
And User_612 click the add button in FiancialServiceLimit under Maintenance
And User_612 click the service code under FiancialServiceLimit
And User_612 click the searchbutton under service code
And User_612 enter a value in operation under service code 
And User_612 click the add button in NonFiancialServiceLimit under Maintenance
And User_612 click the service code under NonFiancialServiceLimit
And User_612 click the searchbutton in service code under NonFiancialServiceLimit
And User_612 enter a value in operation in service code under NonFiancialServiceLimit
And User_612 click on the Authentication Matrix1 under parameters
And User_612 check the block credit card field in Authentication Matrix Screen


@CRD_024

Scenario: activate card -- maker - checker testing - disabled



