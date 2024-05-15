Feature: Testing JDBC States

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: States testing with JDBC
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | states     |
    Then Send The Query the database "select name from states limit 10" and control match
