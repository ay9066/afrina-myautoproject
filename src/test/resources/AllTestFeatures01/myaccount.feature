Feature: My Account
  As a logged in user i can do all my account activeties

  Background: User on Home Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto account page

  Scenario: User is on myaccount page
    Then User see myaccount label

  Scenario: User see all my account option
    Then User see all myacount options in below table
     # | option list          |
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | My Seller Dashboard  |
