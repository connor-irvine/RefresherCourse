Feature: Visit an online store and add something to a basket

  @test
  Scenario: As a new home owner, I want to add a fridge to my basket, so that I can keep my beers chilled in my new house
    Given I go to url http://www.ao.com
    Then I enter american fridge freezers into the search bar
    And I click the Search button
    When I want a Samsung Fridge I select the the checkbox