@PhaseOne
Feature: Tasks Management

@SmokeTest
Scenario: Create a new Tasks
Given User is logged in
When User creates a Tasks

Scenario: View Tasks
Given User is logged in
When User view Tasks

@RegressionTest @SmokeTest
Scenario: Update Tasks
Given User is logged in
When User update a Tasks

Scenario: Delete a Tasks
Given User is logged in
When User delete Tasks