@LoginOther
Feature: Validate Login

Scenario Outline: Login different way
     When User enters "<userName>" and "<password>"

     
     Examples:
     |userName         |password|
     |demo@techfios.com|abc123|