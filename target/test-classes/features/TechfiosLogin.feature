@LoginFeature @Regression
Feature: TechFios Billing Functionality validation

@Scenario1 @Smoke
Scenario: 1 User should be able to login valid credentials
Given User is on the techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks sign in button
Then User should land on dashboard page


@Scenario2
Scenario: 2 User should be able to login valid credentials
Given User is on the techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc124"
When User clicks sign in button
Then User should land on dashboard page 
