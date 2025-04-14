Feature: product search from ecommerce application
@landingpage
Scenario Outline: Get vegies details from application
Given user is on greencart landing page
When user seached with shortname <Name> and get the actual name of the product
Then user seach the same <Name> in offer page to check if product is realy exist

Examples:
|Name|
|Tomato|
|Potato|

@offerpage
Scenario Outline: Add More Vegies on cart and do checkout
Given user is on greencart landing page and add search the vegetable "Tomato"
When user get the searcher Item and add additional 3Kg in the cart and click on Addtocart Button
And user can click the proceed to checkout button
Then user seach the same Vegetable name, appy and place order in offer page to check if product is realy displayed