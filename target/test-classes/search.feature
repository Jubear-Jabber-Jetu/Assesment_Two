Feature: Search functionality on a website

Scenario: Perform a search
    Given I open the website
    When I search for "example"
    Then I should see search results
    