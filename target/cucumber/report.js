$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Billing Functionality validation",
  "description": "",
  "id": "techfios-billing-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "1 User should be able to login valid credentials",
  "description": "",
  "id": "techfios-billing-functionality-validation;1-user-should-be-able-to-login-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    },
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_the_echfios_login_page()"
});
formatter.result({
  "duration": 7376199200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefination.user_enters_username_as(String)"
});
formatter.result({
  "duration": 3229198500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefination.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3097692600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_sign_in_button()"
});
formatter.result({
  "duration": 4439257300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 459929800,
  "status": "passed"
});
formatter.after({
  "duration": 892563200,
  "status": "passed"
});
});