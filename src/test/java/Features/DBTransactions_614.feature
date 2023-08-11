Feature: Checking the functionalities of Account Transfer


@AT_003
Scenario: Submit own account transfer - one time with corporate user and two approvals are required

Given user navigates to the OmniScreen Admin Url and login with the valid credentials_RIDA
And user click on the parameters features in the OmniScreen admin page
And user click on the user management label in the admin screen
And user click on the cutomer approval matrix feature under the parameters
And user click on the search icon in the customer approval matrix
And user enters the approval matrix code in the code field and click on the enter button
And user selects the inputed code from the search result and double click on it
And user selects the already defined limit types and delete if anything is already defined
And user click on the add button and add the first limit type in the customer approval matrix
And user click on the limit type and select the range option in customer approval matrix
And user enter the minimum amount in customer approval matrix for first row
And user enter the maximum amount in customer approval matrix for first row
And user enter the group id in customer approval matrix for first row
And user enter the number of user in the customer approval matrix for first row
And user click on the save button in the customer approval matrix
And user click on the ok button for the warning popup in the customer approval matrix
And user click on the ok button for the Success popup in the customer approval matrix
And user click on the search icon in the customer approval matrix
And user enters the approval matrix code in the code field and click on the enter button
And user selects the inputed code from the search result and double click on it
And user clicks on the approve button in the customer approval matrix
And user click on the ok button for the warning popup in the customer approval matrix
And user click on the ok button for the Success popup in the customer approval matrix



























