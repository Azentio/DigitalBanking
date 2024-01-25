Feature:  Checking the functionality of Activity History

@AH_009
Scenario: remove the operation "session activity history" to business profile and login with corporate user

And user_612 loads the test datasetup for the test case id AH_009
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And user_612 Click on the Parameters menu
And user_612 Click on the Profile Management submenu
And user_612 Click on the Business Profile screen under Parameters
And user_612 Enter the Profile Name in Business Profile under Parameters
And user_612 Enter the Brief Description in Business Profile under Parameters
And user_612 Select the Application in Business Profile under Parameters
And user_612 Click on Root in Business Profile under Parameters
And user_612 Click the Save Button in Business Profile under Parameters     
And user_612 Click the Search Button in Business Profile under Parameters
And user_612 Enter the Business Profile input in Business Profile under Parameters          
And user_612 Click the Approve Button in Business Profile under Parameters
And user_612 Click on the Sub Profile screen under Parameters
And user_612 Enter the SubProfile Name in Sub Profile under Parameters
And user_612 Enter the Brief Description in Sub Profile under Parameters
And user_612 Select the Business Profile in Sub Profile under Parameters
And user_612 Click the Save Button in Sub Profile under Parameters
And user_612 Click the Search Button in Sub Profile under Parameters
And user_612 Enter the Sub Profile input in Sub Profile under Parameters  
And user_612 Click the Approve Button in Sub Profile under Parameters

And user_612 Click on the User Management submenu
And user_612 Click on the Customer screen under Parameters 
And user_612 Select the Application as Corporate in Customer under Parameters
And user_612 Enter the Customer Name in Customer under Parameters
And user_612 Select the Cif in Customer under Parameters
And user_612 Select the Business Profile in Customer under Parameters
And user_612 Click the Save Button in Customer under Parameters
And user_612 Click the Search Button in Customer under Parameters
And user_612 Enter the Cif input in Customer under Parameters  
And user_612 Click the Approve Button in Customer under Parameters

And user_612 Click on the End User screen under Parameters
And user_612 Select the Application in End User under Parameters
And user_612 Select the Channels in End User under Parameters
And user_612 Enter the Mobile Number in End User under Parameters
And user_612 Select the Customer in End User under Parameters
And user_612 Enter the UserName in End User under Parameters
And user_612 Select the SubProfile in End User under Parameters

And user_612 Click the Save Button in End User under Parameters
And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters  
And user_612 Click the Approve Button in End User under Parameters

And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Deliver Button in End User under Parameters
And user_612 Select the Deliver Option in End User under Parameters
And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Approve Button in End User under Parameters

And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Activate Button in End User under Parameters
And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Approve Button in End User under Parameters
And user_612 clicks on logout btn to logout from Admin portal
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal1
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal1
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal1
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal1

@AH_010
Scenario: remove the operation "session activity history" to business profile and login with agent user
And user_612 loads the test datasetup for the test case id AH_010
Given user_612 navigates to the OmniScreen Admin Url and login with the valid credentials
And user_612 Click on the Parameters menu
And user_612 Click on the Profile Management submenu
And user_612 Click on the Business Profile screen under Parameters
And user_612 Enter the Profile Name in Business Profile under Parameters
And user_612 Enter the Brief Description in Business Profile under Parameters
And user_612 Select the Application in Business Profile under Parameters
And user_612 Click on Root in Business Profile under Parameters
And user_612 Click the Save Button in Business Profile under Parameters     
And user_612 Click the Search Button in Business Profile under Parameters
And user_612 Enter the Business Profile input in Business Profile under Parameters          
And user_612 Click the Approve Button in Business Profile under Parameters
And user_612 Click on the Sub Profile screen under Parameters
And user_612 Enter the SubProfile Name in Sub Profile under Parameters
And user_612 Enter the Brief Description in Sub Profile under Parameters
And user_612 Select the Business Profile in Sub Profile under Parameters
And user_612 Click the Save Button in Sub Profile under Parameters
And user_612 Click the Search Button in Sub Profile under Parameters
And user_612 Enter the Sub Profile input in Sub Profile under Parameters  
And user_612 Click the Approve Button in Sub Profile under Parameters

And user_612 Click on the User Management submenu
And user_612 Click on the Customer screen under Parameters
And user_612 Select the Application as agency in Customer under Parameters
And user_612 Enter the Customer Name in Customer under Parameters
And user_612 Select the Cif in Customer under Parameters
And user_612 Select the Business Profile in Customer under Parameters
And user_612 Click the Save Button in Customer under Parameters
And user_612 Click the Search Button in Customer under Parameters
And user_612 Enter the Cif input in Customer under Parameters  
And user_612 Click the Approve Button in Customer under Parameters

And user_612 Click on the End User screen under Parameters
And user_612 Select the Application in End User under Parameters
And user_612 Select the Channels in End User under Parameters
And user_612 Enter the Mobile Number in End User under Parameters
And user_612 Select the Customer in End User under Parameters
And user_612 Enter the UserName in End User under Parameters
And user_612 Select the SubProfile in End User under Parameters

And user_612 Click the Save Button in End User under Parameters
And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters  
And user_612 Click the Approve Button in End User under Parameters

And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Deliver Button in End User under Parameters
And user_612 Select the Deliver Option in End User under Parameters
And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Approve Button in End User under Parameters

And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Activate Button in End User under Parameters
And user_612 Click the Search Button in End User under Parameters
And user_612 Enter the Cif input in End User under Parameters 
And user_612 Click the Approve Button in End User under Parameters
And user_612 clicks on logout btn to logout from Admin portal
Given user_612 navigates to the omni_corporate_web_portal
And user_612 enters the maker username1 in the login page for omni_corporate_web_portal1
And user_612 enters the maker password1 in the login page for omni_corporate_web_portal1
And user_612 click on the loggin button in the login page for omni_corporate_web_portal1
And user_612 click on the force logout btn in the login page for omni_corporate_web_portal1
And user_612 click on the ok button for the successful login page for omni_corporate_web_portal1

#
#blocked
#Scenario: check if Field Add Close Session Activity History Report Availble in OADM








