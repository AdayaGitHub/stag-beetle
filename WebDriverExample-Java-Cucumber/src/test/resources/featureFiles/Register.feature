  Feature: RegisterUser
  This feature is verifies the registration function of Fashion Clothing Website. 

    @RegisterSuccess
    Scenario Outline: Register and Login a new user
    
    Given I am at the homepage
    When I click the Sign in button		
    Then I am directed to the Authentication page
    When I enter a valid "<email_address>" in the Email address field		
    Then "<email_address>" is shown in the Email address field	
    When I click the Create an account button
    Then I am directed to the Create An Account page	
    When I select a checkbox for title
    Then The appropriate checkbox had been highlighted	
    When I enter a First name into the First name field		
    Then The First name appears in the First name field	
    When I enter a Last name into the Last name field		
    Then The Last name appears in the Last name field.
    And  The Email address field is pre-populated with "<email_address>"
    When I Enter a valid password		
    Then The password appears but is dotted 
    And The first name appears in the first name filed under your address. 
    And The last name appears under the last name section of your address	
    When I enter a valid address		
    Then The address appears in the Address field 	
    When I enter a valid city		
    Then The city appears in the City field
    When I enter a valid state		
    Then The state appears in the State field
    When I enter a valid Postal Code		
    Then The postal code appears in the Zip/Postal Code field. 	
    When I enter a valid mobile phone number		
    Then The mobile phone number appears in the mobile phone number field. 	
    When I click register		
    Then The user is logged in to MY ACCOUNT page	
    When I click Sign out button		
    Then The user is logged out and is on the AUTHENTICATION page	
    When I enter the "<email_address>" registered under ALREADY REGISTERED? Section		
    Then "<email_address>" is entered into the Email address field	
    When I enter the password registered under ALREADY REGISTERED? Section		
    Then Password is entered into the Password field and shown in dots.	
    When I click the Sign in button		
    Then The user is logged in to MY ACCOUNT page

    
    Examples: 
      | email_address | 
      | pencill@gmail.com |  
      | penn@gmail.com |
        
      
