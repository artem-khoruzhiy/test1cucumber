Feature: Login negative cases functionality

  Scenario Outline: As Admin I forgotten the password and trying to login to the system
    Given Admin wants to login
    When Admin login to system with username <username> and password <password>
    Then Admin should see login page

  Examples:
    |username|password|
    |test    |test    |
    |admin   |        |
    |        |admin   |