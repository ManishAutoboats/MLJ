
Feature: Login funtionality of Swag Labs
 
@Reg
  
  Scenario: Validate login with valid details
  When user enter username "test" and password "automation"
  And user click on login button
  Then validate successful login
