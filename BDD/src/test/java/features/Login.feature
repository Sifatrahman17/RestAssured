@login @Regression
Feature: Validate Techfios Login Functionality 

Background: 
   Given User is on the Techfios login page    
 @Scenario1
Scenario: 1 User should be able to login with valid credentials 
   When  User enters username as "demo@techfios.com"  
   When  User enters password as "abc123"      
   And User clicks on signin button    
   Then User should land on Dashboard page  
   
 @Scenario2  @smoke
 Scenario: 2 User should be able to login with valid credentials 
   When  User enters username as "demo@techfios2.com"  
   When  User enters password as "abc123"      
   When User clicks on signin button    
   Then User should land on Dashboard page  
  
@Scenario3       
 Scenario: 3  User should be able to login with valid credentials 
   When  User enters username as "demo@techfios.com"  
   When  User enters password as "abc1234"      
   When User clicks on signin button    
   Then User should land on Dashboard page  
        
        
 @Scenario4       
 Scenario: 4  User should be able to login with valid credentials 
   When  User enters username as "demo@techfios.com"  
   When  User enters password as "abc1234"      
   When User clicks on signin button    
   Then User should land on Dashboard page  
               