Feature: Validate Techfios Login Functionality 

Background: 
   Given User is on the Techfios login page   
   
   Scenario: Users should be able to login 
   
   When  User enters username as "demo@techfios.com"  
   When  User enters password as "abc123"      
   And User clicks on signin button    
   Then User should land on Dashboard page   