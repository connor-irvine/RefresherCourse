package steps;

import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) -> getUrl(url));
        Then("^I enter (.*) into the search bar$", (final String search) -> searchbarWebsite(search));
        And("^I click the Search button$", () -> searchWebsite());
        When("^I want a Samsung Fridge I select the the checkbox$", () -> pickSamsungCheckbox());
        Then("^I select the fridge that comes recommended by AO$", () -> recommendedFridge());
        Then("^I end up in my basket and add the complete installation bundle$", () -> shoppingBasket());
    }
}