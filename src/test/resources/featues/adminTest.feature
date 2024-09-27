Feature: Validate login functionality

  Background:
    Given user open website
    Then verify user is on login page

  Scenario: Verify at least one admin user is present in user list
    When user login with valid credentials
    Then verify user is on homepage
    When user click on admin
    And select user role as admin
    And click on search button
    Then validate the list of users are greater than or equal one


  Scenario: Verify user can apply for the leave
    When user login with valid credentials
    Then verify user is on homepage
    When user click on leave menu
    Then verify user is on leave page
    When click on apply button
    Then leave application form is displayed
    And select random leave type
    And enter leave date
    And select partial days to all days
    And duration half day morning
    When click on apply button
    Then verify the success message is displayed
    And click on my leave
    Then verify date entry with date displayed


