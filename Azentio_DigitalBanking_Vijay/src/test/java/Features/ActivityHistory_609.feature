Feature: Activity History

@AH_001
Scenario: activity history for "account suspension"
And User_609 loads the test datasetup for the test case id AH_001
Given User_609 navigates to the omni_corporate_web_portal
#And User_609 Enters the maker username1 in the login page for omni_corporate_web_portal
#And User_609 Enters the maker password1 in the login page for omni_corporate_web_portal
Given User_609 Enters the maker checker username1 in the login page for omni_corporate_web_portal
Given User_609 Enters the maker checker password1 in the login page for omni_corporate_web_portal
And User_609 click on the loggin button in the login page for omni_corporate_web_portal
And User_609 click on the force logout btn in the login page for omni_corporate_web_portal
And User_609 click on the ok button for the successful login page for omni_corporate_web_portal
And User_609 Click on the Profile
And User_609 Click on the Security Settings
And User_609 Click on the Account suspension under Security Settings
And User_609 Select the Suspension Reason
And User_609 Enter the Comments under Security Settings
And User_609 Click on Submit under Security Settings

Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the User Management submenu
And User_609 Click on the End User screen under Parameters
And User_609 Click the Search Button in End User under Parameters
And User_609 Select the Code in End User under Parameters
And User_609 Click the Reactivate Button in End User under Parameters
And User_609 Enter the Reactivate Reason in End User under Parameters
And User_609 Select the Code in End User under Parameters for Approve
And User_609 Click the Approve Button in End User under Parameters

@AH_002
Scenario: check if the system Retrieve "BVN " input on local beneficiary screen
And User_609 loads the test datasetup for the test case id AH_002
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
#And User_609 enters the maker username1 in the login page for omni_corporate_web_portal
#And User_609 enters the maker password1 in the login page for omni_corporate_web_portal
#And User_609 click on the loggin button in the login page for omni_corporate_web_portal
#And User_609 click on the force logout btn in the login page for omni_corporate_web_portal
#And User_609 click on the ok button for the successful login page for omni_corporate_web_portal
And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu
And User_609 Click on the Business Profile screen under Parameters
And User_609 Enter the Profile Name in Business Profile under Parameters
And User_609 Enter the Brief Description in Business Profile under Parameters
And User_609 Select the Application in Business Profile under Parameters
And User_609 Click on Root in Business Profile under Parameters
And User_609 Click on Retail in Business Profile under Parameters
And User_609 Check the Session Activity History is Displaying in Business Profile under Parameters



#And User_609 Enable the Session Activity History flag in Business Profile under Parameters
#And User_609 Click the Save Button in Business Profile under Parameters     
#And User_609 Click the Search Button in Business Profile under Parameters
#And User_609 Enter the Business Profile input in Business Profile under Parameters          
#And User_609 Click the Approve Button in Business Profile under Parameters

@AH_003
Scenario: check if the operation "session activity history" is available under Corporate business profile
And User_609 loads the test datasetup for the test case id AH_003
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu
And User_609 Click on the Business Profile screen under Parameters
And User_609 Enter the Profile Name in Business Profile under Parameters
And User_609 Enter the Brief Description in Business Profile under Parameters
And User_609 Select the Application in Business Profile under Parameters
And User_609 Click on Root in Business Profile under Parameters
And User_609 Click on Corporate in Business Profile under Parameters
And User_609 Check the Session Activity History is Displaying in Business Profile under Parameters

And User_609 Enable the Session Activity History flag in Business Profile under Parameters
And User_609 Click the Save Button in Business Profile under Parameters     
And User_609 Click the Search Button in Business Profile under Parameters
And User_609 Enter the Business Profile input in Business Profile under Parameters          
And User_609 Click the Approve Button in Business Profile under Parameters

@AH_004
Scenario: check if the operation "session activity history" is available under Agency business profile
And User_609 loads the test datasetup for the test case id AH_004
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu
And User_609 Click on the Business Profile screen under Parameters
And User_609 Enter the Profile Name in Business Profile under Parameters
And User_609 Enter the Brief Description in Business Profile under Parameters
And User_609 Select the Application in Business Profile under Parameters
And User_609 Click on Root in Business Profile under Parameters
And User_609 Click on Agency in Business Profile under Parameters
And User_609 Check the Session Activity History is Displaying in Business Profile under Parameters


@AH_005
Scenario: add the operation  "session activity history" to business profile and login with retail user
And User_609 loads the test datasetup for the test case id AH_005
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu

And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu
And User_609 Click on the Business Profile screen under Parameters
And User_609 Enter the Profile Name in Business Profile under Parameters
And User_609 Enter the Brief Description in Business Profile under Parameters
And User_609 Select the Application in Business Profile under Parameters
And User_609 Click on Root in Business Profile under Parameters
And User_609 Click on Corporate in Business Profile under Parameters
And User_609 Check the Session Activity History is Displaying in Business Profile under Parameters

And User_609 Enable the Session Activity History flag in Business Profile under Parameters
And User_609 Click the Save Button in Business Profile under Parameters     
And User_609 Click the Search Button in Business Profile under Parameters
And User_609 Enter the Business Profile input in Business Profile under Parameters          
And User_609 Click the Approve Button in Business Profile under Parameters

And User_609 Click on the Sub Profile screen under Parameters
And User_609 Enter the SubProfile Name in Sub Profile under Parameters
And User_609 Enter the Brief Description in Sub Profile under Parameters
And User_609 Select the Business Profile in Sub Profile under Parameters
And User_609 Click the Save Button in Sub Profile under Parameters
And User_609 Click the Search Button in Sub Profile under Parameters
And User_609 Enter the Business Profile input in Sub Profile under Parameters  
And User_609 Click the Approve Button in Sub Profile under Parameters

@AH_006
Scenario: add the operation  "session activity history" to business profile and login with corporate user
And User_609 loads the test datasetup for the test case id AH_006
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu


And User_609 Click on the Business Profile screen under Parameters
And User_609 Enter the Profile Name in Business Profile under Parameters
And User_609 Enter the Brief Description in Business Profile under Parameters
And User_609 Select the Application in Business Profile under Parameters
And User_609 Click on Root in Business Profile under Parameters
And User_609 Click on Corporate in Business Profile under Parameters
#And User_609 Check the Session Activity History is Displaying in Business Profile under Parameters
And User_609 Enable the Session Activity History flag in Business Profile under Parameters
And User_609 Click the Save Button in Business Profile under Parameters     
And User_609 Click the Search Button in Business Profile under Parameters
And User_609 Enter the Business Profile input in Business Profile under Parameters          
And User_609 Click the Approve Button in Business Profile under Parameters

And User_609 Click on the Sub Profile screen under Parameters
And User_609 Enter the SubProfile Name in Sub Profile under Parameters
And User_609 Enter the Brief Description in Sub Profile under Parameters
And User_609 Select the Business Profile in Sub Profile under Parameters
And User_609 Click the Save Button in Sub Profile under Parameters
And User_609 Click the Search Button in Sub Profile under Parameters
And User_609 Enter the Sub Profile input in Sub Profile under Parameters  
And User_609 Click the Approve Button in Sub Profile under Parameters


And User_609 Click on the Customer screen under Parameters
And User_609 Select the Application as Corporate in Customer under Parameters
And User_609 Enter the Customer Name in Customer under Parameters
And User_609 Select the Cif in Customer under Parameters
And User_609 Select the Business Profile in Customer under Parameters
And User_609 Click the Save Button in Customer under Parameters
And User_609 Click the Search Button in Customer under Parameters
And User_609 Enter the Cif input in Customer under Parameters  
And User_609 Click the Approve Button in Customer under Parameters

And User_609 Click on the User Management submenu
And User_609 Click on the End User screen under Parameters
And User_609 Select the Application in End User under Parameters
And User_609 Select the Channels in End User under Parameters
And User_609 Enter the Mobile Number in End User under Parameters
And User_609 Select the Customer in End User under Parameters
And User_609 Enter the UserName in End User under Parameters
And User_609 Select the SubProfile in End User under Parameters

And User_609 Click the Save Button in End User under Parameters
And User_609 Click the Search Button in End User under Parameters
And User_609 Enter the Cif input in End User under Parameters  
And User_609 Click the Approve Button in End User under Parameters

And User_609 Click the Search Button in End User under Parameters
And User_609 Enter the Cif input in End User under Parameters 
And User_609 Click the Deliver Button in End User under Parameters
And User_609 Select the Deliver Option in End User under Parameters
And User_609 Click the Search Button in End User under Parameters
And User_609 Enter the Cif input in End User under Parameters 
And User_609 Click the Approve Button in End User under Parameters

And User_609 Click the Search Button in End User under Parameters
And User_609 Enter the Cif input in End User under Parameters 
And User_609 Click the Activate Button in End User under Parameters
And User_609 Click the Search Button in End User under Parameters
And User_609 Enter the Cif input in End User under Parameters 
And User_609 Click the Approve Button in End User under Parameters



@AH_007
Scenario: add the operation  "session activity history" to business profile and login with agent user
And User_609 loads the test datasetup for the test case id AH_007
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the Profile Management submenu
And User_609 Click on the Business Profile screen under Parameters
And User_609 Enter the Profile Name in Business Profile under Parameters
And User_609 Enter the Brief Description in Business Profile under Parameters
And User_609 Select the Application in Business Profile under Parameters
And User_609 Click on Root in Business Profile under Parameters
And User_609 Click on Agency in Business Profile under Parameters
#And User_609 Check the Session Activity History is Displaying in Business Profile under Parameters
And User_609 Enable the Session Activity History flag in Business Profile under Parameters
And User_609 Click the Save Button in Business Profile under Parameters     
And User_609 Click the Search Button in Business Profile under Parameters
And User_609 Enter the Business Profile input in Business Profile under Parameters          
And User_609 Click the Approve Button in Business Profile under Parameters







And User_609 Click on the User Management submenu
And User_609 Click on the End User screen under Parameters
And User_609 Select the Application in End User under Parameters
And User_609 Select the Channels in End User under Parameters

@AH_008
Scenario: add the operation  "session activity history" to business profile and login with agent user
And User_609 loads the test datasetup for the test case id AH_007
Given User_609 navigates to the OmniScreen Admin Url and login with the valid credentials
And User_609 Click on the Parameters menu
And User_609 Click on the User Management submenu
And User_609 Click on the Customer screen under Parameters
#And User_609 Select the Application as Corporate in Customer under Parameters
#And User_609 Enter the Customer Name in Customer under Parameters
And User_609 Select the Cif in Customer under Parameters
#And User_609 Select the Business Profile in Customer under Parameters