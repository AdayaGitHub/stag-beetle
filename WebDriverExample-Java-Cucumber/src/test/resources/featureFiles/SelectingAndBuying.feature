
Feature: Selecting and Buying
  This features verifies the Selecting, Adding to Cart and Buying functions of the Fashion Clothing Website.

  @SelectingAndBuying
  Scenario: Verify that a user and select items of clothing and proceed to checkout to buy the items.
  
  Given I am logged in
  And I am at the homepage
  When I click T-shirts link		
  Then the T-Shirts page is shown	
  When I add a T-shirt to the cart		
  Then A pop up is shown with the message Product successfully added to your shopping cart
  When I click Continue Shopping		
  Then I remain on T-Shirt page	
  When Click the Dresses link		
  Then The dresses page is shown	
  When Add a dress to the cart		
  Then A pop up is shown with the message Product successfully added to your shopping cart. 
  When Click Proceed to checkout		
  Then A summary page is shown with the correct total amount shown	
  When Click Proceed to checkout1		
  Then User is on the ADDRESSES page	
  When Click Proceed to checkout2		
  Then User is on the SHIPPING page	
  When Tick the terms and conditions		
  Then The tick box is ticked	
  When Click Proceed to checkout3		
  Then User is on the PLEASE CHOOSE YOUR PAYMENT METHOD	
  When Click pay by bank wire		
  Then User is on order summary page	
  When Click I confirm my order		
  Then User is on order confirmation page	
  When Click Back to orders		
  Then User is directed to the order history page with the order showing with the correct amount shown	
  
  

