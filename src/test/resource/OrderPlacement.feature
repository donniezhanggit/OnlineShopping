Feature: Verify order placement on shoping site

@setup
Scenario: Verify login functionality
Given I go to signin page
When I enter "loginid" and "password" and click submit
Then I go to Account page

#Scenario: Verify shopping cart
#Given I go to women page
#When I select shopping items
#Then I go to cart summary page