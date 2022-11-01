Feature: Insurance  Get Quote Functional test

  Background:
    Given The user wants to go to renas practice herokuApp website
    When  The user wants to click Insurance icon
    Then  The user wants to verify that get quote page is visible
    Then   The user wants to click Get a Quote button
@Smoke
  Scenario:Verify that user get Quote
    Then The user wants to verify that Get Quote button navigating to vehicle information
    And The user wants to  select vehicle year from drop down menu
    Then The user wants to select Vehicle  brand from drop down
    Then The user wants to select Vehicle model from dropdown
    Then The user wants to click next button
    And  The user wants to verify that one option selected in finance detail
    And The user wants to click financeNext button
    And The user wants to enter distance "45000" in to select driving distance box
    Then The user wants to select I commute to work or school or I use my car to conduct business
    And The user wants to click distanceNext button
    And The user wants to click Coverage Start Date header and choose Coverage Start Date as "12/09/2022"
    And The user wants to click CoverageNext button
    Then The user wants to choose yes or no button for answering winter tire question
    And The user wants to choose yes or no button for enrolling TD MyAdvantage saving
    And The user wants to enter licenceNumber and click next button
      |licenceNumber|12548-12585-12545-87878|
    And The user wants to choose yes or no button to confirm possessing a driving license
    And The user wants to click submit button
    And The user wants to verify that LEt us call you button visible






