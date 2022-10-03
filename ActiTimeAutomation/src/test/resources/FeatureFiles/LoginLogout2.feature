#Author: your.email@your.domain.com
# Created Date:
# Reviewed By:
#Purpose:
# Description :
@Execute
Feature: Login and Logout functionality New
Description: Verify the login and logout functionality

Scenario: Login with valid credentials
Given I launch chrome Browser
And I navigate url of the Application
When I enter valid username in username field
And I enter valid password in password field
And I click on login button
Then I find the home page
And I minimize flyout window

Scenario: Logout from Application
Given I find the home page
When I click on Logout link
Then I find the login page
And I close the application