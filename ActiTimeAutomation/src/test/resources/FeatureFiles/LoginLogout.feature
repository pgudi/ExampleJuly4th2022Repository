#Author: your.email@your.domain.com
# Created Date:
# Reviewed By:
#Purpose:
# Description :

Feature: Login and Logout functionality
Description: Verify the login and logout functionality

Background:
Given I launch Oracle Database
And I connect to Oracle Database

Scenario Outline: Login with valid credentials
Given I launch chrome Browser
And I navigate url of the Application
When I enter valid "<username>" in username field
And I enter valid "<password>" in password field
And I click on login button
Then I find the home page
And I minimize flyout window
Given I find the home page
When I click on Logout link
Then I find the login page
And I close the application

Examples:
|username|password|
|admin|manager|
|admin|manager|
|admin|manager|
