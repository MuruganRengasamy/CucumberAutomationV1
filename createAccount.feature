
Feature:Register
                                              
  Scenario: user Register
    Given User login Chrome Browser
    When Users open URL "http://automationpractice.com/index.php"
    And Click sign in
    Then User can view Create Account Page
    When User Enter email as "email@gmail.com"
    And User  click on Create Account button
   Scenario:Personal Information
    When User enter PersonalFirstName as "Krithick"
    And User enter RersonalLastName as "Maharaj"
    And User enter PersonalPassword as "Murugan@123"
    Scenario: Address
    When user enter FirstName as "Maha"
    And User enter LastName as "Raja"
    And User enter Address as "Tirunelveli"
    When User enter City as "chennai"
    And User select State as "state"
    And User enter Postal Code as "627426"
    When User enter Country as "India"
    And User enter Mobile Number as "9780504020"
    And User enter Alias Address as "Nellai"
    And User click Register button
    
    
 