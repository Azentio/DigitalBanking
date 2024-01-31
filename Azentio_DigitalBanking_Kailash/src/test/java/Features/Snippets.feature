
@tag
Feature: Title of your feature
  I want to use this template for my feature file

Scenario: Submit International Transfer - scheduled with corporate user have maker checker access address_line2_mandatory_verification
And User_626 Click on the Payments for transfer in home Screen of corporate portal
And User_626 Validate the Scheduled own account transfer Below the Payments
And User_626 Validate the Scheduled Scheduled Own Bank Transfer Below the Payments
And User_626 Validate the Scheduled Other Bank Transfer Below the Payments
And User_626 Validate the Scheduled International Transfer Below the Payments
And User_626 Click on the Scheduled own account transfer Below the Payments
And User_626 Validate the From Account field is Available in Scheduled own account transfer
And User_626 Validate the To Account field is Available in Scheduled own account transfer
And User_626 Validate the Currency field is Available in Scheduled own account transfer
And User_626 Validate the Amount field is Available in Scheduled own account transfer
And User_626 Validate the Purpose field is Available in Scheduled own account transfer
And User_626 Validate the Next field is Available in Scheduled own account transfer
And User_626 Validate the Save field is Available in Scheduled own account transfer
And User_626 Click on the from account field for select from account for transfer
And User_626 select the from account for Scheduled own Account Transfer
And User_626 Click on the to account field for select from account for transfer
And User_626 select the to account for Scheduled own Account Transfer
And User_626 Enter Amount for Scheduled own Account Transfer 
And User_626 Enter Purpose for Scheduled own Account Transfer 
And User_626 Click on the periodicity for verify the dropdown Values
And User_626 Verify Recurring Daily Value is avaiable below the periodicity dropdown
And User_626 Verify Recurring Yearly Value is avaiable below the periodicity dropdown
And User_626 Verify Single Future Date Value is avaiable below the periodicity dropdown
And User_626 Verify Recurring weekly Value is avaiable below the periodicity dropdown
And User_626 Verify Recurring Monthly Value is avaiable below the periodicity dropdown
And User_626 Select the periodicity as Recurring Daily in the dropdown
And User_626 Click on the No of payments in Scheduled own account transfer
And User_626 Verify the Value is missing when fields are not filed