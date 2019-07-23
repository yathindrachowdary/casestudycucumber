
Feature: login and payment without adding product


Scenario Outline: Login to TestMeApp
Given User opens the browser and User enters username "<user>" and password "<password>" 
 When User searches headphone in the search box and proceed to pay without adding any item in cart
Then TestMeApp doesn't display the cart icon

   Examples:
   |user|password|
   |lalitha|password123|