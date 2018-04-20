Feature: Login functionality
  Scenario: As Administrator I want be able to login to the system
    Given Admin wants to login
    When Admin login to system with username admin and password admin
    Then Admin should see home page