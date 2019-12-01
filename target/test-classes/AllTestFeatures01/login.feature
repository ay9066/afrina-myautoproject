Feature: Login Functionality
  As a user of MCT Website I can do a login
  So I can do all loggedin activities

  Background: User on Home Page
    Given User is on MCT home page

  Scenario: User can do a login with valid credentials
    When User complete login with id "user" password "pass"
    Then User see  profile name as "James Williams"

  Scenario: User can do a login with valid id and password
    When User complete login with id "mrabc123" password "abc123"
    Then User see  profile name as "Mr Abc"
