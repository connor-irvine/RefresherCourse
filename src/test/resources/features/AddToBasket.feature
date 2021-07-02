Feature: Visit an online store and add something to a basket

  @test
  Scenario: As a new home owner, I want to add a fridge to my basket, so that I can keep my beers chilled in my new house
    Given I go to url http://www.google.co.uk
    Then I enter ao.com into the search bar and select the button