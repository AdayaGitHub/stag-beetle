Feature: ForgotPassword
  I want to use this template for my feature file

  @ForgotPasswordSuccess
  Scenario: Reset Password if forgotten
  Given I am at the AUTHENTICATION page
  When I click the Forgot your password? link		
  Then I am directed to the FORGOT YOUR PASSWORD? page	
  When I enter a valid e-mail address in the Email address field		
  Then email address is shown in the email address field	
  When I click the retrieve password button		
  Then I am taken to a confirmation page which shows the customers email address that they have used to reset	
  When I click the Back to Login button		
  Then I am directed to the AUTHENTICATION PAGE	

