Feature: Purchase pet from store

  @order
  Scenario Outline: User should be able to search pet from the store and add to cart
    Given User is able to Login with username "<username>" and password "<password>"
    When Search for a "<petType>" and it shows in the result
    Then User View details about the pet "<pet>" and add it to cart
    And click on proceed to check

    Examples: 
      | TC No | username | password | petType | pet                  |
      | TC 01 | tinku    | tinku    | Bulldog | Male Adult Bulldog   |
      | TC 02 | tinku    | tinku    | Bulldog | Female Puppy Bulldog |
