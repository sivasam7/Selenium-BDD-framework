Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on login page
    And Enter username "admin"
    And Enter password "admin123"
    And user clicks login button
    Then user should be redirected to home page
