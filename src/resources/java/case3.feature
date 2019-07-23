Feature: Login and Find the headphone in search
   Scenario Outline: Login
     Given User opens the browser and User enters username "<user>" and password "<password>"
     When User searches headphone in the search box
     Then Validating the search results
     
      Examples:
   |user||password|
   |lalitha||password123|