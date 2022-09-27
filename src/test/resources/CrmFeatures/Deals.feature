@PhaseTwo
Feature: Deals Management


Background: User Login
Given User is logged in


@SmokeTest
Scenario: Create a new Deals
When User creates a Deals

@RegressionTest
Scenario: View Deals
When User view Deals

 
Scenario: Update Deals
When User update a Deals

Scenario: Delete a Deals
When User delete Deals