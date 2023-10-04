Feature: Account Transfer

@AT_82_01
Scenario: check if the system Retrieve "BVN " input on local beneficiary screen
And User_609 loads the test datasetup for the test case id AT_082_01
Given User_609 navigates to the omni_corporate_web_portal
And User_609 enters the maker username1 in the login page for omni_corporate_web_portal
And User_609 enters the maker password1 in the login page for omni_corporate_web_portal
And User_609 click on the loggin button in the login page for omni_corporate_web_portal
And User_609 click on the force logout btn in the login page for omni_corporate_web_portal
And User_609 click on the ok button for the successful login page for omni_corporate_web_portal
And User_609 Click on the AMANA payment screen in the homepage
And User_609 Click scheduled transfer under AMANA payment screen
And User_609 Click scheduled transfer under AMANA payment screen
And User_609 Click scheduled other bank transfer under the AMANA payment screen
And User_609 Select from account under scheduled other bank transfer

And User_609 Click To other under scheduled other bank transfer
And User_609 Select Bank under scheduled other bank transfer
And User_609 Enter Branch value under scheduled other bank transfer
And User_609 Enter Beneficiary BVN under scheduled other bank transfer

#Account Number
And User_609 Select beneficiary under scheduled other bank transfer
And User_609 Select Beneficiary Currency under scheduled other bank transfer
And User_609 Enable Save Beneficiary flag under scheduled other bank transfer

And User_609 Enter transfer amount under scheduled other bank transfer
And User_609 Enter purpose of transfer under scheduled other bank transfer
And User_609 Click next button under scheduled other bank transfer
And User_609 Select periodicity under scheduled other bank transfer
And User_609 Enter number of payments under scheduled other bank transfer
And User_609 Click next button1 under scheduled other bank transfer
And User_609 Click submit button under scheduled other bank transfer
And User_609 Click ok button for request submitted successfully or request time