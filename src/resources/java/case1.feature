Feature: Regiteration for testme app
   Scenario: Regiteration for testme app
   
      Given User should be in registeration page
      When Enter the user details in the registration page username "yathindra1000" firstname "yathindra" lastName "yathindra" password 
      And "yathindra123" confirmPassword "yathindra123" emailAddress "yathindra@gmail.com" mobileNumber "9876543211" dob "11/11/1997"
      And  address "Chennai Chennai" answer "blue" 
      Then Registration successful