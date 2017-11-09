Feature: SMRT As SMRT User I want to access list of departments on style color level


Scenario: 1.
  Given SMRT User has been logged in to the application
  When User navigates to the style & color page
  Then Application displays list of style & color items available for listing for 212

#Scenario: 2.

#Given I want to select one of the style+color item to manage it on SKU level
#And I click on any column in a style+color row
#When Application displays SKU details for selected style+color item (20 items per page)
#Then Application displays below SKU fileds with populated data