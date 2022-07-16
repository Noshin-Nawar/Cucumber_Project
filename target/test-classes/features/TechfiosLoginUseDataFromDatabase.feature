@DDLoginFeature @Regression
Feature: TechFios Billing Functionality validation

@DDScenario1 
Scenario: 1 User should be able to login valid credentials
Given User is on the techfios login page
When User enters "username" from Techfios database
When User enters "password" from Techfios database
When User clicks sign in button
Then User should land on dashboard page

