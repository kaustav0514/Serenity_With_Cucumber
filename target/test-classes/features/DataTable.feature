Feature: View pet categories available in store

  Background: 
  Given User is able to Login with username "tinku" and password "tinku"
  
  
  @order1
  Scenario: User should be able to view all the pet categories
    When Click on category, then a category is displayed
      | FISH     |
      | CATS     |
      | DOGS     |
      | BIRDS    |
      | REPTILES |

