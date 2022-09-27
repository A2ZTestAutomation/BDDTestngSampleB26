@PhaseOne
Feature: Contacts Management

@SmokeTest
Scenario: Create a new contact
Given User is logged in
When User creates a contact

Scenario: View contact
Given User is logged in
When User view contact

@RegressionTest 
Scenario: Update contact
Given User is logged in
When User update a contact

@SmokeTest
Scenario: Delete a contact
Given User is logged in
When User delete contact