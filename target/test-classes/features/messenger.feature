@web
  Feature: Facebook page signup feature

    Background:
      Given  I am on facebook home  page
      @login-1
      Scenario: Verify signup button
        When I enter Sumeyra into firstname text fields on home page screen
        And I enter Yesilova into lastname text fields on home page screen
        Then I verify that signup button is disable or not

    @login-2
    Scenario Outline: Sign up button form should not accept any invalid email address
          When I enter Sumeyra into firstname text fields on home screen
          And I enter  Yesilova into lastname text fields on home screen
          And I enter <email> into Mobilenumber text fields on home screen
           And I click on signup button on home page screen
          Then I verify Error message for invalid email on homepage

          Examples:

            | email                         |
            | plainaddress                  |
            | #@%^%#$@#$@#.com              |
            |@example.com                   |
