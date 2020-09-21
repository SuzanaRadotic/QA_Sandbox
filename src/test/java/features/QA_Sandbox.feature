@AllUseCases
Feature: Use Cases functionality tests
  As a user I want to check create, read, update and delete actions on Use Cases functionality

Background:
  # Login and navigation to "Use Cases" page

  Given I am on "QASANDBOXLOGIN" page
  When I log into application with "AUTOTESTEMAIL"
  Then the system shows "QA Sandbox Dashboard" page
  When I click on "Use Cases Box"
  Then the system shows "Use Cases" page


  @Delete
  Scenario: Delete Use Cases
    When I delete Use Cases
    Then List of Use Cases is empty


  @Create
    Scenario: Create Use Cases
    When I create Use Cases
    Then Use Cases are shown in the list on "Use Cases" page


  @Edit
  Scenario: Edit Use Cases
    When I edit Use Cases
    Then List of Use Cases is also updated


  @DeleteEdited
  Scenario: Delete Edited Use Cases
    When I delete edited Use Cases
    Then List of Use Cases does not contain edited Use Cases







