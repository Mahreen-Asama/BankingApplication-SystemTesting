Feature: BankingApp static pages searches

  Scenario Outline: user visits static pages of bankingapp
    Given user visits bankingapp
    Then by default Home page is shown
    When user clicks on Home in nav bar
    Then Home page is shown
    When user clicks on About in nav bar
    Then About page is shown
    When user clicks on Contact in nav bar
    Then Contact page is shown

    Examples:


#
#Feature: Get list of accounts
  Scenario: unauthenticated user wants to retrieve list of accounts
    Given user visits bankingapp again
    When user clicks on Accounts in nav bar
    Then user redirects to login page


