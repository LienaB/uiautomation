Feature: SMRT As SMRT User I want to be able to set update target for SKU

Scenario: werwt
Given I am on SKU level for a particular CC level
When I click on target cell for a particular SKU
Then System displays numtab with ability to type in required number

Scenario: 2.wer
Given I updated at least 1 SKU target
And System displays "Confirm" button (button name can change) in active mode  on SKU list view
When I click "Confirm" button
Then System captures the number

Scenario: 3.wer
Given I updated at least 1 SKU target
And System displays "Confirm" button (button name can change) in active mode  on SKU list view
When "cancel and exit" button is clicked
Then system does NOT capture number

Scenario: 4.
Given I am on SKU level for a particular CC level
And I click on target cell for a particular SKU
When System displays numtab with ability to type in required number
And I enter incorrect number of new target 
Or I enter more than 3 target numbers
Then system informs me about incorrect data
And system does NOT capture number