Feature: SMRT As SMRT User I want to be able to set Disposition on CC level

Scenario: 1. Send all to store
  Given I want to have all available CC in 209 sent to 212
  When I select disposition Send all to Store
  Then Application sets targets for all SKUs for selected CC to infinite sign
  And Application disables target fields
#  And Application automatically calculates Pull Quantity for selected CC for transfer requests

#Scenario: 2. sdfsdf
#Given I want to return all inventory
#When I select disposition value to be Exhaust RTV
#Then Application
#And sets targets for all SKUs for selected CC to 0 and disables target fields
#
#Scenario: 3. e5345
#Given I want to return all inventory
#When I select disposition value to be Exhaust Stock - balance
#Then Application
#And sets targets for all SKUs for selected CC to 0 and disables target fields