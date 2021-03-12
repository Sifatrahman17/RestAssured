$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Login Functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 3871125200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 3900988700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "1 User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.User_enters_username_as(String)"
});
formatter.result({
  "duration": 311619800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2240986400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3719642500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 548469000,
  "status": "passed"
});
formatter.after({
  "duration": 903873900,
  "status": "passed"
});
formatter.before({
  "duration": 1823144600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 4046856400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "2 User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;2-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Scenario2"
    },
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User enters username as \"demo@techfios2.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios2.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.User_enters_username_as(String)"
});
formatter.result({
  "duration": 316226400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2139460500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3175718600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 9851500,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.StepDefinition.user_should_land_on_Dashboard_page(StepDefinition.java:56)\r\n\tat ✽.Then User should land on Dashboard page(features/Login.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 896869100,
  "status": "passed"
});
formatter.before({
  "duration": 1781386600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 5790660600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "3  User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;3--user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters password as \"abc1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.User_enters_username_as(String)"
});
formatter.result({
  "duration": 239799800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1234",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2146610100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3604644700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 56924200,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.StepDefinition.user_should_land_on_Dashboard_page(StepDefinition.java:56)\r\n\tat ✽.Then User should land on Dashboard page(features/Login.feature:25)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 865138500,
  "status": "passed"
});
formatter.before({
  "duration": 1880534000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 3742720000,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "4  User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;4--user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Scenario4"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User enters password as \"abc1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.User_enters_username_as(String)"
});
formatter.result({
  "duration": 232576800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1234",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2180652700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3183791300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 8178200,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.StepDefinition.user_should_land_on_Dashboard_page(StepDefinition.java:56)\r\n\tat ✽.Then User should land on Dashboard page(features/Login.feature:33)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1707751200,
  "status": "passed"
});
formatter.uri("features/LoginOther.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Login",
  "description": "",
  "id": "validate-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginOther"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login different way",
  "description": "",
  "id": "validate-login;login-different-way",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "validate-login;login-different-way;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 9,
      "id": "validate-login;login-different-way;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123"
      ],
      "line": 10,
      "id": "validate-login;login-different-way;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1888887400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login different way",
  "description": "",
  "id": "validate-login;login-different-way;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginOther"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 710906600,
  "status": "passed"
});
});