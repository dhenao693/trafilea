  #language: en
  Feature: Login

    @buy @unhappyPath
    Scenario Outline: Buy product with user logged
      Given "Daniel" is on Demoblaze page
      When select first product and add to car with alert "Product added." and buy
        | email   | firstName   | lastName   | address   | aptSuite   | city   | country   | state   | postalCode   | phone   |
        | <email> | <firstName> | <lastName> | <address> | <aptSuite> | <city> | <country> | <state> | <postalCode> | <phone> |
      Then see the successful pay modal with message "Your card number is invalid"

      Examples:
        | email             | firstName | lastName    | address            | aptSuite | city     | country      | state    | postalCode | phone      |
        | qa.mail@gmail.com | My Name   | My Lastname | 123 William Street | apt 1    | New York | United State | New York | 10038      | 1234567890 |

