$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AddToBasket.feature");
formatter.feature({
  "name": "Visit an online store and add something to a basket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a new home owner, I want to add a fridge to my basket, so that I can keep my beers chilled in my new house",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I go to url http://www.google.co.uk",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter ao.com into the search bar and select the button",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
});