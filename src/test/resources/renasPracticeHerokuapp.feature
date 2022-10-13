Feature: Insurance  Get Quote Functional test

  Background:
    Given The user wants to go to renas practice herokuApp website
    When  The user wants to click Insurance icon
    Then  The user wants to verify that get page is visible
    And   The user wants to click get a code button

  Scenario:Verify that user get Quote
    Then The user wants to verify that Get Quote button navigating to vehicle information
    And  The user wants to click vehicle details header and select vehicle year from drop down menu
    And  The user wants to click Finance Details header and select only one option
    And  The user wants to verify that one option selected in finance detail
    Then The user wants to click Driving Distance header and enter distance in to select driving distance box




